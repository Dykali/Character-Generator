package Tables;
import java.util.ArrayList;
import java.util.List;
import CharacterSheet.CharacterClass;

//holds lists of all the spells
public class SpellLists {
	private List<Spell> zeroSpells;
	private List<Spell> firstSpells;
	private List<Spell> secondSpells;
	private List<Spell> thirdSpells;
	private List<Spell> fourthSpells;
	private List<Spell> fifthSpells;
	private List<Spell> sixthSpells;
	private List<Spell> seventhSpells;
	private List<Spell> eighthSpells;
	private List<Spell> ninthSpells;

	public SpellLists() {
		this.zeroSpells = makeZeroSpellList();
		this.firstSpells = makeFirstSpellList();
		this.secondSpells = makeSecondSpellList();
		this.thirdSpells = makeThirdSpellList();
		this.fourthSpells = makeFourthSpellList();
		this.fifthSpells = makeFifthSpellList();
		this.sixthSpells = makeSixthSpellList();
		this.seventhSpells = makeSeventhSpellList();
		this.eighthSpells = makeEighthSpellList();
		this.ninthSpells = makeNinthSpellList();
	}
	
	public List<Spell> getZeroSpells(){
		return this.zeroSpells;
	}
	
	public List<Spell> getFirstSpells(){
		return this.firstSpells;
	}
	
	public List<Spell> getSecondSpells(){
		return this.secondSpells;
	}
	
	public List<Spell> getThirdSpells(){
		return this.thirdSpells;
	}
	
	public List<Spell> getFourthSpells(){
		return this.fourthSpells;
	}
	
	public List<Spell> getFifthSpells(){
		return this.fifthSpells;
	}
	
	public List<Spell> getSixthSpells(){
		return this.sixthSpells;
	}
	
	public List<Spell> getSeventhSpells(){
		return this.seventhSpells;
	}
	
	public List<Spell> getEighthSpells(){
		return this.eighthSpells;
	}
	
	public List<Spell> getNinthSpells(){
		return this.ninthSpells;
	}
	
	//adds zero level spells to a list
	private List<Spell> makeZeroSpellList(){
		List<Spell> spellList = new ArrayList<Spell>();
		
		List<CharacterClass> classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		Spell spell = new Spell("Acid Splash", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Arcane Mark", School.UNIVERSAL, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Bleed", School.NECROMANCY, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		spell = new Spell("Create Water", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Dancing Lights", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Daze", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Detect Magic", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Detect Poison", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Disrupt Undead", School.NECROMANCY, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Flare", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Ghost Sound", School.ILLUSION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		spell = new Spell("Guidance", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.DRUID);
		spell = new Spell("Know Direction", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Light", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		spell = new Spell("Lullaby", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Mage Hand", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Mending", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Message", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Open/Close", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Prestidigitation", School.UNIVERSAL, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		spell = new Spell("Purify Food and Drink", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Ray of Frost", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Read Magic", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Resistance", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		spell = new Spell("Stabilize", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.BARD);
		spell = new Spell("Summon Instrument", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Touch of Fatigue", School.NECROMANCY, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		spell = new Spell("Virtue", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		return spellList;
	}
	
	//adds first level spells to a list
	private List<Spell> makeFirstSpellList(){
		List<Spell> spellList = new ArrayList<Spell>();
		
		List<CharacterClass> classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.RANGER);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		Spell spell = new Spell("Alarm", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Animate Rope", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		spell = new Spell("Bane", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.PALADIN);
		spell = new Spell("Bless", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.PALADIN);
		spell = new Spell("Bless Water", School.TRANSMUTATION, classList, SpellAlignment.GOOD);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.PALADIN);
		spell = new Spell("Bless Weapon", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Burning Hands", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Calm Animals", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);

		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Cause Feart", School.NECROMANCY, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Charm Animal", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Charm Person", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Chill Touch", School.NECROMANCY, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Color Spray", School.ILLUSION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		spell = new Spell("Command", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Comprehend Languages", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		spell = new Spell("Confusion, Lesser", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.PALADIN);
		spell = new Spell("Create Water", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.CLERIC);		
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.PALADIN);
		spell = new Spell("Cure Light Wounds", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);		
		spell = new Spell("Curse Water", School.NECROMANCY, classList, SpellAlignment.EVIL);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);		
		spell = new Spell("Deathwatch", School.NECROMANCY, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.RANGER);		
		spell = new Spell("Delay Poison", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);		
		spell = new Spell("Detect Animals or Plants", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);		
		spell = new Spell("Detect Chaos", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);		
		spell = new Spell("Detect Evil", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);		
		spell = new Spell("Detect Good", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);		
		spell = new Spell("Detect Law", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.PALADIN);
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Detect Poison", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Detect Secret Doors", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Detect Snares and Pits", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.PALADIN);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Detect Undead", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Disguise Self", School.ILLUSION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.PALADIN);
		spell = new Spell("Divine Favor", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		spell = new Spell("Doom", School.NECROMANCY, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.PALADIN);
		classList.add(CharacterClass.RANGER);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Endure Elements", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Enlarge Person", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Entangle", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		spell = new Spell("Entropic Shield", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Erase", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Expeditious Retreat", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		spell = new Spell("Faerie Fire", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Feather Fall", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Floating Disk", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		spell = new Spell("Goodberry", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Grease", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Hide From Animals", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		spell = new Spell("Hide From Undead", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		spell = new Spell("Hideous Laughter", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Hold Portal", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Hypnotism", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Identify", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		spell = new Spell("Inflict Light Wounds", School.NECROMANCY, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);		
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Jump", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);		
		spell = new Spell("Longstrider", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);	
		spell = new Spell("Mage Armor", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);	
		spell = new Spell("Magic Aura", School.ILLUSION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Magic Fang", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);	
		spell = new Spell("Magic Missile", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);	
		spell = new Spell("Magic Mouth", School.ILLUSION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);	
		spell = new Spell("Magic Stone", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.PALADIN);	
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Magic Weapon", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Mount", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		spell = new Spell("Obscure Object", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.DRUID);	
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Obscuring Mist", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);	
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Pass Without Trace", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);	
		spell = new Spell("Produce Flame", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);	
		classList.add(CharacterClass.PALADIN);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Protection from Chaos", School.ABJURATION, classList, SpellAlignment.LAWFUL);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);	
		classList.add(CharacterClass.PALADIN);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Protection from Evil", School.ABJURATION, classList, SpellAlignment.GOOD);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);	
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Protection from Good", School.ABJURATION, classList, SpellAlignment.EVIL);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);	
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Protection from Law", School.ABJURATION, classList, SpellAlignment.CHAOTIC);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Ray of Enfeeblement", School.NECROMANCY, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.PALADIN);
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Read Magic", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Reduce Person", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.CLERIC);
		spell = new Spell("Remove Fear", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.PALADIN);
		spell = new Spell("Resistance", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Resist Energy", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.PALADIN);
		spell = new Spell("Restoration, Lesser", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.CLERIC);
		spell = new Spell("Sanctuary", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Shield", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.CLERIC);
		spell = new Spell("Shield of Faith", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.DRUID);
		spell = new Spell("Shillelagh", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();	
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Shocking Grasp", School.EVOCATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Silent Image", School.ILLUSION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Sleep", School.ENCHANTMENT, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Speak With Animals", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.CLERIC);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Summon Monster I", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.DRUID);
		classList.add(CharacterClass.RANGER);
		spell = new Spell("Summon Nature's Ally I", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("True Strike", School.DIVINATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		spell = new Spell("Undetectable Alignment", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Unseen Servant", School.CONJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		spell = new Spell("Ventriloquism", School.ILLUSION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.PALADIN);
		spell = new Spell("Virtue", School.TRANSMUTATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		return spellList;
	}
	
	//adds first level spells to a list
	private List<Spell> makeSecondSpellList(){
		List<Spell> spellList = new ArrayList<Spell>();
		
		List<CharacterClass> classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.CLERIC);
		Spell spell = new Spell("Alarm", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		return spellList;
	}
	
	//adds first level spells to a list
	private List<Spell> makeThirdSpellList(){
		List<Spell> spellList = new ArrayList<Spell>();
		
		List<CharacterClass> classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.RANGER);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		Spell spell = new Spell("Alarm", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		return spellList;
	}
	
	//adds first level spells to a list
	private List<Spell> makeFourthSpellList(){
		List<Spell> spellList = new ArrayList<Spell>();
		
		List<CharacterClass> classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.RANGER);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		Spell spell = new Spell("Alarm", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		return spellList;
	}
	
	//adds first level spells to a list
	private List<Spell> makeFifthSpellList(){
		List<Spell> spellList = new ArrayList<Spell>();
		
		List<CharacterClass> classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.RANGER);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		Spell spell = new Spell("Alarm", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		return spellList;
	}
	
	//adds first level spells to a list
	private List<Spell> makeSixthSpellList(){
		List<Spell> spellList = new ArrayList<Spell>();
		
		List<CharacterClass> classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.RANGER);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		Spell spell = new Spell("Alarm", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		return spellList;
	}
	
	//adds first level spells to a list
	private List<Spell> makeSeventhSpellList(){
		List<Spell> spellList = new ArrayList<Spell>();
		
		List<CharacterClass> classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.RANGER);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		Spell spell = new Spell("Alarm", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		return spellList;
	}
	
	//adds first level spells to a list
	private List<Spell> makeEighthSpellList(){
		List<Spell> spellList = new ArrayList<Spell>();
		
		List<CharacterClass> classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.RANGER);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		Spell spell = new Spell("Alarm", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		return spellList;
	}
	
	//adds first level spells to a list
	private List<Spell> makeNinthSpellList(){
		List<Spell> spellList = new ArrayList<Spell>();
		
		List<CharacterClass> classList = new ArrayList<CharacterClass>();
		classList.add(CharacterClass.BARD);
		classList.add(CharacterClass.RANGER);
		classList.add(CharacterClass.SORCERER);
		classList.add(CharacterClass.WIZARD);
		Spell spell = new Spell("Alarm", School.ABJURATION, classList, SpellAlignment.NONE);
		spellList.add(spell);
		
		return spellList;
	}
}
