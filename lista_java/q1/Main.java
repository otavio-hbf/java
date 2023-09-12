package lista_java.q1;

public class Main {
    public static void main(String[] args) {
    
    //------- CARTAO DE CREDITO ----------------------------------------------------------------
        int count = 1;
        CartaoCredito tentativasCartaoCredito[] = new CartaoCredito[]{
            new CartaoCredito(413, 2442),
            new CartaoCredito(413, 2452)
        };
        
        for(CartaoCredito t:tentativasCartaoCredito){
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

    //------- BOLETO BANCARIO ---------------------------------------------------------------------

        BoletoBancario tentativas[] = new BoletoBancario[]{
            new BoletoBancario("KJ23K25B2I3"),
            new BoletoBancario("23WEI4HOEW79")
        };
        
        for(BoletoBancario t:tentativas){
            System.out.println("\u001B[33m" + "Tentativa "+ count + ":" + "\u001B[0m" + "\n" );
            try{
                t.processarPagamento(1018.99);
            }
            catch(Authfail e){
                e.print();
            }
            finally{
                count++;
                System.out.println("Tentativa finalizada.\n");
            }
        }


    //------ PAYPAL ----------------------------------------------------------------------------------

        PayPal tentativasPayPal[] = new PayPal[]{
            new PayPal("ham4", "vouchorarpqtirei9ponto8"),
            new PayPal("ohbf", "mimdepapai")
        };
        
        for(PayPal t:tentativasPayPal){
            System.out.println("\u001B[33m" + "Tentativa "+ count + ":" + "\u001B[0m" + "\n" );
            try{
                t.processarPagamento(28.90);
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
