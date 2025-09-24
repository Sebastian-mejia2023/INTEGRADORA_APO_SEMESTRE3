package model.estructuras;

public class NodoDoble<T>{
    T Date;
    NodoDoble<T> Next;
    NodoDoble<T> Prev;

    public NodoDoble(T date){
        this.date = date;
        this.next = next = null:
        this.prev = null;
    }

    public T getDate() {
        return Date;
    }

    public void setDate(T date) {
        Date = date;
    }

    public NodoDoble<T> getNext() {
        return Next;
    }

    public void setNext(NodoDoble<T> next) {
        Next = next;
    }

    public NodoDoble<T> getPrev() {
        return Prev;
    }

    public void setPrev(NodoDoble<T> prev) {
        Prev = prev;
    }
}
