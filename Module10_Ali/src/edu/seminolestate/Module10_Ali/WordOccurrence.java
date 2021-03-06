package edu.seminolestate.Module10_Ali;


	//Glen Ali
	//Date:3/21/2021
	//Ali_Module10
	//Add JavaDoc


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.LinkedHashMap;
	   /**
	    * Prints the top 20 words in the play Macbeth, sorted by the most frequently used word.
	    * @author Betancourt
	    *
	    */ 
	public class WordOccurrence {
		   
		/**
		 * 
		 * @param args holds the command line arguments
		 */
	    public static void main(String[] args) {
			
		
	    
	    /**
	     * Prints the top 20 reoccurring words in the play Macbeth and how many times they are used.
	     */
	   public void countNumberOfWord() {
			LinkedHashMap<String, Integer> wordcount =  new LinkedHashMap<String, Integer>();
		    try { 
		    	//reading through and figuring out the number of each word
		        BufferedReader in = new BufferedReader(
		        new FileReader("http://shakespeare.mit.edu/macbeth/full.html"));
		        String str;

		        while ((str = in.readLine()) != null) { 
		            str = str.toLowerCase(); //convert to lower case 
		            String[] words = str.split("\\s+"); //split the line on whitespace, would return an array of words

		            for(String word : words ) {
		              if(word.length() == 0 ) {
		                continue; 
		              }

		              Integer occurences = wordcount.get(word);

		              if(occurences == null) {
		                occurences = 1;
		              } else {
		                occurences++;
		              }

		              wordcount.put(word, occurences);
		            }

		                } 

		        } 
		    catch(Exception e){
		        System.out.println(e);
		    }


	        ArrayList<Integer> values = new ArrayList<Integer>();
		    values.addAll(wordcount.values());

		    Collections.sort(values, Collections.reverseOrder());

		    int last_i = -1;

	         for (Integer i : values.subList(0, 20)) { 
		        if (last_i == i) //without duplicates
		            continue;
		        last_i = i;

	            for (String s : wordcount.keySet()) { 

		            if (wordcount.get(s) == i) //which have this value  
		               System.out.println(s+ ": " + i);

			   
			   
			   
		}

	}
		}

		}
