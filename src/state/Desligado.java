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

//    @Override
//    public void pressXAction(TocadorMusica tocadorMusica) {
//        System.out.println("Tocando música");
//        tocadorMusica.changeState(new XStage());
//    }

    public String toString(){
        return "Desligado";
    }
}
