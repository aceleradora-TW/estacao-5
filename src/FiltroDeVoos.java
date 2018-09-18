import java.util.ArrayList;
import java.util.List;

public class FiltroDeVoos {
    private List<Voo> listaVoos = new ArrayList<Voo>();

    public FiltroDeVoos(ArrayList<Voo> listaVoos) {
        this.listaVoos = listaVoos;
    }

    private ArrayList<Voo> saindoDe(String origem){
        ArrayList<Voo> voos = new ArrayList<Voo>();

        for(int i = 0; i < listaVoos.size(); i++){
            if(listaVoos.get(i).getOrigem().equals(origem)){
                voos.add(listaVoos.get(i));
            }
        }
        return voos;
    }

    private ArrayList<Voo> chegandoEm(String destino){
        ArrayList<Voo> voos = new ArrayList<Voo>();

        return voos;
    }

    private ArrayList<Voo> operadoPor(String equipamento){
        ArrayList<Voo> voos = new ArrayList<Voo>();

        return voos;
    }
}
