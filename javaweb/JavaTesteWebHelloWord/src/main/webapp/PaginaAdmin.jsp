<%@page import="br.com.aulajavaweb.bean.PessoaBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Pagina admin</title>
<style type="text/css">
form {
	position: absolute;
	top: 20%;
	left: 33%;
	right: 33%;
}


</style>
</head>
<body>
	
	<form class="row g-3 needs-validation" novalidate>
	<h2 style="color: #d00000;">Usuário Logado : <%= session.getAttribute("usuario-logado") %></h2>

	<h1>Página administrativa</h1>
	
 	<a href="http://localhost:8080/JavaTesteWebHelloWord/Menu.html">
 		Abrir Menu
 	</a>
 	<br>
 	<br>
 	<input type="submit" value="Sair" class="btn btn-primary" style="width: 100%"; 
 	<% session.invalidate(); 
 		String submit = request.getParameter("submete");
 	 	if(submit == null){
 	 		out.println("<META HTTP-EQUIV=\"Refresh\" CONTENT=\"0; URL = Login.jsp \">");	
 	 	}
 		%>>
	
	</form>
</body>
</html>