package decorator;

public class ComChocolate extends BebidaDecorator {
    public ComChocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com chocolate";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 1.0;
    }
}
