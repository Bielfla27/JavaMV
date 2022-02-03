<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="br.com.javaewb.entity.Pessoa"%>
<jsp:useBean id="pessoaBean" class="br.com.javaewb.bean.PessoaBean" scope="session"/>

<%
	String acaoSalvar = request.getParameter("salvar");
	String mensagem = "";
	Pessoa pessoa;
	
	if(acaoSalvar != null){
		pessoa = new Pessoa();
		pessoa.setNome(request.getParameter("txtNome"));
		pessoa.setSenha(request.getParameter("txtSenha"));
		pessoa.setUsuario(request.getParameter("txtUsuario"));
	
		pessoaBean.criar(pessoa);
		out.println("<br> <font color='FF0000'>" + "Cadastro realizado com sucesso!" + "</font>");
	}
%>

<script type="text/javascript"> 
	
	function voltar(){
		location.href = "PessoaList.jsp"
	}

</script>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova Pessoa</title>
</head>
<body>
	<form method="POST">
		<div id="cadastro">
			<fieldset>
				<legend>Nova Pessoa</legend>
				<table>
					<tr>
						<td><label for="nome">Nome: </label></td>
						<td><input type="text" name="txtNome" id="nome" /></td>

					</tr>
					<tr>
						<td><label for="usuario">Usuário: </label></td>
						<td><input type="text" name="txtUsuario" id="usuario"
							required="true" size="10" maxlength="10" /></td>

					</tr>
					<tr>
						<td><label for="senha">Senha: </label></td>
						<td><input type="text" name="txtSenha" id="senha"
							required="true" size="6" maxlength="6" /></td>

					</tr>
				</table>
				<hr>
				<input type="submit" value="Salvar" name="salvar"> <input
					type="reset" value="Limpar"> <input type="button"
					value="Voltar" onClick="voltar()">

			</fieldset>
		</div>
	</form>
</body>
</html>