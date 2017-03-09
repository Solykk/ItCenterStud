package homeWorkLevel2;
import java.util.Scanner;
public class Tyr {
	public static void main  (String[] args){
		System.out.println("Enter Your Nomber");
		Scanner key = new Scanner(System.in);
	    int size = key.nextInt();
	     if(size == 0 || size < 0 || size > Integer.MAX_VALUE) {
	    	System.out.println("Error. Enter Correct ");
	     return; }
	    int [] veo = new int [size];
	    for( int i = 0; i < veo.length; i++){
	        veo[i] = i + 1;
	         if (i == 0){
	           System.out.print("revertVector(int[] vector); // [" + veo[i] + ",") ;
	       } else if (i == (veo.length - 1)){ 
	           System.out.print(" " + veo[i] + "]");
	       } else {
	           System.out.print( " " + veo[i] + ",");
	       } 
	         
	    }	System.out.println();
	    revertVector(veo);
	    
	 	}
	public static void revertVector( int [] vector){
			for(int i = 0;  i  < vector.length; i++){
	       vector [i] = vector.length - i;
	    if( i == (vector.length - 1)){
	    	 System.out.print(" " + vector[i] + "]");
	           
	       }else if ( i == 0){
	    	   System.out.print("[" + vector[i] + ","); 
	          
	       }else {
	           System.out.print( " " + vector[i] + ","); 
	         }
	       }                 
	}
}
	

