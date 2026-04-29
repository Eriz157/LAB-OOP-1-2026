package soal1;
class KaryawanKontrak extends Karyawan{
    private int upahPerhari;
    KaryawanKontrak(String nama, String idKaryawan, int upahPerhari) {
        super(nama, idKaryawan);
        this.upahPerhari = upahPerhari;
    }

    @Override
    int hitungGaji() {
        int totalGaji = upahPerhari * getinfohadir();
        if (getinfohadir()>20){
            totalGaji += 500000;
        }
        return totalGaji;
    }

    void tampilkanInfo() {
        int panjang = panjang(upahPerhari,hitungGaji());
        System.out.println("╔═══════════════════" + "═".repeat(panjang)                                                              + "╗");
        System.out.println("║ NAMA KARYAWAN   : " + getnama() + " ".repeat(panjang-getnama().length())                                       + "║");
        System.out.println("║ ID KARYAWAN     : " + getidkaryawan() + " ".repeat(panjang-getidkaryawan().length())         + "║");
        System.out.println("║ UPAH PERHARI    : " + upahPerhari + " ".repeat(panjang-String.valueOf(upahPerhari).length())                       + "║");
        System.out.println("║ GAJI BULAN INI  : " + hitungGaji() + " ".repeat(panjang-String.valueOf(hitungGaji()).length())            + "║");
        System.out.println("╚═══════════════════" + "═".repeat(panjang)                                                              + "╝");
    }
}
