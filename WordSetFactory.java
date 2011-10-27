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
		    	return new SimpleSet();
			case 2:
				return new MyListTree(); //mi primera implemetacion JCF
			case 3:
				return new ();
			default:
				return null;
		}
	}
	
	
}