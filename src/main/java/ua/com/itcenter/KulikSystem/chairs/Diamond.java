package chairs;

import eNums.Base;
import eNums.Color;
import eNums.LeatherColor;
import eNums.Material;
import eNums.Mechanism;
import eNums.Model;
import eNums.ModelLine;

public class Diamond extends Chair{
	
	

	@Override
	public String toString() {
		
		return  getLine() + "," + "\n" + "\t" + getModel() + "," + "\n" + "\t"+ getMaterial()
				+ "," + "\n"+ "\t"+ getColor() + "," + "\n"+ "\t" + getMechanism() +"\n" + "\t" + getBase()   
				 + "." 
				;
	}

	public Diamond(Material material, Color color) {
		
		super(null, null, material, color, null, null, null);
		this.setLine(ModelLine.LuxoryLine);
		this.setModel(Model.Diamond);
		this.setBase(Base.Wooden);
		this.setMechanism(Mechanism.MultiSynchro);
		this.setHeadrest(new HeadRest(this.getLine(), this.getModel(), this.getMaterial(), this.getColor()));
	}

	public Diamond(Material material, LeatherColor color) {
		
		super(null, null, material, color, null, null, null);
		this.setLine(ModelLine.LuxoryLine);
		this.setModel(Model.Diamond);
		this.setBase(Base.Wooden);
		this.setMechanism(Mechanism.MultiSynchro);
		this.setHeadrest(new HeadRest(this.getLine(), this.getModel(), this.getMaterial(), this.getColor()));
	}
	
}
