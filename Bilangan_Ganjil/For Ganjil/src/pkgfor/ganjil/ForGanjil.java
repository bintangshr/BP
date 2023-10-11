
package pkgfor.ganjil;
import java.util.Scanner;
public class ForGanjil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("For Bilangan Ganjil");
        System.out.println("Masukkan Bilangan : ");
        int n = s.nextInt();
        System.out.println("Deret angka ganjil adalah : ");
        for (int i = 1; i <= n; i += 2){ 
            System.out.println( i+ "");
        }
        
    }
    
}
