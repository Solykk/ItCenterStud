package startProgram;

import chairs.Diamond;
import eNums.Color;
import eNums.LeatherColor;
import eNums.Material;

public class MainKulikSystem {
	
	
	
	

	public static void main(String[] args) {
		Diamond d = new Diamond(Material.Leather,Color.Gold);
		Diamond b = new Diamond(Material.Leather,Color.Gold);
		Diamond c = new Diamond(Material.Leather,Color.Brown);
		System.out.println(d.toString() + "\n" + "\n" + c.toString() + "\n" + "\n" + b.toString());
		System.out.println(d.toString().equals(b.toString()));
		Diamond v = new Diamond(Material.Leather,LeatherColor.Black);
		System.out.println(v.getLeatherColor().toRusian(LeatherColor.Black));
		
		String hj = "123";
		System.out.println();
		Integer p = Integer.valueOf(hj);
		System.out.println(p + 3);
		
		int ui = 15;
		String tt = String.valueOf(ui);
		System.out.println(tt);
		System.out.println(tt.length());
		
	}
}
