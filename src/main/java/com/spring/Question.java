package com.spring;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;  
	private String name;  
	private Map<User,Answer> answers;  
	  
	public Question() {}  
	public Question(int id, String name, Map<User,Answer> answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	  
	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");  
	    Set<Entry<User, Answer>> set=answers.entrySet();  
	    Iterator<Entry<User, Answer>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<User, Answer> entry=itr.next();  
	        Answer ans=entry.getValue();
	        User user=entry.getKey();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	    }  
	}  
	
}
