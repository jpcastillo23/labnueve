import java.util.ArrayList;

/**
 * Esta es una clase wrapper que utiliza un BinarySearchTree para almacenar el conjunto de 
 * palabras. Esta implementacion es más rapida, ya que el BinarySearchTree es muy eficiente para
 * las busquedas de elementos. 
 */

/**
 * @author Medrano
 *
 */
public class MySet implements WordSet {

	private BinarySearchTree<Word> searchtree;
	
	
	public MySet(){
		//base = new ArrayList<Word>();
		searchtree = new BinarySearchTree<Word>();
		
	}
	
	/**
	 * Permite anadir un elemento al arbol
	 * @param	wordObject   Elemento que se añade
	 */
	@Override
	public void add(Word wordObject) {
		// TODO Auto-generated method stub
		searchtree.add(wordObject);
	}

	
	/**
	 * Permite anadir obtener un elemento del arbol (si existe)
	 * @param   word	Elemento que se desea obtener (buscar)
	 */
	@Override
	public Word get(Word word) {
		//if(index == -1) return null;
		//return base.get(index);
		return searchtree.get(word);
		
	}

}
