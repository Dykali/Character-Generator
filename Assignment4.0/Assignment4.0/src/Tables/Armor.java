package Tables;

//defines a piece of armor with a field for all items in the core rulebook tables
public class Armor {
	private String name;
	private int cost;
	private int armorBonus;
	private int maxDexBonus;
	private int armorCheckPenalty;
	private double arcaneSpellFailure;
	private int speed30;
	private int speed20;
	private int weight;
	
	public Armor(String name, int cost, int armorBonus, int maxDexBonus, int armorCheckPenalty, 
			double arcaneSpellFailure, int speed30, int speed20, int weight) {
		this.name = name;
		this.cost = cost;
		this.armorBonus = armorBonus;
		this.maxDexBonus = maxDexBonus;
		this.armorCheckPenalty = armorCheckPenalty;
		this.arcaneSpellFailure = arcaneSpellFailure;
		this.speed30 = speed30;
		this.speed20 = speed20;
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	public int getArmorBonus() {
		return this.armorBonus;
	}
	
	public int getMaxDexBonus() {
		return this.maxDexBonus;
	}
	
	public int getArmorCheckPenalty() {
		return this.armorCheckPenalty;
	}
	
	public double getArcaneSpellFailure() {
		return this.arcaneSpellFailure;
	}
	
	public int getSpeed30() {
		return this.speed30;
	}
	
	public int getSpeed20() {
		return this.speed20;
	}
	
	public int getWeight() {
		return this.weight;
	}
}
