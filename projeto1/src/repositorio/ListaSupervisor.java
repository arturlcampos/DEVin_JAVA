package repositorio;

import classes.Supervisor;

import java.util.ArrayList;
import java.util.List;

public class ListaSupervisor {
    public static List<Supervisor> supervisors = new ArrayList<>();

    public static void adcionar (Supervisor supervisor){
        supervisors.add(supervisor);
    }

    public static Supervisor retornar (Integer id){
        return supervisors.get(id);
    }

    public static List<Supervisor> retornarTodos (){
        return supervisors;
    }
    public static void adicinar(Supervisor supervisor) {
    }
}
