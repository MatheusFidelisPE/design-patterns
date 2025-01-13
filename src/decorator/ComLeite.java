package decorator;

public class ComLeite extends BebidaDecorator {
    public ComLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com leite";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.5;
    }
}
