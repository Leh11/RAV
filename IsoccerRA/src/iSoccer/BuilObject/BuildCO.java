package iSoccer.BuilObject;

import iSoccer.Employees.*;
import iSoccer.Partiner.Elite;
import iSoccer.Partiner.Junior;
import iSoccer.Partiner.Partiner;
import iSoccer.Partiner.Senior;
import iSoccer.Resource.Arena;
import iSoccer.Resource.Bus;
import iSoccer.Resource.Resource;
import iSoccer.Resource.TrainningCenter;

public class BuildCO extends BuildObject {


    @Override
    public Employee buildEmployee(String type){
        switch (type) {
            case "PRESIDENTE":
                return new President();

            case "MEDICO":
                return new Doctor();

            case "TECNICO":
                return new Manager();

            case "PREPARADOR FISICO":
                return new PersonaTrainer();

            case "MOTORISTA":
                return new Driver();

            case "COZINHEIRA":
                return new Cooker();

            case "ADVOGADO":
                return new Lawyer();

            case "JOGADOR":
                return new Player();
        }
        return null;
    }

    @Override
    public Resource buildResource(String type){
        switch (type) {
            case "ARENA":
                return new Arena();

            case "ONIBUS":
                return new Bus();

            case "CENTRO":
                return new TrainningCenter();
        }
        return null;
    }

    @Override
    public Partiner buildPartiner(String type) {
         switch (type) {
                case "JUNIOR":
                    return new Senior();

                case "SENIOR":
                    return new Junior();

                case "ELITE":
                    return new Elite();
         }
         return null;
    }
}
