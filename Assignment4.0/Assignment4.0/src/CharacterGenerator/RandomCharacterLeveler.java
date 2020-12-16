package CharacterGenerator;

import java.io.IOException;

import CharacterSheet.CharacterClass;
import CharacterSheet.CharacterSheet;
import Tests.PrintUtils;

public class RandomCharacterLeveler {
	
	public static void secondLevel(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		if(charClass == CharacterClass.BARBARIAN) {
			secondLevelBarbarian(charSheet);
		}else if(charClass == CharacterClass.BARD) {
			secondLevelBard(charSheet);
		}else if(charClass == CharacterClass.CLERIC) {
			secondLevelCleric(charSheet);
		}else if(charClass == CharacterClass.DRUID) {
			secondLevelDruid(charSheet);
		}else if(charClass == CharacterClass.FIGHTER) {
			secondLevelFighter(charSheet);
		}else if(charClass == CharacterClass.MONK) {
			secondLevelMonk(charSheet);
		}else if(charClass == CharacterClass.PALADIN) {
			secondLevelPaladin(charSheet);
		}else if(charClass == CharacterClass.RANGER) {
			secondLevelRanger(charSheet);
		}else if(charClass == CharacterClass.ROGUE) {
			secondLevelRogue(charSheet);
		}else if(charClass == CharacterClass.SORCERER) {
			secondLevelSorcerer(charSheet);
		}else if(charClass == CharacterClass.WIZARD) {
			secondLevelWizard(charSheet);
		}
	}
	
	public static void secondLevelBarbarian(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.addSpecialAbility("Rage Power");
		charSheet.addSpecialAbility("Uncanny Dodge");
		charSheet.setBaseAttackBonus(2);
		charSheet.setFortitudeBase(3);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(0);
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	public static void secondLevelBard(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.addSpecialAbility("Versatile Performance");
		charSheet.addSpecialAbility("Well-Versed");
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(0);
		charSheet.setReflexBase(3);
		charSheet.setWillBase(3);
		//TODO spells/feats
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	public static void secondLevelCleric(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(3);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(3);
		//TODO spells/feats
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	public static void secondLevelDruid(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.addSpecialAbility("Woodlant Stride");
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(3);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(3);
		//TODO spells/feats
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	public static void secondLevelFighter(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.addSpecialAbility("Bravery +1");
		charSheet.addSpecialAbility("Bonus Feat");
		charSheet.setBaseAttackBonus(2);
		charSheet.setFortitudeBase(3);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(3);
		//TODO spells/feats
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	public static void secondLevelMonk(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.addSpecialAbility("Bonus Feat");
		charSheet.addSpecialAbility("Evasion");
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(3);
		charSheet.setReflexBase(3);
		charSheet.setWillBase(3);
		//TODO spells/feats
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	public static void secondLevelPaladin(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.addSpecialAbility("Divine Grace");
		charSheet.addSpecialAbility("Lay on Hands");
		charSheet.setBaseAttackBonus(2);
		charSheet.setFortitudeBase(3);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(3);
		//TODO spells/feats
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	public static void secondLevelRanger(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.addSpecialAbility("Combat Style Feat");
		charSheet.setBaseAttackBonus(2);
		charSheet.setFortitudeBase(3);
		charSheet.setReflexBase(3);
		charSheet.setWillBase(0);
		//TODO spells/feats
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	public static void secondLevelRogue(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.addSpecialAbility("Evasion");
		charSheet.addSpecialAbility("Rogue Talent");
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(3);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(3);
		//TODO spells/feats
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	public static void secondLevelSorcerer(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(0);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(3);
		//TODO spells/feats
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	public static void secondLevelWizard(CharacterSheet charSheet) {
		CharacterClass charClass = charSheet.getCharClass();
		charSheet.addSpecialAbility("Versatile Performance");
		charSheet.addSpecialAbility("Well-Versed");
		charSheet.setBaseAttackBonus(1);
		charSheet.setFortitudeBase(0);
		charSheet.setReflexBase(0);
		charSheet.setWillBase(3);
		//TODO spells/feats
		assignHP(charSheet, charClass);
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomClassInitializer.assignClassSkillRanks(charSheet, 2);	
		RandomSkillInitializer.updateSkills(charSheet);
		RandomCharacterGenerator.updateTotals(charSheet);
	}
	
	//set starting hp
	public static void assignHP(CharacterSheet charSheet, CharacterClass charClass) {
		if(charClass == CharacterClass.BARBARIAN) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(12);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}else if(charClass == CharacterClass.BARD) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(8);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}else if(charClass == CharacterClass.CLERIC) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(8);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}else if(charClass == CharacterClass.DRUID) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(8);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}else if(charClass == CharacterClass.FIGHTER) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(10);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}else if(charClass == CharacterClass.MONK) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(8);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}else if(charClass == CharacterClass.PALADIN) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(10);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}else if(charClass == CharacterClass.RANGER) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(10);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}else if(charClass == CharacterClass.ROGUE) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(8);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}else if(charClass == CharacterClass.SORCERER) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(6);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}else if(charClass == CharacterClass.WIZARD) {
			int hp = charSheet.getHP();
			int rand = RandomCharacterGenerator.dieRoller(6);
			charSheet.setHP(hp+rand+charSheet.getConMod());
		}
	}
}
