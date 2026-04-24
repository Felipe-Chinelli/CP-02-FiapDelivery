public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso) {
        this.codigo = codigo;
        setPeso(peso);
        this.status = "Pendente";
    }

    public String getCodigo() { return codigo; }
    public double getPeso()   { return peso; }
    public String getStatus() { return status; }

    public void setPeso(double peso) {
        if (peso <= 0)
            throw new IllegalArgumentException("Peso deve ser positivo.");
        this.peso = peso;
    }

    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.isBlank())
            throw new IllegalArgumentException("Status inválido.");
        this.status = novoStatus;
    }

    @Override
    public String toString() {
        return "Pacote [" + codigo + " | " + peso + "kg | " + status + "]";
    }
}
