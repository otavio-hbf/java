package q1;

class ClienteCC extends Cliente<Integer>{

    ClienteCC(int cod, int senha){
        super(cod, senha);
    }

    public int getCod() { //Sei que eh redudante, mas optei por fazer isso para ter mais clareza no código
        return this.getAuth1();
    }
    public int getSenha() {
        return this.getAuth2();
    }
}

public class CartaoCredito implements FormaDePagamento {

    ClienteCC[] clients ;
    int input_cod;
    int input_senha;
    double valor;

    CartaoCredito(int input_cod, int input_senha){
        this.input_cod = input_cod;
        this.input_senha = input_senha;

        this.clients = new ClienteCC[]{
            new ClienteCC(413, 2452),
            new ClienteCC(706, 132214),
            new ClienteCC(123, 1234),
        };
    }
    
    @Override
    public boolean autenticar(){
        boolean result = false;

        for(ClienteCC client : this.clients){

            if((this.input_cod == client.getCod()) && (this.input_senha == client.getSenha())){
                result = true;
                break;
            }
        }
        
        return result;
    };

    @Override
    public void processarPagamento(double valor) throws Authfail{
        if(this.autenticar()){
            System.out.println("Valor de R$" + valor + " pago com Cartao de Credito.");
        }
        else{
            Authfail e;
            e = new Authfail();
            throw e;
        }
    }
}
