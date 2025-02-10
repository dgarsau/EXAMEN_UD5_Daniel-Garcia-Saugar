package org.example.carrera_solidaria;

import java.util.ArrayList;
import java.util.Arrays;

//Clase Corredor
public class Corredor {

    //Variable utilizada para el dorsal.
    private static int contadordorsal=1;

    private String nombre;
    private int dorsal;
    private ArrayList<String> listaPatrocinadores;
    private double importe_vuelta;
    private int vueltas_completadas;

    public Corredor(String nombre, double importe_vuelta) {
        this.nombre = nombre;
        setDorsal(); //llama al setter
        setImporte_vuelta(importe_vuelta);
        this.vueltas_completadas = 0;
        this.listaPatrocinadores = new ArrayList<>(); //inicializo el ArrayList vacío
    }

    public void setDorsal() {
        this.dorsal = contadordorsal;
        contadordorsal++; //actualizo la variable contadordorsal para el siguiente corredor.
    }

    public void setNumero_vueltas(int vueltas){
        this.vueltas_completadas=vueltas;
    }

    //metodo para insertar patrocinadores (uno o varios), recibe una lista de nombres. Patrocinador no es una clase por lo que solamente se guarda el nombre de ellos.
    public void insertarPatrocinador(String... patrocinador){
        listaPatrocinadores.addAll(Arrays.asList(patrocinador));
        System.out.println("* Nuevos patrocinadores añadidos para el corredor " + this.nombre);
    }

    //setter de importe_vuelta, si es menor a 0.5 se iguala a 0.5. Si no, se guarda la que recibe el constructor.
    public void setImporte_vuelta(double importe_vuelta) {
        if (importe_vuelta<0.5){
            this.importe_vuelta=0.5;
        }else{
            this.importe_vuelta = importe_vuelta;
        }
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public ArrayList<String> getListaPatrocinadores() {
        return listaPatrocinadores;
    }

    public void setListaPatrocinadores(ArrayList<String> listaPatrocinadores) {
        this.listaPatrocinadores = listaPatrocinadores;
    }

    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    public int getVueltas_completadas() {
        return vueltas_completadas;
    }


    //toString, permite imprimir desde el main.
    @Override
    public String toString(){
        return "- Corredor [nombre=" + nombre + ", dorsal=" + dorsal + ", listaPatrocinadores" + listaPatrocinadores + ", importe_vuelta="+ importe_vuelta + ", numero_vueltas=" + vueltas_completadas + "]";
    }

}
