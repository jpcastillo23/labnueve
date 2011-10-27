/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 8 
Autor: JosePablo Castillo

Descripcion: SimpleSet ejemplo con ArrayList.
*/
import java.util.LinkedList;

class MyBinarySearchTree implements WordSet
{
	private BinarySearchTree base;
	
	public MyBinarySearchTree()
	{
		base = new BinarySearchTree<Word>();
	}
	
	public Word get(Word word)
	{
		return (Word)base.get(word);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}