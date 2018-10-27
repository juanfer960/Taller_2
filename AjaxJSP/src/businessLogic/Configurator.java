package businessLogic;

import net.sf.json.JSONArray;
import persistence.Queries;

/**
 * Clase encargada de manejar acceso a capa de persistencia
 * @author juanfernandozuluaga
 *
 */
public class Configurator 
{
	private static Configurator configurator;
	private static Queries queries;
	
	/**
	 * Metod encargado de generar la instancia 
	 * @return instancia Configurator
	 */
	public static Configurator getConfigurator() 
	{
		if(configurator == null) 
		{
			configurator = new Configurator();
			queries = new Queries();
		}
		
		return configurator;
	}
	
	/**
	 * Retorna lista de comunidades
	 * @return JSONArray con la lista total de comunidades
	 * @throws Exception
	 */
	public JSONArray getAllCommunities() throws Exception
	{
		return queries.getAllCommunities();
	}
}
