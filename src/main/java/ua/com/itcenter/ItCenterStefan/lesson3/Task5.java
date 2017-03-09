package lesson3;

public class Task5 {
	public static void main(String[] args) {
		
		int [] array = new int [10];
		int idx = 0;
		while (idx < 10){
		array [idx] = (int)(Math.random() * 10);// array [idx] = 9 * idx;;
		idx++;
}
		
		idx = 0;
		while (idx < 10){
		System.out.print(array[idx] + " ");
		idx++;
}
		idx = 0;
		while (idx < 10){
			if (array[idx] % 2 != 0){
		array[idx] = 0;
			}
			idx++;
		System.out.print(array[idx] + " ");
				}
}
}