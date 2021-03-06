<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="./include/header.jsp" %>

<section class="contact-section"><!-- division디비전이라는 div 영역표시 태그 대신에 사용 -->
<h1>CONTACT</h1>
<div class="container">
<!-- 폼태그의 필수 속성, name, action-데이터를 전송할 대상값, method-데이터를 전송하는 방법값 -->
<!-- input 한줄입력 태그, textarea 여러줄입력 태그 -->
<form name="message_form" action="/contact" method="post">
<!-- 플케이스 홀더:공간에 자리를 차지하지 않으면서 입력힌트를 보여주는 역활 -->
<fieldset>
<legend>현재폼이타이틀영역입니다.</legend>
<div class="input-class">
<label for="name">이름</label>
<!-- label은 이름표, 입력태그와 라벨은 1:1매칭이 있는 관계 -->
<input name="name" id="name" type="text" placeholder="박상훈">
<label for="phone">연락처</label>
<input name="phone" id="name" type="text" placeholder="000-0000-0000">
<label for="phone">이메일</label> 
<input name="email" type="text" placeholder="abc@abc.com">
<!-- 입력 제약조건 htm15에서 지원하는 기능 type에 꼭 enall라고 형식을 지정해야하지만 제약조건 작동이됨 -->
</div>
<div class="textarea-class">
<label for="message">메세지</label>
<textarea name="message" placeholder="내용을 입력"></textarea>
</div>
</fieldset>
<div class=submit-btn>
<button type="submit">메세지보내기</button>
</div>
</form>
<!-- form 태그의 목적은 input,textarea,checkbox,radio,select 데이터를
submit 전송하는것이 목적 -->
<!-- 폼전송은 get(비보안용), post(보안용) -->
<!-- get방식은 유일하게 검색할떄 사용됩니다. -->
</div>
</section>

<%@ include file="./include/footer.jsp" %>
