package model;

public class Pedido {
    
    private int id;
    private String tamanho;
    private String[] acomp;
    private String colher;
    private String bebida;
    private String entrega;
    private double valor;
    private String formaDePagamento;
    
    public Pedido(){}

    public Pedido(String tamanho, String[] acomp, String colher, String bebida, String entrega) {
        this.tamanho = tamanho;
        this.acomp = acomp;
        this.colher = colher;
        this.bebida = bebida;
        this.entrega = entrega;
    }

    public int getId() {
        return id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String[] getAcomp() {
        return acomp;
    }

    public String getColher() {
        return colher;
    }

    public String getBebida() {
        return bebida;
    }

    public String getEntrega() {
        return entrega;
    }

    public double getValor() {
        return valor;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setAcomp(String[] acomp) {
        this.acomp = acomp;
    }

    public void setColher(String colher) {
        this.colher = colher;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getTodosAcomp(){
        if( this.acomp != null) {
            String acomps = "";
            for( int i=0; i<this.acomp.length; i++ ){
                acomps += this.acomp[i] + "/";
            }
            return acomps;
        }
        return "Sem acompanhamentos.";
    }
    
    public void calcularPedido(){
        double subTotal = 0.0;
        
        switch( this.tamanho ){
            case "Pequeno": subTotal += 10.00;
            break;
            case "Médio": subTotal += 15.00;
            break;
            case "Grande": subTotal += 20.00;
            break;
        }
        
        if( this.acomp != null){
            subTotal += acomp.length * 2;
        }
        
        if( this.colher.equals("Sim") ){
            subTotal += 0.5;
        }
        
        switch( this.bebida ){
            case "Água s/gás 600ml": subTotal += 3.0;
            break;
            case "Água c/gás 600ml": subTotal += 3.0;
            break;
            case "Guárana Fruki 300ml": subTotal += 5.0;
            break;
            case "Coca-Cola 300ml": subTotal += 6.0;
            break;
        }
        
        if(this.entrega.equals("Delivery")){
            subTotal += 8.5;
        }
        
        
        
        this.valor = subTotal;
        
        
        
        
    }
    
    
    
    
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", tamanho=" + tamanho + ", acomp=" + getTodosAcomp() + ", colher=" + colher + ", bebida=" + bebida + ", entrega=" + entrega + ", valor=" + valor + ", formaDePagamento=" + formaDePagamento + '}';
    }
    
    
    
    
}
