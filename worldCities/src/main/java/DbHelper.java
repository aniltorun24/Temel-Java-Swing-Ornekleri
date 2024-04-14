
import java.sql.*;



public class DbHelper {
    private String userName="root";
    private String password="12345";
    private String dbUrl="jdbc:myspq://localhost:3306/world?useSSL=false&serverTimezone=UTC";//mysqldeki world tablosuna bağlanması için gerekli url
    //burada mysql connectörünü projeye eklemel gerekiyor.
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("error:"+exception.getMessage());
        System.out.println("errorcode:"+exception.getErrorCode());
        
    }
}
