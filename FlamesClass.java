package flames_circular_linkedList;

import java.util.ArrayList;

public class FlamesClass {

	
	
	
    public static String doTraverse(String myname,String crushname) {
		
		
		ArrayList<Character> mylist = new ArrayList<Character>();
		
		for(char ch : myname.toCharArray() ) {
			mylist.add(ch);
		}
		
        ArrayList<Character> herlist = new ArrayList<Character>();
		
		for(char ch : crushname.toCharArray() ) {
		    herlist.add(ch);
		}
	
		
		for(int i=0;i<mylist.size();i++) {
			
		    if( herlist.contains(mylist.get(i)) ) {
		    	
		    	int a = herlist.indexOf(mylist.get(i));
		    	mylist.remove(i);
		    	herlist.remove(a);
		    	i--;
		    }
		}
		
		
         int count_of_distinct_character = mylist.size()+herlist.size();
		
		//System.out.println(count_of_distinct_character);
		
		ArrayList<Character> arraylist = new ArrayList<Character>();
		
		arraylist.add('F');
		arraylist.add('L');
		arraylist.add('A');
		arraylist.add('M');
		arraylist.add('E');
		arraylist.add('S');
		
		int count = 0;
		for(int i=0;i<arraylist.size();i++) { 
			
		//   System.out.print(arraylist.get(i)+" ");
		   if(arraylist.size()==1) {
			  // System.out.println(arraylist+"* ");
			   break;
		   }
		  count++;
		  if(count == count_of_distinct_character) {
			  
			  
			  //System.out.println(arraylist.remove(i));
			 //System.out.println(arraylist);
			  count = 0;
			  if(i==arraylist.size()-1) {
				  arraylist.remove(i);
				  i=-1;
				//  System.out.println(i);
			  }
			  else {
				  arraylist.remove(i);
				  i--; 
				  //System.out.println(i+".");
			  }
			  continue;
		  }
		  if(i==arraylist.size()-1) {
			  i=-1;
			  continue;
		  }
		
    	}
	    char result = arraylist.get(0);
		if(result=='F') {
			return "Friends";
		}
		else if(result=='L') {
			return "Love";
		}
        else if(result=='A') {
        	return "Affection";
		}
        else if(result=='M') {
        	return "Marriage";
		}
        else if(result=='E') {
        	return "Enemy";
		}
        else if(result=='S') {
        	return "Sister";
		}
		return "Bye!";
		
    }
    
    
}
