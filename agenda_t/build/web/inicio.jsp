<%@page import="model.Usuario"%>
<%
Usuario u = new Usuario();
    
if( session.getAttribute("userLogged") == null ){
    response.sendRedirect("index.jsp");
} else {
    u = (Usuario)session.getAttribute("userLogged");
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página inicial</title>
    </head>
    <body>
        <h1>Bem vindo <%= u.getNomeUsuario() %>!</h1>
        <h1>Bem vindo <%= u.getTelefoneUsuario()%></h1>
        <button type="button" onclick="window.location.href='UsuarioController?flag=sair'">
            Sair
        </button>
        <button type="button" onclick="window.location.href='edita-usuario.jsp'">
            Editar perfil
        </button>
    </body>
</html>
