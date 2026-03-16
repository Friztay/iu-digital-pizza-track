package models;

public class PizzaModel {

    private final String nombre;
    private String[] ingredientes = new String[3];

    public PizzaModel(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String[] getIngredientes() {
        return this.ingredientes;
    }
}