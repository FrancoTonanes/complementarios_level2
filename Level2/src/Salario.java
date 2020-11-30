import java.util.ArrayList;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<Integer> horas = new ArrayList<>();
        ArrayList<Integer> sueldo = new ArrayList<>();
        ArrayList<Integer> total_semana = new ArrayList<>();
        ArrayList<Integer> total_mes = new ArrayList<>();

        System.out.println("Ingrese cantidad de datos a ingresar: ");
        int n = ingreso.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Ingrese cantidad de horas: ");
            int h = ingreso.nextInt();
            System.out.println("Ingrese cantidad salario por hora: ");
            int s = ingreso.nextInt();
            horas.add(h);
            sueldo.add(s);
        }
        for(int i = 0; i < horas.size(); i++){
            int x = horas.get(i) * sueldo.get(i);
            total_semana.add(x);
        }
        int total = 0;
        for(int i : total_semana){
            total += i;
        }

        total_mes.add(total);

        System.out.println("Salario por semana: " + total_semana);
        System.out.println("Total Final: $" + total_mes.get(0));
        ingreso.close();
    } 
    
}
