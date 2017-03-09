package homeWorkLevel2;
import java.util.Scanner;
public class WektorPerevorot {
	public static void main  (String[] args){
		
		
		
		
        Scanner key = new Scanner(System.in);
        int vector = key.nextInt();
        int [] array  = new int [vector];
        for( int i = 0; i < array.length; i++){
        array[i] = i + 1;
         if (i == 0){
           System.out.print("[" + array[i] + ",") ;
       } else if (i == (array.length - 1)){ 
           System.out.print(" " + array[i] + "]");
       } else {
           System.out.print( " " + array[i] + ",");
       } 
     }

} 
	
public static void revertVector( int vector){
	Scanner key = new Scanner(System.in);
    vector = key.nextInt();
    int [] vectorr = new int [vector];
	for(int i = 0;  i  < vectorr.length; i++){
       vectorr [i] = vectorr.length - i;
    if( i == (vectorr.length - 1)){
          System.out.print("[" + vectorr[i] + ","); 
       }else if ( i == 0){
          System.out.print(" " + vectorr[i] + "]");
       }else {
           System.out.print( " " + vectorr[i] + ","); 
         }
       }     revertVector(vector);               
    }
}