package hw2;
/*�������� ����� ����� (hw2.Fraction), ����������� ��������� ��������:
- �������� ������ (����� Fraction add(Fraction frac))
- ��������� (����� Fraction sub(Fraction frac))
- ��������� (����� Fraction mul(Fraction frac))
- ������� (����� Fraction div(Fraction frac))
- ���������� � ������(����� String toString())
- ����� (����� void print())*/
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

