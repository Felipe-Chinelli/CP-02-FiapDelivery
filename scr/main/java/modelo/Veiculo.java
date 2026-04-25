package modelo;

public abstract class Veiculo {
    private String placa;
    private double capacidade;

    protected Veiculo(String placa, double capacidade) {
        setPlaca(placa);
        setCapacidade(capacidade);
    }

    public String getPlaca() { return placa; }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank())
            throw new IllegalArgumentException("Placa não pode ser vazia.");
        this.placa = placa;
    }

    public double getCapacidade() { return capacidade; }

    public void setCapacidade(double capacidade) {
        if (capacidade <= 0)
            throw new IllegalArgumentException("Capacidade deve ser positiva.");
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [placa=" + placa + ", capacidade=" + capacidade + "kg]";
    }
}