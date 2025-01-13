package decorator;

public class Cafe implements Bebida {
    private String descricao;
    private double custo;

    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getCusto() {
        return 3.0;
    }
}
