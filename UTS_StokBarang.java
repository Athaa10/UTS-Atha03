import java.util.Scanner;
public class UTS_StokBarang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaBarang, selesai = "";
        int stokBarang = 0, permintaanBarang = 0;
        double hargaPerUnit = 0;
        boolean inputValid;

        do {
            System.out.print("Masukkan nama barang (atau ketik 'selesai' untuk mengakhiri): ");
            namaBarang = sc.nextLine();
            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            // Input stok barang
            inputValid = false;
            while (!inputValid) {
                System.out.print("Masukkan jumlah stok " + namaBarang + ": ");
                if (sc.hasNextInt()) {
                    stokBarang = sc.nextInt();
                    inputValid = true;
                } else {
                    System.out.println("Input tidak valid, mohon masukkan angka kembali.");
                    sc.next(); 
                }
            }
            sc.nextLine(); 

            inputValid = false;
            while (!inputValid) {
                System.out.print("Masukkan harga per unit untuk " + namaBarang + ": ");
                if (sc.hasNextDouble()) {
                    hargaPerUnit = sc.nextDouble();
                    inputValid = true;
                } else {
                    System.out.println("Input tidak valid, mohon masukkan angka kembali.");
                    sc.next();
                }
            }
            sc.nextLine(); 

            
            double totalNilaiStok = stokBarang * hargaPerUnit;
            System.out.println("Total nilai stok untuk " + namaBarang + " adalah: " + totalNilaiStok);

            
            inputValid = false;
            while (!inputValid) {
                System.out.print("Masukkan jumlah permintaan barang: ");
                if (sc.hasNextInt()) {
                    permintaanBarang = sc.nextInt();
                    inputValid = true;
                } else {
                    System.out.println("Input tidak valid, harap masukkan angka.");
                    sc.next();
                }
            }
            sc.nextLine(); 

            if (permintaanBarang <= stokBarang) {
                stokBarang -= permintaanBarang;
                System.out.println("Permintaan barang dapat dipenuhi. Stok tersisa: " + stokBarang);
            } else {
                System.out.println("Permintaan melebihi stok. Stok tidak mencukupi.");
            }

            System.out.println("Apakah ingin memasukkan data barang lainnya? (ketik 'selesai' untuk keluar)");
            selesai = sc.nextLine();

        } while (!selesai.equalsIgnoreCase("selesai"));

        System.out.println("Program dihentikan.");
        sc.close();
    }
}