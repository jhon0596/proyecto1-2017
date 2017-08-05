package java.clases.lista;



public class LinkDoble<T> {

        private Object T;

        private LinkDoble next;

        private LinkDoble previo;


        public LinkDoble(Object x){
            this.T= x;
        }
        public void display(){
            System.out.println(T);
        }

        public void setNext(LinkDoble next) {
            this.next = next;
        }

        public void setT(Object t) {
            T = t;
        }

        public void setPrevio(LinkDoble previo) {
            this.previo = previo;
        }

        public LinkDoble getNext() {
            return next;
        }

        public LinkDoble getPrevio() {
            return previo;
        }

        public Object getT() {
            return T;
        }

        public static void main(String[] args) {
            }
}
