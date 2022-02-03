<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="pessoaBean" class="br.com.javaewb.bean.PessoaBean" scope="session"/>

<%
	String idExcluir = request.getParameter("idExcluir");

	if(idExcluir != null){
		pessoaBean.deletar(Integer.parseInt(idExcluir));
		out.println("<META HTTP-EQUIV=\"Refresh\" CONTENT=\"0; URL = PessoaList.jsp \">");	
		out.println("<br> <font color='FF0000'" + "Exclusão realizada com sucesso!" + "</font>");
	}
%>

<script type="text/javascript"> 
	
	function nova(){
		location.href = "PessoaCreate.jsp"
	}	
	function voltar(){
		location.href = "../Menu.jsp"
	}

</script>	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Pessoas</title>
</head>
<body>
	<form method="POST">
		<div id="cadastro">
			<fieldset>
				<legend>PESSOAS CADASTRADAS</legend>
				<table border="1">
					<tr>
						<td>ID</td>
						<td>NOME</td>
						<td>USUARIO</td>
						<td>SENHA</td>
						<td>AÇÃO</td>
					</tr>
					<c:forEach var="pessoa" items="${pessoaBean.listarTodos()}">
							<tr>
								<td><c:out value="${pessoa.id}"></c:out></td>
								<td><c:out value="${pessoa.nome}"></c:out></td>
								<td><c:out value="${pessoa.usuario}"></c:out></td>
								<td><c:out value="${pessoa.senha}"></c:out></td>
								<td><a href="PessoaList.jsp?idExcluir=${pessoa.id}">Excluir</a>
									<a href="PessoaEdit.jsp?pessoaId=${pessoa.id}
											&&pessoaNome=${pessoa.nome}
											&&pessoaUsuario=${pessoa.usuario}
											&&pessoaSenha=${pessoa.senha}">Editar</a>
								</td>
							</tr>
					</c:forEach>
				</table>
			</fieldset>
		</div>
		<hr />
		<input type="button" value="Novo" onclick="nova()"> <input
			type="button" value="Voltar" onclick="voltar()">
	</form>
</body>
</html>