package soal1;
class KaryawanTetap extends Karyawan {
    private int gajiPokok;
    private int tunjanganMakan;
    private int bonusKinerja;

    KaryawanTetap(String nama, String idKaryawan, int gajiPokok, int tunjanganMakan, int bonusKinerja) {
        super(nama, idKaryawan);
        this.gajiPokok = gajiPokok;
        this.tunjanganMakan = tunjanganMakan;
        this.bonusKinerja = bonusKinerja;
    }

    @Override
    public int hitungGaji() {
        return gajiPokok + (tunjanganMakan * getinfohadir());
    }

    public double hitungGaji(double bonusKinerja) {
        return hitungGaji() + bonusKinerja;
    }

    void tampilkanInfo() {
        int panjang = panjang(gajiPokok,hitungGaji(),tunjanganMakan);
        System.out.println("╔═══════════════════" + "═".repeat(panjang)                                                            + "╗");
        System.out.println("║ NAMA KARYAWAN   : " + getnama() + " ".repeat(panjang-getnama().length())                       + "║");
        System.out.println("║ ID KARYAWAN     : " + getidkaryawan() + " ".repeat(panjang-getidkaryawan().length())           + "║");
        System.out.println("║ UPAH PERHARI    : " + gajiPokok + " ".repeat(panjang-String.valueOf(gajiPokok).length())       + "║");
        System.out.println("║ TUNJANGAN MAKAN : " + tunjanganMakan + " ".repeat(panjang-String.valueOf(tunjanganMakan).length())       + "║");
        System.out.println("║ BONUS KINERJA   : " + bonusKinerja + " ".repeat(panjang-String.valueOf(bonusKinerja).length())       + "║");
        System.out.println("║ GAJI BULAN INI  : " + hitungGaji(bonusKinerja) + " ".repeat(panjang-String.valueOf(hitungGaji(bonusKinerja)).length()) + "║");
        System.out.println("╚═══════════════════" + "═".repeat(panjang)                                                            + "╝");
    }
}