package eNums;

public enum LeatherColor {
	Black,
	White,
	Green,
	Beige,
	Red,
	Whiskey,
	Gold;
	
	public String toRusian(LeatherColor d){
		if(d.equals(Black) == true){
			return "������";
		} else {
			return "%";
		}
	}
}
