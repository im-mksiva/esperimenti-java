/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package esperimenti;

public class App {

    public static void main(String[] args) {
        num_gen generatore = new num_gen();
        assistente assistente = new assistente();
        assistente.explain();
        int valore = generatore.get_value();
        assistente.take_guess();
        System.out.println("il valore del computer è: " + valore);
        System.out.println("il tuo valore è: " + assistente.user_guess);

    }
}
