package decorator;

public class ComCanela extends BebidaDecorator {
    public ComCanela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com canela";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.25;
    }
}
