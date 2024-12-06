package controller;

import Model.classes.penduduk;
import Model.classes.DatabaseHandler;
import Model.Enum.Agama;
import Model.Enum.GolonganDarah;
import Model.Enum.JenisKelamin;
import Model.Enum.StatusPerkawinan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {
    public Penduduk fetchDataFromDB(String NIK){
        DatabaseHandler conn = DatabaseHandler();
        conn.connect();
        String query = "SELECT * FROM dataPenduduk WHERE NIK= '\" + NIK + \"'";
        Penduduk user = new Penduduk();
        user.setNIK(NIK);

        try{
            Statement conStatement = conn.con.createStatement();
            ResultSet rs = conStatement.executeQuery(query);
            while(rs.next()){
                user.setNama(rs.getString("nama"));
                user.setTempatLahir(rs.getString("tempatLahir"));
                user.setTanggalLahir(rs.getDate("tanggalLahir"));

                switch (rs.getString("jenisKelamin")) {
                    case "PRIA":
                        user.setJenisKelamin(JenisKelamin.PRIA);
                        break;
                    case "WANITA":
                        user.setJenisKelamin(JenisKelamin.WANITA);
                        break;
                        
                }

                switch (rs.getString("golDarah")) {
                    case "A":
                        user.setGolDarah(GolonganDarah.A);
                        break;
                    case "B":
                        user.setGolDarah(GolonganDarah.B);
                        break;
                    case "O":
                        user.setGolDarah(GolonganDarah.O);
                        break;
                    case "AB":
                        user.setGolDarah(GolonganDarah.AB);
                        break;
                }

                user.setAlamat(rs.getString("alamat"));
                user.setRt_Rw(rs.getString("rt_Rw"));
                user.setKel_Desa(rs.getString("kel_Desa"));
                user.setKecamatan(rs.getString("kecamatan"));

                switch (rs.getString("agama")) {
                    case "KRISTEN":
                        user.setAgama(Agama.KRISTEN);
                        break;
                    case "KATOLIK":
                        user.setAgama(Agama.KATOLIK);
                        break;
                    case "BUDHA":
                        user.setAgama(Agama.BUDHA);
                        break;
                    case "HINDU":
                        user.setAgama(Agama.HINDU);
                        break;
                    case "ISLAM":
                        user.setAgama(Agama.ISLAM);
                        break;
                    case "KONGHUCHU":
                        user.setAgama(Agama.KONGHUCHU);
                        break;
                }

                switch (rs.getString("statusPerkawinan")) {
                    case "BELUM_MENIKAH":
                        user.setStatusPerkawinan(StatusPerkawinan.BELUM_MENIKAH);
                        break;
                    case "MENIKAH":
                        user.setStatusPerkawinan(StatusPerkawinan.MENIKAH);
                        break;
                    case "JANDA":
                        user.setStatusPerkawinan(StatusPerkawinan.JANDA);
                        break;
                    case "DUDA":
                        user.setStatusPerkawinan(StatusPerkawinan.DUDA);
                        break;
                }

                user.setPekerjaan(rs.getString("pekerjaan"));
                user.setKewarganegaraan(rs.getString("kewarganegaraan"));
                user.setFoto(rs.getString("foto"));
                user.setTandaTangan(rs.getString("tandaTangan"));
                user.setBerlakuHingga(rs.getString("berlakuHingga"));
                user.setKotaPembuatan(rs.getString("kotaPembuatan"));
                user.setTanggalPembuatan(rs.getDate("tanggalPembuatan"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return (user);
    }
}
