package model;

public class Consumo {
    
    private String equipamento;
    private int potencia;
    private float tempo;
    private float valor;
    
    public Consumo(){}

    public Consumo(String equipamento, int potencia, float tempo, float valor) {
        this.equipamento = equipamento;
        this.potencia = potencia;
        this.tempo = tempo;
        this.valor = valor;
    }

    public float calcularConsumo(){
        return (((this.potencia * this.tempo) * 30) / 1000) * this.valor;
        
    }
    
    public String resultado(){
        String r = "";
        float c = calcularConsumo();
        
        if( c < 5){
            r = "consumo irrisório";
        } else if(c >- 5 && c < 20){
            r = "Consumo moderado";
        }else{
            r = "Consumo alto";
        }
        
        return r;
        
    }
    
    @Override
    public String toString() {
        return "<hr>" +
                "<h3> Estimativa de gasto mensal: </h3>" +
                "<h5> R$" + calcularConsumo() + "</h5>" + 
                "<h5>" + resultado() + "</h5>";
    }

    
    
    
    
}
