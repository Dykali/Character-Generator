package CharacterGenerator;

import CharacterSheet.CharacterAlignment;
import CharacterSheet.CharacterClass;
import CharacterSheet.CharacterSheet;
import Tables.School;
import Tables.Spell;
import Tables.SpellLists;
import java.util.List;

public class RandomSpellGenerator {
	//given a characters level, domain and alignment, assigns number of spells to that character
	public static void assignZeroSpells(CharacterSheet charSheet, int numberOfSpells, School school, CharacterAlignment alignment) {
		SpellLists spellList = new SpellLists();
		List<Spell> zeroSpells = spellList.getZeroSpells();
		CharacterClass charClass = charSheet.getCharClass();
		int len = zeroSpells.size();
		int rand = 1;
		int i = 0;
		while( i<numberOfSpells) {
			rand = RandomCharacterGenerator.dieRoller(len-1);
			Spell spell = zeroSpells.get(rand);
			if(classMatch(charClass, spell.getClassList()) && !nameMatch(spell.getName(), charSheet.getZeroSpellList())){
				charSheet.addZeroSpell(spell.getName());
				i++;
			}else {continue;}
		}
	}
	
	public static void assignFirstSpells(CharacterSheet charSheet, int numberOfSpells, School school, CharacterAlignment alignment) {
		SpellLists spellList = new SpellLists();
		List<Spell> firstSpells = spellList.getFirstSpells();
		CharacterClass charClass = charSheet.getCharClass();
		int len = firstSpells.size();
		int rand = 1;
		int i = 0;
		while( i<numberOfSpells) {
			rand = RandomCharacterGenerator.dieRoller(len-1);
			Spell spell = firstSpells.get(rand);
			if(classMatch(charClass, spell.getClassList()) && !nameMatch(spell.getName(), charSheet.getFirstSpellList())){
				charSheet.addFirstSpell(spell.getName());
				i++;
			}else {continue;}
		}
	}
	
	public static void assignAllZeroSpells(CharacterSheet charSheet, School school, CharacterAlignment alignment) {
		SpellLists spellList = new SpellLists();
		List<Spell> zeroSpells = spellList.getZeroSpells();
		CharacterClass charClass = charSheet.getCharClass();
		int len = zeroSpells.size();

		for(int i = 0; i<len; i++) {
			Spell spell = zeroSpells.get(i);
			if(classMatch(charClass, spell.getClassList()) && !nameMatch(spell.getName(), charSheet.getZeroSpellList())){
				charSheet.addZeroSpell(spell.getName());
			}else {continue;}
		}
	}
	
	public static void assignAllFirstSpells(CharacterSheet charSheet, School school, CharacterAlignment alignment) {
		SpellLists spellList = new SpellLists();
		List<Spell> firstSpells = spellList.getFirstSpells();
		CharacterClass charClass = charSheet.getCharClass();
		int len = firstSpells.size();

		for(int i = 0; i<len; i++) {
			Spell spell = firstSpells.get(i);
			if(classMatch(charClass, spell.getClassList()) && !nameMatch(spell.getName(), charSheet.getFirstSpellList())){
				charSheet.addFirstSpell(spell.getName());
			}else {continue;}
		}
	}
	
	public static boolean nameMatch(String spellName, List<String> knownSpells) {
		int len = knownSpells.size();
		for(int i = 0; i < len; i++) {
			if(knownSpells.get(i) == spellName) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean classMatch(CharacterClass charClass, List<CharacterClass> classList) {
		int len = classList.size();
		for(int i = 0; i < len; i++) {
			if(classList.get(i) == charClass) {
				return true;
			}
		}
		return false;
	}
	
	
	
}


