package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardList {

	public static void main(String[] args) {
		//DB접속정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //서버나, 포트 정보등이 있어야 한다.
		String UID = "java00";
		String UPW = "java00";
		
		//사용할 객체
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			//드라이버가 있는지 확인 하고 클래스 정보를 로딩(Static) 해야만한다.-> 서버가 돌아갈때
			//맨처음 한번만 하면된다.
			Class.forName(driver);
			System.out.println("1.드라이버 확인 완료.");
			
			// 2.서버 연결 - 서버, 사용자 정보 
			con  = DriverManager.getConnection(url, UID, UPW);
			System.out.println("2. 오라클 서버 연결 완료 : " + con);
			
			// 3.실행할 SQL을 작성
			String sql = "select no, title, writer, writeDate, hit "
					+ "from board order by no desc";
			System.out.println("3.실행할 sql 문장 : " + sql );
			
			// 4.작성된 커리를 실행하기 위한 객체 & 데이터 세팅 
			pstmt = con.prepareStatement(sql);
			System.out.println("4.실행객체 생성 설정 완료 : " + pstmt );
			
			// 5.실행 - select : executeQuery() / insert, update, delete : executeUpdate()
			rs = pstmt.executeQuery();
			System.out.println("5.실행완료 : "  +  rs);
			
			//6.표시 또는 데이터 담기 
			if(rs != null) {
				//next 다음 데이터가 있으면 true를 리턴해준다. 작업 데이터의 포인트를 다음 데이터로 이동시켜준다.
				while(rs.next()) {
					//rs.get데이터타입("select의 데이터 타입")
					System.out.print(" | " + rs.getLong("no"));
					System.out.print(" | " + rs.getString("title"));
					System.out.print(" | " + rs.getString("writer"));
					System.out.print(" | " + rs.getString("writeDate"));
					System.out.print(" | " +rs.getLong("hit"));
					System.out.println();
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					// 7. 사용한 객체 닫기
					if(con != null)con.close();
					if(pstmt != null)pstmt.close();
					if(rs != null)rs.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
