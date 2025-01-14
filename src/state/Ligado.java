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

//    @Override
//    public void pressXAction(TocadorMusica tocadorMusica) {
//        System.out.println("Tocar 10 minutos de música sem parar...");
//        tocadorMusica.changeState(new XStage());
//    }

    public String toString(){
        return "Ligado";
    }
}
