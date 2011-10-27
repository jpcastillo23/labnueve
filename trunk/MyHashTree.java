/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 8 
Autor: JosePablo Castillo

Descripcion: SimpleSet ejemplo con hastree
*/
import java.util.*;

class MyHashTree implements WordSet
{
	private Map<Word, Word> base;
	
	public MyHashTree()
	{
		base = new HashMap<Word, Word>();
	}
	
	public Word get(Word word)
	{
		return base.get(word);
	}
	
	public void add(Word wordObject)
	{
		base.put(wordObject,wordObject);
	}
}