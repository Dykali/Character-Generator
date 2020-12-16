package CharacterGenerator;

import java.util.List;

import CharacterSheet.CharacterSheet;
import CharacterSheet.Skill;

public class RandomSkillInitializer {

	//sets relevant class skills to true for Barbarian
	public static void assignClassSkillsBarbarian(CharacterSheet charSheet) {
		charSheet.getAcrobatics().setClassSkill(true);
		charSheet.getClimb().setClassSkill(true);
		charSheet.getCraft1().setClassSkill(true);
		charSheet.getHandleAnimal().setClassSkill(true);
		charSheet.getIntimidate().setClassSkill(true);
		charSheet.getKnowledgeNature().setClassSkill(true);
		charSheet.getPerception().setClassSkill(true);
		charSheet.getRide().setClassSkill(true);
		charSheet.getSurvival().setClassSkill(true);
		charSheet.getSwim().setClassSkill(true);
	}

	//sets relevant class skills to true for Bard
	public static void assignClassSkillsBard(CharacterSheet charSheet) {
		charSheet.getAcrobatics().setClassSkill(true);
		charSheet.getAppraise().setClassSkill(true);
		charSheet.getBluff().setClassSkill(true);
		charSheet.getClimb().setClassSkill(true);
		charSheet.getDiplomacy().setClassSkill(true);
		charSheet.getDisguise().setClassSkill(true);
		charSheet.getEscapeArtist().setClassSkill(true);
		charSheet.getIntimidate().setClassSkill(true);
		charSheet.getKnowledgeArcana().setClassSkill(true);
		charSheet.getKnowledgeDungeoneering().setClassSkill(true);
		charSheet.getKnowledgeEngineering().setClassSkill(true);
		charSheet.getKnowledgeGeography().setClassSkill(true);
		charSheet.getKnowledgeHistory().setClassSkill(true);
		charSheet.getKnowledgeLocal().setClassSkill(true);
		charSheet.getKnowledgeNature().setClassSkill(true);
		charSheet.getKnowledgeNobility().setClassSkill(true);
		charSheet.getKnowledgePlanes().setClassSkill(true);
		charSheet.getKnowledgeReligion().setClassSkill(true);
		charSheet.getLinguistics().setClassSkill(true);
		charSheet.getPerception().setClassSkill(true);
		charSheet.getPerform1().setClassSkill(true);
		charSheet.getProfession1().setClassSkill(true);
		charSheet.getSenseMotive().setClassSkill(true);
		charSheet.getSleightOfHand().setClassSkill(true);
		charSheet.getSpellcraft().setClassSkill(true);
		charSheet.getStealth().setClassSkill(true);
		charSheet.getUseMagicDevice().setClassSkill(true);
	}

	//sets relevant class skills to true for Cleric
	public static void assignClassSkillsCleric(CharacterSheet charSheet) {
		charSheet.getAppraise().setClassSkill(true);
		charSheet.getCraft1().setClassSkill(true);
		charSheet.getDiplomacy().setClassSkill(true);
		charSheet.getHeal().setClassSkill(true);
		charSheet.getKnowledgeArcana().setClassSkill(true);
		charSheet.getKnowledgeHistory().setClassSkill(true);
		charSheet.getKnowledgeNobility().setClassSkill(true);
		charSheet.getKnowledgePlanes().setClassSkill(true);
		charSheet.getKnowledgeReligion().setClassSkill(true);
		charSheet.getLinguistics().setClassSkill(true);
		charSheet.getProfession1().setClassSkill(true);
		charSheet.getSenseMotive().setClassSkill(true);
		charSheet.getSpellcraft().setClassSkill(true);
	}

	//sets relevant class skills to true for Druid
	public static void assignClassSkillsDruid(CharacterSheet charSheet) {
		charSheet.getClimb().setClassSkill(true);
		charSheet.getCraft1().setClassSkill(true);
		charSheet.getFly().setClassSkill(true);
		charSheet.getHandleAnimal().setClassSkill(true);
		charSheet.getHeal().setClassSkill(true);
		charSheet.getKnowledgeGeography().setClassSkill(true);
		charSheet.getKnowledgeNature().setClassSkill(true);
		charSheet.getPerception().setClassSkill(true);
		charSheet.getProfession1().setClassSkill(true);
		charSheet.getRide().setClassSkill(true);
		charSheet.getSpellcraft().setClassSkill(true);
		charSheet.getSurvival().setClassSkill(true);
		charSheet.getSwim().setClassSkill(true);
	}

	//sets relevant class skills to true for Fighter
	public static void assignClassSkillsFighter(CharacterSheet charSheet) {
		charSheet.getClimb().setClassSkill(true);
		charSheet.getCraft1().setClassSkill(true);
		charSheet.getHandleAnimal().setClassSkill(true);
		charSheet.getIntimidate().setClassSkill(true);
		charSheet.getKnowledgeDungeoneering().setClassSkill(true);
		charSheet.getKnowledgeEngineering().setClassSkill(true);
		charSheet.getProfession1().setClassSkill(true);
		charSheet.getRide().setClassSkill(true);
		charSheet.getSurvival().setClassSkill(true);
		charSheet.getSwim().setClassSkill(true);
	}

	//sets relevant class skills to true for Monk
	public static void assignClassSkillsMonk(CharacterSheet charSheet) {
		charSheet.getAcrobatics().setClassSkill(true);
		charSheet.getClimb().setClassSkill(true);
		charSheet.getCraft1().setClassSkill(true);
		charSheet.getEscapeArtist().setClassSkill(true);
		charSheet.getIntimidate().setClassSkill(true);
		charSheet.getKnowledgeHistory().setClassSkill(true);
		charSheet.getKnowledgeReligion().setClassSkill(true);
		charSheet.getPerception().setClassSkill(true);
		charSheet.getPerform1().setClassSkill(true);
		charSheet.getProfession1().setClassSkill(true);
		charSheet.getRide().setClassSkill(true);
		charSheet.getSenseMotive().setClassSkill(true);
		charSheet.getStealth().setClassSkill(true);
		charSheet.getSwim().setClassSkill(true);
	}

	//sets relevant class skills to true for Paladin
	public static void assignClassSkillsPaladin(CharacterSheet charSheet) {
		charSheet.getCraft1().setClassSkill(true);
		charSheet.getDiplomacy().setClassSkill(true);
		charSheet.getHandleAnimal().setClassSkill(true);
		charSheet.getHeal().setClassSkill(true);
		charSheet.getKnowledgeNobility().setClassSkill(true);
		charSheet.getKnowledgeReligion().setClassSkill(true);
		charSheet.getProfession1().setClassSkill(true);
		charSheet.getRide().setClassSkill(true);
		charSheet.getSenseMotive().setClassSkill(true);
		charSheet.getSpellcraft().setClassSkill(true);
	}

	//sets relevant class skills to true for Ranger
	public static void assignClassSkillsRanger(CharacterSheet charSheet) {
		charSheet.getClimb().setClassSkill(true);
		charSheet.getCraft1().setClassSkill(true);
		charSheet.getHandleAnimal().setClassSkill(true);
		charSheet.getHeal().setClassSkill(true);
		charSheet.getIntimidate().setClassSkill(true);
		charSheet.getKnowledgeDungeoneering().setClassSkill(true);
		charSheet.getKnowledgeGeography().setClassSkill(true);
		charSheet.getKnowledgeNature().setClassSkill(true);
		charSheet.getPerception().setClassSkill(true);
		charSheet.getProfession1().setClassSkill(true);
		charSheet.getRide().setClassSkill(true);
		charSheet.getSpellcraft().setClassSkill(true);
		charSheet.getStealth().setClassSkill(true);
		charSheet.getSurvival().setClassSkill(true);
		charSheet.getSwim().setClassSkill(true);
	}

	//sets relevant class skills to true for Rogue
	public static void assignClassSkillsRogue(CharacterSheet charSheet) {
		charSheet.getAcrobatics().setClassSkill(true);
		charSheet.getAppraise().setClassSkill(true);
		charSheet.getBluff().setClassSkill(true);
		charSheet.getClimb().setClassSkill(true);
		charSheet.getCraft1().setClassSkill(true);
		charSheet.getDiplomacy().setClassSkill(true);
		charSheet.getDisableDevice().setClassSkill(true);
		charSheet.getDisguise().setClassSkill(true);
		charSheet.getEscapeArtist().setClassSkill(true);
		charSheet.getIntimidate().setClassSkill(true);
		charSheet.getKnowledgeDungeoneering().setClassSkill(true);
		charSheet.getKnowledgeLocal().setClassSkill(true);
		charSheet.getLinguistics().setClassSkill(true);
		charSheet.getPerception().setClassSkill(true);
		charSheet.getPerform1().setClassSkill(true);
		charSheet.getProfession1().setClassSkill(true);
		charSheet.getSenseMotive().setClassSkill(true);
		charSheet.getSleightOfHand().setClassSkill(true);
		charSheet.getStealth().setClassSkill(true);
		charSheet.getSwim().setClassSkill(true);
		charSheet.getUseMagicDevice().setClassSkill(true);
	}

	//sets relevant class skills to true for Sorcerer
	public static void assignClassSkillsSorcerer(CharacterSheet charSheet) {
		charSheet.getAppraise().setClassSkill(true);
		charSheet.getBluff().setClassSkill(true);
		charSheet.getCraft1().setClassSkill(true);
		charSheet.getFly().setClassSkill(true);
		charSheet.getIntimidate().setClassSkill(true);
		charSheet.getKnowledgeArcana().setClassSkill(true);
		charSheet.getProfession1().setClassSkill(true);
		charSheet.getSpellcraft().setClassSkill(true);
		charSheet.getUseMagicDevice().setClassSkill(true);
	}

	//sets relevant class skills to true for Wizard
	public static void assignClassSkillsWizard(CharacterSheet charSheet) {
		charSheet.getAppraise().setClassSkill(true);
		charSheet.getCraft1().setClassSkill(true);
		charSheet.getFly().setClassSkill(true);
		charSheet.getKnowledgeArcana().setClassSkill(true);
		charSheet.getKnowledgeDungeoneering().setClassSkill(true);
		charSheet.getKnowledgeEngineering().setClassSkill(true);
		charSheet.getKnowledgeGeography().setClassSkill(true);
		charSheet.getKnowledgeHistory().setClassSkill(true);
		charSheet.getKnowledgeLocal().setClassSkill(true);
		charSheet.getKnowledgeNature().setClassSkill(true);
		charSheet.getKnowledgeNobility().setClassSkill(true);
		charSheet.getKnowledgePlanes().setClassSkill(true);
		charSheet.getKnowledgeReligion().setClassSkill(true);
		charSheet.getLinguistics().setClassSkill(true);
		charSheet.getProfession1().setClassSkill(true);
		charSheet.getSpellcraft().setClassSkill(true);
	}

	//takes in ranks for class and maxRanks for level and assigns a rank to a class skill
	public static void assignSkillRanks(CharacterSheet charSheet, int ranks, int maxRanks) {
		int rand;
		Skill skill;
		List<Skill> skillList = charSheet.getSkillList();
		while(ranks > 0) {
			rand = RandomCharacterGenerator.dieRoller(39)-1;
			skill = skillList.get(rand);
			if(skill.getClassSkill() && skill.getRanks() < maxRanks) {
		    	skill.setRanks(skill.getRanks() + 1);
			}else continue;
			ranks = ranks - 1;
		}
	}

	//updates the ability modifier associated with each skill
	public static void updateSkillAbilityMods(CharacterSheet charSheet) {
		Skill skill = charSheet.getAppraise();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getAcrobatics();
		skill.setAbilityMod(charSheet.getDexMod());
		skill = charSheet.getBluff();
		skill.setAbilityMod(charSheet.getChaMod());
		skill = charSheet.getClimb();
		skill.setAbilityMod(charSheet.getStrMod());
		skill = charSheet.getCraft1();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getCraft2();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getCraft3();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getDiplomacy();
		skill.setAbilityMod(charSheet.getChaMod());
		skill = charSheet.getDisableDevice();
		skill.setAbilityMod(charSheet.getDexMod());
		skill = charSheet.getDisguise();
		skill.setAbilityMod(charSheet.getChaMod());
		skill = charSheet.getEscapeArtist();
		skill.setAbilityMod(charSheet.getDexMod());
		skill = charSheet.getFly();
		skill.setAbilityMod(charSheet.getDexMod());
		skill = charSheet.getHandleAnimal();
		skill.setAbilityMod(charSheet.getChaMod());
		skill = charSheet.getHeal();
		skill.setAbilityMod(charSheet.getWisMod());
		skill = charSheet.getIntimidate();
		skill.setAbilityMod(charSheet.getChaMod());
		skill = charSheet.getKnowledgeArcana();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getKnowledgeDungeoneering();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getKnowledgeEngineering();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getKnowledgeGeography();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getKnowledgeHistory();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getKnowledgeLocal();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getKnowledgeNature();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getKnowledgeNobility();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getKnowledgePlanes();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getKnowledgeReligion();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getLinguistics();
		skill.setAbilityMod(charSheet.getIntMod());		
		skill = charSheet.getPerception();
		skill.setAbilityMod(charSheet.getWisMod());
		skill = charSheet.getPerform1();
		skill.setAbilityMod(charSheet.getChaMod());
		skill = charSheet.getPerform2();
		skill.setAbilityMod(charSheet.getChaMod());
		skill = charSheet.getProfession1();
		skill.setAbilityMod(charSheet.getWisMod());
		skill = charSheet.getProfession2();
		skill.setAbilityMod(charSheet.getWisMod());
		skill = charSheet.getRide();
		skill.setAbilityMod(charSheet.getDexMod());
		skill = charSheet.getSenseMotive();
		skill.setAbilityMod(charSheet.getWisMod());
		skill = charSheet.getSleightOfHand();
		skill.setAbilityMod(charSheet.getDexMod());
		skill = charSheet.getSpellcraft();
		skill.setAbilityMod(charSheet.getIntMod());
		skill = charSheet.getStealth();
		skill.setAbilityMod(charSheet.getDexMod());
		skill = charSheet.getSurvival();
		skill.setAbilityMod(charSheet.getWisMod());
		skill = charSheet.getSwim();
		skill.setAbilityMod(charSheet.getStrMod());
		skill = charSheet.getUseMagicDevice();
		skill.setAbilityMod(charSheet.getChaMod());
	}

	//updates the total of each skill
	public static void updateSkills(CharacterSheet charSheet) {
		Skill skill;
		List<Skill> skillList = charSheet.getSkillList();
		for(int i = 0; i < 39; i++) {
			skill = skillList.get(i);
			skill.setTotal(skill.getAbilityMod() + skill.getRanks() + skill.getMiscMod());
		}
	}

}
