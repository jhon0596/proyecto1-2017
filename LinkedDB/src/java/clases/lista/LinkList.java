package java.clases.lista;


public class LinkList<T> {
    public Link firstLink;
    public int tamaño;

    LinkList(){
        firstLink = null;

    }
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirstLink(2);
        theList.insertFirstLink(3);
        theList.insertFirstLink(4);
        theList.insertFirstLink(5);
        theList.removeEspecifico(4);
        theList.display();
    }
    public int getTamaño() {
        return tamaño;
    }
    public boolean isEmpty(){
        return(firstLink == null);
    }

    public void insertFirstLink(T cantidad){
        Link newLink = new Link(cantidad);
        insertFirstLink(newLink);
    }
   private void insertFirstLink(Link link){//inserta un nodo en la primer posicion
       link.setNext(firstLink);
       firstLink = link;
       tamaño++;
    }
    public void insertLink(T cantidad,int contador){
        Link LinkInsertar = new Link(cantidad);
        insertLink(LinkInsertar,contador);

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
        LinkPrevio.setNext(LinkInsertar);
        LinkInsertar.setNext(LinkActual);
        tamaño++;
    };
    public Link removeFirst(){//elimina un nodo
        Link linkReference = firstLink;

        if(!isEmpty()) {
            firstLink = firstLink.getNext();
            tamaño--;
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
            LinkPrevio.setNext(LinkActual.getNext());
            tamaño--;
        }

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
    public void display(){
        Link theLink =  firstLink;
        while(theLink != null){
            theLink.display();
            theLink = theLink.getNext();
        }
    }
}

