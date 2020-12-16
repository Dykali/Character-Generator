package CharacterGenerator;

import CharacterSheet.CharacterAlignment;
import CharacterSheet.CharacterClass;
import CharacterSheet.CharacterSheet;
import Tables.School;

public class RandomClassInitializer {

	//assigns bonuses for each first level character class
	public static void assignClassBonuses(CharacterSheet charSheet, CharacterClass charClass) {
		if(charClass == CharacterClass.BARBARIAN) {	
			assignBarbarianBonuses(charSheet);
		}else if(charClass == CharacterClass.BARD) {
			assignBardBonuses(charSheet);
		}else if(charClass == CharacterClass.CLERIC) {
			assignClericBonuses(charSheet);
		}else if(charClass == CharacterClass.DRUID) {	
			assignDruidBonuses(charSheet);
		}else if(charClass == CharacterClass.FIGHTER) {
			assignFighterBonuses(charSheet);
		}else if(charClass == CharacterClass.MONK) {	
			assignMonkBonuses(charSheet);
		}else if(charClass == CharacterClass.PALADIN) {
			assignPaladinBonuses(charSheet);
		}else if(charClass == CharacterClass.RANGER) {	
			assignRangerBonuses(charSheet);
		}else if(charClass == CharacterClass.ROGUE) {
			assignRogueBonuses(charSheet);
		}else if(charClass == CharacterClass.SORCERER) {
			assignSorcererBonuses(charSheet);
		}else if(charClass == CharacterClass.WIZARD) {	
			assignWizardBonuses(charSheet);
		}
	}

	public static void assignBarbarianBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.BARBARIAN;
		RandomSkillInitializer.assignClassSkillsBarbarian(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		CharacterAlignment alignment = CharacterAlignment.LG;
		while(alignment == CharacterAlignment.LG || alignment == CharacterAlignment.LN ||alignment == CharacterAlignment.LE) {
			alignment = RandomCharacterGenerator.randomAlignment();
		}
		charSheet.setAlignment(alignment);
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Fast Movement");
		charSheet.setBaseSpeed(charSheet.getBaseSpeed() + 10);
		charSheet.addSpecialAbility("Rage");
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(2);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(0);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	public static void assignBardBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.BARD;
		RandomSkillInitializer.assignClassSkillsBard(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		charSheet.setAlignment(RandomCharacterGenerator.randomAlignment());
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Spells");
		RandomSpellGenerator.assignFirstSpells(charSheet, 2, School.NONE, charSheet.getAlignment());
		charSheet.addSpecialAbility("Bardic Knowledge");
		charSheet.addSpecialAbility("Bardic Performance");
		charSheet.addSpecialAbility("Cantrips");
		RandomSpellGenerator.assignZeroSpells(charSheet, 4, School.NONE, charSheet.getAlignment());
		charSheet.addSpecialAbility("Countersong");
		charSheet.addSpecialAbility("Distraction");
		charSheet.addSpecialAbility("Fascinate");
		charSheet.addSpecialAbility("Inspire Courage +1");
		charSheet.setBaseAttackBonus(0);
		charSheet.setFortitudeBase(0);
		charSheet.setReflexBase(2);
		charSheet.setWillBase(2);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	public static void assignClericBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.CLERIC;
		RandomSkillInitializer.assignClassSkillsCleric(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		charSheet.setAlignment(RandomCharacterGenerator.randomAlignment());
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Spells");
		charSheet.addSpecialAbility("Aura");
		charSheet.addSpecialAbility("Channel Energy");
		charSheet.addSpecialAbility("Domains");
		charSheet.addSpecialAbility("Orisons");
		charSheet.setBaseAttackBonus(0);
		charSheet.setFortitudeBase(2);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(2);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	public static void assignDruidBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.DRUID;
		RandomSkillInitializer.assignClassSkillsDruid(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		CharacterAlignment alignment = CharacterAlignment.LG;
		while(alignment == CharacterAlignment.LE || alignment == CharacterAlignment.CE || alignment == CharacterAlignment.CG ||
				alignment == CharacterAlignment.LG) {
			alignment = RandomCharacterGenerator.randomAlignment();
		}
		charSheet.setAlignment(alignment);
		charSheet.addLanguage("Druidic");
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Spells");
		charSheet.addSpecialAbility("Spontaneous Casting");
		charSheet.addSpecialAbility("Nature Bond");
		charSheet.addSpecialAbility("Nature Sense");
		charSheet.getKnowledgeNature().setMiscMod(charSheet.getKnowledgeNature().getMiscMod()+2);
		charSheet.getSurvival().setMiscMod(charSheet.getSurvival().getMiscMod()+2);
		charSheet.addSpecialAbility("Orisons");
		charSheet.addSpecialAbility("Wild Empathy");
		charSheet.setBaseAttackBonus(0);
		charSheet.setFortitudeBase(2);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(2);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	public static void assignFighterBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.FIGHTER;
		RandomSkillInitializer.assignClassSkillsFighter(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		charSheet.setAlignment(RandomCharacterGenerator.randomAlignment());
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Bonus Feats");
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(2);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(0);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	public static void assignMonkBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.MONK;
		RandomSkillInitializer.assignClassSkillsMonk(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		CharacterAlignment alignment = CharacterAlignment.CG;
		while(true) {
			alignment = RandomCharacterGenerator.randomAlignment();
			if(alignment == CharacterAlignment.LG || alignment == CharacterAlignment.LN ||alignment == CharacterAlignment.LE) {
				break;
			}
		}
		charSheet.setAlignment(alignment);
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Bonus Feat");//from class table
		charSheet.addSpecialAbility("Flurry of Blows");
		charSheet.addSpecialAbility("Stunning Fist");//bonus feat
		charSheet.addSpecialAbility("Unarmed Strike");//bonus feat
		charSheet.setBaseAttackBonus(0);
		charSheet.setFortitudeBase(2);
		charSheet.setReflexBase(2);
		charSheet.setWillBase(2);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	public static void assignPaladinBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.PALADIN;
		RandomSkillInitializer.assignClassSkillsPaladin(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		charSheet.setAlignment(CharacterAlignment.LG);
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Aura of Good");
		charSheet.addSpecialAbility("Detect Evil");
		charSheet.addSpecialAbility("Smite Evil");
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(2);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(2);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	public static void assignRangerBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.RANGER;
		RandomSkillInitializer.assignClassSkillsRanger(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		charSheet.setAlignment(RandomCharacterGenerator.randomAlignment());
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Favored Enemy");
		charSheet.addSpecialAbility("Track");
		charSheet.addSpecialAbility("Wild Empathy");
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(2);
		charSheet.setReflexBase(2);
		charSheet.setWillBase(0);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	public static void assignRogueBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.ROGUE;
		RandomSkillInitializer.assignClassSkillsRogue(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		charSheet.setAlignment(RandomCharacterGenerator.randomAlignment());
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Sneak Attack");
		charSheet.addSpecialAbility("Trap Finding");
		charSheet.setBaseAttackBonus(0);
		charSheet.setFortitudeBase(0);
		charSheet.setReflexBase(2);
		charSheet.setWillBase(0);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	public static void assignSorcererBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.SORCERER;
		RandomSkillInitializer.assignClassSkillsSorcerer(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		charSheet.setAlignment(RandomCharacterGenerator.randomAlignment());
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Spells");
		RandomSpellGenerator.assignFirstSpells(charSheet, 2, School.NONE, charSheet.getAlignment());
		charSheet.addSpecialAbility("Bloodline");			
		charSheet.addSpecialAbility("Cantrips");
		RandomSpellGenerator.assignZeroSpells(charSheet, 4, School.NONE, charSheet.getAlignment());
		charSheet.addSpecialAbility("Eschew Materials");
		charSheet.setBaseAttackBonus(0);
		charSheet.setFortitudeBase(0);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(2);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	public static void assignWizardBonuses(CharacterSheet charSheet) {
		CharacterClass charClass = CharacterClass.WIZARD;
		RandomSkillInitializer.assignClassSkillsWizard(charSheet);
		RandomClassInitializer.assignHP(charSheet, charClass);
		charSheet.setAlignment(RandomCharacterGenerator.randomAlignment());
		charSheet.addSpecialAbility("Weapon and Armor Proficiency");
		charSheet.addSpecialAbility("Spells");
		RandomSpellGenerator.assignAllFirstSpells(charSheet, School.NONE, charSheet.getAlignment());
		charSheet.addSpecialAbility("Arcane Bond");
		charSheet.addSpecialAbility("Arcane School");
		charSheet.addSpecialAbility("Cantrips");
		RandomSpellGenerator.assignAllZeroSpells(charSheet, School.NONE, charSheet.getAlignment());
		charSheet.addSpecialAbility("Scribe Scroll");//bonus feat
		charSheet.setBaseAttackBonus(0);
		charSheet.setFortitudeBase(0);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(2);
		charSheet.setGP((RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6))*10);
	}
	
	//used to add racial ability bonus to the most relevant class
	public static void modifyHighestScore(CharacterSheet charSheet, CharacterClass charClass, int modifier) {
		if(charClass == CharacterClass.BARBARIAN) {
			charSheet.setStr(charSheet.getStr() + modifier);
		}else if(charClass == CharacterClass.BARD) {
			charSheet.setCha(charSheet.getCha() + modifier);
		}else if(charClass == CharacterClass.CLERIC) {
			charSheet.setWis(charSheet.getWis() + modifier);
		}else if(charClass == CharacterClass.DRUID) {
			charSheet.setWis(charSheet.getWis() + modifier);
		}else if(charClass == CharacterClass.FIGHTER) {
			charSheet.setStr(charSheet.getStr() + modifier);
		}else if(charClass == CharacterClass.MONK) {
			charSheet.setWis(charSheet.getWis() + modifier);
		}else if(charClass == CharacterClass.PALADIN) {
			charSheet.setStr(charSheet.getStr() + modifier);
		}else if(charClass == CharacterClass.RANGER) {
			charSheet.setDex(charSheet.getDex() + modifier);	
		}else if(charClass == CharacterClass.ROGUE) {
			charSheet.setDex(charSheet.getDex() + modifier);
		}else if(charClass == CharacterClass.SORCERER) {
			charSheet.setCha(charSheet.getCha() + modifier);
		}else if(charClass == CharacterClass.WIZARD) {
			charSheet.setInt(charSheet.getInt() + modifier);
		}
	}

	//outputs a new class
	public static CharacterClass generateRandomClass() {
		int classScore = RandomCharacterGenerator.dieRoller(11);
		if(classScore == 1) {
			return CharacterClass.BARBARIAN;
		}else if(classScore == 2) {
			return CharacterClass.BARD;
		}else if(classScore == 3) {
			return CharacterClass.CLERIC;
		}else if(classScore == 4) {
			return CharacterClass.DRUID;
		}else if(classScore == 5) {
			return CharacterClass.FIGHTER;
		}else if(classScore == 6) {
			return CharacterClass.MONK;
		}else if(classScore == 7) {
			return CharacterClass.PALADIN;
		}else if(classScore == 8) {
			return CharacterClass.RANGER;
		}else if(classScore == 9) {
			return CharacterClass.ROGUE;
		}else if(classScore == 10) {
			return CharacterClass.SORCERER;
		}else {
			return CharacterClass.WIZARD;
		}
	}

	//assigns the number of skill ranks a character gets when leveling up
	public static void assignClassSkillRanks(CharacterSheet charSheet, int level) {
		CharacterClass charClass = charSheet.getCharClass();
		if(charClass == CharacterClass.BARBARIAN) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 4+charSheet.getIntMod(), level);
		}else if(charClass == CharacterClass.BARD) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 6+charSheet.getIntMod(), level);
		}else if(charClass == CharacterClass.CLERIC) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 2+charSheet.getIntMod(), level);
		}else if(charClass == CharacterClass.DRUID) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 4+charSheet.getIntMod(), level);
		}else if(charClass == CharacterClass.FIGHTER) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 2+charSheet.getIntMod(), level);
		}else if(charClass == CharacterClass.MONK) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 4+charSheet.getIntMod(), level);
		}else if(charClass == CharacterClass.PALADIN) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 2+charSheet.getIntMod(), level);
		}else if(charClass == CharacterClass.RANGER) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 6+charSheet.getIntMod(), level);
		}else if(charClass == CharacterClass.ROGUE) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 8+charSheet.getIntMod(), level);
		}else if(charClass == CharacterClass.SORCERER) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 2+charSheet.getIntMod(), level);
		}else if(charClass == CharacterClass.WIZARD) {
			RandomSkillInitializer.assignSkillRanks(charSheet, 2+charSheet.getIntMod(), level);
		}
	}

	//set starting hp
	public static void assignHP(CharacterSheet charSheet, CharacterClass charClass) {
		if(charClass == CharacterClass.BARBARIAN) {
			charSheet.setHP(12+charSheet.getConMod());
		}else if(charClass == CharacterClass.BARD) {
			charSheet.setHP(8+charSheet.getConMod());
		}else if(charClass == CharacterClass.CLERIC) {
			charSheet.setHP(8+charSheet.getConMod());
		}else if(charClass == CharacterClass.DRUID) {
			charSheet.setHP(8+charSheet.getConMod());
		}else if(charClass == CharacterClass.FIGHTER) {
			charSheet.setHP(10+charSheet.getConMod());
		}else if(charClass == CharacterClass.MONK) {
			charSheet.setHP(8+charSheet.getConMod());
		}else if(charClass == CharacterClass.PALADIN) {
			charSheet.setHP(10+charSheet.getConMod());
		}else if(charClass == CharacterClass.RANGER) {
			charSheet.setHP(10+charSheet.getConMod());
		}else if(charClass == CharacterClass.ROGUE) {
			charSheet.setHP(8+charSheet.getConMod());
		}else if(charClass == CharacterClass.SORCERER) {
			charSheet.setHP(6+charSheet.getConMod());
		}else if(charClass == CharacterClass.WIZARD) {
			charSheet.setHP(6+charSheet.getConMod());
		}
	}

}
