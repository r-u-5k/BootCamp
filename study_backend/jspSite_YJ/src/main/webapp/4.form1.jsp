<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>form 요소 연습</title>
</head>
<body>
	<br />
	<br />
	<br />
	<h1 align="center">회원가입</h1>
	<form action="4.join1.jsp" method="post">
		<table width="600px" border="1px" align="center">
			<tr style="height: 40px">
				<td style="width: 150px; text-align: center">아이디</td>
				<td style="padding-left: 10px">
					<!-- 한 줄 짜리 키보드 입력 요소 --> 
					<input type="text" style="width: 400px"  value="guard" name="id"  placeholder="아이디를 입력하세요" />
				</td>
			</tr>

			<tr style="height: 40px">
				<td style="width: 150px; text-align: center">패쓰워드</td>
				<td style="padding-left: 10px">
					<!-- 비밀번호 입력 요소 : 입력하는 동안 입력 문자가 표시되지 X --> 
					<input type="password" style="width: 400px" value="1234" name="password" />
				</td>
			</tr>

			<tr style="height: 40px">
				<td style="width: 150px; text-align: center">이메일</td>
				<td style="padding-left: 10px">
				<input type="text" style="width: 200px" value="banana" name="email1"/> @ <!-- 목록 중에서 하나를 선택하는 입력 요소 (Dropdown 방식) -->
				<select name="email2" style="width: 170px">
						<option>도메인을 선택하세요</option>
						<option>naver.com</option>
						<option>daum.net</option>
						<option selected="selected">gmail.com</option>
						<option>nate.com</option>
						<option>dreamwiz.com</option>
						<option>직접입력</option>
				</select>
				</td>
			</tr>
			<tr style="height: 40px">
				<td style="width: 150px; text-align: center">성별</td>
				<td style="padding-left: 10px">
					<!-- 배타적 단일 선택 입력 요소 (radio button) --> 
					<!-- 배타적 단일 선택이 되려면 각 radio가 같은 name을 가져야 합니다. -->
					<input type="radio" name="gender" value="남"/>남
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					<input type="radio" name="gender" value="여" checked="checked"/>여
					
				</td>
			</tr>

			<tr style="height: 40px">
				<td style="width: 150px; text-align: center">관심영역</td>
				<td style="padding-left: 10px">
					<!-- 다중 선택 입력 요소 (checkbox) -->
					<input type="checkbox" checked="checked" name="favorite" value="IT"/>IT&nbsp;&nbsp;&nbsp; 
					<input type="checkbox" name="favorite" value="경제"/>경제&nbsp;&nbsp;&nbsp;
					<input type="checkbox" name="favorite" value="정치"/>정치&nbsp;&nbsp;&nbsp; 
					<input type="checkbox" checked="checked" name="favorite" value="문화"/>문화 &nbsp;&nbsp;&nbsp; 
					<input type="checkbox" name="favorite" value="연예"/>연예
				</td>
			</tr>

			<tr style="height: 40px">
				<td style="width: 150px; text-align: center">가입인사</td>
				<td style="padding-left: 10px">
					<!-- 여러 줄 키보드 자유 입력 요소 --> 
					<!-- 반드시 시작 태그와 종료 태그 쌍으로 작성 --> 
					<textarea rows="10" cols="55" name="message">안녕하세요!!!</textarea>
				</td>
			</tr>

			<tr style="height: 40px">
				<td style="text-align: center" colspan="2">
					<!-- button : 버튼 모양, 자바스크립트와 연결을 위해 사용 
					<input type="button" value="눌러주세요"  onclick="alert('버튼클릭');" /> 
					--> 
					<!-- image : 이미지 입힌 버튼 모양, 서버로 데이터 전송 -->
					<input type="image" src="image/w.png" /> 
					<!-- submit : 버튼 모양, 서버로 데이터 전송 -->
					<input type="submit" value="서버로 전송" />
					<!-- reset : 초기화, 최초 페이지 로딩할 때 상태로 전환 --> 
					<input type="reset" value="초기화" /> 
					
					
				</td>
			</tr>
		</table>
	</form>

</body>
</html>









