import java.sql.*;
public class Test {
    Connection con;
    public Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("���ݿ��������سɹ�");
                        /*
                        ע�⣺�¾��У�Aָ����Ҫ���ӵ����ݿ�����ƣ�Bָ��ĵ�¼����Cָ��ĵ�¼����
                         */
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName = Test","sa","zhbit");
            if(con != null) {
                System.out.println("���ݿ����ӳɹ�");
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