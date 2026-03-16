package services;

import java.util.Scanner;
import models.NodoModel;
import models.PedidosCancelados;
import models.PedidosPendientes;
import models.PilaPedidosModel;
import models.PizzaModel;

public class GestionPedidosService {

    private final Scanner scan = new Scanner(System.in);
    private final PedidosPendientes pedidosPendientes;
    private final PedidosCancelados pedidosCancelados;

    public GestionPedidosService() {
        this.pedidosPendientes = new PedidosPendientes();
        this.pedidosCancelados = new PedidosCancelados();
    }

    public void registrarNuevaPizza() {
        System.out.println("Función para registrar una nueva pizza.");
        String nombrePizza;
        String[] ingredientes = new String[3];

        System.out.println("Ingrese el nombre de la pizza: ");
        nombrePizza = scan.nextLine();

        for (int x=0; x < ingredientes.length; x++) {
            System.out.printf("Ingrese el ingrediente %d: ", x+1);
            ingredientes[x] = scan.nextLine();
        }
        System.out.printf("Confirmación de Pedido: Pizza %s, con ingredientes: %s \n", nombrePizza, String.join(", ", ingredientes));
        PizzaModel pizzaModel = new PizzaModel(nombrePizza, ingredientes);
        this.pedidosPendientes.push(pizzaModel);
    }

    public void deshacerUltimoPedido() {
        System.out.println("Función para deshacer el último pedido.");
        NodoModel<PizzaModel> nodoEliminado = this.pedidosPendientes.pop();
        if (nodoEliminado == null) 
            return;
            
        System.out.printf("Pedido eliminado: %s \n", nodoEliminado.getValor().getNombre());
        this.pedidosCancelados.push(nodoEliminado.getValor());
    }

    public void rehacerUltimaCancelacion() {
        System.out.println("Función para rehacer el último pedido cancelado.");
        NodoModel<PizzaModel> nodoRehecho = this.pedidosCancelados.pop();
        if (nodoRehecho == null) 
            return;
            
        System.out.printf("Pedido rehecho: %s \n", nodoRehecho.getValor().getNombre());
        this.pedidosPendientes.push(nodoRehecho.getValor());
    }

    public void mostrarPedidoActual() {
        System.out.println("Función para mostrar el pedido actual.");
        NodoModel<PizzaModel> nodoTope = this.pedidosPendientes.peek();
        if (nodoTope == null)
            return;

        PizzaModel pizzaActual = nodoTope.getValor();
        System.out.printf("Pedido actual: Pizza %s, con ingredientes: %s \n", pizzaActual.getNombre(), String.join(", ", pizzaActual.getIngredientes()));
    }

    public void mostrarPedidosPendientes() {
        System.out.println("Función para mostrar todos los pedidos pendientes.");
        mostrarPedidos(this.pedidosPendientes);
    }

    public void mostrarPedidosCancelados() {
        System.out.println("Función para mostrar todos los pedidos cancelados.");
        mostrarPedidos(this.pedidosCancelados);
    }

    private void mostrarPedidos(PilaPedidosModel pilaPedidos) {
        NodoModel<PizzaModel> nodoActual = pilaPedidos.peek();
        int posicion = 1;
        while (nodoActual != null) {
            PizzaModel pizza = nodoActual.getValor();
            System.out.printf("%s - Pizza: %s, Ingredientes: %s \n", posicion, pizza.getNombre(), String.join(", ", pizza.getIngredientes()));
            nodoActual = nodoActual.getSiguiente();
            posicion++;
        }
    }
}