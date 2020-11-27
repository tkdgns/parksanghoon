<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp: java server page 약자 자바서버용 페이지 -->
<%-- 자바주석 시작 
- jsp파일에서 자바 프로그램을 사용할 때 쓰는 <% %> 감싸주게 됩니다. 
- 다른언어 PHP예를 들면 <?php ?>꺽쇠로 감싸주게 됩니다. 
- @page 골뱅이는 애노테이션발음 =페이지 지시자 랭귀지:java, 
콘텐츠타입:text/html; 문자셋:유니코드 페이징인코딩:UTF-8
자바주석 끝--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반응형 홈페이지</title>
</head>
<body>
HomeController.java 에서 index.jsp로 매칭 시킨 결과가 나오는 페이지 입니다.<br>
- HTML에서는 /resoureces/sample/index.html이렇게 접근합니다.<br>
- jsp프로그램에서는 위 html처럼 바로접근 못하고 ,홈 컨트롤러자바를 거쳐서 index.jsp를 접근하는 이유는 보안떄문 입니다.<br>
- 그래서 ,은행,관공서, 대학에서 대부분 사용합니다.(스프링을 배우는 목적)<br>
- 다른 예로, php프로그램은 위에 있는 html처럼 파일에 바로 접근이 가능합니다 (일반 중소기업 홈페이지에 활용)<br>
- 출발은 자바(pc용애플리케이션, 웹프로램도 만드는데 모두 사용됩니다.)<br>
- 자바에서 출발한 스프링 프레임워크는: 자바에서 웹프로그램 만드는데 특화된 라이브러리(프로그램묶음)를 구조화 시키는것<br>
- 개발자가 편하게 만들어 놓은것이 스프링 프레임 워크.(현재 버전5. x 우리는 4.3.22버전 사용예정)<br>
- 그러면, jsp는 뭐냐: 지금 보이는 프로젝트는 스프링 MVC프로젝트입니다.<br>
- MVC= Model(데이터베이스) - Viwe(jsp페이지) <->Controller(컨트롤러java클래스)<br>
- org.edu.controller 패키지명:자바클래스가 있는 폴더 경로를 말합니다.<br>
- 패키지를 사용하는 이유: 자바 클래스를 기능별로 묶어놓기 위해서 명시적으로 만든 묶음.<br>
</body>
</html>