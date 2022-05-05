package com.nttdataLogback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author David Navarro Fajardo
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Llamada a la clase Logger
    	Logger logger = LoggerFactory.getLogger(App.class);
    	
    	//Se realiza un bucle para generar las líneas que rellenarán los ficheros.
    	for (int i=0; i<3000;i++) {
    		logger.info("Iteración  {}",i, App.class.getSimpleName());
    	}
    	//Mensaje de fin del proceso.
    	logger.warn("El proceso ha terminado");
    }
}
