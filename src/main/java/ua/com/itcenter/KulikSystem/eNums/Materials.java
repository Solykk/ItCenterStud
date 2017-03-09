package eNums;

public class Materials {
	
	private LeatherColor leatherColor;
	private EcoLeatherColor ecoLeatherColor;
	
		
	public LeatherColor getLeatherColor() {
		return leatherColor;
	}
	public void setLeatherColor(LeatherColor leatherColor) {
		this.leatherColor = leatherColor;
	}
	public EcoLeatherColor getEcoLeatherColor() {
		return ecoLeatherColor;
	}
	public void setEcoLeatherColor(EcoLeatherColor ecoLeatherColor) {
		this.ecoLeatherColor = ecoLeatherColor;
	}
	
	
	public static enum LeatherColor{
		Black,
		White,
		Green,
		Beige,
		Red,
		Whiskey,
		Gold;
		
		public String toRusian(LeatherColor d){
			if(d.equals(Black) == true){
				return "Черный";
			} else {
				return "%";
			}
		}
	}
	public static enum EcoLeatherColor{
		Black,
		White,
		Green,
		Blue,
		LightBlue,
		LightGray,
		Brown,
		Claret,
		Orange,
		Yellow,
		Sand,
		Beige,
		Gold,
		Silver;

		public String toRusian(EcoLeatherColor d){
			if(d.equals(Black) == true){
				return "Черный";
			} else {
				return "%";
			}
		}
	}
	public static enum AntaraColor{
		
	}
}
