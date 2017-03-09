package hw2;
/*Написать класс дробь (hw2.Fraction), выполняющий следующие действия:
- сложение дробей (метод Fraction add(Fraction frac))
- вычитание (метод Fraction sub(Fraction frac))
- умножение (метод Fraction mul(Fraction frac))
- деление (метод Fraction div(Fraction frac))
- приведение к строке(метод String toString())
- вывод (метод void print())*/
public class Fraction {
		public static void main(String[] args) {
			Fraction fr = new Fraction(1.22);
									
		}
		private double frac;
		private int numerator;
		private int denominator;
		
		public Fraction(){
			this.frac = 1.22;
		}
		
		public Fraction(double frac){
			this.numerator = (int)(frac * 10);
			this.denominator = 10;
			if(this.numerator % 2 == 0 && this.denominator % 2 == 0){
				this.numerator = this.numerator/2;
				this.denominator = this.denominator/2;
			}
			System.out.println(this.numerator + "/" + this.denominator);
		}
		
		public double get(){
			return frac;
		}
				
		public Fraction add(Fraction frac){
			return new Fraction (this.frac + frac.get()); 
		}
		
		public Fraction sub(Fraction frac){
			return new Fraction (this.frac - frac.get());
		}
		
		public Fraction mul(Fraction frac){
			return new Fraction (this.frac * frac.get());
		}
		
		public Fraction div(Fraction frac){
			return new Fraction (this.frac / frac.get());
		}
		
		public String toString(){
	        return Double.toString(get());
	    }
		
		public void print(){
			System.out.println();
		}
	 
		    
	}

