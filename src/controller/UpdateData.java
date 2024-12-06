package controller;

import Model.classes.Penduduk;
import Model.classes.DatabaseHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class UpdateData {
    public boolean updateValueToDB(Map<String, Object> allInput){
        Penduduk tempData = Temporary.temp(allInput);
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();

        String query = "UPDATE dataPenduduk SET "
                + "nama = ?, "
                + "tempatLahir = ?, "
                + "tanggalLahir = ?, "
                + "jenisKelamin = ?, "
                + "golDarah = ?, "
                + "alamat = ?, "
                + "rt_Rw = ?, "
                + "kel_Desa = ?, "
                + "kecamatan = ?, "
                + "agama = ?, "
                + "statusPerkawinan = ?, "
                + "pekerjaan = ?, "
                + "kewarganegaraan = ?, "
                + "foto = ?, "
                + "tandaTangan = ?, "
                + "berlakuHingga = ?, "
                + "kotaPembuatan = ?, "
                + "tanggalPembuatan = ? "
                + "WHERE NIK = ?";

                try {
                    PreparedStatement conStatement = conn.con.prepareStatement(query);
                    conStatement.setString(1, tempData.getNama());
                    conStatement.setString(2, tempData.getTempatLahir());
                    conStatement.setDate(3, new java.sql.Date(tempData.getTanggalLahir().getTime()));
                    conStatement.setString(4, tempData.getJenisKelamin().toString());
                    conStatement.setString(5, tempData.getGolDarah().toString());
                    conStatement.setString(6, tempData.getAlamat());
                    conStatement.setString(7, tempData.getRt_Rw());
                    conStatement.setString(8, tempData.getKel_Desa());
                    conStatement.setString(9, tempData.getKecamatan());
                    conStatement.setString(10, tempData.getAgama().toString());
                    conStatement.setString(11, tempData.getStatusPerkawinan().toString());
                    conStatement.setString(12, tempData.getPekerjaan());
                    conStatement.setString(13, tempData.getKewarganegaraan());
                    conStatement.setString(14, tempData.getFoto());
                    conStatement.setString(15, tempData.getTandaTangan());
                    conStatement.setString(16, tempData.getBerlakuHingga());
                    conStatement.setString(17, tempData.getKotaPembuatan());
                    conStatement.setDate(18, new java.sql.Date(tempData.getTanggalPembuatan().getTime()));
                    conStatement.setString(19, tempData.getNIK());

                    int check = conStatement.executeUpdate();
            conn.disconnect();

            if(check==0){
                return (false);
            }

            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }  
    }
}
