package org.example.carrera_solidaria;

import java.util.ArrayList;

//Clase Organizador
public class Organizador {

    private String nombre;
    private String edicion;
    private ArrayList<Corredor> listaCorredores;

    //Como siempre es IES MUTXAMEL, el constructor solo recibe la edicion, se crea también una lista vacía.
    public Organizador (String edicion){
        this.nombre="IES MUTXAMEL";
        this.edicion=edicion;
        this.listaCorredores = new ArrayList<>();
    }

    //Metodo para inscribir corredores, el if controla que no se introduzcan más de 700
    public void inscribir_corredor(Corredor corredor) {
        if(listaCorredores.size()<=700){
            listaCorredores.add(corredor);
            System.out.println("* Nueva inscripcion realizada. Corredor : " + corredor.getNombre() + " con dorsal " + corredor.getDorsal());
        } else {
            System.out.println("ERROR. No se pueden añadir más de 700 participantes.");
        }

    }

    //metodo para eliminar corredores, no lo pedía el ejercicio.
    public void eliminarCorredor(Corredor corredor) {
        listaCorredores.remove(corredor);
    }

    //Metodo para mostrar corredores, mediante un bucle for, imprimo el dorsal y nombre de los corredores, recorriendo la lista.
    public void mostrarCorredores(){
        System.out.println("Corredores inscritos: " + listaCorredores.size());
        for(Corredor corredor : listaCorredores){
            System.out.println("    ["+corredor.getDorsal()+"]. " + corredor.getNombre());
        }
    }

    //Metodo para calcular el total de donaciones, multiplica el importe de la vuelta por las vueltas totales.
    public void calcularDonacion(Corredor corredor){
        System.out.println("El corredor " + corredor.getNombre() + " ha conseguido una donacion de " + corredor.getImporte_vuelta()*corredor.getVueltas_completadas() + "€");
    }


    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString(){
        return "- Organizador [nombre= " + nombre + ", edicion=" + edicion + ", listaCorredores=" + listaCorredores + "]";
    }


}
