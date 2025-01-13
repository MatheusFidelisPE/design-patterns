package abstractFactory;

public class OldFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new OldChair();
    }

    @Override
    public Table createTable() {
        return new OldTable();
    }
}
