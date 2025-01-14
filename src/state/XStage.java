package state;

public class XStage implements Estado {
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
        System.out.println("-==-NADA ACONTECE-==-");
    }

//    @Override
//    public void pressXAction(TocadorMusica tocadorMusica) {
//        System.out.println("Executando ação X...");
//        tocadorMusica.changeState(new Desligado());
//    }
}
