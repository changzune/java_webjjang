package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB {

	// DB 정보 - DB.DRIVER
	// final 변수의 경우 올 대문자를 사용한다.
	private final static String DRIVER = "oracle.jdbc.OracleDriver";
	private final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final static String UID = "java00";
	private final static String UPW = "java00";
	
	// checkDriver가 true면 있는거, false이면 없는거.
	private static boolean checkDriver = false;
	
	// static 초기화 블록
	// 처음 실행되는 곳 (main())에서 Class.forName(DB) 코드를 넣어 줘야 실행 된다.
	static {
		try {
			Class.forName(DRIVER);
			//드라이버가 있는 경우 입니다.
			checkDriver = true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		//연결 객체를 받아가는 메서드 getConnection()
		public static Connection getConnection() throws SQLException {
			return DriverManager.getConnection(URL, UID, UPW);
	}
		
	// 2개의 객체 닫기 - con, pstmt 
		public static void close(Connection con, PreparedStatement pstmt) throws SQLException {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
		}

}
