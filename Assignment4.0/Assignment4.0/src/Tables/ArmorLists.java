package Tables;

import java.util.ArrayList;
import java.util.List;

//holds lists of armor for convenient armor access
public class ArmorLists {
	private List<Armor> lightArmor;
	private List<Armor> mediumArmor;
	private List<Armor> heavyArmor;
	private List<Armor> shield;
	
	public ArmorLists() {
		this.lightArmor = makeLightArmorList();
		this.mediumArmor = makeMediumArmorList();
		this.heavyArmor = makeHeavyArmorList();
		this.shield = makeShieldList();
	}

	//a list of shields
	private List<Armor> makeShieldList() {
		List<Armor> armorList = new ArrayList<Armor>();
		
		Armor armor = new Armor("Buckler", 5, 1, 0, -1, .05, 0, 0, 5);
		armorList.add(armor);
		
		armor = new Armor("Shield, light wooden", 3, 1, 0, -1, .05, 0, 0, 5);
		armorList.add(armor);
		
		armor = new Armor("Shield, light steel", 9, 1, 0, -1, .05, 0, 0, 5);
		armorList.add(armor);
		
		armor = new Armor("Shield, heavy wooden", 7, 2, 0, -2, .15, 0, 0, 10);
		armorList.add(armor);
		
		armor = new Armor("Shield, heavy steel", 20, 2, 0, -2, .15, 0, 0, 15);
		armorList.add(armor);
		
		armor = new Armor("Shield, tower", 30, 4, 2, -10, .50, 0, 0, 45);
		armorList.add(armor);
		
		return armorList;
	}

	//a list of heavy armor
	private List<Armor> makeHeavyArmorList() {
		List<Armor> armorList = new ArrayList<Armor>();
		
		Armor armor = new Armor("Splint Mail", 200, 7, 0, -7, .40, 20, 15, 45);
		armorList.add(armor);
		
		armor = new Armor("Banded Mail", 250, 7, 1, -6, .35, 20, 15, 35);
		armorList.add(armor);
		
		armor = new Armor("Half-plate", 600, 8, 0, -7, .40, 20, 15, 50);
		armorList.add(armor);
		
		armor = new Armor("Full plate", 1500, 9, 1, -6, .35, 20, 15, 50);
		armorList.add(armor);
		
		return armorList;
	}

	//a list of medium armor
	private List<Armor> makeMediumArmorList() {
		List<Armor> armorList = new ArrayList<Armor>();
		
		Armor armor = new Armor("Hide", 15, 4, 4, -3, .20, 20, 15, 25);
		armorList.add(armor);
		
		armor = new Armor("Scale Mail", 50, 5, 3, -4, .25, 20, 15, 30);
		armorList.add(armor);
		
		armor = new Armor("Chainmail", 150, 6, 2, -5, .30, 20, 15, 40);
		armorList.add(armor);
		
		armor = new Armor("Breastplate", 200, 6, 3, -4, .25, 20, 15, 30);
		armorList.add(armor);
		
		return armorList;
	}

	//a list of light armor
	private List<Armor> makeLightArmorList() {
		List<Armor> armorList = new ArrayList<Armor>();
		
		Armor armor = new Armor("Padded", 5, 1, 8, 0, .05, 30, 20, 10);
		armorList.add(armor);
		
		armor = new Armor("Leather", 10, 2, 6, 0, .10, 30, 20, 15);
		armorList.add(armor);
		
		armor = new Armor("Studded Leather", 25, 3, 5, -1, .15, 30, 20, 25);
		armorList.add(armor);
		
		armor = new Armor("Chain Shirt", 100, 4, 4, -2, .20, 30, 20, 25);
		armorList.add(armor);
		
		return armorList;
	}

	public List<Armor> getLightArmorList(){
		return this.lightArmor;
	}
	
	public List<Armor> getMediumArmorList(){
		return this.mediumArmor;
	}
	
	public List<Armor> getHeavyArmorList(){
		return this.heavyArmor;
	}
	
	public List<Armor> getShieldList(){
		return this.shield;
	}
}
