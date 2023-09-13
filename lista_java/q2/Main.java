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
        equipe1.add(membro1);
        equipe1.add(membro2);
        equipe1.add(membro3);
        LiderEquipe
    }
}
