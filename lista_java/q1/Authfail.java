package lista_java.q1;

public class Authfail extends Exception {
    Authfail(){
        super("Erro de autenticação");
    }
    public void print(){
        System.out.println("Erro de autenticação");
    }
}
