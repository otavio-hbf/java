package q1;

class ClientePP extends Cliente<String>{

    ClientePP(String login, String senha){
        super(login, senha);
    }

    public String getLogin() { //Sei que eh redudante, mas optei por fazer isso para ter mais clareza no código
        return this.getAuth1();
    }
    public String getSenha() {
        return this.getAuth2();
    }
}

public class PayPal implements FormaDePagamento {

    ClientePP[] clients ;
    String input_login;
    String input_senha;
    double valor;

    PayPal(String input_login, String input_senha){
        this.input_login = input_login;
        this.input_senha = input_senha;

        this.clients = new ClientePP[]{
            new ClientePP("ohbf", "mimdepapai"),
            new ClientePP("trm4", "zeldinha123"),
            new ClientePP("pbgs2", "peuba1980"),
        };
    }
    
    @Override
    public boolean autenticar(){
        boolean result = false;

        for(ClientePP client : this.clients){

            if((this.input_login == client.getLogin()) && (this.input_senha == client.getSenha())){
                result = true;
                break;
            }
        }
        
        return result;
    };

    @Override
    public void processarPagamento(double valor) throws Authfail{
        if(this.autenticar()){
            System.out.println("Valor de R$" + valor + " pago com PayPal, o pix dos gringos.");
        }
        else{
            Authfail e;
            e = new Authfail();
            throw e;
        }
    }
}
