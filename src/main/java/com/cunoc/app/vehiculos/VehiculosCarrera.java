package com.cunoc.vehiculos;

import com.cunoc.interfaces.*;

public class VehiculosCarrera extends Vehiculos implements Giro, ComportamientoCarrera{
    
    @Override
    public void atributosVehiculo(String combustible, int galonesmax, int pasajeros, int velocidad, int aceleracion){
        System.out.println("\nLos vehiculos de carrera se llenan de: "+combustible+" y su capacidad maxima de combustible es de: "+galonesmax+" galones.");
        System.out.println("Los vehiculos de carrera tienen capacidad para: "+pasajeros+" pasajeros, y su velocidad maxima es de: "+velocidad+" km/h, mientras que su aceleracion base es de: "+aceleracion+" km/h.");
    }

    @Override
    public void giroIzquierda(){
        System.out.println("El vehiculo de carrera gira a la izquierda.");
    }
    
    @Override
    public void giroDerecha(){
        System.out.println("El vehiculo de carrera gira a la derecha.");
    }
    
    @Override
    public void turbo(){
        System.out.println("Los vehiculos de carrera necesitan turbo para competir en sus carreras.");
    }
    
    @Override
    public void triplicarAceleracion(){
        System.out.println("El vehiculo de carreras al utilizar el turbo puede triplicar su aceleracion base.");        
        System.out.println("Su aceleracion triplicada es de: 300");
    }
}
