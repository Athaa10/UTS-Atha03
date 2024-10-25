import java.util.Scanner;
public class UTS_NilaiSiswa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        double nilai, totalNilai = 0, ratarata = 0;
        int jumlahSiswa = 0, diatasRatarata = 0, dibawahRatarata = 0;
        boolean mayoritas;

        while (true) {
            System.out.println("Masukkan nilai siswa: (ketik 'selesai' untuk berhenti)");
            nama = sc.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.println("Masukkan nilai siswa: ");
            nilai = sc.nextDouble();
            sc.nextLine();

            jumlahSiswa++;
            totalNilai += nilai;
            ratarata = totalNilai/jumlahSiswa;
            if (nilai>=ratarata) {
                diatasRatarata++;
            } else {
                dibawahRatarata++;
            }
        }
        if (jumlahSiswa > 0) {
            System.out.println("Rata rata nilai kelas: " + ratarata);
            System.out.println("jumlah siswa di atas rata rata: " + diatasRatarata);
            System.out.println("jumlah siswa di bawah rata rata: " + dibawahRatarata);

            mayoritas = (diatasRatarata > jumlahSiswa / 2);
            if (mayoritas) {
                System.out.println("Mayoritas siswa yang memiliki nilai di atas rata rata: ");
            } else {
                System.out.println("Mayoritas siswa yang memiliki nilai di bawah rata rata: ");
            }
        } else {
                System.out.println("Tidak ada data yang dimasukkan ");

            }
        }
    }
