package Tests;

import java.util.List;

import CharacterSheet.CharacterSheet;
import CharacterSheet.Skill;

public class PrintUtils {

	//prints character sheet fields to help verify correct output
	public static void printSheet(CharacterSheet charSheet) {
		System.out.println("Name:"+ charSheet.getCharacterName() + " Alignment:" + charSheet.getAlignment());
		System.out.println("HP " + charSheet.getHP());
		System.out.println(charSheet.getCharRace() + " " + charSheet.getCharClass());
		System.out.println("Size:" + charSheet.getCharSize() + " Gender:" + charSheet.getGender() + " Age:" + charSheet.getAge() + " Height:" + charSheet.getHeight() + " Weight:" + charSheet.getWeight());
		System.out.println("STR " + charSheet.getStr() + " " + charSheet.getStrMod());
		System.out.println("DEX " + charSheet.getDex() + " " + charSheet.getDexMod());
		System.out.println("CON " + charSheet.getCon() + " " + charSheet.getConMod());
		System.out.println("INT " + charSheet.getInt() + " " + charSheet.getIntMod());
		System.out.println("WIS " + charSheet.getWis() + " " + charSheet.getWisMod());
		System.out.println("CHA " + charSheet.getCha() + " " + charSheet.getChaMod());
		System.out.println("AC " + charSheet.getAC());
		System.out.println("TOUCH " + charSheet.getTouch());
		System.out.println("FORTITUDE " + charSheet.getFortitude());
		System.out.println("REFLEX " + charSheet.getReflex());
		System.out.println("WILL " + charSheet.getWill());
		System.out.println("BASE ATTACK BONUS " + charSheet.getBaseAttackBonus() + " SPELL RESISTANCE " + charSheet.getSpellResistance());
		System.out.println("CMB " + charSheet.getCMB());
		System.out.println("CMD " + charSheet.getCMD());	
		System.out.println("Special Abilities " + charSheet.getSpecialAbilities());
		printSkills(charSheet);
		printSpells(charSheet);

	}
	
	public static void printSpells(CharacterSheet charSheet) {
		printZeroSpells(charSheet);
		printFirstSpells(charSheet);
	}
	
	public static void printZeroSpells(CharacterSheet charSheet) {
		List<String> spells = charSheet.getZeroSpellList();
		int len = spells.size();
		System.out.println("                             Zero Spells");
		for(int i = 0; i<len;i++) {
			System.out.println(spells.get(i));
		}
	}
	
	public static void printFirstSpells(CharacterSheet charSheet) {
		List<String> spells = charSheet.getFirstSpellList();
		int len = spells.size();
		System.out.println("                             First Spells");
		for(int i = 0; i<len;i++) {
			System.out.println(spells.get(i));
		}
	}
	
	public static void printSkills(CharacterSheet charSheet) {
		//print skills
		Skill skill = charSheet.getAppraise();
		System.out.println(skill.getClassSkill() + " Appraise " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getAcrobatics();
		System.out.println(skill.getClassSkill() + " Acrobatics " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getBluff();
		System.out.println(skill.getClassSkill() + " Bluff " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getClimb();
		System.out.println(skill.getClassSkill() + " Climb " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getCraft1();
		System.out.println(skill.getClassSkill() + " Craft1 " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getCraft2();
		System.out.println(skill.getClassSkill() + " Craft2 " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getCraft3();
		System.out.println(skill.getClassSkill() + " Craft3 " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getDiplomacy();
		System.out.println(skill.getClassSkill() + " Diplomacy " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getDisableDevice();
		System.out.println(skill.getClassSkill() + " Disable Device " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getDisguise();
		System.out.println(skill.getClassSkill() + " Disguise " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getEscapeArtist();
		System.out.println(skill.getClassSkill() + " Escape Artist " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getFly();
		System.out.println(skill.getClassSkill() + " Fly " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getHandleAnimal();
		System.out.println(skill.getClassSkill() + " Handle Animal " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getHeal();
		System.out.println(skill.getClassSkill() + " Heal " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getIntimidate();
		System.out.println(skill.getClassSkill() + " Intimidate " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getKnowledgeArcana();
		System.out.println(skill.getClassSkill() + " Knowledge Arcana " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getKnowledgeDungeoneering();
		System.out.println(skill.getClassSkill() + " Knowledge Dungeoneering " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getKnowledgeEngineering();
		System.out.println(skill.getClassSkill() + " Knowledge Engineering " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getKnowledgeGeography();
		System.out.println(skill.getClassSkill() + " Knowledge Geography " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getKnowledgeHistory();
		System.out.println(skill.getClassSkill() + " Knowledge History " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getKnowledgeLocal();
		System.out.println(skill.getClassSkill() + " Knowledge Local " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getKnowledgeNature();
		System.out.println(skill.getClassSkill() + " Knowledge Nature " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getKnowledgeNobility();
		System.out.println(skill.getClassSkill() + " Knowledge Nobility " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getKnowledgePlanes();
		System.out.println(skill.getClassSkill() + " Knowledge Planes " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getKnowledgeReligion();
		System.out.println(skill.getClassSkill() + " Knowledge Religion " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getLinguistics();
		System.out.println(skill.getClassSkill() + " Linguistics " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());	
		skill = charSheet.getPerception();
		System.out.println(skill.getClassSkill() + " Perception " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getPerform1();
		System.out.println(skill.getClassSkill() + " Perform1 " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getPerform2();
		System.out.println(skill.getClassSkill() + " Perform2 " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getProfession1();
		System.out.println(skill.getClassSkill() + " Profession1 " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getProfession2();
		System.out.println(skill.getClassSkill() + " Profession2 " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getRide();
		System.out.println(skill.getClassSkill() + " Ride " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getSenseMotive();
		System.out.println(skill.getClassSkill() + " Sense Motive " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getSleightOfHand();
		System.out.println(skill.getClassSkill() + " Sleight of Hand " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getSpellcraft();
		System.out.println(skill.getClassSkill() + " Spellcraft " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getStealth();
		System.out.println(skill.getClassSkill() + " Stealth " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getSurvival();
		System.out.println(skill.getClassSkill() + " Survival " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getSwim();
		System.out.println(skill.getClassSkill() + " Swim " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
		skill = charSheet.getUseMagicDevice();
		System.out.println(skill.getClassSkill() + " Use Magic Device " + skill.getTotal() + " " + skill.getAbilityMod() + " " + skill.getRanks() + " "+ skill.getMiscMod());
	}
	
	

}
