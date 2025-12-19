public class Monbeauprogramme {

    static void main() {
        System.out.println("Coucou les BTS SIO!!");
        int a=1;
        int b=2;
        double pi=3.14;
        //cast(convertion) de pi en entier
        int res= a+b+ (int)pi;
        //ou    int res= (int)(a+b+pi);
        Terminal.ecrireString("l'addition de " + a + " + "+ b+ " + "+pi+ " = " + res);
    }
}
