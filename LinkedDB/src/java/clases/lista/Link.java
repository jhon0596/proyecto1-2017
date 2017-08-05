package java.clases.lista;


public class Link<T> {


    private Object T;

    private Link next;

    public Object getT() {
        return T;
    }

    public void setT(T t) {
        T = t;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getNext() {
        return next;
    }

    public Link(T cantidad){
        this.T = cantidad;

    }
    public void display(){
        System.out.print(T);
    }

    public static void main(String[] args) {
    }
}




