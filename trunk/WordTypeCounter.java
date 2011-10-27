/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 8 
Autor: Eduardo Castellanos

Descripcion: Programa principal. 
*/
import java.io.*;

class WordTypeCounter {
	public static void main(String[] args) throws Exception
	{
		if(args.length > 1)
		{
			// Declaración e inicialización de variables.
			File wordFile = new File(args[0]);
			File textFile = new File(args[1]);
			BufferedReader wordreader;
			BufferedReader textreader;
			
			int verbs=0;
			int nouns=0;
			int adjectives=0;
			int adverbs=0;
			int gerunds=0;
			
			long starttime;
			long endtime;
			
			// Verificar que los dos parámetros que se pasaron sean archivos que existen
			if(wordFile.isFile() && textFile.isFile()) {
				// Leer archivos
				try
				{
					wordreader = new BufferedReader(new FileReader(wordFile));
					textreader = new BufferedReader(new FileReader(textFile));
				}
				catch (Exception ex)
				{
					System.out.println("Error al leer!");
					return;
				}

				// Crear un WordSet para almacenar la lista de palabras
				// Se emplea WordSetFactory.generateSet (1) para que se genere un
				//      objeto de la clase SimpleSet 
				// Luego de que usted modifique la clase WordSetFactory, deberá
				//      emplear generateSet(2) para utilizar la clase que usted
				//      propone como una mejor alternativa
				// =====================================================
				WordSet words =  WordSetFactory.generateSet(1);//;1,2,3,4
				// =====================================================
				
				String line = null;
				String[] wordParts;
				
				// leer el archivo que contiene las palabras y cargarlo al WordSet.
				starttime = System.currentTimeMillis();
				line = wordreader.readLine();
				while(line!=null)
				{
					wordParts = line.split("\\.");  // lo que esta entre comillas es una expresión regular.
					if(wordParts.length == 2)
					{
						words.add(new Word(wordParts[0].trim(),wordParts[1].trim()));
					}
					line = wordreader.readLine();
				}
				wordreader.close();
				endtime = System.currentTimeMillis();
				
				System.out.println("Palabras cargadas en " + (endtime-starttime) + " ms.");
				
				// Procesar archivo de texto
				starttime = System.currentTimeMillis();
				line = textreader.readLine();
				String[] textParts;
				Word currentword;
				Word lookupword = new Word();
				
				while(line!=null)
				{
					// Separar todas las palabras en la línea.
					textParts = line.split("[^\\w-]+"); // utilizar de separador cualquier caracter que no sea una letra, número o guión.
					
					// Revisar cada palabra y verificar de que tipo es. 
					for(int i=0;i<textParts.length;i++)
					{
						lookupword.setWord(textParts[i].trim().toLowerCase());
						currentword = words.get(lookupword);
						if(currentword != null)
						{
							if(currentword.getType().equals("v-d") || currentword.getType().equals("v") || currentword.getType().equals("q"))
								verbs++;
							else if(currentword.getType().equals("g") )
								gerunds++;
							else if(currentword.getType().equals("a-s") || currentword.getType().equals("a-c") || currentword.getType().equals("a"))
								adjectives++;
							else if(currentword.getType().equals("e"))
								adverbs++;
							else 
								nouns++;
						}
					}
					
					line = textreader.readLine();
				}
				textreader.close();
				endtime = System.currentTimeMillis();
				System.out.println("Texto analizado en " + (endtime-starttime) + " ms.");
				
				// Presentar estadísticas
				System.out.println("El texto tiene:");
				System.out.println(verbs + " verbos");
				System.out.println(nouns + " sustantivos");
				System.out.println(adjectives + " adjetivos");
				System.out.println(adverbs + " adverbios");
				System.out.println(gerunds + " gerundios");
				
			}
			else
			{
				System.out.println("No encuentro los archivos :'( ");
			}
		}
		else
		{
			System.out.println("Faltan Parametros.");
		}
	}
}