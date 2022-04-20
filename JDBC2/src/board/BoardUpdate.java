package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardUpdate {
	
	public static void main(String[] args) {
		// 수정할 데이트 - 글번호 , 제목, 내용, 작성자가 필요하다.
		long no = 2;
		String title = "oracle";
		String content ="oracle javazzang";
		String writer = "son";
		
		// DB정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String UID = "java00";
		String UPW = "java00";
		// 사용객체
		Connection con = null;
		PreparedStatement pstmt = null;

		// 예외처리가 필요하다
		try {
			//1. 드라이버 확인
			Class.forName(driver);
			//2. 연결
			con = DriverManager.getConnection(url, UID, UPW);
			//3. sql작성
			String sql = "update board set title = ?, content = ?, writer = ? "
					+ " where no = ?";
			//4. 실행객체 & 데이터 셋팅
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, writer);
			pstmt.setLong(4, no);
			//5. 실행
			int result = pstmt.executeUpdate();
			//6. 결과 표시 저장
			System.out.println("게시판 수정이 되었습니다." + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//7.닫기
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
