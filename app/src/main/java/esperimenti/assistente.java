package esperimenti;

import java.util.Scanner;

public class assistente {
    public int user_guess;

    public static void main(){
        System.out.println("Evocazione dell'assistente riuscita");
    }

    public void explain(){
        System.out.println("Ciao. Il computer genererà un numero.\nPensa un numero tra 1 e 1000 e vedi se hai indovinato!");
    }

    public int take_guess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        user_guess = scanner.nextInt();
        scanner.close();
        return user_guess;
    }

}
