<%@page import="br.com.javaewb.bean.PessoaBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="br.com.javaewb.entity.Pessoa"%>
<jsp:useBean id="pessoaBean" class="br.com.javaewb.bean.PessoaBean" scope="session"/>
<%
	String enviar = request.getParameter("submete");
	if(enviar != null){
		String usuario = request.getParameter("user");
		String senha = request.getParameter("passwd");
		
		if(pessoaBean.validarLogin(usuario,senha)){
			out.println("<META HTTP-EQUIV=\"Refresh\" CONTENT=\"0; URL = Menu.jsp \">");	
			session.setAttribute("usuario-logado", usuario);
		}else{
			out.println("<br> <font color='FF0000'>" + "Usuario ou senha incorreta!" + "</font>");
		}
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login JSP</h1>
	<form method="POST">
		<p>
			Login: <input type="text" name="user">
		</p>
		<p>
			Senha: <input type="password" name="passwd">
		</p>
		<p>
			<input type="submit" value="Submeter" name="submete"> <input
				type="reset" value="Limpar">
		</p>
	</form>
</body>
</html>