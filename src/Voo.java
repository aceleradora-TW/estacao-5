public class Voo {
    private String origem;
    private String destino;
    private String equipamento;
    private int duracaoMinutos;

    public Voo(){

    }

    public Voo(String origem, String destino, String equipamento, int duracaoMinutos) {
        this.origem = origem;
        this.destino = destino;
        this.equipamento = equipamento;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
