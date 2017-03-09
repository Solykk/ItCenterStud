import java.util.ArrayList;

public class Proba {
	public static void main(String[] args) {
		ArrayList<Integer> p = new ArrayList<Integer>();
		p.add(7);
		p.add(90);
		p.add(89);
		for(Integer r: p){
			System.out.print("<" + r + ">");
			
		}
		System.out.println();
		System.out.println(p.size());
		System.out.println(p.remove(0));
		for(Integer r: p){
			System.out.print("<" + r + ">");
			
		}
		System.out.println();
		System.out.println(p.size());
	
	}
}
