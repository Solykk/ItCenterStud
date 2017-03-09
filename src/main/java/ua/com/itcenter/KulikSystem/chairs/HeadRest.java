package chairs;

import eNums.Color;
import eNums.Material;
import eNums.Model;
import eNums.ModelLine;

public class HeadRest {
	
	private ModelLine line;
	private Model model;
	private Material material;
	private Color color;
	
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

	public HeadRest(ModelLine line, Model model, Material material, Color color) {
		super();
		this.line = line;
		this.model = model;
		this.material = material;
		this.color = color;
	}
	
	
	
}
