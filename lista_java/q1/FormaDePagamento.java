package lista_java.q1;

public interface FormaDePagamento {
    public boolean autenticar ();
    public void processarPagamento(double valor) throws Authfail;
}