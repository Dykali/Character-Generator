package Tables;
import java.lang.String;

public class Weapon {
	private String weaponName;
	private WeaponType type1;
	private WeaponType type2;
	private int range;
	private String ammunition;
	private int damageM;
	private int damageS;
	private String critical;
	private String special;
	
	public Weapon(String weaponName, WeaponType type1, WeaponType type2, int range, String ammunition, 
			int damageM, int damageS, String critical, String special) {
		this.weaponName = weaponName;
		this.type1 = type1;
		this.type2 = type2;
		this.range = range;
		this.ammunition = ammunition;
		this.damageM = damageM;
		this.damageS = damageS;
		this.critical = critical;
		this.special = special;
	}
	
	public String getSpecial() {
		return this.special;
	}
	
	public void setSpecial(String special) {
		this.special = special;
	}
	
	public String getCritical() {
		return this.critical;
	}
	
	public void setCritical(String critical) {
		this.critical = critical;
	}
	
	public int getRange() {
		return this.range;
	}
	
	public void setRange(int range) {
		this.range = range;
	}
	
	public int getDamageM() {
		return this.damageM;
	}
	
	public void setDamageM(int damage) {
		this.damageM = damage;
	}
	
	public int getDamageS() {
		return this.damageS;
	}
	
	public void setDamageS(int damage) {
		this.damageS = damage;
	}
	
	public String getWeaponName() {
		return this.weaponName;
	}
	
	public void setWeaponName(String name) {
		this.weaponName = name;
	}
	
	public String getAmmunition() {
		return this.ammunition;
	}
	
	public void setAmmunition(String ammo) {
		this.ammunition = ammo;
	}
	
	public WeaponType getWeaponType1() {
		return this.type1;
	}
	
	public void setWeaponType1(WeaponType type) {
		this.type1 = type;
	}
	
	public WeaponType getWeaponType2() {
		return this.type2;
	}
	
	public void setWeaponType2(WeaponType type) {
		this.type2 = type;
	}
	

}

