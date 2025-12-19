import java.security.Provider;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

//    static void main() {
//        //creation d'une personne
//        LocalDate datenais=LocalDate.of(1956,06,23);
//        //appel de son constructeur
//        Personne pers=new Personne(datenais,"bbardot@free.fr","Bardot",
//                "brigitte");
//        System.out.println(pers);
//        //modifier le nom, prénom et email de cette personne
//        pers.setPrenom("Nathalie");
//        pers.setNom("Simon");
//        pers.setEmail("nsimon@free.Fr");
//        LocalDate dateNaissSimon= LocalDate.of(1964,10,25);
//        pers.setDateNaissance(dateNaissSimon);
//        //TODO creer une adresse et l'affecter à pers
//        Adresse a = new Adresse("2","boulevard victor Hugo","75016","paris");
//        pers.setAdresse(a);
//        System.out.println("pers modifiée:"+pers);
//        //insérer pers en BDD
//        try {
//            //appel de Service pour opération CRUD
//            Service service= new Service();
//            service.ajoutPersonne(pers);
//            //TODO update Adresse
//            Adresse a3 = new Adresse("22", "rue Goerges", "56000","Vannes");
//            service.updateAdresse(a3);
//            int id_adressAdd= service.updateAdresse(a3);
//            //ajout de ma nouvelle adresse
//            Adresse a2= new Adresse("24","boulevard Saint Martin", "56000","Vannes");
//            int id_adresseAdd = service.ajoutAdresse(a2);
//            a2.setId(id_adresseAdd);//on y inser l'idd adresse de syntaxe
//            System.out.println(service.selectAllAdress());
//        } catch (SQLException e) {//en cas de probleme de syntaxe sql
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {// cas ou il ne trouve pas le driver mysql
//            throw new RuntimeException(e);
//        }

//    }

    static void main() {
        //créaiton de voitures avec les 3 constructeurs différents.
        Voiture v1= new Voiture();
        v1.setImmatriculation("124-aab-12");
        v1.setMarque("renault");
        v1.setModele("megane");
        Voiture v2= new Voiture("124-gf-54");
        v2.setMarque("peugeot");
        v2.setModele("308");
        Voiture v3= new Voiture("333-er-51", "Bmw", "x1");
        System.out.println("V1: "+v1);
        System.out.println("V2 : "+v2);
        System.out.println("V3: "+v3);
        List<Voiture> listeVoitures= new ArrayList<>();
        //TODO ajouter les voitures dans la listeVoiture
        listeVoitures.add(v1);listeVoitures.add(v2);listeVoitures.add(v3);
        System.out.println(listeVoitures);
        //creation d'une personne
        LocalDate datenais= LocalDate.of(1964,10,25);
        Personne pers=new Personne(datenais,"bbardot@free.fr","Bardot", "brigitte");
        //creer dans personne un attribut List<Voiture>
        //creer les getters et les setters de cette List<Voiture>
        //affecter listeVoitures à une personne
        pers.setListeVoiture(listeVoitures);
        //créer la table voiture

        Adresse a = new Adresse("2","boulevard victor Hugo","75016","paris");
        pers.setAdresse(a);

        //TODO Insérer la méthode dans la classe Service, ajoutListeVoiture
        try{
            Service service= new Service();

            int idpers=service.ajoutPersonne(pers);
            int id_adresseAdd = service.ajoutAdresse(a);
            pers.setId(idpers);



            service.ajoutListeVoiture(pers);
        } catch (SQLException e) {//en cas de probleme de syntaxe sql
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {// cas ou il ne trouve pas le driver mysql
            throw new RuntimeException(e);
        }
    }

}
