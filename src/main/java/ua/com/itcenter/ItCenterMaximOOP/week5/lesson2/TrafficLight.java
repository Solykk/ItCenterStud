package week5.lesson2;

public class TrafficLight {
	EnumTrafColor tmp = null;
	private EnumTrafColor now;
	
	private EnumTrafColor red = EnumTrafColor.Red;
	private EnumTrafColor yel = EnumTrafColor.Yelow;
	private EnumTrafColor gre = EnumTrafColor.Green;
	
	public EnumTrafColor getRed() {
		return red;
	}
	
	public EnumTrafColor getYel() {
		return yel;
	}
	
	public EnumTrafColor getGre() {
		return gre;
	}
	
	public void getNextColor(){
		
		
		if(now == null){
			now = getRed();
			tmp = null;
		} else if(now == getRed()){
			now = getYel();
			tmp = getRed();
			
		} else if(now == getYel() && tmp == getRed()){
			now = getGre();
			tmp = null;
		} else if(now == getGre()){
			now = getYel();
			tmp = getGre();
		} else if(now == getYel() && tmp == getGre()){
			now = getRed();
			tmp = null;
		}
			
		
	}

	public EnumTrafColor getNow() {
		return now;
	}

	

	public TrafficLight(EnumTrafColor now) {
		
		this.now = now;
	}
	
	
	
}
