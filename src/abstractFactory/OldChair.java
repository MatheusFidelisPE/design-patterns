package abstractFactory;

public class OldChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on an old chair");
    }
}
