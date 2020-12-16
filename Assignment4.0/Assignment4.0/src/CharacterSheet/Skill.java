package CharacterSheet;

public class Skill {
	private boolean classSkill;
	private int total, abilityMod, ranks, miscMod;
	
	public Skill() {
		this.classSkill = false;
		this.total = this.abilityMod = this.ranks = this.miscMod = 0;
	}
	public int getTotal() {
		return this.total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getAbilityMod() {
		return this.abilityMod;
	}
	
	public void setAbilityMod(int abilityMod) {
		this.abilityMod = abilityMod;
	}
	
	public int getRanks() {
		return this.ranks;
	}
	
	public void setRanks(int ranks) {
		this.ranks = ranks;
	}
	
	public int getMiscMod() {
		return this.miscMod;
	}
	
	public void setMiscMod(int miscMod) {
		this.miscMod = miscMod;
	}
	
	public boolean getClassSkill() {
		return this.classSkill;
	}
	
	public void setClassSkill(boolean classSkill) {
		this.classSkill = classSkill;
	}
}
