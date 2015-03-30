import java.sql.*;
public class Test {
    Connection con;
    public Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("数据库驱动加载成功");
                        /*
                        注意：下句中，A指你所要连接的数据库的名称，B指你的登录名，C指你的登录密码
                         */
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName = Test","sa","zhbit");
            if(con != null) {
                System.out.println("数据库连接成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
     
    public static void main(String[] args) {
        Test getConn = new Test();
        getConn.getConnection();
    }
}