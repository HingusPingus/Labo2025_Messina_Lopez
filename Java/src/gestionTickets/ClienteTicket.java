package gestionTickets;

import personas.Persona;

public class ClienteTicket extends Persona {

    public ClienteTicket() {
        super();
    }

    public ClienteTicket(String nombre, int edad, String direccion) {
        super(nombre, edad, direccion);
    }

    public ClienteTicket(String nombre, String apellido, int edad, String direccion) {
        super(nombre, apellido, edad, direccion);
    }
}
