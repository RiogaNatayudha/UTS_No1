public class KTP {
    private String nama;
    private String telefon;
    private String tgl_lhr;

    public KTP(String nama) {
        this.nama = nama;
        this.telefon = "088888888888";
        this.tgl_lhr = "31-12-2012";
    }

    public void setTelefon(String telefon) {
        if (telefon.length() >= 12 && telefon.length() <= 13 && telefon.charAt(0) == '0') {
            this.telefon = telefon;
            System.out.println("Pergantian No Telepon Berhasil");
        } else {
            System.out.println("Nomor Telepon Tidak Valid");
        }
    }

    public void setTgl_lhr(String[] tgl_lhr) {
        int tanggal = Integer.parseInt(tgl_lhr[0]);
        int bulan = Integer.parseInt(tgl_lhr[1]);
        int tahun = Integer.parseInt(tgl_lhr[2]);

        if (tahun >= 1900 && bulan >= 1 && bulan <= 12) {
            int max_tanggal = 31;
            if (bulan == 2) {
                max_tanggal = 28;
            } else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
                max_tanggal = 30;
            }
            if (tanggal >= 1 && tanggal <= max_tanggal) {
                this.tgl_lhr = String.format("%d-%d-%d", tanggal, bulan, tahun);
                System.out.println("Pergantian Tanggal Lahir Berhasil");
            }
        }
    }
    public String toString() {
        return "KTP{" + "nama= " + nama+ ", telefon=" + telefon + ", tgl_lhr=" + tgl_lhr + '}';
    }
}
