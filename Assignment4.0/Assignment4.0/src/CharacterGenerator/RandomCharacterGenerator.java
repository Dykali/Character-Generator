package CharacterGenerator;
import java.util.Random;
import java.util.Arrays;

import CharacterSheet.*;

public class RandomCharacterGenerator {
	private CharacterSheet charSheet = new CharacterSheet();

	public CharacterSheet getRandomCharacterGeneratorSheet(String playerName, CharacterClass charClass, CharacterRace charRace) {
		this.charSheet.setPlayerName(playerName);
		//Choose a class and race
		if(charClass == CharacterClass.RANDOM) {
			charClass = RandomClassInitializer.generateRandomClass();
		}
		if(charRace == CharacterRace.RANDOM) {
			charRace = RandomRaceInitializer.generateRandomRace();
		}
	
		assignClassRace(charSheet, charClass, charRace);	
		RandomRaceInitializer.assignDescriptors(charSheet);	
		//Assign base ability scores relatively based on class
		RandomCharacterGenerator.assignBaseScores(charSheet, charClass, generateBaseScores());
		//Assign racial bonuses
		RandomRaceInitializer.assignRacialBonuses(charSheet, charRace);
		//Assign class bonuses
		RandomClassInitializer.assignClassBonuses(charSheet, charClass);	
		//Assign ability score modifiers
		assignAbilityScoreMods(charSheet);
		//update skills table
		RandomClassInitializer.assignClassSkillRanks(charSheet, 1);	
		RandomSkillInitializer.updateSkillAbilityMods(charSheet);
		RandomSkillInitializer.updateSkills(charSheet);
		//add equipment
		
		//add up all the totals
		updateTotals(charSheet);
		
		return this.charSheet;
	}
	
	public static void updateTotals(CharacterSheet charSheet) {
		updateAC(charSheet);
		updateTouch(charSheet);
		updateFlatFooted(charSheet);
		updateCMD(charSheet);
		updateCMB(charSheet);
		updateInitiative(charSheet);
		updateSaves(charSheet);
	}
	
	public static void updateAC(CharacterSheet charSheet) {
		charSheet.setAC(10 + charSheet.getArmorBonus() + charSheet.getShieldBonus() + charSheet.getDexMod() + charSheet.getSizeMod() + charSheet.getNaturalArmor() + charSheet.getDeflectionMod() + charSheet.getACMiscMod());
	}
	
	public static void updateTouch(CharacterSheet charSheet) {
		charSheet.setTouch(charSheet.getAC() - charSheet.getArmorBonus() - charSheet.getShieldBonus() - charSheet.getNaturalArmor());
	}
	
	public static void updateFlatFooted(CharacterSheet charSheet) {
		charSheet.setFlatFooted(charSheet.getAC() - charSheet.getDexMod());
	}
	
	public static void updateCMD(CharacterSheet charSheet) {
		charSheet.setCMD(charSheet.getBaseAttackBonus() + charSheet.getStrMod() + charSheet.getDexMod() + charSheet.getSizeMod() + 10);
	}
	
	public static void updateCMB(CharacterSheet charSheet) {
		charSheet.setCMB(charSheet.getBaseAttackBonus() + charSheet.getStrMod() + charSheet.getSizeMod());
	}
	
	public static void updateInitiative(CharacterSheet charSheet) {
		charSheet.setInitiative(charSheet.getDexMod() + charSheet.getInitiativeMiscMod());
	}
	
	public static void updateSaves(CharacterSheet charSheet) {
		charSheet.setFortitude(charSheet.getFortitudeBase() + charSheet.getConMod() + charSheet.getFortitudeMiscMod());
		charSheet.setFortitude(charSheet.getReflexBase() + charSheet.getDexMod() + charSheet.getReflexMiscMod());
		charSheet.setFortitude(charSheet.getWillBase() + charSheet.getWisMod() + charSheet.getWillMiscMod());
	}
	
	//assigns ability score modifiers for all abilities
	public static void assignAbilityScoreMods(CharacterSheet charSheet) {
		  charSheet.setStrMod(abilityScoreModCalc(charSheet.getStr()));
		  charSheet.setDexMod(abilityScoreModCalc(charSheet.getDex()));
		  charSheet.setConMod(abilityScoreModCalc(charSheet.getCon()));
		  charSheet.setIntMod(abilityScoreModCalc(charSheet.getInt()));
		  charSheet.setWisMod(abilityScoreModCalc(charSheet.getWis()));
		  charSheet.setChaMod(abilityScoreModCalc(charSheet.getCha()));
	}
	
	//calculates an ability score modifier
	public static int abilityScoreModCalc(int baseScore) {
		if(baseScore >= 10) {
			return (baseScore-10)/2;
		}
		else{
			return (baseScore-1-10)/2;
		}
	}
	
	//returns a random alignment
	public static CharacterAlignment randomAlignment() {
		int rand = dieRoller(9);
		CharacterAlignment align;
		if(rand == 1) {
			align = CharacterAlignment.CE;
		}else if(rand == 2) {
			align = CharacterAlignment.CG;
		}else if(rand == 3) {
			align = CharacterAlignment.CN;
		}else if(rand == 4) {
			align = CharacterAlignment.LE;
		}else if(rand == 5) {
			align = CharacterAlignment.LG;
		}else if(rand == 6) {
			align = CharacterAlignment.LN;
		}else if(rand == 7) {
			align = CharacterAlignment.N;
		}else if(rand == 8) {
			align = CharacterAlignment.NE;
		}else{
			align = CharacterAlignment.NG;
		}
		return align;
	}
	
	//assigns the initial class and race. Assumes there are no class or race assigned.
	public static void assignClassRace(CharacterSheet charSheet, CharacterClass charClass, CharacterRace charRace) {
		charSheet.setCharClass(charClass);
		charSheet.setCharRace(charRace);
	}
	
	//assign a rank value for every ability score values 0-5
	public static void assignBaseScoreRanking(CharacterSheet charSheet, int str, int dex, int con, int intel, int wis, int cha, int[] baseScores) {
		charSheet.setStr(baseScores[str]);
		charSheet.setCon(baseScores[con]);
		charSheet.setDex(baseScores[dex]);
		charSheet.setWis(baseScores[wis]);
		charSheet.setInt(baseScores[intel]);
		charSheet.setCha(baseScores[cha]);
	}
	
	//returns a sorted array of random new ability scores
	public static int[] generateBaseScores() {
		int scores[] = new int[6];
		scores[0] = generateBaseScore();
		scores[1] = generateBaseScore();
		scores[2] = generateBaseScore();
		scores[3] = generateBaseScore();
		scores[4] = generateBaseScore();
		scores[5] = generateBaseScore();
		Arrays.sort(scores);
		return scores;
	}
	
	//rolls 4 die, taking the 3 highest and returning them
	public static int generateBaseScore() {
		int scores[] = new int[4];
		scores[0] = dieRoller(6);
		scores[1] = dieRoller(6);
		scores[2] = dieRoller(6);
		scores[3] = dieRoller(6);
		Arrays.sort(scores);
		int baseScore = scores[1] + scores[2] + scores[3];
		//disallowing scores below 8 to avoid very weak characters
		if(baseScore < 8) {
			baseScore = generateBaseScore();
		}
		return baseScore;
	}
	
	//rolls a die
	public static int dieRoller(int die) {
		Random rand = new Random();
		return rand.nextInt(die) + 1;
	}

	//assigns the base stats. Assumes that no stats have been assigned (does not check previous values in stats)
	public static void assignBaseScores(CharacterSheet charSheet, CharacterClass charClass, int[] baseScores) {
		if(charClass == CharacterClass.BARBARIAN) {
			assignBaseScoreRanking(charSheet, 5, 3, 4, 1, 2, 0, baseScores);
		}else if(charClass == CharacterClass.BARD) {
			assignBaseScoreRanking(charSheet, 0, 4, 1, 3, 2, 5, baseScores);
		}else if(charClass == CharacterClass.CLERIC) {
			assignBaseScoreRanking(charSheet, 4, 3, 2, 1, 5, 0, baseScores);
		}else if(charClass == CharacterClass.DRUID) {
			assignBaseScoreRanking(charSheet, 2, 3, 4, 1, 5, 0, baseScores);
		}else if(charClass == CharacterClass.FIGHTER) {
			assignBaseScoreRanking(charSheet, 5, 3, 4, 1, 2, 0, baseScores);
		}else if(charClass == CharacterClass.MONK) {
			assignBaseScoreRanking(charSheet, 4, 2, 3, 1, 5, 0, baseScores);
		}else if(charClass == CharacterClass.PALADIN) {
			assignBaseScoreRanking(charSheet, 5, 0, 3, 2, 1, 4, baseScores);
		}else if(charClass == CharacterClass.RANGER) { //assuming dex based ranger (move str to top for str based)
			assignBaseScoreRanking(charSheet, 1, 5, 4, 2, 3, 0, baseScores);		
		}else if(charClass == CharacterClass.ROGUE) {
			assignBaseScoreRanking(charSheet, 0, 5, 1, 2, 4, 3, baseScores);
		}else if(charClass == CharacterClass.SORCERER) {
			assignBaseScoreRanking(charSheet, 0, 2, 4, 3, 1, 5, baseScores);
		}else if(charClass == CharacterClass.WIZARD) {
			assignBaseScoreRanking(charSheet, 0, 2, 4, 5, 1, 3, baseScores);
		}
	}
	
}
