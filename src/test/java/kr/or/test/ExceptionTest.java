package kr.or.test;
import java.io.IOException;
import java.io.InputStreamReader;

import org.edu.vo.MemberVO;
/**
 * 자바에서 예외처리하는 테스트 클래스
 * @author User
 *
 */
public class ExceptionTest {
	public static void main(String[] args) {
		//toString메서드에 대해서...
		MemberVO memberVO = new MemberVO();
		//맴버클래스에 값 을 입력해 봅니다. 메모리 DB에 입력합니다.
		memberVO.setUser_id("parksanghoon");
		memberVO.setUser_name("박상훈");
		memberVO.setEmail("rnrdj6062@naver.com");
		System.out.println("회원정보 클래스의 맴버변수 값들을 출력하기 =" 
		+ memberVO.getEmail());
		// 진입실행메서드 main()
		//메서드 내부변수 
		String[] stringArray = {"10", "2a", "100"};//2a는 강제로 예외사항 발생하기 위해서
		int indexValue = 0;
		for(int cnt=0;cnt<=2;cnt++) {
		
			/*//예외처리 Exception처리를 하지 않으면, 프로그램이 종료됩니다.
			indexValue = Integer.parseInt(stringArray[cnt]);//배열의 문자값을 int형변환
			System.out.println(cnt + " 번째 배열에 저장된 숫자는 = " + indexValue);
			*/

			try {
				indexValue = Integer.parseInt(stringArray[cnt]);//배열의 문자값을 int형변환
				System.out.println((cnt+1) + " 번째 배열에 저장된 숫자는 = " + indexValue);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("에러메세지 출력 = " + e.toString());
				System.out.println("배열의 크기가 올바르지 않습니다.");
			}catch(NumberFormatException e) {
				System.out.println("에러메시지 출력 = " + e.toString());
				System.out.println("개발자가 지정한 에러메세지는 숫자 변환시 에러가 발생 되었음.");
			}finally {
				System.out.println("finally는 try~catch 결과와 상관없이 항상 실행");
			}
			
		}
	}
}