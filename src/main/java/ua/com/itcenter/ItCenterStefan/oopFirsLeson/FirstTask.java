package oopFirsLeson;
import java.util.Scanner;
public class FirstTask {
	
	
	public static void main(String[] args){

	Scanner key = new Scanner(System.in);
	System.out.println("Vvedi razmer massiva");
	int hige = key.nextInt();

	if(hige <= 0){
	System.out.println("Неверный размер вектора");
	return;
	}
	int [] vector = new int[hige];
	System.out.println("Otlichno, Vvedi elementi massiva");
	for(int i = 0; i < vector.length; i++){
	vector[i] = key.nextInt();
	if(vector[i] < 0){
	System.out.println("Неверный размер вектора");
	return;
	}
	} 

	calcVectorAvg(vector);
	}
	public static int calcVectorAvg(int[] vector){

	int rezult = vector[0];
	for(int i = 0; i < vector.length; i++){
	if(i == 0){
	System.out.print("[" + vector[i]);
	} else if(i == (vector.length - 1)){
	System.out.print(vector[i] + "]");
	} else {
	System.out.print(vector[i]);
	}

	}
	System.out.println();
	int k = vector[0];
	for(int i = 1; i < vector.length; i++){
	k = k + vector[i];
	}
	rezult = k / vector.length;
	System.out.println(rezult); 
	System.out.println();
	return rezult; 


	}
	}

	 

