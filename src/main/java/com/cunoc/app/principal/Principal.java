package com.cunoc.principal;

import java.util.*;
import com.cunoc.vehiculos.*;
import com.cunoc.interfaces.*;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculos[] tipoVehiculo = new Vehiculos[20];       
          
        VehiculosCarga deCarga = new VehiculosCarga();
        VehiculosCarrera deCarrera = new VehiculosCarrera();
        Camionetas camioneta = new Camionetas();
        
            deCarga.atributosVehiculo("diesel", 50, 2, 95, 50);
            deCarga.giroIzquierda();
            deCarga.giroDerecha();
            deCarga.transportarMaterial();

            deCarrera.atributosVehiculo("gasolina", 100, 1, 200, 100);
            deCarrera.giroIzquierda();
            deCarrera.giroDerecha();
            deCarrera.turbo();
            deCarrera.triplicarAceleracion();

            camioneta.atributosVehiculo("diesel y gasolina", 25, 8, 120, 75);
            camioneta.giroIzquierda();
            camioneta.giroDerecha();
            camioneta.transportarPersonas();        
    }
   
}