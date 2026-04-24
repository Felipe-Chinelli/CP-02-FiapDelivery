public class Moto extends Veiculo {
    private boolean temBau;

    public Moto(String placa, double capacidade, boolean temBau) {
        super(placa, capacidade);
        this.temBau = temBau;
    }

    public boolean isTemBau() { return temBau; }
    public void setTemBau(boolean temBau) { this.temBau = temBau; }

    @Override
    public String toString() {
        return super.toString().replace("]", ", baú=" + (temBau ? "sim" : "não") + "]");
    }
}
