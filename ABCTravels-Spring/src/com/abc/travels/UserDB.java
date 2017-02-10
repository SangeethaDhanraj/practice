package com.abc.travels;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class UserDB {
	
	public String verifyUser(String loginId, String password){
		String value=null;
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Query q = new Query("ABCUser");
		PreparedQuery preparedquery = datastore.prepare(q);
		
		for (Entity user : preparedquery.asIterable()) {
			if (((user.getProperty("LoginId")).equals(loginId)) && ((user.getProperty("Password")).equals(password))) {
				value= "success";
				break;
			} else {
				value= "Error";
			}
		}
		return value;
	}
	
	public String addUser(String name, String address, String contactno, String loginid, String password){
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

		Entity entity = new Entity("ABCUser", loginid);
		entity.setProperty("UserName", name);
		entity.setProperty("Address", address);
		entity.setProperty("ContactNo", contactno);
		entity.setProperty("LoginId", loginid);
		entity.setProperty("Password", password);

		datastore.put(entity);

		return "success";

	}

}
