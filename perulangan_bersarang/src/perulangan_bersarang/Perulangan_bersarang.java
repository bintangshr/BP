
package perulangan_bersarang;
import java.util.Scanner;
public class Perulangan_bersarang {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Masukkan angka : ");
        int a = s.nextInt();
        
        int i = 1;
        int j = 1;
        do {
            do{
                System.out.print( j + " ");
                j++;
            } while (i >= j);
            
            System.out.println(" ");
            j = 1;
            i++;
        } while (a >= i);
            }
        }
  
