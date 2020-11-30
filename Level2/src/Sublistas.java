import java.util.ArrayList;
import java.util.List;


public class Sublistas {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        String[] names = { "Franco", "Roberto", "Francisco", "Maria", "Hiusa", "Nicole", 
                            "Ailin", "Evelyn", "Azul", "Alejandra", "Aylen", "Ivon" };

        
        for(String i : names){
            nombres.add(i);
        }

        System.out.println(nombres);

        System.out.println("Se divide la lista en sublistas");

        List<String> nombres1 = nombres.subList(0, 4);
        List<String> nombres2 = nombres.subList(4, 8);
        List<String> nombres3 = nombres.subList(8, 12);
        System.out.println(nombres1);
        System.out.println(nombres2);
        System.out.println(nombres3);

        
        
    }
}
