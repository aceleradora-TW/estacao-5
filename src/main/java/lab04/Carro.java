package lab04;

/**
 *
 *  1: Crie os atributos necessarios
 *
 *  2: Crie um construtor que receba os atributos
 *
 *  3: Implemente o metodo toString()
 *
 *
 *  Obs: Voce nao vai precisar de getters e setters.
 */
public class Carro {
    private String modelo;
    private String marca;
    private String cor;

    public Carro (String modelo, String marca, String cor){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }





    public String toString(){
        return "" + marca + " " + modelo + " " + cor;
    }

}
