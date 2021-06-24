package com.cunoc.principal;

import java.util.*;
import com.cunoc.vehiculos.*;
import com.cunoc.interfaces.*;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
          
        VehiculosCarga deCarga = new VehiculosCarga();
        VehiculosCarrera deCarrera = new VehiculosCarrera();
        Camionetas camioneta = new Camionetas();
        
        Vehiculos[] vehiculo = {deCarga, deCarrera, camioneta};
				
		for(int i =0; i<6;i++){
			System.out.println("\nAl azar: "+(i+1));
			for(Vehiculos vehi: vehiculo){
				if(vehi instanceof VehiculosCarga){
					System.out.println("\nEl objeto es de la clase vehiculo de carga");
					deCarga.atributosVehiculo("diesel", 50, 2, 95, 50);
					deCarga.giroIzquierda();
					deCarga.giroDerecha();
					deCarga.transportarMaterial();
					
				}
				if(vehi instanceof VehiculosCarrera){
					System.out.println("\nEl objeto es de la clase vehiculo de carrera");
					deCarrera.atributosVehiculo("gasolina", 100, 1, 200, 100);
					deCarrera.giroIzquierda();
					deCarrera.giroDerecha();
					deCarrera.turbo();
					deCarrera.triplicarAceleracion();
					
				}
				if(vehi instanceof Camionetas){		
					System.out.println("\nEl objeto es de la clase vehiculo de tipo camioneta");
					camioneta.atributosVehiculo("diesel y gasolina", 25, 8, 120, 75);
					camioneta.giroIzquierda();
					camioneta.giroDerecha();
					camioneta.transportarPersonas();
				}	
			}		
		}	
    }
   
}