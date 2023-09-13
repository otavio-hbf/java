package q1;

public class Cliente <T> {
    private T auth1, auth2;

    Cliente(T auth1, T auth2){
        this.auth1 = auth1;
        this.auth2 = auth2;
    }

    public T getAuth1() {
        return auth1;
    }
    public T getAuth2() {
        return auth2;
    }
}
