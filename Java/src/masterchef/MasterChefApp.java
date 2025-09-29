package masterchef;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args) {
        System.out.println("=== PRINCIPIANTE ===");
        HashSet<String> ingredientesProhibidos = new HashSet<>();
        ingredientesProhibidos.add("gluten");
        ingredientesProhibidos.add("lactosa");

        Principiante principiante = new Principiante("Ana", LocalDate.of(1990, 5, 15), "Madrid", Color.ROJO, ingredientesProhibidos);
        principiante.prepararTrabajo();

        HashMap<String, Integer> ingredientesEntrada = new HashMap<>();
        ingredientesEntrada.put("lechuga", 2);
        ingredientesEntrada.put("tomate", 3);
        ingredientesEntrada.put("aceite", 1);

        Plato entrada = new Plato("Ensalada", 15, ingredientesEntrada);
        Plato entradaServida = principiante.cocinarEntrada(entrada);
        if (entradaServida != null) {
            principiante.servirEntrada(entradaServida);
        }

        HashMap<String, Integer> ingredientesProhibidosEntrada = new HashMap<>();
        ingredientesProhibidosEntrada.put("gluten", 1);
        ingredientesProhibidosEntrada.put("pollo", 2);

        Plato entradaProhibida = new Plato("Pollo con gluten", 20, ingredientesProhibidosEntrada);
        Plato entradaProhibidaServida = principiante.cocinarEntrada(entradaProhibida);

        System.out.println("\n=== INTERMEDIO ===");
        HashMap<String, Integer> stockIntermedio = new HashMap<>();
        stockIntermedio.put("arroz", 5);
        stockIntermedio.put("pollo", 3);
        stockIntermedio.put("verduras", 10);

        Intermedio intermedio = new Intermedio("Carlos", LocalDate.of(1985, 8, 22), "Barcelona", Color.VERDE, stockIntermedio);
        intermedio.prepararTrabajo();

        HashMap<String, Integer> ingredientesPrincipal = new HashMap<>();
        ingredientesPrincipal.put("arroz", 2);
        ingredientesPrincipal.put("pollo", 1);
        ingredientesPrincipal.put("verduras", 3);

        Plato principal = new Plato("Arroz con pollo", 30, ingredientesPrincipal);
        Plato principalServido = intermedio.cocinarPrincipal(principal);
        if (principalServido != null) {
            intermedio.servirPrincipal(principalServido);
        }

        HashMap<String, Integer> ingredientesFaltantes = new HashMap<>();
        ingredientesFaltantes.put("arroz", 10); // Solo tenemos 5 en stock
        ingredientesFaltantes.put("pollo", 2);

        Plato principalFaltante = new Plato("Plato grande", 25, ingredientesFaltantes);
        Plato principalFaltanteServido = intermedio.cocinarPrincipal(principalFaltante);

        System.out.println("\n=== EXPERTO ===");
        Experto experto = new Experto("Maria", LocalDate.of(1980, 3, 10), "Valencia", Color.AZUL);
        experto.prepararTrabajo();

        HashMap<String, Integer> ingredientesEntradaExperto = new HashMap<>();
        ingredientesEntradaExperto.put("queso", 1);
        ingredientesEntradaExperto.put("jamón", 2);

        Plato entradaExperto = new Plato("Entrada experta", 20, ingredientesEntradaExperto);
        Plato entradaExpertoServida = experto.cocinarEntrada(entradaExperto);
        if (entradaExpertoServida != null) {
            experto.servirEntrada(entradaExpertoServida);
        }

        HashMap<String, Integer> ingredientesPrincipalExperto = new HashMap<>();
        ingredientesPrincipalExperto.put("carne", 2);
        ingredientesPrincipalExperto.put("patatas", 4);
        ingredientesPrincipalExperto.put("especias", 1);

        Plato principalExperto = new Plato("Plato principal experto", 35, ingredientesPrincipalExperto);
        Plato principalExpertoServido = experto.cocinarPrincipal(principalExperto);
        if (principalExpertoServido != null) {
            experto.servirPrincipal(principalExpertoServido);
        }

        HashMap<String, Integer> ingredientesTiempo = new HashMap<>();
        ingredientesTiempo.put("ingrediente", 1);

        Plato platotiempo = new Plato("Plato largo", 60, ingredientesTiempo);
        Plato platotiempoServido = experto.cocinarPrincipal(platotiempo);

        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}