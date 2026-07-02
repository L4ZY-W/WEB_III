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

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", tamanho=" + tamanho + ", acomp=" + acomp + ", colher=" + colher + ", bebida=" + bebida + ", entrega=" + entrega + ", valor=" + valor + ", formaDePagamento=" + formaDePagamento + '}';
    }
    
    
    
    
}
