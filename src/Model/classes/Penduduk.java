package Model.classes;

import model.Enum.Agama;
import model.Enum.GolonganDarah;
import model.Enum.JenisKelamin;
import model.Enum.StatusPerkawinan;

public class Penduduk {
    private String nik, nama, tempatLahir, alamat, rt_Rw, kel_Desa, kecamatan, pekerjaan, kewarganegaraan, berlakuHingga, kotaPembuatan, foto, tandaTangan;
    private JenisKelamin jenisKelamin;
    private GolonganDarah golonganDarah;
    private Agama agama;
    private StatusPerkawinan statusPerkawinan;
    private Date tanggalLahir, tanggalPembuatan;

    public Penduduk(String nik, String nama, String tempatLahir, JenisKelamin jenisKelamin, GolonganDarah golonganDarah, String alamat, String rt_Rw, String kel_Desa, String kecamatan, Agama agama, StatusPerkawinan statusPerkawinan, String pekerjaan, String kewarganegaraan, String berlakuHingga, String kotaPembuatan, String foto, String tandaTangan, Date tanggalLahir, Date tanggalPembuatan) {
        this.nik = nik;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.golonganDarah = golonganDarah;
        this.alamat = alamat;
        this.rt_Rw = rt_Rw;
        this.kel_Desa = kel_Desa;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.berlakuHingga = berlakuHingga;
        this.kotaPembuatan = kotaPembuatan;
        this.foto = foto;
        this.tandaTangan = tandaTangan;
        this.tanggalPembuatan = tanggalPembuatan;
    }

    //getter setter
    //nik
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }

    //nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Tempat lahir
    public String getTempatLahir() {
        return tempatLahir;
    }
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    //Jenis Kelamin
    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    //Golongan darah
    public GolonganDarah getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(GolonganDarah golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    //alamat
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //Rt_Rw
    public String getRt_Rw() {
        return rt_Rw;
    }
    public void setRt_Rw(String rt_Rw) {
        this.rt_Rw = rt_Rw;
    }

    //kel_Desa
    public String getKel_Desa() {
        return kel_Desa;
    }
    public void setKel_Desa(String kel_Desa) {
        this.kel_Desa = kel_Desa;
    }

    //kecamatan
    public String getKecamatan() {
        return kecamatan;
    }
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    //agama
    public Agama getAgama() {
        return agama;
    }

    public void setAgama(Agama agama) {
        this.agama = agama;
    }

    //status perkawinan
    public StatusPerkawinan getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(StatusPerkawinan statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    //pekerjaan
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    //Kewarganegaraan
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }
    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    //berlaku hingga
    public String getBerlakuHingga() {
        return berlakuHingga;
    }
    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }

    //kota pembuatan KTP
    public String getKotaPembuatan() {
        return kotaPembuatan;
    }
    public void setKotaPembuatan(String kotaPembuatan) {
        this.kotaPembuatan = kotaPembuatan;
    }

    //foto
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }

    //tanda tangan
    public String getTandaTangan() {
        return tandaTangan;
    }
    public void setTandaTangan(String tandaTangan) {
        this.tandaTangan = tandaTangan;
    }

    //tanggal lahir
    public Date getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    //tanggal pembuatan
    public Date getTanggalPembuatan() {
        return tanggalPembuatan;
    }
    public void setTanggalPembuatan(Date tanggalPembuatan) {
        this.tanggalPembuatan = tanggalPembuatan;
    }
   
}
