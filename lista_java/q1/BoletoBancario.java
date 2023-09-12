package lista_java.q1;

class ClienteBB extends Cliente<String>{

    ClienteBB(String cod){
        super(cod, "<NULL>"); //<NULL> indica a ausencia de auth2, já que boleto requer apenas o codigo do boleto
    }

    public String getCodBol() {
        return this.getAuth1();
    }

}

public class BoletoBancario implements FormaDePagamento {

    ClienteBB[] clients ;
    String input_cod;
    double valor;

    BoletoBancario(String input_cod){
        this.input_cod = input_cod;

        this.clients = new ClienteBB[]{
            new ClienteBB("23WEI4HOEW79"),
            new ClienteBB("34R2HU45U9ED"),
            new ClienteBB("S67890DFHNI2"),
        };
    }
    
    @Override
    public boolean autenticar(){
        boolean result = false;

        for(ClienteBB client : this.clients){

            if(this.input_cod == client.getCodBol()){
                result = true;
                break;
            }
        }
        
        return result;
    };

    @Override
    public void processarPagamento(double valor) throws Authfail{
        if(this.autenticar()){
            System.out.println("Valor de R$" + valor + " pago com Boleto Bancario.");
        }
        else{
            Authfail e;
            e = new Authfail();
            throw e;
        }
    }
}
