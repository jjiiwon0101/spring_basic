<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>학생들의 전체 성적 조회</h2>
	
	<c:forEach var="stu" items="${sList}">
		<p>
			학번: ${stu.stuId}, 이름:${stu.stuName}, 국어:${stu.kor}, 영어:${stu.eng},
			수학: ${stu.math}, 총점:${stu.total}, 평균: ${stu.average}
			<a href="">[삭제]</a>
		</p>
	</c:forEach>
	
	<a href="<c:url value='/score/register' />">다른 점수 등록하기</a>

</body>
</html>