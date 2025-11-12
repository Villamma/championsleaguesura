package org.example.betplay;

import java.util.HashMap;

public class deportivoIndependienteMedellin {

    public static void main(String[] args) {

        //Creando mi primer diccionario.

        HashMap<String,Object>jugador=new HashMap<>();

        //Agregar elementos a un diccionario.
        jugador.put("posicion" , "portero");
        jugador.put("nombre", "David gonzales");
        jugador.put("edad", 50);
        jugador.put("estatura", 1.98);
        jugador.put("esCampeonLibertador", false);


        System.out.println(jugador);


    }



}
