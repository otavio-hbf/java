package lista_java.q1;

class ClienteCC{
    public int cod, senha;

    ClienteCC(int cod, int senha){
        this.cod = cod;
        this.senha = senha;
    }

    public int getCod() {
        return cod;
    }
    public int getSenha() {
        return senha;
    }
}

public class CartaoCredito implements FormaDePagamento {

    ClienteCC[] clients = new ClienteCC[]{
        new ClienteCC(412, 2452),
        new ClienteCC(706, 132214),
        new ClienteCC(123, 1234),
    };

    int input_cod;
    int input_senha;
    double valor;

    CartaoCredito(int input_cod, int input_senha){
        this.input_cod = input_cod;
        this.input_senha = input_senha;
    }
    
    @Override
    public boolean autenticar(){
        boolean result = false;

        for(ClienteCC client : this.clients){

            if((this.input_cod == client.cod) && (this.input_senha == client.senha)){
                result = true;
                break;
            }
        }
        
        return result;
    };

    @Override
    public void processarPagamento(double valor) throws Authfail{
        if(this.autenticar()){
            System.out.println("Valor de R$" + valor + " pago com cartão de crédito");
        }
        else{
            Authfail e;
            e = new Authfail();
            throw e;
        }
    }
}
