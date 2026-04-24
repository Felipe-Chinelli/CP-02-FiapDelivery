public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote  = pacote;
        this.veiculo = veiculo;
    }

    public void iniciar() {
        pacote.atualizarStatus("Em trânsito");
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│           ENTREGA INICIADA              │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.println("│ Pacote  → " + pacote);
        System.out.println("│ Veículo → " + veiculo);
        System.out.println("└─────────────────────────────────────────┘");
    }

    public void finalizar() {
        pacote.atualizarStatus("Entregue");
        System.out.println("✔ Pacote " + pacote.getCodigo() + " entregue com sucesso!\n");
    }
}
