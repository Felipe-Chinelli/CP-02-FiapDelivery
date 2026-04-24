public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        setEixos(eixos);
    }

    public int getEixos() { return eixos; }

    public void setEixos(int eixos) {
        if (eixos < 2)
            throw new IllegalArgumentException("Caminhão precisa de ao menos 2 eixos.");
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return super.toString().replace("]", ", eixos=" + eixos + "]");
    }
}
