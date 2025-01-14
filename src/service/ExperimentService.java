package service;

import abstractFactory.AbstractFactory;
import abstractFactory.ModernFactory;
import builder.Sandwich;
import decorator.*;
import state.TocadorMusica;
import without_state.Multimidia;

public class ExperimentService {

    public static void abstractFactoryExperiment() {
        AbstractFactory factory = new ModernFactory();
        // imprimir tipo da variável factory
        System.out.println();
        factory.createChair().sitOn();
        factory.createTable().putOn();
    }

    public static void builderExperiment() {
        Sandwich sandwich = new Sandwich.Builder()
                .setMeat("Turkey")
                .setCheese("Swiss")
                .setVeggies("Lettuce")
                .setCondiments("Mayo")
                .build();

        System.out.println(sandwich);
    }

    public static void stateExperiment(){
        System.out.println("Tocador de músicas");

        TocadorMusica tocadorMusica = new TocadorMusica();
        tocadorMusica.status();

        tocadorMusica.clickPlay();
        tocadorMusica.clickStop();
        tocadorMusica.clickPower();
        tocadorMusica.clickPlay();
        tocadorMusica.clickStop();
        tocadorMusica.clickPlay();
        tocadorMusica.clickPower();
        tocadorMusica.clickPower();
        tocadorMusica.clickPlay();
        tocadorMusica.clickStop();
        tocadorMusica.clickPower();
    }
    public static void DecoratorExperiment(){
        Bebida cafe = new Cafe();
        cafe = new ComLeite(cafe);
        System.out.printf("%s R$ %.2f\n", cafe.getDescricao(), cafe.getCusto());
        cafe = new ComChocolate(cafe);
        System.out.printf("%s R$ %.2f\n", cafe.getDescricao(), cafe.getCusto());
        cafe = new ComCanela(cafe);
        System.out.printf("%s R$ %.2f\n", cafe.getDescricao(), cafe.getCusto());

    }

    public static void WithoutStatePattern(){
        Multimidia multimidia = new Multimidia();
//        Botões -> 0 = play, 1 = stop, 2 = power
        multimidia.clickBooton(0);
        multimidia.clickBooton(1);
        multimidia.clickBooton(2);
        multimidia.clickBooton(0);
        multimidia.clickBooton(1);
        multimidia.clickBooton(0);
        multimidia.clickBooton(2);
        multimidia.clickBooton(2);
        multimidia.clickBooton(0);
        multimidia.clickBooton(1);
        multimidia.clickBooton(2);



    }
}
