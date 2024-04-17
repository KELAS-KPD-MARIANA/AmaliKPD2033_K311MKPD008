
package amalikpd2033_k311mkpd008;
import java.util.Scanner;
public class AmaliKPD2033_K311MKPD008 {

    public static void main(String[] args) {
        string nama_pekerja;
        int Bil_Hari, jumlah_gaji;
        String nama;
        int gaji = 160;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nama: ");
        
        nama = input.nextLine();
       
        do{
        System.out.print("Masukkan bilangan hari bekerja: ");
        Bil_Hari = input.nextInt();
        
        
        
        if (Bil_Hari > 31) {
            System.out.println("Bilangan hari tidak boleh melebihi 31 hari");
            System.out.println("Masukkan semula bilangan hari bekerja: ");
            Bil_Hari = input.nextInt();
            
        }
        } while (Bil_Hari > 31);
        
            jumlah_gaji = Bil_Hari * gaji;
        
            System.out.println("Rumusan bagi gaji " + nama);
            System.out.println("Jumlah hari bekerja " + Bil_Hari);
            System.out.println("GAJI BULANAN ADALAH: " + jumlah_gaji);
    }
    
}
