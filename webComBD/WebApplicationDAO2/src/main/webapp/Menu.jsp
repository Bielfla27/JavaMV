<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	if(session.getAttribute("usuario-logado") == null){
		out.println("<META HTTP-EQUIV=\"Refresh\" CONTENT=\"0; URL = Login.jsp \">");	
	}else{
		out.println("<h3>" + "Usuário Logado: " + session.getAttribute("usuario-logado") + "</h3>");
	}
	
	String submete = request.getParameter("submete");
	if(submete != null){
		session.invalidate();
		out.println("<META HTTP-EQUIV=\"Refresh\" CONTENT=\"0; URL = Login.jsp \">");	
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Principal</title>
</head>
<body>
	<form method="POST">
		<div>
			<a href="admin/PessoaList.jsp">Pessoa</a>
		</div>
		<br> <input type="submit" value="Sair" name="submete">
	</form>
</body>
</html>