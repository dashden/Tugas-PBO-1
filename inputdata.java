import java.util.Scanner;

public class inputdata {
    inputdata(){
        Scanner input = new Scanner(System.in);

        // input nama
        System.out.print("Masukkan nama : ");
        String nama = input.next();
        
        // input nim
        System.out.print("Masukkan NIM : ");
        int nim = input.nextInt();

        // input nilai
        System.out.print("Masukkan Nilai Tubes : ");
        float tubes = input.nextFloat();

        System.out.print("Masukkan nilai QUIZ : ");
        float nquiz = input.nextFloat();

        System.out.print("Masukkan nilai Tugas : ");
        float ntugas = input.nextFloat();

        System.out.print("Masukkan nilai UTS : ");
        float niluts = input.nextFloat();
        System.out.print(niluts);

        System.out.print("Masukkan Nilai UAS : ");
        float niluas = input.nextFloat();
        
        // perhitungan nilai
        double totalnilai = (0.3 * tubes) + (0.1 * nquiz) + (0.1 * ntugas) + (0.25 * niluts) + (0.25 * niluas);
        
        // menampilkan hasil input
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek : " + totalnilai);
    }
}
