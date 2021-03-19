<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE>
<html lang="ja">
<head>
<meta charset="UTF-8">
</head>
<body>

	<h2>テスト画面：UTF-8</h2>
	<form action="./MainServlet" method="post">
		<div>
			Text Here：<input type="text" name="TXT"><input type="submit"
				name="submit" value="post">
		</div>
		<div>
			<button type="button" onclick="location.href='./index.jsp'">back</button>
		</div>
	</form>
</body>
</html>
