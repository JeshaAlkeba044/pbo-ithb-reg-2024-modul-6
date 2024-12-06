import Model.classes.Penduduk;
import Model.classes.DatabaseHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.TimeZone;

public class SavingData {
    // public SavingData(){

    // }

    public boolean insertValueToDB(Map<String, Object> allInput){
        DataPenduduk tempData = Temporary.temp(allInput);
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();

        String query = "INSERT INTO dataPenduduk VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement conStatement = conn.con.prepareStatement(query);
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

           conStatement.setString(1,null);
           conStatement.setString(2, tempData.getNIK());
           conStatement.setString(3, tempData.getNama());
           conStatement.setString(4, tempData.getTempatLahir());
           conStatement.setDate(5, new java.sql.Date(tempData.getTanggalLahir().getTime()));
           conStatement.setString(6, tempData.getJenisKelamin().toString());
           conStatement.setString(7, tempData.getGolDarah().toString());
           conStatement.setString(8, tempData.getAlamat());
           conStatement.setString(9, tempData.getRt_Rw());
           conStatement.setString(10, tempData.getKel_Desa());
           conStatement.setString(11, tempData.getKecamatan());
           conStatement.setString(12, tempData.getAgama().toString());
           conStatement.setString(13, tempData.getStatusPerkawinan().toString());
           conStatement.setString(14, tempData.getPekerjaan());
           conStatement.setString(15, tempData.getKewarganegaraan());
           conStatement.setString(16, tempData.getFoto());
           conStatement.setString(17, tempData.getTandaTangan());
           conStatement.setString(18, tempData.getBerlakuHingga());
           conStatement.setString(19, tempData.getKotaPembuatan());
           conStatement.setDate(20, new java.sql.Date(tempData.getTanggalPembuatan().getTime()));

           conStatement.executeUpdate();
            conn.disconnect();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            conn.disconnect();
            return (false);
        }
    }
}
