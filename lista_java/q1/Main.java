package lista_java.q1;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        CartaoCredito tentativas[] = new CartaoCredito[]{
            new CartaoCredito(412, 2442),
            new CartaoCredito(412, 2452)
        };
        
        for(CartaoCredito t:tentativas){
            System.out.println("\u001B[33m" + "Tentativa "+ count + ":" + "\u001B[0m" + "\n" );
            try{
                t.processarPagamento(315.67);
            }
            catch(Authfail e){
                e.print();
            }
            finally{
                count++;
                System.out.println("Tentativa finalizada.\n");
            }
        }

    }
}
