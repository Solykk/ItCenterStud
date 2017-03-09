package week4.lesson1;

public class HumanWoman extends AbstractHuman{
	
	

	public HumanWoman(int haveOrNotGlass, AbstractGlass glass) {
		super(haveOrNotGlass, glass);
		
	}

	@Override
	public void printAboutMe() {
		if(this.getHaveOrNotGlass() == 1){
			System.out.println("I Am Woman and i have a glass " + this.getGlass().getNameOfGlass());
			
			}
			else if(this.getHaveOrNotGlass() == 0){
				System.out.println("I Am Woman i heve not glass " );
			}
	}
	
}
