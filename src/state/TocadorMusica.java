package state;

public class TocadorMusica {
    private Estado estado;

    public TocadorMusica(){
        this.estado = new Desligado();
    }

    public Estado getEstado(){
        return this.estado;
    }

    public void clickPlay(){
        this.estado.pressPlayBotton(this);
    }
    public void clickStop(){
        this.estado.pressStopBotton(this);
    }
    public void clickPower(){
        this.estado.pressPowerBotton(this);
    }

    public void status(){
        System.out.println("Tocador de música está " + this.estado.getClass().getSimpleName());
    }

    protected void changeState(Estado estado){
        this.estado = estado;
    }
}
