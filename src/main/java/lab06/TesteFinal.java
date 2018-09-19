package lab06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Na classe Carro:
 *
 * 1: Crie a classe Carro com os atributos marca, modelo e ano
 *
 * 2: Implemente o construtor, os getters e os setters de cada atributo da classe
 *
 * 4: Implemente o metodo toString da classe Carro retornando marca, modelo e ano separados por um espaco em branco
 *
 *
 * Na classe TesteFinal:
 *
 *    1: Crie uma lista de carros
 *
 *    2: Adicione tres objetos nesta lista com os seguintes atributos:
 *
 *      Marca       Modelo      Ano
 *
 *      Chevrolet   Onix        2018
 *      Ford        Fiesta      2006
 *      Fiat        Mille       2001
 *
 *    3: Percorra a lista criada e concatene o resultado de toString de cada carro da lista a variavel resultado.
 *    Separe cada saida com um traco entre dois espacos em branco. Veja o exemplo abaixo:
 *
 *        Dica:
 *
 *         resultado += " - " + carro.toString();
 *
 *         O valor final da variavel deve ser o seguinte:
 *
 *         " - Chevrolet Onix 2018 - Ford Fiesta 2006 - Fiat Mille 2001"
 *
 *    4:  retorne a variavel resultado e verifique se o teste passou.
 *
 *
 *  DESAFIO:
 *
 *     Implemente a mesma logica utilizada no metodo teste, porem, em vez de utilizar toString() utilize os getters
 *     dos atributos do carro.
 */
public class TesteFinal {

    public static String teste() {

        List<Carro>carros = new ArrayList<>();
        carros.add(new Carro("Onix", "Chevrolet", 2018));
        carros.add(new Carro("Fiesta", "Ford",2006));
        carros.add(new Carro("Mille", "Fiat", 2001));


        String resultado = "";



        for (Carro c: carros){
            resultado += " " + "-";
            resultado += c;
        }
        return resultado;
    }

    public static String testeComGetters() {

        List<Carro>carros = new ArrayList<>();
        carros.add(new Carro("Onix", "Chevrolet", 2018));
        carros.add(new Carro("Fiesta", "Ford",2006));
        carros.add(new Carro("Mille", "Fiat", 2001));


        String resultado = "";



        for (Carro c: carros){
            resultado += " " + "-";
            resultado += " " + c.getMarca() + " " + c.getModelo() + " " + c.getAno();
        }
        return resultado;

    }
}
