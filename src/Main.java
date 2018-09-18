import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Voo> voos = new ArrayList<>();
        Voo v1 = new Voo("Poa", "Sp", "755-8", 120);
        Voo v2 = new Voo("SC", "Acre", "215-8", 220);
        Voo v3 = new Voo("SP", "Rj", "115-8", 25);

        voos.add(v1);
        voos.add(v2);
        voos.add(v3);

        for(int i = 0; i < voos.size(); i++){
            System.out.println("Origem: " + voos.get(i).getOrigem());
            System.out.println("Destino: " + voos.get(i).getDestino());
        }
    }
}
