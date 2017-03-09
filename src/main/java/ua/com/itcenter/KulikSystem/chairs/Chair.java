package chairs;

import eNums.Base;
import eNums.Color;
import eNums.LeatherColor;
import eNums.Material;
import eNums.Mechanism;
import eNums.Model;
import eNums.ModelLine;

public class Chair {
	
	private ModelLine line;
	private Model model;
	private Material material;
	private Color color;
	private Base base;
	private Mechanism mechanism;
	private LeatherColor leatherColor;
	
	private HeadRest headrest;
	
	
	public ModelLine getLine() {
		return line;
	}
	
	public void setLine(ModelLine line) {
		this.line = line;
	}
	
	
	public Model getModel() {
		return model;
	}
	
	public void setModel(Model model) {
		this.model = model;
	}
	
	public Material getMaterial() {
		return material;
	}
	
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Base getBase() {
		return base;
	}
	
	public void setBase(Base base) {
		this.base = base;
	}
	
	public HeadRest getHeadrest() {
		return headrest;
	}
	
	public void setHeadrest(HeadRest headrest) {
		this.headrest = headrest;
	}
	
	public void setMechanism(Mechanism mechanism){
		this.mechanism = mechanism;
	}
	
	public Mechanism getMechanism(){
		return mechanism;
	}

	public Chair(ModelLine line, Model model, Material material, Color color, Base base, Mechanism mechanism,
			HeadRest headrest) {
		super();
		this.line = line;
		this.model = model;
		this.material = material;
		this.color = color;
		this.base = base;
		this.mechanism = mechanism;
		this.headrest = headrest;
	}
	
	public Chair(ModelLine line, Model model, Material material, LeatherColor leatherColor, Base base, Mechanism mechanism,
			HeadRest headrest) {
		super();
		this.line = line;
		this.model = model;
		this.material = material;
		this.leatherColor = leatherColor;
		this.base = base;
		this.mechanism = mechanism;
		this.headrest = headrest;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((headrest == null) ? 0 : headrest.hashCode());
		result = prime * result + ((line == null) ? 0 : line.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((mechanism == null) ? 0 : mechanism.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chair other = (Chair) obj;
		if (base != other.base)
			return false;
		if (color != other.color)
			return false;
		if (headrest == null) {
			if (other.headrest != null)
				return false;
		} else if (!headrest.equals(other.headrest))
			return false;
		if (line != other.line)
			return false;
		if (material != other.material)
			return false;
		if (mechanism != other.mechanism)
			return false;
		if (model != other.model)
			return false;
		return true;
	}

	public LeatherColor getLeatherColor() {
		return leatherColor;
	}

	public void setLeatherColor(LeatherColor leatherColor) {
		this.leatherColor = leatherColor;
	}
	
	
	
	
	
}
