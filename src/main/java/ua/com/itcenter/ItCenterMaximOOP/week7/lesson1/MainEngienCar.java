package week7.lesson1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class MainEngienCar {
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException  {
		ArrayList<Car> cars = new ArrayList<Car>();
		Scanner key = new Scanner(System.in);
		int k = key.nextInt();
		for(int i = 0; i < k; i++){
			int e = (int)(Math.random() * 10000);
			String ee = String.valueOf(e);
			int c = (int)(Math.random() * 100000);
			String cc = String.valueOf(c);
			cars.add(new Car(new Engine(ee), cc));
		}
		
		for(Car ty: cars){
		 
			   FileOutputStream fos = new FileOutputStream("D:\\" + (ty.getNomber() +".out"));
			   ObjectOutputStream oos = new ObjectOutputStream(fos);
			   try {
			    oos.writeObject(ty);
			   } finally {
			    oos.close();
			   }
		 }
		
		ArrayList<Car> cars2 = new ArrayList<Car>();
		
		File f = new File("d://");
		File[] files = f.listFiles();
		
		for(int i = 0; i < files.length; i++){
			
		if(files[i].toString().endsWith(".out")){
			FileInputStream fis = new FileInputStream(files[i]);
			 ObjectInputStream oin = new ObjectInputStream(fis);
				   try {
				    cars2.add((Car) oin.readObject());
				    

				   } finally {
				    oin.close();
				   }
			}
		}
		
		for(Car v: cars2){
			System.out.println(v.toString());
		}
		
		/*Car car1 = new Car(new Engine("123456"), "DR5678KO");
		Car car2 = car1.clone();
		System.out.println(car1 == car2);
		System.out.println(car1.getEngi().getNomber() + "  " +  car2.getEngi().getNomber());
		car1.getEngi().setNomber("908876");
		System.out.println(car1.getEngi() == car2.getEngi());
		System.out.println(car1.getEngi().getNomber() + "  " +  car2.getEngi().getNomber());*/
		
		}
	
	}

