package Calcul;

public class TestProcessor extends AbstractProcessor {
	 @Override
	 public void inputChar(char c) {
	  System.out.println("������� "+c);
	  setResult(10*getResult()+(c-'0'));
	 }
}
