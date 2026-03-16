package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuService {
    int opcionIngresada = 1;
    private final Scanner scan = new Scanner(System.in);
    private final GestionPedidosService gestionPedidosService = new GestionPedidosService();
    private Map<Integer, Runnable> menuOpciones;

    public MenuService() {}

    public void inicializarGestorPedidos() {
        System.out.println("¡Bienvenido a Pizza Track!");
        while (this.opcionIngresada != 0) {
            ejecutarGestorPedidos();
        }
    }

    public void ejecutarGestorPedidos() {
        mostrar_menu();
        boolean valido = false;
        while (!valido) {
            System.out.print("Digite la opción del menú que desea ejecutar:\n");
            try {
                this.opcionIngresada = Integer.parseInt(scan.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número correspondiente a una opción del menú.\n");
            }
        }
        if (this.opcionIngresada == 0) {
            System.out.println("¡Gracias por usar Pizza Track! ¡Hasta luego!");
            return;
        }

        procesar_opcion_seleccionada(opcionIngresada);
    }
    
    public void procesar_opcion_seleccionada(int opcionIngresada) {
        menuOpciones = new HashMap<>();
        menuOpciones.put(1, this.gestionPedidosService::registrarNuevaPizza); 
        menuOpciones.put(2, this.gestionPedidosService::deshacerUltimoPedido); 
        menuOpciones.put(3, this.gestionPedidosService::rehacerUltimaCancelacion); 
        menuOpciones.put(4, this.gestionPedidosService::mostrarPedidoActual); 
        menuOpciones.put(5, this.gestionPedidosService::mostrarPedidosPendientes); 
        menuOpciones.put(6, this.gestionPedidosService::mostrarPedidosCancelados); 

        Runnable action = menuOpciones.get(opcionIngresada);
        if (action == null) {
            System.out.println("Opción no válida. Por favor, seleccione una opción del menú. \n");
            return;
        }

        action.run();
    }
    
    public void mostrar_menu() {
        System.out.println(":::Menú de opciones:::");
        String[] opciones_menu = new String[] {
            "Registrar Nuevo Pedido de Pizza",
            "Deshacer Último Pedido",
            "Rehacer Último Pedido Cancelado",
            "Mostrar Pedido Actual",
            "Mostrar Pedidos Pendientes",
            "Mostrar Pedidos Cancelados"
        };

        for (int opcion=0; opcion < opciones_menu.length; opcion++) {
            System.out.println((opcion + 1) + ". " + opciones_menu[opcion]);
        }
    }
    
}