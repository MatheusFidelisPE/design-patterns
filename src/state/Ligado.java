package state;

public class Ligado implements Estado {
    @Override
    public void pressPlayBotton(TocadorMusica tocadorMusica) {
        System.out.println("Tocando música...");
        tocadorMusica.changeState(new MusicaTocando());
    }

    @Override
    public void pressStopBotton(TocadorMusica tocadorMusica) {
        System.out.println("-==-NADA ACONTECE-==-");
    }

    @Override
    public void pressPowerBotton(TocadorMusica tocadorMusica) {
        System.out.println("Turning off");
        tocadorMusica.changeState(new Desligado());
    }
    public String toString(){
        return "Ligado";
    }
}
