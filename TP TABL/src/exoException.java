public class exoException {

    public static int division(int a, int b) throws DivisionParZeroException{
        if (a == 0 || b == 0) {throw new DivisionParZeroException("On peut pas diviser par 0 !");
        }
        return a/b;
    }
    static void main(){
                try{
                    //TODO demander à l'utilisateur de saisir 2 chiffres
                    //pour faire la division
                    Terminal.ecrireString("saisir 1er nombre : ");
                    int a = Terminal.lireInt();
                    Terminal.ecrireString("saisir 2ème nombre : ");
                    int b = Terminal.lireInt();
                    Terminal.ecrireString(" le résultat est " + division(a,b));

                }catch(DivisionParZeroException e){
                    System.out.println(" DivisionParZeroException exception levée: " + e);

                }finally {
                    System.out.println("Au revoir");
                }

    }
}
