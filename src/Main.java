import abstractFactory.AbstractFactory;
import abstractFactory.ModernFactory;
import abstractFactory.OldFactory;
import builder.Sandwich;
import service.ExperimentService;
import state.TocadorMusica;

public class Main {
    public static void main(String[] args) {
//        ExperimentService.abstractFactoryExperiment();
//        ExperimentService.builderExperiment();
        ExperimentService.stateExperiment();
        System.out.println("-------------------------------------------------");
        ExperimentService.WithoutStatePattern();
//        ExperimentService.DecoratorExperiment();




    }
}