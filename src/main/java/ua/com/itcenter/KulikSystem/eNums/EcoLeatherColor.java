package eNums;

public enum EcoLeatherColor {
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
