package esperimenti;

import java.util.Random;

public class num_gen {
    public static void main(){
    }

    public int get_value(){
        Random generator = new Random();
        System.out.println("valore generato");
        return generator.nextInt(1000 - 1) + 1;
    }
}
