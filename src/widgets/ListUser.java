import javax.swing.*;
package chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Logger;

import logger.LoggerFactory;
import chat.Failure;
import chat.Vocabulary;

public class ListUser extends AbstractListModel<String> {
    private SortedSet<String> nameSet;

	/**
	 * Constructeur
	 */
	public NameSetListModel()
	{
		// Done nameSet = ...
		nameSet = new TreeSet();
	}

	/**
	 * Ajout d'un élément
	 * @param value la valeur à ajouter
	 * @return true si l'élément à ajouter est non null et qu'il n'était pas
	 * déjà présent dans l'ensemble et false sinon.
	 * @warning Ne pas oublier de faire un
	 * {@link #fireContentsChanged(Object, int, int)} lorsqu'un nom est
	 * effectivement ajouté à l'ensemble des noms
	 */
	public boolean add(String value)
	{
		// TODO Replace with implementation ...
		String origine= nameSet.iterator();
		if(value!=null )
		{
			for(origine; origine.hasNext();)
			{
				if(origine.next() == value) 
			   	return false;
			}
			nameSet.add(value);
		}
		
	}

	/**
	 * Teste si l'ensemble de noms contient le nom passé en argument
	 * @param value le nom à rechercher
	 * @return true si l'ensemble de noms contient "value", false sinon.
	 */
	public boolean contains(String value)
	{
		// TODO Replace with implementation ...
		nameSet.contains(value);
		return false;
	}

	/**
	 * Retrait de l'élément situé à l'index index
	 * @param index l'index de l'élément à supprimer
	 * @return true si l'élément a été supprimé, false sinon
	 * @warning Ne pas oublier de faire un
	 * {@link #fireContentsChanged(Object, int, int)} lorsqu'un nom est
	 * effectivement supprimé de l'ensemble des noms
	 */
	public boolean remove(int index)
	{
		// TODO Replace with implementation ...
		String value = nameSet.iterator();
		int count = 0;
		for(value; value.hasNext();)
		{
			if(count == index) break;
			else
				count++;
			value.next();
		}
		nameSet.remove(value);

		return false;
	}

	/**
	 * Efface l'ensemble du contenu de la liste
	 * @warning ne pas oublier de faire un
	 * {@link #fireContentsChanged(Object, int, int)} lorsque le contenu est
	 * effectivement effacé (si non vide)
	 */
	public void clear()
	{
		// TODO Complete ...
		nameSet.clear();
		fireContentsChanged(this, 0, this.getSize());
	}

	/**
	 * Nombre d'éléments dans le ListModel
	 * @return le nombre d'éléments dans le modèle de la liste
	 * @see javax.swing.ListModel#getSize()
	 */
	@Override
	public int getSize()
	{
		// TODO Replace with implementation ...
		return nameSet.size();
	}

	/**
	 * Accesseur à l'élément indexé
	 * @param l'index de l'élément recherché
	 * @return la chaine de caractère correponsdant à l'élément recherché ou
	 * bien null si celui ci n'existe pas
	 * @see javax.swing.ListModel#getElementAt(int)
	 */
	@Override
	public String getElementAt(int index)
	{
		// TODO Replace with implementation ...
		String value = nameSet.iterator();
		int count = 0;
		for(value; value.hasNext();)
		{
			if(count == index) 
			   return value;
			else
				count++;
			value.next();
		}
		
		return null;
	}

	/**
	 * Représentation sous forme de chaine de caractères de la liste de
	 * noms unique et triés.
	 * @return une chaine de caractères représetant la liste des noms uniques
	 * et triés
	 */
	

}