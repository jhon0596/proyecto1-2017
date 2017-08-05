package java.clases.lista;


public class DobleLinkedList {
    public LinkDoble PrimerLink;

    DobleLinkedList(){
        PrimerLink = null;
    }

    public void addFirst(Object x){
        LinkDoble LinkInsertar = new LinkDoble(x);
        if (PrimerLink == null){
            LinkInsertar.setNext(PrimerLink);
            LinkInsertar.setPrevio(null);
            PrimerLink = LinkInsertar;
        }else{
            PrimerLink.setPrevio(LinkInsertar);
            LinkInsertar.setNext(PrimerLink);
            LinkInsertar.setPrevio(null);
            PrimerLink = LinkInsertar;
        }
    }
    public void addLast(Object x) {
        LinkDoble LinkInsertar = new LinkDoble(x);
        LinkDoble LinkActual = PrimerLink;
        while (LinkActual.getNext() != null) {
            LinkActual = LinkActual.getNext();
        }
        LinkActual.setNext(LinkInsertar);
        LinkInsertar.setNext(null);
        LinkInsertar.setPrevio(LinkActual);
    }

    public void display(){
        LinkDoble Link = PrimerLink;
        while (Link != null){
            System.out.print(Link.getT());
            Link = Link.getNext();
        }
    }
    public void addat(Object x, int index){
        LinkDoble LinkInsertar = new LinkDoble(x);
        LinkDoble LinkActual = PrimerLink;
        LinkDoble LinkPrevio = LinkActual;
        int z = 0;
        while(z != index){
            LinkPrevio = LinkActual;
            LinkActual = LinkActual.getNext();
            z++;
        }
        LinkPrevio.setNext(LinkInsertar);
        LinkInsertar.setPrevio(LinkPrevio);
        LinkActual.setPrevio(LinkInsertar);
        LinkInsertar.setNext(LinkActual);
    }
    public void deleteFirst(){
        PrimerLink = PrimerLink.getNext();
        PrimerLink.setPrevio(null);
    }
    public void deleteLast(){
        LinkDoble LinkActual = PrimerLink;
        LinkDoble LinkPrevio = LinkActual;
        while(LinkActual.getNext() != null){
            LinkPrevio = LinkActual;
            LinkActual = LinkActual.getNext();
        }
        LinkPrevio.setNext(null);
    }
    public  void deleteAt(int index){
        LinkDoble LinkActual = PrimerLink;
        LinkDoble LinkPrevio = LinkActual;
        int x = 0;
        while(x != index){
            LinkPrevio = LinkActual;
            LinkActual = LinkActual.getNext();
            x++;
        }
       LinkPrevio.setNext(LinkActual.getNext());
       LinkActual.getNext().setPrevio(LinkPrevio);
    }
    public void printLinkPrevio(int index){
        LinkDoble LinkActual = PrimerLink;
        int x = 0;
        while(x != index){
            LinkActual = LinkActual.getNext();
            x++;
        }
        System.out.println(LinkActual.getPrevio().getT());
    }
    public boolean search(Object x){
        LinkDoble LinkActual = PrimerLink;
        while(LinkActual != null){
            if(LinkActual.getT() == x){
                return true;
            }
            LinkActual = LinkActual.getNext();
        }
        return false;
    }
    public LinkDoble getNodoEspecifico(int posicion){
        LinkDoble linkActual = PrimerLink;
        int x = 0;
        while(x!=posicion){
            linkActual = linkActual.getNext();
            x+=1;
        }
        return linkActual;
    }
    public static void main(String[] args) {
        DobleLinkedList Lista = new DobleLinkedList();
        Lista.addFirst("papa");
        Lista.addFirst("carne");
        Lista.addFirst("verdura");
        Lista.addFirst(2);
        Lista.display();
    }
}
