package ch12collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSetExample {
	
	public static void main(String[] args) {
		//중복되지않은 integer 데이터를 저장
		//set은 인턴페이스구나 
		Set<Integer> lotto = new HashSet<Integer>();
		// 난수발생객체 = 타임스템프를 시드값으로 사용한다.
		Random random = new Random();	
		// 데이터 갯수가 6이면 계속 반복 6개가 되면 빠져 나간다.
		while(lotto.size()<6) {
			//1~45까지 랜덤숫자를 하나를 set 변수인 lotto에 저장한다. - 같은 데이이터를 덮어 쓰기한다.
			lotto.add(random.nextInt(45)+1);
		}
		// 숫자가 중복하지 않은 6개의 데이터를 출력하게 된다.
		System.out.println(lotto);
		//정렬해서 출력하려면 set 순서가 없으므로 배열로 받아 낸다.
		Object[] lottoArr = lotto.toArray();
		Arrays.sort(lottoArr);
		System.out.println(Arrays.toString(lottoArr));
	}

}
