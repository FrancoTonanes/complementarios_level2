import java.util.ArrayList;
import java.util.Collections;

public class Barajas {
    public static void main(String[] args) {
        ArrayList<String> cartas = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            String a = String.valueOf(i);
            cartas.add(a);
        }
        cartas.add(0, "A");
        cartas.add("J");
        cartas.add("Q");
        cartas.add("k");
        System.out.println(cartas);
        Collections.reverse(cartas);
        System.out.println(cartas);
        Collections.shuffle(cartas); /*barajar*/
        System.out.println(cartas);
        
    }
}
