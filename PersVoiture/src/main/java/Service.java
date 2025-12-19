import java.sql.*;
import java.util.List;

public class Service {
    Connection cx;

    public Service() {
        try {
            //chargement de la classe correspondant au driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connexion à la base de donnée
            cx = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mabase",
                    "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public int updateAdresse(Adresse a) throws SQLException, ClassNotFoundException {
        PreparedStatement pst = cx.prepareStatement("UPDATE adresse SET" +
                " num=?,rue=?,cp=?,ville=?" +
                " WHERE id=?");
        pst.setString(1, a.getNumero());
        pst.setString(2, a.getRue());
        pst.setString(3, a.getCodePostal());
        pst.setString(4, a.getVille());
        pst.setInt(5, a.getId());
        //exectution de la requête
        pst.executeUpdate();
        pst.close();
        return 0;
    }

    public String selectAllAdresse() throws SQLException {
        PreparedStatement pst = cx.prepareStatement("select * FROM adresse");
        ResultSet rs = pst.executeQuery();
        //parcours du resultat
        StringBuffer res = null;
        while (rs.next()) {
            int id = rs.getInt("id");
            String numero = rs.getString("num");
            String rue = rs.getString("rue");
            String cp = rs.getString("cp");
            String ville = rs.getString("ville");
            res.append(id + " " + numero + " " + rue + " " + cp + " " + ville + "\n");
        }
        pst.close();
        return String.valueOf(res);
    }

    public Integer ajoutAdresse(Adresse a) throws SQLException, ClassNotFoundException {

        PreparedStatement pst = cx.prepareStatement("INSERT INTO adresse " +
                "(num,rue,cp,ville)" +
                " VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, a.getNumero());
        pst.setString(2, a.getRue());
        pst.setString(3, a.getCodePostal());
        pst.setString(4, a.getVille());
        //execution de la requete
        pst.executeUpdate();
        ResultSet rs = pst.getGeneratedKeys();//récupération des valeurs enregistrées
        int id = -1;//definition de l'id recupérant l'id_adresse de l'enreg ajouté
        if (rs.next()) {// parcours du resulset
            id = rs.getInt(1);//récupération de la valeur de primarykey
        }//correspondant à l'enregistrement inséré
        pst.close();
        return id;
    }

    public void deleteAdresse(int id) throws SQLException, ClassNotFoundException {
        //TODO implémenter la requete de suppression
        PreparedStatement pst = cx.prepareStatement("DELETE FROM adresse " +
                "WHERE id=?");

    }

    public Integer ajoutPersonne(Personne p) throws SQLException, ClassNotFoundException {
        int id_adresse = ajoutAdresse(p.getAdresse());
        System.out.println("id adresse inséré:" + id_adresse);
        PreparedStatement pst = cx.prepareStatement("INSERT INTO personnes " +
                "(Nom,Prenom,DateNaissance,email,id_adresse)" +
                " VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, p.getNom());
        pst.setString(2, p.getPrenom());
        //conversion de LocalDate en date pour le passer à la requete
        pst.setDate(3, Date.valueOf(p.getDateNaissance()));
        pst.setString(4, p.getEmail());
        pst.setInt(5, id_adresse);


        //execution de la requete
        int row = pst.executeUpdate();
        System.out.println("enregistrement en bdd:" + row);
        ResultSet rs = pst.getGeneratedKeys();//récupération des valeurs enregistrées
        int id = -1;//definition de l'id recupérant l'id_adresse de l'enreg ajouté
        if (rs.next()) {// parcours du resulset
            id = rs.getInt(1);//récupération de la valeur de primarykey
        }//correspondant à l'enregistrement inséré
        pst.close();
        return id;
    }
        public void ajoutListeVoiture(Personne p) throws SQLException, ClassNotFoundException {
            PreparedStatement pst = cx.prepareStatement("INSERT INTO voiture " +
                    "(immatriculation,marque,modele,id_personne)" +
                    " VALUES (?,?,?,?)");


            List<Voiture> listeVoitures = p.getListeVoiture();
            for (Voiture v : p.getListeVoiture()) {
                pst.setString(1, v.getImmatriculation());
                pst.setString(2, v.getMarque());
                pst.setString(3, v.getModele());
                pst.setInt(4, p.getId());

                pst.executeUpdate();


            } pst.close();
        }
    }

