package Calcul;

public class MainCalc {
	 public static void main(String[] args) {
		  AbstractProcessor processor = new TestProcessor();
		  AbstractProcessor processor1 = new TestProcessor();
		  Calc calc = new Calc(processor);

		  calc.inSymv('1');
		  calc.inSymv('2');
		//  calc.inSymv('+');
		//  calc.inSymv('4');
		//  calc.inSymv('5');
		//  calc.inSymv('=');
		 }
}
