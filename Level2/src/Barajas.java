import java.util.ArrayList;
import java.util.Collections;

public class Barajas {
    public static void main(String[] args) {
        ArrayList<Integer> cartas = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            cartas.add(i);
        }
        System.out.println(cartas);
        Collections.reverse(cartas);
        System.out.println(cartas);
        Collections.shuffle(cartas); /*barajar*/
        System.out.println(cartas);
        
    }
}
