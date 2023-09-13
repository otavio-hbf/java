package q2;

import java.util.ArrayList;

public class LiderEquipe extends MembroEquipe{
    ArrayList<MembroEquipe> sub;
    LiderEquipe(String name, ArrayList<MembroEquipe> sub_arr){
        super(name);
        this.sub = sub_arr;
    }
}
