package java.clases.lista;


public class ListaCircular<T> {
    public Link firstLink;
    public Link lastLink;
    ListaCircular(){
        firstLink = null;

    }
    public boolean isEmpty(){
        return(firstLink == null);
    }

    public void insertFirstLink(T cantidad){
        Link newLink = new Link(cantidad);
        insertFirstLink(newLink);
    }
    private void insertFirstLink(Link link){//inserta un nodo en la primer posicion
        if(firstLink == null){
            firstLink = link;
            lastLink = link;
            lastLink.setNext(link);
        }
        else{
            link.setNext(firstLink);
            firstLink = link;
            lastLink.setNext(firstLink);
        }
    }
    public void insertLink(T cantidad,int contador){
        if(contador ==0){
            insertFirstLink(cantidad);
        }
        else{
            Link LinkInsertar = new Link(cantidad);
            insertLink(LinkInsertar,contador);
        }
    }
    private void insertLink(Link LinkInsertar, int contador){//contador define la posicion notar que las posiciones empienza de 0
        Link LinkActual = firstLink;
        Link LinkPrevio = LinkActual;
        int x = 0;
        while(x!=contador){
            LinkPrevio = LinkActual;
            LinkActual = LinkActual.getNext();
            x = x+1;
        }
        if(LinkActual == firstLink){
            LinkPrevio.setNext(LinkInsertar);
            LinkInsertar.setNext(LinkActual);
            lastLink = LinkInsertar;
        }
        else{
            LinkPrevio.setNext(LinkInsertar);
            LinkInsertar.setNext(LinkActual);
        }
    }
    public Link removeFirst(){//elimina un nodo
        Link linkReference = firstLink;

        if(!isEmpty()) {
            firstLink = firstLink.getNext();
            lastLink.setNext(firstLink);
        }else{
            System.out.println("Empty");
        }

        return linkReference;
    }
    public void removeEspecifico(int contador){//elimina un nodo en la posicion especifica
        if(contador == 0){
            removeFirst();
        }
        else{
            Link LinkActual = firstLink;
            Link LinkPrevio = LinkActual;
            int x = 0;
            while(x!=contador){
                LinkPrevio = LinkActual;
                LinkActual = LinkActual.getNext();
                x = x+1;
            }
            if(LinkActual == lastLink){
                LinkPrevio.setNext(LinkActual.getNext());
                lastLink = LinkPrevio;
            }
            else {
                LinkPrevio.setNext(LinkActual.getNext());
            }
        }

    }
    public void display(){
        Link theLink =  firstLink;
        while(theLink.getNext() != firstLink){
            theLink.display();
            theLink = theLink.getNext();
        }
        lastLink.display();
    }
    public Link getNodoEspecifico(int posicion){
        Link linkActual = firstLink;
        int x = 0;
        while(x!=posicion){
            linkActual = linkActual.getNext();
            x+=1;
        }
        return linkActual;
    }
    public static void main(String[] args) {
        ListaCircular theList = new ListaCircular();
        theList.insertFirstLink(2);
        theList.insertFirstLink(3);
        theList.insertFirstLink(4);
        theList.insertFirstLink(5);
        theList.removeEspecifico(3);
        theList.lastLink.display();
    }
}
