package persistence;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import net.sf.json.JSONObject;
import net.sf.json.JSONArray;


/**
 * Clase encargada de generar las consultas a BD
 * @author juanfernandozuluaga
 *
 */
public class Queries extends Connection
{
	/**
	 * retorna la lista de comunidades
	 * @throws Exception 
	 */
	
	public JSONArray getAllCommunities() throws Exception
	{
		JSONArray communities = new JSONArray();
		
		try
		{
			DBCollection collection = db.getCollection("comunidades");
			DBCursor cursor = collection.find();
			
			while(cursor.hasNext()) 
			{
				JSONObject community = new JSONObject();
				DBObject object = cursor.next();
				community.put("community", object.get("comunidad"));
				communities.add(community);
			}
		}
		catch(Exception e)
		{	
			throw new Exception("Se presento un problema intentando realizar la consulta getAllCommunities");
		}
		
		return communities;
	}
}
