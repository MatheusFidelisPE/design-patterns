package state;

public class Desligado implements Estado {
    @Override
    public void pressPlayBotton(TocadorMusica tocadorMusica) {
        System.out.println("-==-NADA ACONTECE-==-");
    }

    @Override
    public void pressStopBotton(TocadorMusica tocadorMusica) {
        System.out.println("-==-NADA ACONTECE-==-");
    }

    @Override
    public void pressPowerBotton(TocadorMusica tocadorMusica) {
        System.out.println("Ligando o tocador...");
        tocadorMusica.changeState(new Ligado());
    }

    public String toString(){
        return "Desligado";
    }
}
