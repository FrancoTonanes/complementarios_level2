import java.util.Scanner;
import java.util.ArrayList;

public class PilaCola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 0; i<5; i++){
            System.out.println("Ingrese un número: ");
            Integer n = entrada.nextInt();
            numeros.add(n);
        }
        System.out.println(numeros);

        numeros.add(0, 100);
        numeros.add(99);
        System.out.println(numeros);
        entrada.close();
    }
}
