package immutable;

import java.util.*;
import java.text.SimpleDateFormat;  

public class EMailArchive {
	
	 static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	 static Date date = new Date(); 
	 
	 	private static String name;
	    private static ArrayList <EMail> data = new ArrayList <EMail>();
	    


	    EMailArchive(String name, ArrayList <EMail> data) {
	    	
	    	date = new Date();
	        EMailArchive.name = name;
	        EMailArchive.data = data;
	        
	    }

	    public String getName() {
	        return name;
	    }

	    public Date getDate( ) {
	        return date;
	    }

	    public List <EMail> getEMailData() {
	        return data;
	    }

	    public void addEMailToArchive(final EMail mail) {
	        data.add(mail);
	        // the mail added to the list shall not be removed, but how do i do that
	    }
	
	 public static void main(String[] args){
		
		 EMailArchive a = new EMailArchive("name", data);
		 
		 
	 }
	
	
	 
}



