package lista_java.q1;

public class Tuple<A,B> {
    A fst;
    B snd;

    Tuple(A first, B second){
        this.fst = first;
        this.snd = second;
    }

    public A getFst() {
        return fst;
    }

    public B getSnd() {
        return snd;
    }
}
