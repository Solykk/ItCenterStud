package lesson3;



public class Tasc12 {
public static int summa(int a, int b){
		int summa = a + b;
		return summa;// не имеет значения, где распологается метод(созданый)
	}
	
	
	public static void main(String[] args){
		int rez = summa(2, 3);
		System.out.print(rez);
		hello("Petia");
		hello("Vasiya");
					      
					}
	public static void hello(String str){
		System.out.println("Hello " + str);
	}
			}


