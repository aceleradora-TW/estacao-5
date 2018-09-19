package lab06;

public class Carro {
    private String modelo, marca;
    private int ano;

    public Carro (String modelo, String marca, int ano){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public int getAno(){
        return ano;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String toString(){
        return " " + marca + " " + modelo + " " + ano;
    }
}
