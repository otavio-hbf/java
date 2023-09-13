package q3;

public class Latte extends Coffe {
    Latte(){
        this.waterRequired = 100;
        this.milkRequired = 350;
        this.coffeeRequired = 50;
    }
    public void prepare(){

        System.out.println("Selecione um copo de 500 ml.");
        System.out.println("Selecione os graos de café arabica e insira-os no moedor");
        System.out.println("Coe " + this.coffeeRequired + "g de cafe com " + this.waterRequired +"ml de agua.");
        System.out.println("Escolha entre leite comum ou de soja.");      
        System.out.println("Realize a mistura.");
        
    }
}
