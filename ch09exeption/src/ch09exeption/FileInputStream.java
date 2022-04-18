package ch09exeption;

public class FileInputStream implements AutoCloseable {
	
	private String file;
	
	
	//생성자 - file 의 데이터를 전달받아서 셋팅한다.
	// 처리를 위한 메서드 - 파일의 데이터를 읽어온다. -가짜
	public FileInputStream(String file) {
		this.file = file;
		
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	
	
	//파워 자원을 닫는 메서드 - 상속 받은 추상 메서드의 반드시 해야만 한다.
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
		
	}

}
