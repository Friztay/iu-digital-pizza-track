package models;

public class PilaPedidosModel {
    
    private NodoModel<PizzaModel> tope;
    private Integer cantidad;

    public PilaPedidosModel() {
        this.tope = null;
        this.cantidad = 0;
    }

    public void push(PizzaModel valorNodo) {
        NodoModel<PizzaModel> nuevoPedido = new NodoModel<>(valorNodo);
        nuevoPedido.setSiguiente(this.tope);
        this.tope = nuevoPedido;
        this.cantidad++;
    }

    public NodoModel<PizzaModel> pop() {
        if (isEmpty()) {
            return null;
        }   
        NodoModel<PizzaModel> nodoEliminado = this.tope;
        this.tope = this.tope.getSiguiente();
        this.cantidad--;
        return nodoEliminado;
    }

    public NodoModel<PizzaModel> peek() {
        if (isEmpty())
            return null;
        
        return this.tope;
    }

    public boolean isEmpty() {
        if (this.tope == null) {
            System.out.println("No hay pedidos pendientes por procesar. \n");
            return true;
        }
        return false;
    }
}