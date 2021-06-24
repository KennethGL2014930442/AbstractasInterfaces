package com.cunoc.vehiculos;

import com.cunoc.interfaces.*;

public abstract class Vehiculos {
    
    protected String combustible;
    protected int galonesmax;
    protected int pasajeros;
    protected int velocidad;
    protected int aceleracion;
    
    public abstract void atributosVehiculo(String combustible, int galonesmax, int pasajeros, int velocidad, int aceleracion);
}