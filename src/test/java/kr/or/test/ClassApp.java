package kr.or.test;

public class ClassApp {

	public static void main(String[] args) {
		// 이클래스의 진입 메서드 main 실행
		/*
		 *circle은 우리가 지정한 클래스 이름인거고,
		 *circle c 클래스 이름 + c(라는 뭔가 값 구하는 방식인거고) = new 클래스 네임 (반지름 5)인가요
		 */
		circle c = new circle(5);//인스턴스 (오브젝트 클래스)변수 c 생성 new 키워드 생성장 circle(반지름값5)
		//circle클래스를 c 이름으로 prefix해서 사용하는겁니다.
		circle c2 = new circle(10);
		//자바프로그램의 특징은 OOP프로그램밍의 대표적인사례, object=위 에서 new 키워드로 생성한 c 오브젝트,
		//자바에서 OOP를 사용방식을 설명하는 예, 스프링에서는 new 키워대신 @Inject를 주로사용.
		double print_result=c.getParksanghoon();
		System.out.println("원의 넓이는" + print_result + "입니다.");
		double print_result2=c2.getParksanghoon();
		System.out.println("원의 넓이는" + print_result2 + "입니다.");
		//아래 new 키워드 생성자를 이용해서 오브젝트를 2개 만들었음.
		Employee employee = new Employee();
		Salesman salesman = new Salesman();
		Development development = new Development();		
		//employee.dojob();
		//salesman.dojob();
		//development.dojob();
		GraphicObject graphicObject = new Triangle();
		graphicObject.draw();//클래스형 변수명을 지정할때, 카멜표기(낙타등)를 적용.
		//더하기, 빼기 int sum =5 +3 ;
	}

}


//메서드 오버라이드(메서드 이름이 같은 것을 실행-상속관계)
//메서드 오버로드(메서드이름은 고유값이라서 중복해서 사용할 수 없어요, 단 매게변수(인자값)가 다르면 가능합니다.)
//추상클래에 대한 연습(아래)
//추상클래스또는 인터페이스를 사용하는 목적은 두꺼운 책에서 목차를 만드는 것과 똑같은 역할.
abstract class GraphicObject {
	int x, y;//그래픽오브젝트 클래스 맴버변수 선언
	abstract void draw();//명세만 있고 구현내용이 없는 (인터페이스) 추상메서드 선언
	//다른 해석하면, 책에서 목차만 있고 , 내용이 없는 구조.
}
class Triangle extends GraphicObject {
	//메서드 오버라이드(메서드 이름이 같은것을 상속관계에서 실행)=부모 메서드 재정의, 대표적인 다형성을 구현하는 것.
	@Override//메서드 제정의
	void draw() {
		System.out.println(" *");
		System.out.println(" * * ");
		System.out.println("*****");
	}
}
//클래스 상속에 대한연습 (아래)
class Employee{//회식의 지원들 클래스
	int nsalary;//회사직원 봉급 맴버변수
	String szDept;//회사직원의 부서명 맴버변수
	public void dojob() {
		System.out.println("환영합니다.직원분들!");
	}
}
class Salesman extends Employee{
	public Salesman( ) {//클래스명과 똑같은 메서드를 생성자 매서드 입니다.
		szDept = "판매부서";//부모클래스 Employee의 szDept 맴버변수를 자식 클래스에서도 사용가능
	}
	public void dojob() {
		System.out.println("환영합니다."+ szDept+" 입니다!");
	}
}
class Development extends Employee{
	public Development() {szDept="개발부서";}
	public void dojob() {
		System.out.println("환영합니다."+ szDept+"입니다.!");
	}
}
//오브젝트 생성과  new키워드 사용 연습(아래)
class circle {
	int r;//맴버 변수 반지름 이클래스에서 전연 변수
	public circle(int a) {//생성자 메서드
		r = a;
	}
	public double getParksanghoon() {
		return r*r*3.14;//원의 넓이를 반환
	}
}