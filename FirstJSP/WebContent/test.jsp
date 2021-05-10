<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="testResult.jsp">
		이름 : <input type="text" name="name"><br>
		주소 : <input type="text" name="addr"><br>
		전화번호 : <input type="text" name="phone"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>

<%-- 웹프로그램 ===> jsp php asp

클라이언트		   서버

웹서버 ===> 아파치
웹컨테이너(웹엔진) ===> 톰캣
WAS(Web Application Server) ===> 웹서버 + 웹컨테이너:톰캣

컴퓨터를 서버로 만든다
클라이언트랑 서버 역할 동시에


클라이언트		  서버
	  객체
      request : 요청
      response : 응답
      out : 출력 => 표현식 <%= %>


<% %> : 스크립트릿 ==> 자바문법사용 --%>