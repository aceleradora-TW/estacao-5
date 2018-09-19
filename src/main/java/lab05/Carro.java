package lab05;

public class Carro {
    private String marca, modelo;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }


    public String toString() {
        return marca + " " + modelo;
    }
}
