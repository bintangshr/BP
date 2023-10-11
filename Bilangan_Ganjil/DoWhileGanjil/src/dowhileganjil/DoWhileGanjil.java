
package dowhileganjil;
import java.util.Scanner;
public class DoWhileGanjil {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.println("Do While Ganjil");
        System.out.println("Masukkan Bilangan : ");
        int n = s.nextInt();
        System.out.println("Deret Angka ganjil adalah : ");
        int counter = 1;
        do {
            System.out.println(counter + " ");
            counter += 2;
        } while (n >= counter);
        }
    }
    

