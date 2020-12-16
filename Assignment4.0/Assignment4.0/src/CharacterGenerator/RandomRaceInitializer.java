package CharacterGenerator;

import CharacterSheet.CharacterClass;
import CharacterSheet.CharacterRace;
import CharacterSheet.CharacterSheet;
import CharacterSheet.CharacterSize;
import CharacterSheet.Skill;

public class RandomRaceInitializer {

	//assign racial modifiers, abilities, etc
	public static void assignRacialBonuses(CharacterSheet charSheet, CharacterRace charRace) {
		if(charRace == CharacterRace.DWARF) {
			assignDwarfBonuses(charSheet);
		}else if(charRace == CharacterRace.ELF) {
			assignElfBonuses(charSheet);
		}else if(charRace == CharacterRace.GNOME) {
			assignGnomeBonuses(charSheet);
		}else if(charRace == CharacterRace.HALFELF) {
			assignHalfElfBonuses(charSheet);
		}else if(charRace == CharacterRace.HALFLING) {
			assignHalflingBonuses(charSheet);
		}else if(charRace == CharacterRace.HALFORC) {
			assignHalfOrcBonuses(charSheet);
		}else if(charRace == CharacterRace.HUMAN) {
			assignHumanBonuses(charSheet);
		}
	}
	
	public static void assignDwarfBonuses(CharacterSheet charSheet) {
		charSheet.setCon(charSheet.getCon() + 2);
		charSheet.setWis(charSheet.getWis() + 2);
		charSheet.setCha(charSheet.getCha() - 2);
		charSheet.setCharSize(CharacterSize.M);
		charSheet.setBaseSpeed(20);
		charSheet.setArmorSpeed(20);	
		charSheet.addSpecialAbility("[R]Darkvision(60 ft)");
		charSheet.addSpecialAbility("[R]Defensive Training");//+4 vs Giants
		charSheet.setACMiscMod(charSheet.getACMiscMod() + 4);
		charSheet.addSpecialAbility("[R]Greed");//+2 nonmagical items containing precious metals or gemstones
		charSheet.getAppraise().setMiscMod(charSheet.getAppraise().getMiscMod() + 2);
		charSheet.addSpecialAbility("[R]Hatred"); //+1 bonus on attacks vs orc/goblin
		charSheet.addSpecialAbility("[R]Hardy"); //+2 on saving throws vs poison, spells, spell-like abilities
		charSheet.addSpecialAbility("[R]Stability");//+4 CMD vs bull rush/trip
		charSheet.addSpecialAbility("[R]Stonecunning");//+2 vs unusual stonework
		Skill perception = charSheet.getPerception();
		int percMiscMod = perception.getMiscMod();
		perception.setMiscMod(percMiscMod + 2);
		charSheet.setPerception(perception);
		charSheet.addSpecialAbility("[R]Weapon Familiarity"); //weapon proficiency
		charSheet.addLanguage("Dwarven");
		charSheet.addLanguage("Common");
		//TODO: high int gets more lang choice
	}
	
	public static void assignElfBonuses(CharacterSheet charSheet) {
		charSheet.setDex(charSheet.getDex() + 2);
		charSheet.setInt(charSheet.getInt() + 2);
		charSheet.setCon(charSheet.getCon() - 2);
		charSheet.setCharSize(CharacterSize.M);
		charSheet.setBaseSpeed(30);
		charSheet.addSpecialAbility("[R]Low-Light Vision");
		charSheet.addSpecialAbility("[R]Elven Immunities");
		charSheet.addSpecialAbility("[R]Elven Magic");
		charSheet.addSpecialAbility("[R]Keen Senses");
		charSheet.getPerception().setMiscMod(charSheet.getPerception().getMiscMod() + 2);
		charSheet.addSpecialAbility("[R]Weapon Familiarity");
		charSheet.addLanguage("Common");
		charSheet.addLanguage("Elven");
		//TODO high int get lang choice
	}
	
	public static void assignGnomeBonuses(CharacterSheet charSheet) {
		charSheet.setCon(charSheet.getCon() + 2);
		charSheet.setCha(charSheet.getCha() + 2);
		charSheet.setStr(charSheet.getStr() - 2);
		//small size
		charSheet.setCharSize(CharacterSize.S);
		charSheet.setSizeMod(1);
		charSheet.setBaseAttackBonus(charSheet.getBaseAttackBonus() + 1);
		charSheet.getStealth().setMiscMod(charSheet.getStealth().getMiscMod() + 4);
		charSheet.setBaseSpeed(20);
		charSheet.addSpecialAbility("[R]Defensive Training");//+4 vs Giants
		charSheet.setACMiscMod(charSheet.getACMiscMod() + 4);
		charSheet.addSpecialAbility("[R]Gnome Magic");
		charSheet.addSpecialAbility("[R]Hatred"); //+1 bonus on attacks vs reptilian/goblinoid
		charSheet.addSpecialAbility("[R]Illusion Resistance");
		charSheet.addSpecialAbility("[R]Keen Senses");
		charSheet.getPerception().setMiscMod(charSheet.getPerception().getMiscMod() + 2);
		charSheet.addSpecialAbility("[R]Obsessive");
		charSheet.addSpecialAbility("[R]Weapon Familiarity");
		charSheet.addLanguage("Common");
		charSheet.addLanguage("Gnome");
		charSheet.addLanguage("Sylvan");
		//TODO high int get lang choice
	}
	
	public static void assignHalfElfBonuses(CharacterSheet charSheet) {
		RandomClassInitializer.modifyHighestScore(charSheet, charSheet.getCharClass(), 2);
		charSheet.setCharSize(CharacterSize.M);
		charSheet.setBaseSpeed(30);
		charSheet.addSpecialAbility("[R]Low-Light Vision");
		charSheet.addSpecialAbility("[R]Adaptability");
		charSheet.addFeat("[R]Skill Focus");
		charSheet.addSpecialAbility("[R]Elf Blood");
		charSheet.addSpecialAbility("[R]Elven Immunities");
		charSheet.addSpecialAbility("[R]Keen Senses");
		charSheet.getPerception().setMiscMod(charSheet.getPerception().getMiscMod() + 2);
		charSheet.addSpecialAbility("[R]Multitalented");
		charSheet.addLanguage("Common");
		charSheet.addLanguage("Elven");
		//TODO high int get lang choice
	}
	
	public static void assignHalflingBonuses(CharacterSheet charSheet) {
		charSheet.setDex(charSheet.getDex() + 2);
		charSheet.setCha(charSheet.getCha() + 2);
		charSheet.setStr(charSheet.getStr() - 2);
		//small size
		charSheet.setCharSize(CharacterSize.S);
		charSheet.setSizeMod(1);
		charSheet.setBaseAttackBonus(charSheet.getBaseAttackBonus() + 1);
		charSheet.getStealth().setMiscMod(charSheet.getStealth().getMiscMod() + 4);
		charSheet.setBaseSpeed(20);
		charSheet.addSpecialAbility("[R]Fearless");
		charSheet.addSpecialAbility("[R]Halfling Luck");
		charSheet.addSpecialAbility("[R]Keen Senses");
		charSheet.getPerception().setMiscMod(charSheet.getPerception().getMiscMod() + 2);
		charSheet.addSpecialAbility("[R]Sure-Footed");
		charSheet.getAcrobatics().setMiscMod(charSheet.getAcrobatics().getMiscMod() + 2);
		charSheet.getClimb().setMiscMod(charSheet.getClimb().getMiscMod() + 2);
		charSheet.addLanguage("Common");
		charSheet.addLanguage("Halfling");
		//TODO high int get lang choice
	}
	
	public static void assignHalfOrcBonuses(CharacterSheet charSheet) {
		RandomClassInitializer.modifyHighestScore(charSheet, charSheet.getCharClass(), 2);
		charSheet.setCharSize(CharacterSize.M);
		charSheet.setBaseSpeed(30);
		charSheet.addSpecialAbility("[R]Darkvision(60 ft)");
		charSheet.addSpecialAbility("[R]Intimidating");
		charSheet.getIntimidate().setMiscMod(charSheet.getIntimidate().getMiscMod() + 2);
		charSheet.addSpecialAbility("[R]Orc Blood");
		charSheet.addSpecialAbility("[R]Orc Ferocity");
		charSheet.addSpecialAbility("[R]Weapon Familiarity");
		charSheet.addLanguage("Common");
		charSheet.addLanguage("Orc");
		//TODO high int get lang choice
	}
	
	public static void assignHumanBonuses(CharacterSheet charSheet) {
		RandomClassInitializer.modifyHighestScore(charSheet, charSheet.getCharClass(), 2);
		charSheet.setCharSize(CharacterSize.M);
		charSheet.setBaseSpeed(30);
		charSheet.addSpecialAbility("[R]Bonus Feat");
		charSheet.addSpecialAbility("[R]Skilled");
		charSheet.addLanguage("Common");
		//TODO high int get lang choice
	}

	public static void assignAgeModifiers(CharacterSheet charSheet) {
		CharacterRace charRace = charSheet.getCharRace();
		CharacterClass charClass = charSheet.getCharClass();
		if(charRace == CharacterRace.DWARF) {
			RandomRaceInitializer.assignAgeModValues(charSheet, 3, 5, 7, 6, charClass);
		}else if(charRace == CharacterRace.ELF) {
			RandomRaceInitializer.assignAgeModValues(charSheet, 4, 6, 10, 6, charClass);
		}else if(charRace == CharacterRace.GNOME) {
			RandomRaceInitializer.assignAgeModValues(charSheet, 4, 6, 9, 6, charClass);
		}else if(charRace == CharacterRace.HALFELF) {
			RandomRaceInitializer.assignAgeModValues(charSheet, 1, 2, 3, 6, charClass);
		}else if(charRace == CharacterRace.HALFLING) {
			RandomRaceInitializer.assignAgeModValues(charSheet, 2, 3, 4, 6, charClass);
		}else if(charRace == CharacterRace.HALFORC) {
			RandomRaceInitializer.assignAgeModValues(charSheet, 1, 1, 2, 6, charClass);
		}else if(charRace == CharacterRace.HUMAN) {
			RandomRaceInitializer.assignAgeModValues(charSheet, 1, 1, 2, 6, charClass);
		}	
	}

	//generates a unique character description
	public static void assignDescriptors(CharacterSheet charSheet) {
		CharacterRace charRace = charSheet.getCharRace();
		if(charRace == CharacterRace.DWARF) {
			int rand = RandomCharacterGenerator.dieRoller(2);
			if(rand == 1) {
				charSheet.setGender("M");
				rand = RandomCharacterGenerator.dieRoller(6);
				if(rand == 1) {
					charSheet.setCharacterName("Dolgrin");
				}else if(rand == 2) {
					charSheet.setCharacterName("Grunyar");
				}else if(rand == 3) {
					charSheet.setCharacterName("Harsk");
				}else if(rand == 4) {
					charSheet.setCharacterName("Kazmuk");
				}else if(rand == 5) {
					charSheet.setCharacterName("Morgrym");
				}else if(rand == 6) {
					charSheet.setCharacterName("Rogar");
				}
				rand = RandomCharacterGenerator.dieRoller(4) + RandomCharacterGenerator.dieRoller(4);
				charSheet.setHeight(3*12+9+rand);
				charSheet.setWeight(150+rand*7);
				charSheet.setAge(40);
			}else {
				charSheet.setGender("F");
				rand = RandomCharacterGenerator.dieRoller(6);
				if(rand == 1) {
					charSheet.setCharacterName("Agna");
				}else if(rand == 2) {
					charSheet.setCharacterName("Bodill");
				}else if(rand == 3) {
					charSheet.setCharacterName("Ingra");
				}else if(rand == 4) {
					charSheet.setCharacterName("Kotri");
				}else if(rand == 5) {
					charSheet.setCharacterName("Rusilka");
				}else if(rand == 6) {
					charSheet.setCharacterName("Yangrit");
				}
				rand = RandomCharacterGenerator.dieRoller(4)+RandomCharacterGenerator.dieRoller(4);
				charSheet.setHeight(3*12+7+rand);
				charSheet.setWeight(120+rand*7);
				charSheet.setAge(40);
			}
		}else if(charRace == CharacterRace.ELF) {
			int rand = RandomCharacterGenerator.dieRoller(2);
			if(rand == 1) {
				charSheet.setGender("M");
				rand = RandomCharacterGenerator.dieRoller(8);
				if(rand == 1) {
					charSheet.setCharacterName("Caladrel");
				}else if(rand == 2) {
					charSheet.setCharacterName("Heldalel");
				}else if(rand == 3) {
					charSheet.setCharacterName("Lanliss");
				}else if(rand == 4) {
					charSheet.setCharacterName("Meirdrarel");
				}else if(rand == 5) {
					charSheet.setCharacterName("Seldlon");
				}else if(rand == 6) {
					charSheet.setCharacterName("Talathel");
				}else if(rand == 7) {
					charSheet.setCharacterName("Variel");
				}else if(rand == 8) {
					charSheet.setCharacterName("Zordlon");
				}
				rand = RandomCharacterGenerator.dieRoller(8)+RandomCharacterGenerator.dieRoller(8);
				charSheet.setHeight(5*12+4+rand);
				charSheet.setWeight(100+rand*3);
				charSheet.setAge(110);
			}else {
				charSheet.setGender("F");
				rand = RandomCharacterGenerator.dieRoller(9);
				if(rand == 1) {
					charSheet.setCharacterName("Amrunelara");
				}else if(rand == 2) {
					charSheet.setCharacterName("Dardlara");
				}else if(rand == 3) {
					charSheet.setCharacterName("Faunra");
				}else if(rand == 4) {
					charSheet.setCharacterName("Jathal");
				}else if(rand == 5) {
					charSheet.setCharacterName("Merisiel");
				}else if(rand == 6) {
					charSheet.setCharacterName("Oparal");
				}else if(rand == 7) {
					charSheet.setCharacterName("Soumral");
				}else if(rand == 8) {
					charSheet.setCharacterName("Tessara");
				}else if(rand == 9) {
					charSheet.setCharacterName("Yalandlara");
				}
				rand = RandomCharacterGenerator.dieRoller(6)+RandomCharacterGenerator.dieRoller(6);
				charSheet.setHeight(5*12+4+rand);
				charSheet.setWeight(90+rand*3);
				charSheet.setAge(110);
			}
		}else if(charRace == CharacterRace.GNOME) {
			int rand = RandomCharacterGenerator.dieRoller(2);
			if(rand == 1) {
				charSheet.setGender("M");
				rand = RandomCharacterGenerator.dieRoller(7);
				if(rand == 1) {
					charSheet.setCharacterName("Abroshtor");
				}else if(rand == 2) {
					charSheet.setCharacterName("Bastargre");
				}else if(rand == 3) {
					charSheet.setCharacterName("Halungalom");
				}else if(rand == 4) {
					charSheet.setCharacterName("Krolmnite");
				}else if(rand == 5) {
					charSheet.setCharacterName("Poshment");
				}else if(rand == 6) {
					charSheet.setCharacterName("Zarzuket");
				}else if(rand == 7) {
					charSheet.setCharacterName("Zatqualmie");
				}
				rand = RandomCharacterGenerator.dieRoller(4)+RandomCharacterGenerator.dieRoller(4);
				charSheet.setHeight(3*12+0+rand);
				charSheet.setWeight(35+rand*1);
				charSheet.setAge(40);
			}else {
				charSheet.setGender("F");
				rand = RandomCharacterGenerator.dieRoller(8);
				if(rand == 1) {
					charSheet.setCharacterName("Besh");
				}else if(rand == 2) {
					charSheet.setCharacterName("Fijit");
				}else if(rand == 3) {
					charSheet.setCharacterName("Lini");
				}else if(rand == 4) {
					charSheet.setCharacterName("Neji");
				}else if(rand == 5) {
					charSheet.setCharacterName("Majet");
				}else if(rand == 6) {
					charSheet.setCharacterName("Pai");
				}else if(rand == 7) {
					charSheet.setCharacterName("Queck");
				}else if(rand == 8) {
					charSheet.setCharacterName("Trig");
				}
				rand = RandomCharacterGenerator.dieRoller(4)+RandomCharacterGenerator.dieRoller(4);
				charSheet.setHeight(2*12+10+rand);
				charSheet.setWeight(30+rand*1);
				charSheet.setAge(40);
			}
		}else if(charRace == CharacterRace.HALFELF) {
			int rand = RandomCharacterGenerator.dieRoller(2);
			if(rand == 1) {
				charSheet.setGender("M");
				rand = RandomCharacterGenerator.dieRoller(8);
				if(rand == 1) {
					charSheet.setCharacterName("Calathes");
				}else if(rand == 2) {
					charSheet.setCharacterName("Encinal");
				}else if(rand == 3) {
					charSheet.setCharacterName("Kyras");
				}else if(rand == 4) {
					charSheet.setCharacterName("Narciso");
				}else if(rand == 5) {
					charSheet.setCharacterName("Quiray");
				}else if(rand == 6) {
					charSheet.setCharacterName("Satinder");
				}else if(rand == 7) {
					charSheet.setCharacterName("Seltyriel");
				}else if(rand == 8) {
					charSheet.setCharacterName("Zirul");
				}
				rand = RandomCharacterGenerator.dieRoller(8)+RandomCharacterGenerator.dieRoller(8);
				charSheet.setHeight(5*12+2+rand);
				charSheet.setWeight(110+rand*5);
				charSheet.setAge(20);
			}else {
				charSheet.setGender("F");
				rand = RandomCharacterGenerator.dieRoller(8);
				if(rand == 1) {
					charSheet.setCharacterName("Cathran");
				}else if(rand == 2) {
					charSheet.setCharacterName("Elsbeth");
				}else if(rand == 3) {
					charSheet.setCharacterName("Iandoli");
				}else if(rand == 4) {
					charSheet.setCharacterName("Kieyanna");
				}else if(rand == 5) {
					charSheet.setCharacterName("Lialda");
				}else if(rand == 6) {
					charSheet.setCharacterName("Maddela");
				}else if(rand == 7) {
					charSheet.setCharacterName("Reda");
				}else if(rand == 8) {
					charSheet.setCharacterName("Tamarie");
				}
				rand = RandomCharacterGenerator.dieRoller(8)+RandomCharacterGenerator.dieRoller(8);
				charSheet.setHeight(5*12+0+rand);
				charSheet.setWeight(90+rand*5);
				charSheet.setAge(20);
			}
		}else if(charRace == CharacterRace.HALFLING) {
			int rand = RandomCharacterGenerator.dieRoller(2);
			if(rand == 1) {
				charSheet.setGender("M");
				rand = RandomCharacterGenerator.dieRoller(8);
				if(rand == 1) {
					charSheet.setCharacterName("Antal");
				}else if(rand == 2) {
					charSheet.setCharacterName("Boram");
				}else if(rand == 3) {
					charSheet.setCharacterName("Evan");
				}else if(rand == 4) {
					charSheet.setCharacterName("Jamir");
				}else if(rand == 5) {
					charSheet.setCharacterName("Kaleb");
				}else if(rand == 6) {
					charSheet.setCharacterName("Lem");
				}else if(rand == 7) {
					charSheet.setCharacterName("Miro");
				}else if(rand == 8) {
					charSheet.setCharacterName("Sumak");
				}
				rand = RandomCharacterGenerator.dieRoller(4)+RandomCharacterGenerator.dieRoller(4);
				charSheet.setHeight(2*12+8+rand);
				charSheet.setWeight(30 + rand*1);
				charSheet.setAge(20);
			}else {
				charSheet.setGender("F");
				rand = RandomCharacterGenerator.dieRoller(9);
				if(rand == 1) {
					charSheet.setCharacterName("Anafa");
				}else if(rand == 2) {
					charSheet.setCharacterName("Bellis");
				}else if(rand == 3) {
					charSheet.setCharacterName("Etune");
				}else if(rand == 4) {
					charSheet.setCharacterName("Filiu");
				}else if(rand == 5) {
					charSheet.setCharacterName("Lissa");
				}else if(rand == 6) {
					charSheet.setCharacterName("Marra");
				}else if(rand == 7) {
					charSheet.setCharacterName("Rillka");
				}else if(rand == 8) {
					charSheet.setCharacterName("Sistra");
				}else if(rand == 9) {
					charSheet.setCharacterName("Yamyra");
				}
				rand = RandomCharacterGenerator.dieRoller(4) + RandomCharacterGenerator.dieRoller(4);
				charSheet.setHeight(2*12+6+rand);
				charSheet.setWeight(25 + rand*1);
				charSheet.setAge(20);
			}
		}else if(charRace == CharacterRace.HALFORC) {
			int rand = RandomCharacterGenerator.dieRoller(2);
			if(rand == 1) {
				charSheet.setGender("M");
				rand = RandomCharacterGenerator.dieRoller(7);
				if(rand == 1) {
					charSheet.setCharacterName("Ausk");
				}else if(rand == 2) {
					charSheet.setCharacterName("Davor");
				}else if(rand == 3) {
					charSheet.setCharacterName("Hakak");
				}else if(rand == 4) {
					charSheet.setCharacterName("Kizziar");
				}else if(rand == 5) {
					charSheet.setCharacterName("Makoa");
				}else if(rand == 6) {
					charSheet.setCharacterName("Nesteruk");
				}else if(rand == 7) {
					charSheet.setCharacterName("Tsadok");
				}
				rand = RandomCharacterGenerator.dieRoller(12) + RandomCharacterGenerator.dieRoller(12);
				charSheet.setHeight(4*12+10+rand);
				charSheet.setWeight(150+rand*7);
				charSheet.setAge(14);
			}else {
				charSheet.setGender("F");
				rand = RandomCharacterGenerator.dieRoller(7);
				if(rand == 1) {
					charSheet.setCharacterName("Canan");
				}else if(rand == 2) {
					charSheet.setCharacterName("Drogheda");
				}else if(rand == 3) {
					charSheet.setCharacterName("Goruza");
				}else if(rand == 4) {
					charSheet.setCharacterName("Mazon");
				}else if(rand == 5) {
					charSheet.setCharacterName("Shirish");
				}else if(rand == 6) {
					charSheet.setCharacterName("Tevaga");
				}else if(rand == 7) {
					charSheet.setCharacterName("Zeljka");
				}
				rand = RandomCharacterGenerator.dieRoller(12)+RandomCharacterGenerator.dieRoller(12);
				charSheet.setHeight(4*12+5+rand);
				charSheet.setWeight(110+rand*7);
				charSheet.setAge(14);
			}
		}else if(charRace == CharacterRace.HUMAN) {
			int rand = RandomCharacterGenerator.dieRoller(2);
			if(rand == 1) {
				charSheet.setGender("M");
				rand = RandomCharacterGenerator.dieRoller(8);
				if(rand == 1) {
					charSheet.setCharacterName("Desmond");
				}else if(rand == 2) {
					charSheet.setCharacterName("Thoma");
				}else if(rand == 3) {
					charSheet.setCharacterName("Dipaka");
				}else if(rand == 4) {
					charSheet.setCharacterName("Phinees");
				}else if(rand == 5) {
					charSheet.setCharacterName("Felicius");
				}else if(rand == 6) {
					charSheet.setCharacterName("Chike");
				}else if(rand == 7) {
					charSheet.setCharacterName("Vladimir");
				}else if(rand == 8) {
					charSheet.setCharacterName("John");
				}
				rand = RandomCharacterGenerator.dieRoller(10)+RandomCharacterGenerator.dieRoller(10);
				charSheet.setHeight(4*12+10+rand);
				charSheet.setWeight(120+rand*5);
				charSheet.setAge(15);
			}else {
				charSheet.setGender("F");
				rand = RandomCharacterGenerator.dieRoller(9);
				if(rand == 1) {
					charSheet.setCharacterName("Jane");
				}else if(rand == 2) {
					charSheet.setCharacterName("Matilda");
				}else if(rand == 3) {
					charSheet.setCharacterName("Lestari");
				}else if(rand == 4) {
					charSheet.setCharacterName("Sonja");
				}else if(rand == 5) {
					charSheet.setCharacterName("Meera");
				}else if(rand == 6) {
					charSheet.setCharacterName("Priya");
				}else if(rand == 7) {
					charSheet.setCharacterName("Simin");
				}else if(rand == 8) {
					charSheet.setCharacterName("Ginette");
				}else if(rand == 9) {
					charSheet.setCharacterName("Shura");
				}
				rand = RandomCharacterGenerator.dieRoller(10)+RandomCharacterGenerator.dieRoller(10);
				charSheet.setHeight(4*12+5+rand);
				charSheet.setWeight(85+rand*5);
				charSheet.setAge(15);
			}
		}
		assignAgeModifiers(charSheet);
	}

	//outputs a new race
	public static CharacterRace generateRandomRace() {
		int raceScore = RandomCharacterGenerator.dieRoller(7);
		if(raceScore == 1) {
			return CharacterRace.DWARF;
		}else if(raceScore == 2) {
			return CharacterRace.ELF;
		}else if(raceScore == 3) {
			return CharacterRace.GNOME;
		}else if(raceScore == 4) {
			return CharacterRace.HALFELF;
		}else if(raceScore == 5) {
			return CharacterRace.HALFLING;
		}else if(raceScore == 6) {
			return CharacterRace.HALFORC;
		}else {
			return CharacterRace.HUMAN;
		}
	}

	public static void assignAgeModValues(CharacterSheet charSheet, int val1, int val2, int val3, int die, CharacterClass charClass) {
		CharacterRace charRace = charSheet.getCharRace();
		int die1 = die;
		if(charRace == CharacterRace.HUMAN || charRace == CharacterRace.HALFORC || charRace == CharacterRace.HALFLING) {
			die1 = 4;
		}
		if(charClass == CharacterClass.BARBARIAN || charClass == CharacterClass.ROGUE || charClass == CharacterClass.SORCERER) {
			charSheet.setAge(charSheet.getAge() + val1*RandomCharacterGenerator.dieRoller(die1));
		}
		if(charClass == CharacterClass.BARD || charClass == CharacterClass.FIGHTER || charClass == CharacterClass.PALADIN || charClass == CharacterClass.RANGER) {
			charSheet.setAge(charSheet.getAge() + val2*RandomCharacterGenerator.dieRoller(die));
		}
		if(charClass == CharacterClass.CLERIC || charClass == CharacterClass.DRUID || charClass == CharacterClass.MONK || charClass == CharacterClass.WIZARD) {
			charSheet.setAge(charSheet.getAge() + val3*RandomCharacterGenerator.dieRoller(die));
		}
	}

}
