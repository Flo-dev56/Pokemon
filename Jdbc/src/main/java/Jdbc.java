import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {



        public static void main( String[] args ) throws Exception {
//chargement de la classe correspondant au driver

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cx = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mabase","root","");

            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery( "SELECT * FROM personnes" );
            while (rs.next()) {
                String nom = rs.getString("nom");
                String ville = rs.getString("ville");
                System.out.println( nom + " a " + ville + " ans" );
            }
            int nb = st.executeUpdate("INSERT INTO personnes (Id,Nom,Prenom, DateNaissance, Ville" +" VALUES(2,Macron','Brigitte',1920-10-10,'Paris'");
            System.out.println("enreg effectué:" + nb);
            rs.close();
            st.close();
            cx.close();
}
}