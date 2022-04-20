package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardWrite {
	
	public static void main(String[] args) {
		//DB에 입력할 정보 - 사용자 입력
		String title = "jdbc";
		String content = "데이터베이스 연결 프로그램";
		String writer = "이창준";
		
		//DB 정보
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String UID = "java00";
		String UPW = "java00";
		
		//사용객체
		Connection con = null;
		PreparedStatement pstmt =null;
		//예외처리
		try {
			//1.드라이버확인
			Class.forName(driver);
			System.out.println("1.드라이버확인완료.");
			//2.연결
			con =DriverManager.getConnection(url, UID, UPW);
			System.out.println("2.연결완료." + con);
			
			//3.실행 SQL 작성
			String sql = "insert into board(no, title, content, writer) "
					+ "values(board_seq.nextval, ?, ?, ?)";
			System.out.println("3. SQL" + sql );
			
			//4.실행객체 & 데이터 세팅
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, writer);
			System.out.println("4.실행객체 성공 -" + pstmt);
			//5.실행 select - executeQuety() / insert, update, delete : executeUpdate()
			// result가 1이면 성공적으로 등록 0이면 등록 안됨
			// insert의 경우에는 0이 나오지 않는다. 0이라는것 예외
	
			int result = pstmt.executeUpdate();
			System.out.println("5. 실행 완료 : " + result );

			//6.표시 또는 저장 
			System.out.println("6. 게시판 등록 완료 :");
			
		} catch (Exception e) {
			e.printStackTrace();			
		}finally {
			try {
				//7.사용 객체 닫기
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				System.out.println("7.객체 닫기 성공");
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
	}

}
