<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="br.com.javaewb.entity.Pessoa"%>
<jsp:useBean id="pessoaBean" class="br.com.javaewb.bean.PessoaBean" scope="session"/>

<%
	String acaoSalvar = request.getParameter("salvar");
	Pessoa pessoa;
	
	Integer id = Integer.parseInt(request.getParameter("pessoaId"));
	String nome = (String) request.getParameter("pessoaNome");
	String usuario = (String) request.getParameter("pessoaUsuario");
	String senha = (String) request.getParameter("pessoaSenha");
	
	if(acaoSalvar != null){
		pessoa = new Pessoa();
		pessoa.setId(id);
		pessoa.setNome(request.getParameter("txtNome"));
		pessoa.setSenha(request.getParameter("txtSenha"));
		pessoa.setUsuario(request.getParameter("txtUsuario"));
		pessoaBean.atualizar(pessoa);
		out.println("<br> <font color='FF0000'>" + "Atualização realizada com sucesso!" + "</font>");
	}
	if(!nome.equals(request.getParameter("txtNome"))){
		nome = request.getParameter("txtNome");
	}
	if(!usuario.equals(request.getParameter("txtUsuario"))){
		usuario = request.getParameter("txtUsuario");
	}
	if(!senha.equals(request.getParameter("txtSenha"))){
		senha = request.getParameter("txtSenha");
	}
%>

<script type="text/javascript"> 
	
	function Voltar(){
		location.href = "PessoaList.jsp"
	}

</script>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar Pessoa</title>
</head>
<body>
	<form method="POST">
		<div id="Form">
			<fieldset>
				<legend>Atualizar Pessoa</legend>
				<table>
					<tr>
						<td><label for="id">ID: </label></td>
						<td><input type="text" name="txtId" id="id" size="6"
							disabled="true" value="" /></td>

					</tr>
					<tr>
						<td><label for="nome">Nome: </label></td>
						<td><input type="text" name="txtNome" id="nome"
							required="true" value="" /></td>

					</tr>
					<tr>
						<td><label for="usuario">Usuário: </label></td>
						<td><input type="text" name="txtUsuario" id="usuario"
							required="true" size="10" maxlength="10" value="" /></td>

					</tr>
					<tr>
						<td><label for="senha">Senha: </label></td>
						<td><input type="text" name="txtSenha" id="senha"
							required="true" size="6" maxlength="6" value="" /></td>

					</tr>
				</table>
				<hr>
				<input type="submit" value="Salvar" name="salvar"> <input
					type="button" value="Voltar" onClick="Voltar()">

			</fieldset>
		</div>
	</form>
</body>
</html>