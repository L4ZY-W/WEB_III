<%@page import="model.Pedido"%>
<%
    Pedido p = (Pedido) request.getAttribute("pedido");
    

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Açaí QI - Pedido</title>
    </head>
    <body>
        <h1>Finalizar pedido</h1>
        <h2>Confira os dados do pedido: </h2>
        
        <ul>
            <li>tamanho: <%= p.getTamanho() %> </li>
            <li>Acompanhamentos: <%= p.getTodosAcomp()%> </li>
            <li>Colher: <%= p.getColher()%></li>
            <li>Bebida: <%= p.getBebida()%></li>
            <li>Entrega: <%= p.getEntrega()%></li>
            <li>Valor: <%= p.getValor()%></li>
        </ul>

        <hr>
        <form action="index.html" onsubmit="alert('Pedido realizado!')">
            <input type="radio" id="pgto1" name="pgto" value="Pix" required>
            <label for="pgto1">Pix</label>
            <br>
            <input type="radio" id="pgto2" name="pgto" value="Cartão">
            <label for="pgto2">Cartão</label>
            <br>
            <input type="submit" value="Finalizar Pedido">
            
        </form>
        
    </body>
</html>
