package model;

import java.time.LocalDate;

public class Pagamento {
    //Atributos
    private String tipo;
    private double total;
    private LocalDate data;
    private String donoCartao;
    private long numeroCartao;
    private int vencimento;
    private int cvv;
    private int quantidadeParcelas;


    //Construtores
    public Pagamento( String tipo, double total, LocalDate data) {
        this.tipo = tipo;
        this.total = total;
        this.data = data;
    }

    //Métodos get

    public String getTipo() {
        return tipo;
    }

    public double getTotal() {
        return total;
    }
    public LocalDate getData() {
        return data;
    }
    //Métodos set
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    //Métodos verificar numerocartao


    //Método To string
    public String toString() {
        return "Pagamento" + "id="+", tipo=" + tipo + ", total=" + total + ", data=" + data;
    }
}
