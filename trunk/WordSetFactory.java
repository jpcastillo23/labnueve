/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 8 
Autor: Eduardo Castellanos

Descripcion: WordSetFactory. Clase  utilizada para instanciar los diferentes tipos de sets. 
*/
class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = myBetterSet  <---- el que yo investigue
	
	public static WordSet generateSet(int tipo)
	{
	    switch(tipo){
			case 1:
		    	return new SimpleSet(); //clase default del programa
			case 2:
				return new MyListTree(); //mi primera implemetacion JCF
			case 3:
				return new MyBinarySearchTree(); //mi segunda implementacion
				//Codigo De: (c) 1998, 2001 duane a. bailey
				//Proporcionado en Clase; siempre haciendo referencia que
				//el Codigo no Ha sido Creado Por Mi Persona.
			default:
				return null;
		}
	}
	
	
}