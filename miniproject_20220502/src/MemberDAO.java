import java.sql.*;

public class MemberDAO {
    // JDBC 변수
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    // 테이블 SQL 명령어
    private final String MEMBER_LIST = "select * from MEMBER order by MEMBER_ID asc";
    private final String MEMBER_INSERT = "insert into MEMBER (MEMBER_ID, NAME, PHONE_NUMBER) values (?, ?, ?)";
    private final String MEMBER_UPDATE = "UPDATE MEMBER SET PHONE_NUMBER = ? where MEMBER_ID = ?";
    private final String MEMBER_DELETE = "delete MEMBER where MEMBER_ID =?";

    public static Connection getConnection(){
        Connection getConn = null;
        try {
            DriverManager.registerDriver(new org.h2.Driver());
            getConn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/creat_table", "sa", "a");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getConn;
    }

    // 회원정보 입력
    public void insertMember(String member_ID, String name, String phone_Number) {
        try {
            conn = getConnection();
            stmt = getConnection().prepareStatement(MEMBER_INSERT);
            stmt.setString(1, member_ID);
            stmt.setString(2, name);
            stmt.setString(3, phone_Number);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close(stmt, conn);
    }

    // 회원정보 수정
    public void updateMember(String member_ID, String phone_Number){

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(MEMBER_UPDATE);
            stmt.setString(1, phone_Number);
            stmt.setString(2, member_ID);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            close(stmt, conn);
        }
    }

    public void getMemberList() {
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(MEMBER_LIST);
            rs = stmt.executeQuery();
            if (!rs.wasNull()) {

                while (rs.next()) {
                    System.out.print("---> Member [memberId = ");
                    System.out.print(rs.getString("MEMBER_ID") + ", ");
                    System.out.print(rs.getString("NAME") + ", ");
                    System.out.print(rs.getString("PHONE_NUMBER") +"]");
                    System.out.println();
                }
                System.out.println("");
            } else{
                System.out.println("등록된 회원이 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(rs, stmt, conn);
        }
    }

    public void deleteMember(String member_ID) {
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(MEMBER_DELETE);
            stmt.setString(1, member_ID);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close(stmt, conn);
        }
    }

    public static void close(PreparedStatement stmt, Connection conn) {
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
        // JDBC 5단계 : 연결 해제
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
