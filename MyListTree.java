/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 8 
Autor: JosePablo Castillo

Descripcion: SimpleSet ejemplo con ArrayList.
*/
import java.util.LinkedList;

class MyListTree implements WordSet
{
	private LinkedList<Word> base;
	
	public MyListTree()
	{
		base = new LinkedList<Word>();
	}
	
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}