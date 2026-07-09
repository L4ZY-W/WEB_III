<%@page import="model.Consumo"%>
<%
    Consumo c = new Consumo();
    if(request.getAttribute("gasto") != null ){
        c = (Consumo)request.getAttribute("gasto");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="padding: 10% 30%">
        
        <h1 style="text-align: center">Consumo de Energia</h1>
        
        <form action="ConsumoController" method="post" style="text-align: center">
            <label for="equipamento">Equipamento:</label>
            <input type="text" id="equipamento" name="equipamento" required>
            <br><br>
            
            <label for="potencia">Potência:</label>
            <input type="number" id="potencia" name="potencia" min="0" required>
            <br><br>
            
            <label for="tempo">Tempo de uso diário (h):</label>
            <input type="number" id="tempo" name="tempo" min="0" step="0.5" required>
            <br><br>
            
            <label for="valor">Preço do kW/h (R$):</label>
            <input type="number" id="valor" name="valor" min="0" step="0.01" required>
            <br><br>
            
            <input type="submit" value="Calcular">
            
        </form>
        <%
            if(request.getAttribute("gasto") != null ){
                out.print(c);
            }
        %>
        
    </body>
</html>
