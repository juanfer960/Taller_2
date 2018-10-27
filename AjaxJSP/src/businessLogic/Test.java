package businessLogic;

import net.sf.json.JSONArray;

/**
 * Test MongoDB
 * @author juanfernandozuluaga
 *
 */
public class Test 
{
	public JSONArray loadData() throws Exception 
	{
		Configurator configuratorn = Configurator.getConfigurator();
		System.out.println(configuratorn.getAllCommunities());
		return configuratorn.getAllCommunities();
	}
	
}
