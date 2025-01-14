package state;

public class MusicaTocando implements Estado {

    public void pressPlayBotton(TocadorMusica tocadorMusica) {
        System.out.println("-==-NADA ACONTECE-==-");
    }

    public void pressStopBotton(TocadorMusica tocadorMusica) {
        System.out.println("Pausando música...");
        tocadorMusica.changeState(new MusicaPausada());
    }

    public void pressPowerBotton(TocadorMusica tocadorMusica) {
        System.out.println("Desligando tocador de música...");
        tocadorMusica.changeState(new Desligado());
    }

//    @Override
//    public void pressXAction(TocadorMusica tocadorMusica) {
//        System.out.println("Tocar 10 minutos de música sem parar...");
//        tocadorMusica.changeState(new XStage());
//    }

    public String toString(){
        return "Musica Tocando";
    }
}
