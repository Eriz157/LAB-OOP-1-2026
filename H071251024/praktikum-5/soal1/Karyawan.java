package soal1;
abstract class Karyawan {
    private String nama;
    private String idKaryawan;
    private int jumlahKehadiran = 0;

    Karyawan(String nama, String idKaryawan){
        this.nama = nama;
        this.idKaryawan = idKaryawan;
    }

    String getnama(){
        return nama;
    }
    String getidkaryawan(){
        return idKaryawan;
    }

    void hadir(){
        jumlahKehadiran++;
    }

    int getinfohadir(){
        return jumlahKehadiran;
    }

    abstract int hitungGaji();

    int panjang(int upah, int gaji){
        int panjang = 30;
        if (panjang < nama.length()){
            panjang = nama.length();
        } else if (panjang < idKaryawan.length()){
            panjang = idKaryawan.length();
        }else if (panjang < String.valueOf(upah).length()){
            panjang = String.valueOf(upah).length();
        }else if (panjang < String.valueOf(gaji).length()){
            panjang = String.valueOf(gaji).length();
        }
        return panjang;
    }

    int panjang(int upah, int gaji, int tunjangan){
        int panjang = 30;
        if (panjang < nama.length()){
            panjang = nama.length();
        } else if (panjang < idKaryawan.length()){
            panjang = idKaryawan.length();
        }else if (panjang < String.valueOf(upah).length()){
            panjang = String.valueOf(upah).length();
        }else if (panjang < String.valueOf(gaji).length()){
            panjang = String.valueOf(gaji).length();
        }else if (panjang < String.valueOf(tunjangan).length()) {
            panjang = String.valueOf(tunjangan).length();
        }
        return panjang;
    }
 }
