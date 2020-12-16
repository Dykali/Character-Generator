package Tables;

import java.util.ArrayList;
import java.util.List;

public class WeaponLists {
	private List<Weapon> simpleWeapons;
	private List<Weapon> martialWeapons;
	private List<Weapon> exoticWeapons;
	
	public WeaponLists() {
		this.simpleWeapons = makeSimpleWeaponList();
		this.martialWeapons = makeMartialWeaponList();
		this.exoticWeapons = makeExoticWeaponList();
	}

	public List<Weapon> getSimpleWeapons(){
		return this.simpleWeapons;
	}
	
	public List<Weapon> getMartialWeapons(){
		return this.martialWeapons;
	}
	
	public List<Weapon> getExoticWeapons(){
		return this.exoticWeapons;
	}
	
	private List<Weapon> makeExoticWeaponList() {
		List<Weapon> weaponList = new ArrayList<Weapon>();
		
		Weapon weapon = new Weapon("Gauntlet", WeaponType.B, WeaponType.NONE, 0, "", 3, 2, "x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Unarmed Strike", WeaponType.B, WeaponType.NONE, 0, "", 3, 2, "x2", "Nonlethal");
		weaponList.add(weapon);
		
		weapon = new Weapon("Dagger", WeaponType.P, WeaponType.S, 10, "", 4, 3, "19-20/x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Dagger, Punching", WeaponType.P, WeaponType.NONE, 0, "", 4, 3, "x3", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Gauntlet, Spiked", WeaponType.P, WeaponType.NONE, 0, "", 4, 3, "x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Mace, Light", WeaponType.B, WeaponType.NONE, 0, "", 6, 4, "x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Sickle", WeaponType.S, WeaponType.NONE, 0, "", 6, 4, "x2", "Trip");
		weaponList.add(weapon);
		
		weapon = new Weapon("Club", WeaponType.B, WeaponType.NONE, 10, "", 6, 4, "x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Mace, Heavy", WeaponType.B, WeaponType.NONE, 0, "", 8, 6, "x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Morningstar", WeaponType.B, WeaponType.P, 0, "", 8, 6, "x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Shortspear", WeaponType.P, WeaponType.NONE, 0, "", 6, 4, "x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Longspear", WeaponType.P, WeaponType.NONE, 0, "", 8, 6, "x3", "Brace, Reach");
		weaponList.add(weapon);
		
		weapon = new Weapon("Quarterstaff", WeaponType.B, WeaponType.NONE, 0, "", 6, 4, "x3", "Double, Monk");
		weaponList.add(weapon);
		
		weapon = new Weapon("Spear", WeaponType.P, WeaponType.NONE, 20, "", 8, 6, "x3", "Brace");
		weaponList.add(weapon);
		
		weapon = new Weapon("Blowgun", WeaponType.P, WeaponType.NONE, 20, "Darts, blowgun(10)", 2, 1, "x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Crossbow, Heavy", WeaponType.P, WeaponType.NONE, 120, "Bolts, crossbow(10)", 10, 8, "19-20/x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Crossbow, Light", WeaponType.P, WeaponType.NONE, 80, "Bolts, crossbow(10)", 8, 6, "19-20/x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Dart", WeaponType.P, WeaponType.NONE, 20, "", 4, 3, "x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Javelin", WeaponType.P, WeaponType.NONE, 30, "", 6, 4, "x2", "");
		weaponList.add(weapon);
		
		weapon = new Weapon("Sling", WeaponType.B, WeaponType.NONE, 50, "Bullets, sling(10)", 4, 3, "x2", "");
		weaponList.add(weapon);
		
		return weaponList;
	}

	private List<Weapon> makeMartialWeaponList() {
		List<Weapon> weaponList = new ArrayList<Weapon>();
		
		Weapon weapon = new Weapon("Axe, throwing", WeaponType.S, WeaponType.NONE, 20, "", 6, 4, "x2", "");
		weaponList.add(weapon);
		
		return weaponList;
	}

	private List<Weapon> makeSimpleWeaponList() {
		List<Weapon> weaponList = new ArrayList<Weapon>();
		
		Weapon weapon = new Weapon("Kama", WeaponType.S, WeaponType.NONE, 10, "", 2, 1, "x2", "");
		weaponList.add(weapon);
		
		return weaponList;
	}
}
