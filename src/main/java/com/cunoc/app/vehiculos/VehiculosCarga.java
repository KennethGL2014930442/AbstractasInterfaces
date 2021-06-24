package com.cunoc.vehiculos;

import com.cunoc.interfaces.*;

public class VehiculosCarga extends Vehiculos implements Giro, ComportamientoCarga{

    @Override
    public void atributosVehiculo(String combustible, int galonesmax, int pasajeros, int velocidad, int aceleracion){
        System.out.println("\nLos vehiculos de carga se llenan de: "+combustible+" y su capacidad maxima de combustible es de: "+galonesmax+" galones.");
        System.out.println("Los vehiculos de carga tienen capacidad para: "+pasajeros+" pasajeros, y su velocidad maxima es de: "+velocidad+" km/h, mientras que su aceleracion base es de: "+aceleracion+" km/h.");
    }
    
    @Override
    public void giroIzquierda(){
        System.out.println("El vehiculo de carga gira a la izquierda.");
    }
    
    @Override
    public void giroDerecha(){
        System.out.println("El vehiculo de carga gira a la derecha.");
    }
    
    public void transportarMaterial(){
        System.out.println("Los vehiculos de tipo carga pueden transportar cualquier tipo de material pesado.");
    }
}
