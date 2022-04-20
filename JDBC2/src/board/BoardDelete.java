package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// delete from board where no = 97
public class BoardDelete {
	
	public static void main(String[] args) {
		//데이터
		long no = 3;
		
		//DB 정보  - Connection을 만들기
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String UID = "java00";
		String UPW = "java00";
		//사용객체 - delete : con , pstmt
		Connection con = null;
		PreparedStatement pstmt =null;
		
		//예외처리
		try {
			//1.드라이버확인
			Class.forName(driver);
			System.out.println("1.드라이버 확인완료");
			//2.2번이 연결
			con = DriverManager.getConnection(url, UID, UPW);
			System.out.println("2번 연결");
			//3.sql
			String sql = " delete from board where no = ? ";
			System.out.println("3.sql" + sql);
			//4.실행객체
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, no);
			System.out.println("4.실행객체 - " + pstmt);
			//5.실행
			int result = pstmt.executeUpdate();
			System.out.println("5.실행완료" + result);
			//6.표시
			System.out.println("6.표시 - 게시판 글이 수정되었습니다." + no);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null)con.close();
				if(pstmt != null)con.close();
				
				
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}

}
