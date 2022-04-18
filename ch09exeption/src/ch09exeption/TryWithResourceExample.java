package ch09exeption;

public class TryWithResourceExample {
	
	public static void main(String[] args) {
		
		//정상 처리를 - try(자원) -> 자원은 try문을 빠져나가면 자동으로 닫기를 해준다.
		try(FileInputStream fis = new FileInputStream("file.txt")){
			
		} catch (Exception e) { // 오류가 발생하면 예외 객체를 생성하고 던진다.
			// TODO Auto-generated catch block
			System.out.println("예외처리 코드가 실행되었습니다.");
		}
		
	}

}
