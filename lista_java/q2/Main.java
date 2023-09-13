package q2;

import java.util.ArrayList;

public class Main {

    public static <T> double calcularCargaDeTrabalho(ArrayList<Tarefa<T>> t, T member){
        double sum = 0;
        for(Tarefa<T> task:t){
            
            if(task.getResponsible() == member){
                sum += task.getWorkload();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        MembroEquipe membro1 = new MembroEquipe("Thiagao");
        MembroEquipe membro2 = new MembroEquipe("Robertinho");
        MembroEquipe membro3 = new MembroEquipe("Peuba");

        ArrayList<MembroEquipe> equipe1 = new ArrayList<>();
        equipe1.add(membro1); equipe1.add(membro2); equipe1.add(membro3);
        LiderEquipe lider1 = new LiderEquipe("Tavinho", equipe1);
   
        Tarefa<LiderEquipe> t1 = new Tarefa<>("admin", lider1);
        Tarefa<LiderEquipe> t2 = new Tarefa<>("fiscal", lider1);
        Tarefa<MembroEquipe> t3 = new Tarefa<>("marketing", membro1);
        Tarefa<MembroEquipe> t4 = new Tarefa<>("fiscal", membro1);
        Tarefa<MembroEquipe> t5 = new Tarefa<>("development", membro2);
        Tarefa<MembroEquipe> t6 = new Tarefa<>("sales", membro3);

        ArrayList<Tarefa<MembroEquipe>> taskList = new ArrayList<>();
        ArrayList<Tarefa<LiderEquipe>> taskList_lider = new ArrayList<>();

        taskList_lider.add(t1); taskList_lider.add(t2);
        taskList.add(t3);taskList.add(t4);taskList.add(t5);taskList.add(t6);

        System.out.println(lider1.getName() + " tem uma carga de " + calcularCargaDeTrabalho(taskList_lider, lider1) + "h");

        for(MembroEquipe m: equipe1){
            System.out.println(m.getName() + " tem uma carga de " + calcularCargaDeTrabalho(taskList, m) + "h");
        }

    }
}
