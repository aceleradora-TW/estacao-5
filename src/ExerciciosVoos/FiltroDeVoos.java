package ExerciciosVoos;

import java.util.ArrayList;
import java.util.List;

public class FiltroDeVoos {


    private List<Voo> retornaLista(){
        List<Voo> lista = new ArrayList<>();

        lista.add(new Voo("poa", "sp", "A179", 234));
        lista.add(new Voo("sc", "rj","E45", 256));
        lista.add(new Voo("mg", "amazonas","T67", 256));

        return lista;
    }
    public List<Voo> saindoDe(String recebe){
        List<Voo> saida = new ArrayList<>();
        for (Voo v: retornaLista()){
            if(v.getOrigem().equals(recebe)){
                saida.add(v);
            }
        }return saida;
    }
    public List<Voo> chegandoEm(String recebe){
        List<Voo> destino = new ArrayList<>();
        for (Voo v: retornaLista()){
            if (v.getDestino().equals(recebe)){
                destino.add(v);
            }
        }return destino;
    }
    public List<Voo> operadoPor(String recebe){
        List<Voo> equipamento = new ArrayList<>();
        for (Voo v: retornaLista()){
            if(v.getEquipamento().equals(recebe)){
                equipamento.add(v);
            }
        }return equipamento;
    }
}
