package state;

public class MusicaPausada implements Estado {

    public void pressPlayBotton(TocadorMusica tocadorMusica) {
        System.out.println("Retomando música...");
        tocadorMusica.changeState(new MusicaTocando());
    }

    public void pressStopBotton(TocadorMusica tocadorMusica) {
        System.out.println("-==-NADA ACONTECE-==-");
    }

    public void pressPowerBotton(TocadorMusica tocadorMusica) {
        System.out.println("Desligando tocador de música...");
        tocadorMusica.changeState(new Desligado());
    }

//    @Override
//    public void pressXAction(TocadorMusica tocadorMusica) {
//        System.out.println("-==-NADA ACONTECE-==-");
//    }

    public String toString(){
        return "Musica Pausada";
    }
}
