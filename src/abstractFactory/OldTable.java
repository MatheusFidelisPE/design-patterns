package abstractFactory;

public class OldTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Putting on an old table");
    }
}
