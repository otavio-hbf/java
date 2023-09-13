package q3;

public class Capuccino extends Coffe{
    Capuccino(){
        this.waterRequired = 50;
        this.milkRequired = 100;
        this.coffeeRequired = 100;
    }
    public void prepare(){

        System.out.println("Coloque "+this.milkRequired+"ml de leite. "+ this.coffeeRequired +"ml de cafe e " + this.waterRequired + "ml de agua na máquina.");
        System.out.println("Aperte o botao.");
        
    }
}
