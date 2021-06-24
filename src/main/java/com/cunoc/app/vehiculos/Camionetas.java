package com.cunoc.vehiculos;

import com.cunoc.interfaces.*;

public class Camionetas extends Vehiculos implements Giro, ComportamientoCamioneta{
    
    @Override
    public void atributosVehiculo(String combustible, int galonesmax, int pasajeros, int velocidad, int aceleracion){
        System.out.println("\nLos vehiculos de tipo camioneta se llenan de: "+combustible+" y su capacidad maxima de combustible es de: "+galonesmax+" galones.");
        System.out.println("Los vehiculos de tipo camioneta tienen capacidad para: "+pasajeros+" pasajeros, y su velocidad maxima es de: "+velocidad+" km/h, mientras que su aceleracion base es de: "+aceleracion+" km/h.");
    }

    @Override
    public void giroIzquierda(){
        System.out.println("El vehiculo de tipo camioneta gira a la izquierda.");
    }
    
    @Override
    public void giroDerecha(){
        System.out.println("El vehiculo de tipo camioneta gira a la derecha.");
    }
    
    @Override
    public void transportarPersonas(){
        System.out.println("Las camionetas pueden transportar a varias personas siempre y cuando no traspase su capacidad maxima.");
    }
}
