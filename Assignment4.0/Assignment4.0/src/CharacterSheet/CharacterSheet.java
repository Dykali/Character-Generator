package CharacterSheet;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

//A CharacterSheet holds nearly all the information about a character.
//This is the main class to pull data directly from to fill out the fields of a character sheet.
//The values held in the sheet will be modified and initialized within the CharacterGenerator.
public class CharacterSheet {
	private int str, dex, con, intel, wis, cha;
	private int strMod, dexMod, conMod, intMod, wisMod, chaMod;
	private int ac, hp, dr, touch, flatFooted, acMiscMod, armorBonus, shieldBonus, naturalArmor, deflectionMod;
	private int fortitude, reflex, will, fortitudeBase, reflexBase, willBase, fortitudeMiscMod, reflexMiscMod, willMiscMod;
	private int baseAttackBonus, spellResistance;
	private int CMB, CMD;
	private int sizeMod;
	private String characterName, playerName;
	private String diety, homeland, gender, hair, eyes;
	private int age, height, weight;
	private int baseSpeed, armorSpeed, flySpeed, swimSpeed, climbSpeed, burrowSpeed;
	private CharacterAlignment alignment;
	private CharacterClass charClass;
	private CharacterRace charRace;
	private CharacterSize charSize;
	private int initiative, initiativeMiscMod;
	private int zeroSpellsKnown, zeroSpellSaveDC, zeroSpellsPerDay, firstSpellsKnown, firstSpellSaveDC, firstSpellsPerDay, firstBonusSpells;
	private List<String> languages;
	private List<String> feats;
	private List<String> specialAbilities;
	private List<String> CMBCMDMods;
	private List<String> savingThrowMods;
	private List<String> domainsSchools;
	private List<String> zeroSpellList;
	private List<String> firstSpellList;
	private List<Skill> skillList;
	//TODO:add modifiers list for saving throws and CMB/CMD
	//private List<String> savingThrowMods;
	//private List<string> CMBCMDMods;
	private int experience, nextLevelxp;
	private int cp, sp, gp, pp;
	
	//All of the skills a character can know
	private Skill acrobatics;
	private Skill appraise;
	private Skill bluff;
	private Skill climb;
	private Skill craft1;
	private Skill craft2;
	private Skill craft3;
	private Skill diplomacy;
	private Skill disableDevice;
	private Skill disguise;
	private Skill escapeArtist;
	private Skill fly;
	private Skill handleAnimal;
	private Skill heal;
	private Skill intimidate;
	private Skill knowledgeArcana;
	private Skill knowledgeDungeoneering;
	private Skill knowledgeEngineering;
	private Skill knowledgeGeography;
	private Skill knowledgeHistory;
	private Skill knowledgeLocal;
	private Skill knowledgeNature;
	private Skill knowledgeNobility;
	private Skill knowledgePlanes;
	private Skill knowledgeReligion;
	private Skill linguistics;
	private Skill perception;
	private Skill perform1;
	private Skill perform2;
	private Skill profession1;
	private Skill profession2;
	private Skill ride;
	private Skill senseMotive;
	private Skill sleightOfHand;
	private Skill spellcraft;
	private Skill stealth;
	private Skill survival;
	private Skill swim;
	private Skill useMagicDevice;
	
	public CharacterSheet() {
		this.str = this.dex = this.con = this.intel = this.wis = this.cha = 0;
		this.strMod = this.dexMod = this.conMod = this.intMod = this.wisMod = this.chaMod = 0;
		this.ac = 10;
		this.hp = this.dr = this.touch = this.flatFooted = this.acMiscMod = this.armorBonus = this.shieldBonus = this.naturalArmor = this.deflectionMod = 0;
		this.fortitude = this.reflex = this.will = this.fortitudeBase = this.reflexBase = this.willBase = this.fortitudeMiscMod = this.reflexMiscMod = this.willMiscMod = 0;
		this.baseAttackBonus = this.spellResistance = 0;
		this.CMB = this.CMD = 0;
		this.sizeMod = 0;
		this.age = this.height = this.weight = 0;
		this.baseSpeed = this.armorSpeed = this.flySpeed = this.swimSpeed = this.climbSpeed = this.burrowSpeed = 0;
		this.initiative = this.initiativeMiscMod = 0;
		this.zeroSpellsKnown = this.zeroSpellSaveDC = this.zeroSpellsPerDay = this.firstSpellsKnown = this.firstSpellSaveDC = this.firstSpellsPerDay = this.firstBonusSpells = 0;
		this.experience = this.nextLevelxp = 0;
		this.cp = this.sp = this.gp = this.pp = 0;
		this.characterName = this.playerName = "";
		this.diety = this.homeland = this.gender = this.hair = this.eyes;
		this.languages = new ArrayList<String>();
		this.feats = new ArrayList<String>();
		this.specialAbilities = new ArrayList<String>();
		this.CMBCMDMods = new ArrayList<String>();
		this.savingThrowMods = new ArrayList<String>();
		this.domainsSchools = new ArrayList<String>();
		this.zeroSpellList = new ArrayList<String>();
		this.firstSpellList = new ArrayList<String>();
		this.skillList = new ArrayList<Skill>();
		this.alignment = CharacterAlignment.N;
		this.charClass = CharacterClass.BARBARIAN;
		this.charRace = CharacterRace.DWARF;
		this.charSize = CharacterSize.M;
		this.acrobatics = new Skill();
		this.skillList.add(this.acrobatics);
		this.appraise = new Skill();
		this.skillList.add(this.appraise);
		this.bluff = new Skill();
		this.skillList.add(this.bluff);
		this.climb = new Skill();
		this.skillList.add(this.climb);
		this.craft1 = new Skill();
		this.skillList.add(this.craft1);
		this.craft2 = new Skill();
		this.skillList.add(this.craft2);
		this.craft3 = new Skill();
		this.skillList.add(this.craft3);
		this.diplomacy = new Skill();
		this.skillList.add(this.diplomacy);
		this.disableDevice = new Skill();
		this.skillList.add(this.disableDevice);
		this.disguise = new Skill();
		this.skillList.add(this.disguise);
		this.escapeArtist = new Skill();
		this.skillList.add(this.escapeArtist);
		this.fly = new Skill();
		this.skillList.add(this.fly);
		this.handleAnimal = new Skill();
		this.skillList.add(this.handleAnimal);
		this.heal = new Skill();
		this.skillList.add(this.heal);
		this.intimidate = new Skill();
		this.skillList.add(this.intimidate);
		this.knowledgeArcana = new Skill();
		this.skillList.add(this.knowledgeArcana);
		this.knowledgeDungeoneering = new Skill();
		this.skillList.add(this.knowledgeDungeoneering);
		this.knowledgeEngineering = new Skill();
		this.skillList.add(this.knowledgeEngineering);
		this.knowledgeGeography = new Skill();
		this.skillList.add(this.knowledgeGeography);
		this.knowledgeHistory = new Skill();
		this.skillList.add(this.knowledgeHistory);
		this.knowledgeLocal = new Skill();
		this.skillList.add(this.knowledgeLocal);
		this.knowledgeNature = new Skill();
		this.skillList.add(this.knowledgeNature);
		this.knowledgeNobility = new Skill();
		this.skillList.add(this.knowledgeNobility);
		this.knowledgePlanes = new Skill();
		this.skillList.add(this.knowledgePlanes);
		this.knowledgeReligion = new Skill();
		this.skillList.add(this.knowledgeReligion);
		this.linguistics = new Skill();
		this.skillList.add(this.linguistics);
		this.perception = new Skill();
		this.skillList.add(this.perception);
		this.perform1 = new Skill();
		this.skillList.add(this.perform1);
		this.perform2 = new Skill();
		this.skillList.add(this.perform2);
		this.profession1 = new Skill();
		this.skillList.add(this.profession1);
		this.profession2 = new Skill();
		this.skillList.add(this.profession2);
		this.ride = new Skill();
		this.skillList.add(this.ride);
		this.senseMotive = new Skill();
		this.skillList.add(this.senseMotive);
		this.sleightOfHand = new Skill();
		this.skillList.add(this.sleightOfHand);
		this.spellcraft = new Skill();
		this.skillList.add(this.spellcraft);
		this.stealth = new Skill();
		this.skillList.add(this.stealth);
		this.survival = new Skill();
		this.skillList.add(this.survival);
		this.swim = new Skill();
		this.skillList.add(this.swim);
		this.useMagicDevice = new Skill();
		this.skillList.add(this.useMagicDevice);
	}
	
	//getters and setters for core ability scores
	public int getStr() {
		return this.str;
	}
	
	public int getDex() {
		return this.dex;
	}
	
	public int getCon() {
		return this.con;
	}
	
	public int getInt() {
		return this.intel;
	}
	
	public int getWis() {
		return this.wis;
	}
	
	public int getCha() {
		return this.cha;
	}
	
	public void setStr(int str) {
		this.str = str;
	}
	
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	public void setCon(int con) {
		this.con = con;
	}
	
	public void setInt(int intel) {
		this.intel = intel;
	}
	
	public void setWis(int wis) {
		this.wis = wis;
	}
	
	public void setCha(int cha) {
		this.cha = cha;
	}
	
	//getters and setters for core ability score modifiers
	public int getStrMod() {
		return this.strMod;
	}
	
	public int getDexMod() {
		return this.dexMod;
	}
	
	public int getConMod() {
		return this.conMod;
	}
	
	public int getIntMod() {
		return this.intMod;
	}
	
	public int getWisMod() {
		return this.wisMod;
	}
	
	public int getChaMod() {
		return this.chaMod;
	}
	
	public void setStrMod(int strMod) {
		this.strMod = strMod;
	}
	
	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}
	
	public void setConMod(int conMod) {
		this.conMod = conMod;
	}
	
	public void setIntMod(int intelMod) {
		this.intMod = intelMod;
	}
	
	public void setWisMod(int wisMod) {
		this.wisMod = wisMod;
	}
	
	public void setChaMod(int chaMod) {
		this.chaMod = chaMod;
	}
	
	//mostly armor related getters and setters
	public int getAC() {
		return this.ac;
	}
	
	public void setAC(int ac) {
		this.ac = ac;
	}
	
	public int getACMiscMod() {
		return this.acMiscMod;
	}
	
	public void setACMiscMod(int acMiscMod) {
		this.acMiscMod = acMiscMod;
	}
	
	public int getArmorBonus() {
		return this.armorBonus;
	}
	
	public void setArmorBonus(int armorBonus) {
		this.armorBonus = armorBonus;
	}
	
	public int getShieldBonus() {
		return this.shieldBonus;
	}
	
	public void setShieldBonus(int shieldBonus) {
		this.shieldBonus = shieldBonus;
	}
	
	public int getNaturalArmor() {
		return this.naturalArmor;
	}
	
	public void setNaturalArmor(int naturalArmor) {
		this.naturalArmor = naturalArmor;
	}
	
	public int getDeflectionMod() {
		return this.deflectionMod;
	}
	
	public void setDeflectionMod(int deflectionMod) {
		this.deflectionMod = deflectionMod;
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	public int getDR() {
		return this.dr;
	}
	
	public void setDR(int dr) {
		this.dr = dr;
	}
	
	public int getTouch() {
		return this.touch;
	}
	
	public void setTouch(int touch) {
		this.touch = touch;
	}
	
	public int getFlatFooted() {
		return this.flatFooted;
	}
	
	public void setFlatFooted(int flatFooted) {
		this.flatFooted = flatFooted;
	}
	
	//saving throw getters and setters
	public int getFortitudeBase() {
		return this.fortitudeBase;
	}
	
	public void setFortitudeBase(int fortitudeBase) {
		this.fortitudeBase = fortitudeBase;
	}
	
	public int getReflexBase() {
		return this.reflexBase;
	}
	
	public void setReflexBase(int reflexBase) {
		this.reflexBase = reflexBase;
	}
	
	public int getWillBase() {
		return this.willBase;
	}
	
	public void setWillBase(int willBase) {
		this.willBase = willBase;
	}
	
	public int getFortitude() {
		return this.fortitude;
	}
	
	public void setFortitude(int fortitude) {
		this.fortitude = fortitude;
	}
	
	public int getReflex() {
		return this.reflex;
	}
	
	public void setReflex(int reflex) {
		this.reflex = reflex;
	}
	
	public int getWill() {
		return this.will;
	}
	
	public void setWill(int will) {
		this.will = will;
	}
	
	public int getFortitudeMiscMod() {
		return this.fortitudeMiscMod;
	}
	
	public void setFortitudeMiscMod(int fortitudeMiscMod) {
		this.fortitudeMiscMod = fortitudeMiscMod;
	}
	
	public int getReflexMiscMod() {
		return this.reflexMiscMod;
	}
	
	public void setReflexMiscMod(int reflexMiscMod) {
		this.reflexMiscMod = reflexMiscMod;
	}
	
	public int getWillMiscMod() {
		return this.willMiscMod;
	}
	
	public void setWillMiscMod(int willMiscMod) {
		this.willMiscMod = willMiscMod;
	}

	//more getters setters
	public int getBaseAttackBonus() {
		return this.baseAttackBonus;
	}
	
	public void setBaseAttackBonus(int baseAttackBonus) {
		this.baseAttackBonus = baseAttackBonus;
	}
	
	public int getSpellResistance() {
		return this.spellResistance;
	}
	
	public void setSpellResistance(int spellResistance) {
		this.spellResistance = spellResistance;
	}
	
	public int getCMB() {
		return this.CMB;
	}
	
	public void setCMB(int CMB) {
		this.CMB = CMB;
	}
	
	public int getCMD() {
		return this.CMD;
	}
	
	public void setCMD(int CMD) {
		this.CMD = CMD;
	}
	
	public int getSizeMod() {
		return this.sizeMod;
	}
	
	public void setSizeMod(int sizeMod) {
		this.sizeMod = sizeMod;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getInitiative() {
		return this.initiative;
	}
	
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	
	public int getInitiativeMiscMod() {
		return this.initiativeMiscMod;
	}
	
	public void setInitiativeMiscMod(int initiativeMiscMod) {
		this.initiativeMiscMod = initiativeMiscMod;
	}
	
	public String getCharacterName() {
		return this.characterName;
	}
	
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public String getDiety() {
		return this.diety;
	}
	
	public void setDiety(String diety) {
		this.diety = diety;
	}
	
	public String getHomeland() {
		return this.homeland;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHair() {
		return this.hair;
	}
	
	public void setHair(String hair) {
		this.hair = hair;
	}
	
	public String getEyes() {
		return this.eyes;
	}
	
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
		
	public List<String> getFirstSpellList() {
		return this.firstSpellList;
	}
	
	public void setFirstSpellList(List<String> firstSpellList) {
		this.firstSpellList = firstSpellList;
	}
	
	public void addFirstSpell(String firstSpell) {
		this.firstSpellList.add(firstSpell);
	}
	
	public List<String> getZeroSpellList() {
		return this.zeroSpellList;
	}
	
	public void setZeroSpellList(List<String> zeroSpellList) {
		this.zeroSpellList = zeroSpellList;
	}
	
	public void addZeroSpell(String zeroSpell) {
		this.zeroSpellList.add(zeroSpell);
	}
	
	public List<String> getDomainsSchools() {
		return this.domainsSchools;
	}
	
	public void setDomainsSchools(List<String> domainsSchools) {
		this.domainsSchools = domainsSchools;
	}
	
	public void addDomainSchool(String domainSchool) {
		this.domainsSchools.add(domainSchool);
	}
	
	public List<String> getLanguages() {
		return this.languages;
	}
	
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	
	public void addLanguage(String language) {
		this.languages.add(language);
	}
	
	public List<String> getFeats() {
		return this.feats;
	}
	
	public void setFeats(List<String> feats) {
		this.feats = feats;
	}
	
	public void addFeat(String feat) {
		this.specialAbilities.add(feat);
	}
	
	public List<String> getCMBCMDMods() {
		return this.CMBCMDMods;
	}
	
	public void setCMBCMDMods(List<String> mods) {
		this.CMBCMDMods = mods;
	}
	
	public void addCMBCMDMods(String mod) {
		this.CMBCMDMods.add(mod);
	}
	
	public List<String> getSavingThrowMods() {
		return this.savingThrowMods;
	}
	
	public void setSavingThrowMods(List<String> mods) {
		this.savingThrowMods = mods;
	}
	
	public void addSavingThrowMods(String mod) {
		this.savingThrowMods.add(mod);
	}
	
	public List<Skill> getSkillList() {
		return this.skillList;
	}
	
	public List<String> getSpecialAbilities() {
		return this.specialAbilities;
	}
	
	public void setSpecialAbilities(List<String> specialAbilities) {
		this.specialAbilities = specialAbilities;
	}
	
	public void addSpecialAbility(String specialAbility) {
		this.specialAbilities.add(specialAbility);
	}

	public CharacterAlignment getAlignment() {
		return this.alignment;
	}
	
	public void setAlignment(CharacterAlignment alignment) {
		this.alignment = alignment;
	}
	
	public CharacterClass getCharClass() {
		return this.charClass;
	}
	
	public void setCharClass(CharacterClass charClass) {
		this.charClass = charClass;
	}
	
	public CharacterRace getCharRace() {
		return this.charRace;
	}
	
	public void setCharRace(CharacterRace charRace) {
		this.charRace = charRace;
	}

	public CharacterSize getCharSize() {
		return this.charSize;
	}
	
	public void setCharSize(CharacterSize charSize) {
		this.charSize = charSize;
	}
	
	//money setters getters
	public int getCP() {
		return this.cp;
	}
	
	public void setCP(int cp) {
		this.cp = cp;
	}
	
	public int getSP() {
		return this.sp;
	}
	
	public void setSP(int sp) {
		this.sp = sp;
	}
	
	public int getGP() {
		return this.gp;
	}
	
	public void setGP(int gp) {
		this.gp = gp;
	}
	
	public int getPP() {
		return this.pp;
	}
	
	public void setPP(int pp) {
		this.pp = pp;
	}
	
	//xp getters setters
	public int getExperience() {
		return this.experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public int getNextLevelxp() {
		return this.nextLevelxp;
	}
	
	public void setNextLevelxp(int nextLevelxp) {
		this.nextLevelxp = nextLevelxp;
	}
	
	//getters and setters for spells
	public int getFirstBonusSpells() {
		return this.firstBonusSpells;
	}
	
	public void setFirstBonusSpells(int firstBonusSpells) {
		this.firstBonusSpells = firstBonusSpells;
	}
	
	public int getFirstSpellsPerDay() {
		return this.firstSpellsPerDay;
	}
	
	public void setFirstSpellsPerDay(int firstSpellsPerDay) {
		this.firstSpellsPerDay = firstSpellsPerDay;
	}
	
	public int getFirstSpellSaveDC() {
		return this.firstSpellSaveDC;
	}
	
	public void setFirstSpellSaveDC(int firstSpellSaveDC) {
		this.firstSpellSaveDC = firstSpellSaveDC;
	}
	
	public int getFirstSpellsKnown() {
		return this.firstSpellsKnown;
	}
	
	public void setFirstSpellsKnown(int firstSpellsKnown) {
		this.firstSpellsKnown = firstSpellsKnown;
	}
	
	public int getZeroSpellsPerDay() {
		return this.zeroSpellsPerDay;
	}
	
	public void setZeroSpellsPerDay(int SpellsPerDay) {
		this.zeroSpellsPerDay = SpellsPerDay;
	}
	
	public int getZeroSpellSaveDC() {
		return this.zeroSpellSaveDC;
	}
	
	public void setZeroSpellSaveDC(int zeroSpellSaveDC) {
		this.zeroSpellSaveDC = zeroSpellSaveDC;
	}
	
	public int getZeroSpellsKnown() {
		return this.zeroSpellsKnown;
	}
	
	public void setZeroSpellsKnown(int zeroSpellsKnown) {
		this.zeroSpellsKnown = zeroSpellsKnown;
	}
	
	//getters and setters for movement speeds
	public int getBaseSpeed() {
		return this.baseSpeed;
	}
	
	public void setBaseSpeed(int baseSpeed) {
		this.baseSpeed = baseSpeed;
	}
	
	public int getArmorSpeed() {
		return this.armorSpeed;
	}
	
	public void setArmorSpeed(int armorSpeed) {
		this.armorSpeed = armorSpeed;
	}
	
	public int getFlySpeed() {
		return this.flySpeed;
	}
	
	public void setFlySpeed(int flySpeed) {
		this.flySpeed = flySpeed;
	}
	
	public int getSwimSpeed() {
		return this.swimSpeed;
	}
	
	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}
	
	public int getClimbSpeed() {
		return this.climbSpeed;
	}
	
	public void setClimbSpeed(int climbSpeed) {
		this.climbSpeed = climbSpeed;
	}
	
	public int getBurrowSpeed() {
		return this.burrowSpeed;
	}
	
	public void setBurrowSpeed(int burrowSpeed) {
		this.burrowSpeed = burrowSpeed;
	}
	
	//getters and setters for all the character skills
	
	public Skill getAcrobatics() {
		return this.acrobatics;
	}
	
	public void setAcrobatics(Skill acrobatics) {
		this.acrobatics = acrobatics;
	}
	
	public Skill getAppraise() {
		return this.appraise;
	}
	
	public void setAppraise(Skill appraise) {
		this.appraise = appraise;
	}
	
	public Skill getBluff() {
		return this.bluff;
	}
	
	public void setBluff(Skill bluff) {
		this.bluff = bluff;
	}
	
	public Skill getClimb() {
		return this.climb;
	}
	
	public void setClimb(Skill climb) {
		this.climb = climb;
	}
	
	public Skill getCraft1() {
		return this.craft1;
	}
	
	public void setCraft1(Skill craft1) {
		this.craft1 = craft1;
	}
	
	public Skill getCraft2() {
		return this.craft2;
	}
	
	public void setCraft2(Skill craft2) {
		this.craft2 = craft2;
	}
	
	public Skill getCraft3() {
		return this.craft3;
	}
	
	public void setCraft3(Skill craft3) {
		this.craft3 = craft3;
	}
	
	public Skill getDiplomacy() {
		return this.diplomacy;
	}
	
	public void setDiplomacy(Skill diplomacy) {
		this.diplomacy = diplomacy;
	}
	
	public Skill getDisableDevice() {
		return this.disableDevice;
	}
	
	public void setDisableDevice(Skill disableDevice) {
		this.disableDevice = disableDevice;
	}
	
	public Skill getDisguise() {
		return this.disguise;
	}
	
	public void setDisguise(Skill disguise) {
		this.disguise = disguise;
	}
	
	public Skill getEscapeArtist() {
		return this.escapeArtist;
	}
	
	public void setEscapeArtist(Skill escapeArtist) {
		this.escapeArtist = escapeArtist;
	}

	public Skill getFly() {
		return this.fly;
	}
	
	public void setFly(Skill fly) {
		this.fly = fly;
	}
	
	public Skill getHandleAnimal() {
		return this.handleAnimal;
	}
	
	public void setHandleAnimal(Skill handleAnimal) {
		this.handleAnimal = handleAnimal;
	}	
	
	public Skill getHeal() {
		return this.heal;
	}
	
	public void setHeal(Skill heal) {
		this.heal = heal;
	}	
	
	public Skill getIntimidate() {
		return this.intimidate;
	}
	
	public void setIntimidate(Skill intimidate) {
		this.intimidate = intimidate;
	}	
	
	public Skill getKnowledgeArcana() {
		return this.knowledgeArcana;
	}
	
	public void setKnowledgeArcana(Skill knowledgeArcana) {
		this.knowledgeArcana= knowledgeArcana;
	}	
	
	public Skill getKnowledgeDungeoneering() {
		return this.knowledgeDungeoneering;
	}
	
	public void setKnowledgeDungeoneering(Skill knowledgeDungeoneering) {
		this.knowledgeDungeoneering = knowledgeDungeoneering;
	}	
	
	public Skill getKnowledgeEngineering() {
		return this.knowledgeEngineering;
	}
	
	public void setKnowledgeEngineering(Skill knowledgeEngineering) {
		this.knowledgeEngineering = knowledgeEngineering;
	}	
	
	public Skill getKnowledgeGeography() {
		return this.knowledgeGeography;
	}
	
	public void setKnowledgeGeography(Skill knowledgeGeography) {
		this.knowledgeGeography = knowledgeGeography;
	}	
	
	public Skill getKnowledgeHistory() {
		return this.knowledgeHistory;
	}
	
	public void setKnowledgeHistory(Skill knowledgeHistory) {
		this.knowledgeHistory = knowledgeHistory;
	}	
	
	public Skill getKnowledgeLocal() {
		return this.knowledgeLocal;
	}
	
	public void setKnowledgeLocal(Skill knowledgeLocal) {
		this.knowledgeLocal = knowledgeLocal;
	}	
	
	public Skill getKnowledgeNature() {
		return this.knowledgeNature;
	}
	
	public void setKnowledgeNature(Skill knowledgeNature) {
		this.knowledgeNature = knowledgeNature;
	}	
	
	public Skill getKnowledgeNobility() {
		return this.knowledgeNobility;
	}
	
	public void setKnowledgeNobility(Skill knowledgeNobility) {
		this.knowledgeNobility = knowledgeNobility;
	}	
	
	public Skill getKnowledgePlanes() {
		return this.knowledgePlanes;
	}
	
	public void setKnowledgePlanes(Skill knowledgePlanes) {
		this.knowledgePlanes = knowledgePlanes;
	}	
	
	public Skill getKnowledgeReligion() {
		return this.knowledgeReligion;
	}
	
	public void setKnowledgeReligion(Skill knowledgeReligion) {
		this.knowledgeReligion = knowledgeReligion;
	}
	
	public Skill getLinguistics() {
		return this.linguistics;
	}
	
	public void setLinguistics(Skill linguistics) {
		this.linguistics = linguistics;
	}	
	
	public Skill getPerception() {
		return this.perception;
	}
	
	public void setPerception(Skill perception) {
		this.perception = perception;
	}	
	
	public Skill getPerform1() {
		return this.perform1;
	}
	
	public void setPerform1(Skill perform1) {
		this.perform1 = perform1;
	}
	
	public Skill getPerform2() {
		return this.perform2;
	}
	
	public void setPerform2(Skill perform2) {
		this.perform2 = perform2;
	}	
	
	public Skill getProfession1() {
		return this.profession1;
	}
	
	public void setProfession1(Skill profession1) {
		this.profession1 = profession1;
	}	
	
	public Skill getProfession2() {
		return this.profession2;
	}
	
	public void setProfession2(Skill profession2) {
		this.profession2 = profession2;
	}	
	
	public Skill getRide() {
		return this.ride;
	}
	
	public void setRide(Skill ride) {
		this.ride = ride;
	}	
	
	public Skill getSenseMotive() {
		return this.senseMotive;
	}
	
	public void setSenseMotive(Skill senseMotive) {
		this.senseMotive = senseMotive;
	}	
	
	public Skill getSleightOfHand() {
		return this.sleightOfHand;
	}
	
	public void setSleightOfHand(Skill sleightOfHand) {
		this.sleightOfHand = sleightOfHand;
	}	
	
	public Skill getSpellcraft() {
		return this.spellcraft;
	}
	
	public void setSpellcraft(Skill spellcraft) {
		this.spellcraft = spellcraft;
	}	
	
	public Skill getStealth() {
		return this.stealth;
	}
	
	public void setStealth(Skill stealth) {
		this.stealth = stealth;
	}	
	
	public Skill getSurvival() {
		return this.survival;
	}
	
	public void setSurvival(Skill survival) {
		this.survival = survival;
	}	
	
	public Skill getSwim() {
		return this.swim;
	}
	
	public void setSwim(Skill swim) {
		this.swim = swim;
	}	
	
	public Skill getUseMagicDevice() {
		return this.useMagicDevice;
	}
	
	public void setUseMagicDevice(Skill useMagicDevice) {
		this.useMagicDevice = useMagicDevice;
	}

}
