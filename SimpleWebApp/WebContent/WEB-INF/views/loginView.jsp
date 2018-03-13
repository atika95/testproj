<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<link rel="stylesheet" href="css/style.css">
<!--Google Font - Work Sans-->
<link href='https://fonts.googleapis.com/css?family=Work+Sans:400,300,700' rel='stylesheet' type='text/css'>
</head>
<body>

<div class="container">
  <div class="profile">
    <button class="profile__avatar" id="toggleProfile">
     <img src="img/img1.jpeg" alt="Avatar" /> 
    </button>
    <div class="profile__form">
	<jsp:include page="_menu.jsp"></jsp:include>
	<h3>Login Page</h3>
    	<form method="POST" action="${pageContext.request.contextPath}/login">
    	<p style="color: red;">${errorString}</p>
	      <div class="profile__fields">
	        <div class="field">
	        
	          <input type="text" id="fieldUser" class="input" name="userName" value="${user.userName}" required pattern=.*\S.* />
	          <label for="fieldUser" class="label">Username</label>
	        </div>
	        <div class="field">
	          <input type="password" id="fieldPassword" class="input" name="password" value="${user.password}" required pattern=.*\S.* />
	          <label for="fieldPassword" class="label">Password</label>
	        </div>
	        <div class="profile__footer">
	          <button type="submit" class="btn">Login</button>
	        </div>
	      </div>
      </form>
     </div>
  </div>
</div>

<script type="text/javascript"  src="js/index.js"></script>

</body>
</html>