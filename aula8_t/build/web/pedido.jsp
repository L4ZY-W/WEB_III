<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Açaí QI - Pedido</title>
        <!-- Link para o arquivo CSS externo (certifique-se de que o nome está correto) -->
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        
        <div class="container">
            <header>
                <h1>Açaí QI</h1>
                <p>Monte o seu pedido em poucos cliques</p>
            </header>

            <form action="PedidoController" method="get" class="order-form">
                
                <!-- SEÇÃO: TAMANHO -->
                <div class="step-section">
                    <h3 class="section-title">Tamanho</h3>
                    <div class="options-grid">
                        <div class="option-card">
                            <input type="radio" id="tamanho1" name="tamanho" value="Pequeno" required>
                            <label for="tamanho1" class="option-label">Pequeno (300 ml)</label>
                        </div>
                        <div class="option-card">
                            <input type="radio" id="tamanho2" name="tamanho" value="Médio" checked>
                            <label for="tamanho2" class="option-label">Médio (500 ml)</label>
                        </div>
                        <div class="option-card">
                            <input type="radio" id="tamanho3" name="tamanho" value="Grande">
                            <label for="tamanho3" class="option-label">Grande (770 ml)</label>
                        </div>
                    </div>
                </div>
                
                <!-- SEÇÃO: ACOMPANHAMENTOS -->
                <div class="step-section">
                    <h3 class="section-title">Acompanhamentos</h3>
                    <div class="options-grid">
                        <div class="option-card">
                            <input type="checkbox" id="acomp1" name="acomp" value="Banana">
                            <label for="acomp1" class="option-label">Banana</label>
                        </div>
                        <div class="option-card">
                            <input type="checkbox" id="acomp2" name="acomp" value="Morango">
                            <label for="acomp2" class="option-label">Morango</label>
                        </div>
                        <div class="option-card">
                            <input type="checkbox" id="acomp3" name="acomp" value="Leite condensado">
                            <label for="acomp3" class="option-label">Leite Condensado</label>
                        </div>
                        <div class="option-card">
                            <input type="checkbox" id="acomp4" name="acomp" value="Leite Ninho">
                            <label for="acomp4" class="option-label">Leite Ninho</label>
                        </div>
                        <div class="option-card">
                            <input type="checkbox" id="acomp5" name="acomp" value="Nutella">
                            <label for="acomp5" class="option-label">Nutella</label>
                        </div>
                    </div>
                </div>
                
                <!-- SEÇÃO: COLHER -->
                <div class="step-section">
                    <h3 class="section-title">Precisa de Colher?</h3>
                    <div class="options-grid">
                        <div class="option-card">
                            <input type="radio" id="colher1" name="colher" value="Sim">
                            <label for="colher1" class="option-label">Sim</label>
                        </div>
                        <div class="option-card">
                            <input type="radio" id="colher2" name="colher" value="Não" checked>
                            <label for="colher2" class="option-label">Não</label>
                        </div>
                    </div>
                </div>
                
                <!-- SEÇÃO: BEBIDA -->
                <div class="step-section">
                    <h3 class="section-title">Bebida</h3>
                    <div class="options-grid">
                        <div class="option-card">
                            <input type="radio" id="bebida1" name="bebida" value="Água s/gás 600ml">
                            <label for="bebida1" class="option-label">Água s/gás 600ml</label>
                        </div>
                        <div class="option-card">
                            <input type="radio" id="bebida2" name="bebida" value="Água c/gás 600ml">
                            <label for="bebida2" class="option-label">Água c/gás 600ml</label>
                        </div>
                        <div class="option-card">
                            <input type="radio" id="bebida3" name="bebida" value="Guárana Fruki 300ml">
                            <label for="bebida3" class="option-label">Guaraná Fruki 300ml</label>
                        </div>
                        <div class="option-card">
                            <input type="radio" id="bebida4" name="bebida" value="Coca-Cola 300ml">
                            <label for="bebida4" class="option-label">Coca-Cola 300ml</label>
                        </div>
                        <div class="option-card">
                            <input type="radio" id="bebida5" name="bebida" value="Sem bebida" checked>
                            <label for="bebida5" class="option-label">Sem bebida</label>
                        </div>
                    </div>
                </div>
                
                <!-- SEÇÃO: ENTREGA -->
                <div class="step-section">
                    <h3 class="section-title">Forma de Entrega</h3>
                    <div class="options-grid">
                        <div class="option-card">
                            <input type="radio" id="entrega1" name="entrega" value="Retirada na loja">
                            <label for="entrega1" class="option-label">Retirada na loja</label>
                        </div>
                        <div class="option-card">
                            <input type="radio" id="entrega2" name="entrega" value="Delivery" checked>
                            <label for="entrega2" class="option-label">Delivery</label>
                        </div>
                    </div>
                </div>
                
                <!-- ÁREA DE ENVIO -->
                <div class="checkout-section">
                    <input type="submit" class="btn-submit" value="Continuar pedido">
                </div>
                
            </form>
        </div>
        
    </body>
</html>