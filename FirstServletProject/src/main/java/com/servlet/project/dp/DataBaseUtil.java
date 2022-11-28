package com.servlet.project.dp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.servlet.project.dto.User;
public class DataBaseUtil {
	private static ArrayList<User> userobj=new ArrayList<User>();
	public static void save(User user) {
		userobj.add(user);
	}
	
	public static List<User> getAllUsers(){
		return userobj;
	}
	
	public static User getUser(UUID id) {
		
		User userObj = null;
		
		for (User user : userobj) {
			
			if(user.getId().equals(id)) {
				userObj = user;
				break;
			}
		}
		
		return userObj;
		
	}
}
