import Model.classes.DatabaseHandler;

import java.aql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public boolean DeleteFromDB(String NIK){
        DatabaseHandler conn = new DatabaseHansler();
        conn.connect();

        String query = "Delete From data_penduduk WHERE NIK ='" + NIK + "'";
        try{
            Statement conStatment = conn.con.createStatement();
            int check = conStatement.executeUpdate(query);
            conn.disconnect();

            if(check == 0){
                return(false);
            }
            return(true);
        }catch(SQLException e){
            e.printStackTrace();
            conn.disconnect();
            return(false);
        }
    }
}
