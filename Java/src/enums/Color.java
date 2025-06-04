package enums;

public enum Color {
    NEGRO("Negro","000000"),BLANCO("Blanco","ffffff"),
    ROJO("Rojo","ff0000"),AZUL("Azul","0000ff")
    ;

    private String nombre;
    private String hex;

    Color(String nombre, String hex) {
        this.nombre = nombre;
        this.hex = hex;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHex() {
        return hex;
    }

}
