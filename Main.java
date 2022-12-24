import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(System.in);
        int pilih;
        int pilih1;
        System.out.println("==================");
        System.out.println("   Tabungan Uhuy   ");
        System.out.println("==================");
        System.out.println("1. Register        ");
        System.out.println("2. Exit           ");
        System.out.println("Masukkan Pilihan :");
        pilih = in.nextInt();

        switch (pilih){
            case 1 :
                Nasabah cs = new Nasabah();
                cs.input_data();
                cs.lihat_data();
                try {
                    FileWriter file = new FileWriter("Nasabah.txt");
                    file.write("\nId Nasabah   : "+cs.id_nas);
                    file.write("\nCustomer       : "+cs.nama);
                    file.write("\nNo Telp      : "+cs.no_hp);
                    file.close();
                    System.out.println("File sudah ditulis!");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                }
                break;
            case 2 :
                System.out.println("Exitt...");
                System.exit(0);
                break;
        }

        System.out.println("================================");
        System.out.println("          MENU TABUNGAN      ");
        System.out.println("================================");
        System.out.println("1. Menabung Rp.50.000,00        ");
        System.out.println("2. Menabung Rp.100.000,00        ");
        System.out.println("3. Menabung Rp.200.000,00        ");
        System.out.println("Masukan Pilihan Anda = ");
        pilih1 = in.nextInt();
        System.out.println();
        if (pilih1 == 1) {
            Menabung by = new Menabung(50000);
            System.out.println("Anda Menabung : " + by.nabung);

        }
        else if (pilih1 == 2) {
            Menabung by = new Menabung(100000);
            System.out.println("Anda Menabung: " + by.nabung);

        }
        else if (pilih1 == 3) {
            Menabung by = new Menabung(200000);
            System.out.println("Anda Menabung : " + by.nabung);

        }

    }


}