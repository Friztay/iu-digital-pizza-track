package models;

public class NodoModel<T> {
    private T valor;
    private NodoModel<T> siguiente;

    public NodoModel(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NodoModel<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoModel<T> siguiente) {
        this.siguiente = siguiente;
    }
}