package modul5.model;

import java.sql.Date;

public class KTP {
    private String NIK;
    private String nama;
    private String tempatLahir;
    private Date tanggalLahir;
    private String jenisKelamin;
    private String golonganDarah;
    private String alamat;
    private String RT_RW;
    private String kelDesa;
    private String kecamatan;
    private String agama;
    private String statusPerkawinan;
    private String pekerjaan;
    private String kewarganegaraan;
    private String berlakuHingga;
    private String kotaPembuatan;
    private Date tanggalPembuatan;
    private String fotoPath;
    private String tandaTanganPath;
    
    public KTP(String nIK, String nama, String tempatLahir, Date tanggalLahir, String jenisKelamin,
            String golonganDarah, String alamat, String rT_RW, String kelDesa, String kecamatan, String agama,
            String statusPerkawinan, String pekerjaan, String kewarganegaraan, String berlakuHingga,
            String kotaPembuatan, Date tanggalPembuatan, String fotoPath, String tandaTanganPath) {
        this.NIK = nIK;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.golonganDarah = golonganDarah;
        this.alamat = alamat;
        this.RT_RW = rT_RW;
        this.kelDesa = kelDesa;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.berlakuHingga = berlakuHingga;
        this.kotaPembuatan = kotaPembuatan;
        this.tanggalPembuatan = tanggalPembuatan;
        this.fotoPath = fotoPath;
        this.tandaTanganPath = tandaTanganPath;
    }
    public String getNIK() {
        return NIK;
    }
    public void setNIK(String nIK) {
        this.NIK = nIK;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getTempatLahir() {
        return tempatLahir;
    }
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
    public Date getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getGolonganDarah() {
        return golonganDarah;
    }
    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getRT_RW() {
        return RT_RW;
    }
    public void setRT_RW(String rT_RW) {
        this.RT_RW = rT_RW;
    }
    public String getKelDesa() {
        return kelDesa;
    }
    public void setKelDesa(String kelDesa) {
        this.kelDesa = kelDesa;
    }
    public String getKecamatan() {
        return kecamatan;
    }
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
    public String getAgama() {
        return agama;
    }
    public void setAgama(String agama) {
        this.agama = agama;
    }
    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }
    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }
    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }
    public String getBerlakuHingga() {
        return berlakuHingga;
    }
    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }
    public String getKotaPembuatan() {
        return kotaPembuatan;
    }
    public void setKotaPembuatan(String kotaPembuatan) {
        this.kotaPembuatan = kotaPembuatan;
    }
    public Date getTanggalPembuatan() {
        return tanggalPembuatan;
    }
    public void setTanggalPembuatan(Date tanggalPembuatan) {
        this.tanggalPembuatan = tanggalPembuatan;
    }
    public String getFotoPath() {
        return fotoPath;
    }
    public void setFotoPath(String fotoPath) {
        this.fotoPath = fotoPath;
    }
    public String getTandaTanganPath() {
        return tandaTanganPath;
    }
    public void setTandaTanganPath(String tandaTanganPath) {
        this.tandaTanganPath = tandaTanganPath;
    }

}
