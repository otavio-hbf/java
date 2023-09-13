package q3;

public class Main {
    public static void main(String[] args) {
        
        CoffeMachine mach = new CoffeMachine();
        Latte cafe1 = new Latte();
        Espresso cafe2 = new Espresso();
        Capuccino cafe3 = new Capuccino();

        mach.makeCoffe(cafe1);
        mach.makeCoffe(cafe2);
        mach.makeCoffe(cafe3);
    }
}
