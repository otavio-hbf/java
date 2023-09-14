package q3;

public class Espresso extends Coffe{

    Espresso(){
        this.waterRequired = 50;
        this.milkRequired = 50;
        this.coffeeRequired = 50;
    }

    @Override
    public void prepare(){
        System.out.println("Selecione uma xícara de 150 ml.");
        System.out.println("Selecione o leite concentrado.");
        System.out.println("Aqueça os " + this.milkRequired + "ml de leite concentrado e coloque na xicara.");
        System.out.println("Selecione o café nespresso.");
        System.out.println("Coloque os " + this.coffeeRequired + "g de café na maquina com " +  this.waterRequired + " de água.");
    }
}
