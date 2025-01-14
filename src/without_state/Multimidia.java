package without_state;

public class Multimidia {

    int estado = 0; // 0 = desligado, 1 = ligado, 2 = tocando, 3 = pausado

//    Se for necessário adicionar um novo estado, será necessário adicionar um novo if dentro de cada if mais externo. Caso seja adicionada uma nova ação,
//    será necessário adicionar um if mais externo e os ifs do estado

    public void clickBooton(int action){
        if(action == 0){
            if(estado == 0){
                System.out.println("-==-NADA ACONTECE-==-");
            }else if(estado == 1){
                System.out.println("Inicie a reprodução...");
                estado = 2;
            }else if(estado == 2){
                System.out.println("-==-NADA ACONTECE-==-");
            }else if(estado == 3){
                System.out.println("Inicie a reprodução...");
            }
        }else if(action == 1){
            if(estado == 0){
                System.out.println("-==-NADA ACONTECE-==-");
            }else if(estado == 1){
                System.out.println("-==-NADA ACONTECE-==-");
            }else if(estado == 2){
                System.out.println("Pausar a reprodução...");
                estado = 3;
            }else if(estado == 3){
                System.out.println("-==-NADA ACONTECE-==-");
            }
        }else if(action == 2){
            if(estado == 0){
                System.out.println("Ligando o multimidia...");
                estado = 1;
            }else if(estado == 1){
                System.out.println("Desligando multimidia...");
                estado = 0;
            }else if(estado == 2){
                System.out.println("Desligando multimidia...");
                estado = 0;
            }else if(estado == 3){
                System.out.println("Desligando multimidia...");
                estado = 0;
            }
        }
    }




}
