package week4.lesson1;

public abstract class AbstractHuman implements Humanable {

	private int haveOrNotGlass;
	private AbstractGlass glass;

	public void takeGlass(AbstractGlass glass) {
		if (this.haveOrNotGlass == 0) {
			this.printAboutMe();
			System.out.println(" 	And I Take " + glass.getNameOfGlass());
			this.haveOrNotGlass = 1;
			this.glass = glass;
		} else if (this.haveOrNotGlass == 1) {
			this.printAboutMe();
			System.out.println( " 	I Have " + glass.getNameOfGlass());
			return;
		}

	}

	public void putGlass() {
		if (this.haveOrNotGlass == 1) {
			this.printAboutMe();
			System.out.println(" 	And I put Doun a Glass" );
			this.haveOrNotGlass = 0;
			this.glass = null;
		} else if (this.haveOrNotGlass == 0) {
			this.printAboutMe();
			System.out.println( "	 I Can not ");
			return;
		}
	}

	public void pourWaterOnTable(AbstractTable table) {
		if(this.haveOrNotGlass == 0){
			System.out.println("I can not puur water on table");
		}
		else if(this.haveOrNotGlass == 1){
			System.out.println("I pour water on table ");
			table.setDry(true);
		}
	}

	public void fillGlass() {

	}

	public int getHaveOrNotGlass() {
		return haveOrNotGlass;
	}

	public void setHaveOrNotGlass(int haveOrNotGlass) {
		this.haveOrNotGlass = haveOrNotGlass;
	}

	public AbstractHuman(int haveOrNotGlass, AbstractGlass glass) {
		super();
		this.haveOrNotGlass = haveOrNotGlass;
		this.glass = glass;
	}

	public AbstractGlass getGlass() {
		return glass;
	}

	public void setGlass(AbstractGlass glass) {
		if(this.getHaveOrNotGlass() == 0){
		this.glass = glass;
		}
		else{
			System.out.println("I have a glass");
		}
	}

}
