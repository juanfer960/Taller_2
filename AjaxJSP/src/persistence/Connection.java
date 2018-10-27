package persistence;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * clase encargada de generar la coneccion a BD
 * @author juanfernandozuluaga
 *
 */
public class Connection 
{
	protected DB db;
	
	/**
	 * El constructor es el encargado de generar la coneccion
	 */
	public Connection()
	{
		try 
		{
			System.out.println("Flujo");
			BasicDBObject documento = new BasicDBObject();
			MongoClient mongoClient = new MongoClient("localhost",27017);
			db = mongoClient.getDB("TestMongo");
		} 
		catch (UnknownHostException e) 
		{		
			e.printStackTrace();	
		}	
	}
}
