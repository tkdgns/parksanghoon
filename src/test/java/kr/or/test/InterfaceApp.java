package kr.or.test;

public class InterfaceApp {

	public static void main(String[] args) {
		// 자바프로그램은 항상 min() 진입점에서 실행하시는겁니다. 단, 앱프로그램은 해당없음..
		AllCalc allCalc = new AllCalc();//실행 오브젝트 변수 allcalc 생성
		allCalc.add(5, 5);
		allCalc.sub(10, 10);//메서드를 호출할때, 5,5 / 10,10 이렇게 매개변수가 고정되지 않고,
		allCalc.mul(5, 5);//동적으로 묶이는 방식을 동정바인딩이라고 함.
		allCalc.div(5, 5);
	}

}

//인터페이스 실습아래(아래) 명세표만-메서드명만 있고 , 구현내용이 없는 구조
interface CalcAddsub {
	void add(double dx, double dy);
	void sub(double dx, double dy);
}
interface Ca1cMulDiv extends CalcAddsub {
	void mul(double dx, double dy);
	void div(double dx, double dy);
}
class AllCalc implements CalcAddsub, Ca1cMulDiv {//임플리먼트:구현하다 의미 뒤에 있는 클래스 명세표 기준 구현한다.
	
	@Override
	public void mul(double dx, double dy) {
		//구현내용
		System.out.println("곱하기 결과는" + dx*dy);
	}
	@Override
	public void div(double dx, double dy) {
		//구현내용
		System.out.println("나누기 결과는" + dx*dy);
	}
	@Override
	public void add(double dx, double dy) {
		//구현내용
		System.out.println("더하기 결과는" + dx*dy);
	}
	@Override
	public void sub(double dx, double dy) {
		//구현내용
		System.out.println("빼기 결과는" + dx*dy);
	}// 임플리먼트: 구현하다 의미 뒤에 있는 클래스명세표기준 구현한다.
	
}