
package whilejava;
import java.util.Scanner;

public class WhileJava {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("While Ganjil");
        System.out.println("Masukkan Bilangan : ");
        int n = s.nextInt();
        System.out.println("Deret angka ganjil adalah : ");
        int counter = 1;
        while (n >= counter) {
            System.out.println(counter + "");
            counter += 2;
        }
    }
    
}
