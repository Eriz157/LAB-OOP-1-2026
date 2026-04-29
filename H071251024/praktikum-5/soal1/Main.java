package soal1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner riz = new Scanner(System.in);
//        KARYAWAN KONTRAK


//        KARYAWAN TETAP
        System.out.print("berapa bonus kinerja : ");int bonus = riz.nextInt();
        KaryawanTetap eriz = new KaryawanTetap("Eriz","H0712", 2000000, 500000,bonus);
        System.out.print("how much present : ");int absenKT = riz.nextInt();
        for (int i = 0; i < absenKT; i++ ){
            eriz.hadir();
        }
        eriz.tampilkanInfo();

        KaryawanKontrak rizo = new KaryawanKontrak("rizo", "I345", 500000);
        System.out.print("how much present : ");int absenKK = riz.nextInt();
        for (int i = 0; i < absenKK; i++ ){
            rizo.hadir();
        }
        rizo.tampilkanInfo();

    }
}