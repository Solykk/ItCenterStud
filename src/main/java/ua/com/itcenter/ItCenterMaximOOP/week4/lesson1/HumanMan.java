package week4.lesson1;

public class HumanMan extends AbstractHuman{

	

	public HumanMan(int haveOrNotGlass, AbstractGlass glass) {
		super(haveOrNotGlass, glass);
		
	}

	@Override
	public void printAboutMe() {
		if(this.getHaveOrNotGlass() == 1){
		System.out.println("I Am Man and i have a glass " + this.getGlass().getNameOfGlass());
		
		}
		else if(this.getHaveOrNotGlass() == 0){
			System.out.println("I Am Man i heve not glass ");
		}
	}
	

}
