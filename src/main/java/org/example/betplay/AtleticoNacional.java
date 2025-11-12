package org.example.betplay;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.HashMap;

public class AtleticoNacional {
    public static void main(String[] args) {

        //Creando una lista de diccionarios.
        ArrayList<HashMap<String, Object>> jugadores = new ArrayList<>();

        //Asignando un diccionario
        HashMap<String, Object> jugador = new HashMap<>();
        jugador.put("posicion" , "portero");
        jugador.put("nombre", "David Ospina");
        jugador.put("edad", 90);
        jugador.put("estatura", 1.98);
        jugador.put("esCampeonLibertador", false);



        HashMap<String, Object> jugadorDos = new HashMap<>();
        jugadorDos.put("posicion" , "Delantero");
        jugadorDos.put("nombre", "Aristigol");
        jugadorDos.put("edad", 90);
        jugadorDos.put("estatura", 1.65);
        jugadorDos.put("esCampeonLibertador", false);


        //Agrego un diccionario a una lista.

        jugadores.add(jugador);
        jugadores.add(jugadorDos);

        System.out.println(jugadores);
    }
}
