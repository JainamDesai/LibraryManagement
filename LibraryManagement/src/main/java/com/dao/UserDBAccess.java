package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.*;
import com.model.UserLibrary;
import com.service.UserService;

public class UserDBAccess {
	
	Session s = UserService.getSessionFactory().openSession();
	Transaction tc = s.beginTransaction();
             public void createBook(UserLibrary lib){
            	 try{
            	 s.saveOrUpdate(lib);
            	 tc.commit();
            	
            	 }
            	 catch(Exception e){
            		 e.printStackTrace();
            	 }
            	 finally{
            		 s.close();
            	 }
             }
             public void deleteBook(int id){
            	 try{
            	 UserLibrary lib = s.get(UserLibrary.class, id);
            	 s.delete(lib);
            	 tc.commit();
            	 }
            	 catch(Exception e){
            		 e.printStackTrace();
            	 }
            	 finally
            	 {
            		 s.close();
            		 
            	 }
             }
             public List<UserLibrary> getAllBooks(){
            	 List<UserLibrary> list = new ArrayList();
            	  try{ 
            	 Query q = s.createQuery("from UserLibrary");
            	 
            	 list = q.list();
            	  System.out.println(list.size());
            	 }
            	  catch(Exception e){
            		  e.printStackTrace();
            	  }
            	  finally{
            		  s.close();
            	  }
            	  return list;
            	 
             }
             public UserLibrary getBook(int id){
            	 UserLibrary lib = null;
            	 try{
            		lib = s.get(UserLibrary.class, id);
            		
            	 }
            	 catch(Exception e){
            		 e.printStackTrace();
            	 }
            	 return lib;
             }
             public void updateUser(UserLibrary lib){
            	 s.update(lib);
            	 tc.commit();
             }

}
