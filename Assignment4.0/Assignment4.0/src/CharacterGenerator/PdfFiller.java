package CharacterGenerator;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField;

import CharacterSheet.CharacterSheet;
import CharacterSheet.Skill;

public class PdfFiller {
	public static void filler(CharacterSheet charSheet) throws IOException{
		PDDocument pdfDocument = PDDocument.load(new File("C:\\Users\\Ilaky\\Desktop\\Assignment4.0\\Assignment4.0\\src\\CharacterSheet\\FillablePathfinderCharacterSheet.pdf"));
		PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
		PDAcroForm acroForm = docCatalog.getAcroForm();
		
		setVals(charSheet, acroForm);

		//printVars();
		
		pdfDocument.save("C:\\Users\\Ilaky\\Desktop\\Assignment4.0\\Assignment4.0\\src\\CharacterSheet\\newPathfinderCharacterSheet.pdf");
		pdfDocument.close();
	}
	
	public static void setVals(CharacterSheet charSheet, PDAcroForm acroForm) throws IOException {
		/*
		if (acroForm != null)
		{
		    PDField field = (PDField) acroForm.getField( "fieldsParentName.fieldName" );
		    field.setValue("new field value");
		}
		*/
		if (acroForm != null)
		{
		    PDField field = (PDField) acroForm.getField( "Character Name" );
		    field.setValue(charSheet.getCharacterName());
		    
		    field = (PDField) acroForm.getField( "Player" );
		    field.setValue(charSheet.getPlayerName());
		    
		    field = (PDField) acroForm.getField( "Alignment" );
		    field.setValue(charSheet.getAlignment().toString());
		    
		    field = (PDField) acroForm.getField( "Character Level" );
		    field.setValue(charSheet.getCharClass().toString());
		    
		    field = (PDField) acroForm.getField( "Race" );
		    field.setValue(charSheet.getCharRace().toString());
		    
		    field = (PDField) acroForm.getField( "Size" );
		    field.setValue(charSheet.getCharSize().toString());
		    
		    field = (PDField) acroForm.getField( "Gender" );
		    field.setValue(charSheet.getGender().toString());
		    
		    field = (PDField) acroForm.getField( "Age" );
		    field.setValue(Integer.toString(charSheet.getAge()));
		    
		    field = (PDField) acroForm.getField( "Height" );
		    field.setValue(Integer.toString(charSheet.getHeight()) + " Inches");
		    
		    field = (PDField) acroForm.getField( "Weight" );
		    field.setValue(Integer.toString(charSheet.getWeight()) + " lbs");
		    
		    field = (PDField) acroForm.getField( "Natural Armor" );
		    field.setValue(Integer.toString(charSheet.getNaturalArmor()));
		    
		    field = (PDField) acroForm.getField( "Deflection Modifier" );
		    field.setValue(Integer.toString(charSheet.getDeflectionMod()));
		    
		    field = (PDField) acroForm.getField( "Total Hp" );
		    field.setValue(Integer.toString(charSheet.getHP()));
		    
		    field = (PDField) acroForm.getField( "Damage Reduction" );
		    field.setValue(Integer.toString(charSheet.getDR()));
		    
		    field = (PDField) acroForm.getField( "Total Armor Class" );
		    field.setValue(Integer.toString(charSheet.getAC()));
		    
		    field = (PDField) acroForm.getField( "AC Misc Modifier" );
		    field.setValue(Integer.toString(charSheet.getACMiscMod()));
		    
		    field = (PDField) acroForm.getField( "Total Initiative Modifier" );
		    field.setValue(Integer.toString(charSheet.getInitiative()));
		    
		    field = (PDField) acroForm.getField( "Armor Bonus" );
		    field.setValue(Integer.toString(charSheet.getArmorBonus()));
		    
		    field = (PDField) acroForm.getField( "Shield Bonus" );
		    field.setValue(Integer.toString(charSheet.getShieldBonus()));
		    
		    field = (PDField) acroForm.getField( "Dex Modifier" );
		    field.setValue(Integer.toString(charSheet.getDexMod()));
		    
		    field = (PDField) acroForm.getField( "Base Speed" );
		    field.setValue(Integer.toString(charSheet.getBaseSpeed()));
		    
		    field = (PDField) acroForm.getField( "Swim" );
		    field.setValue(Integer.toString(charSheet.getSwimSpeed()));
		    
		    field = (PDField) acroForm.getField( "Climb" );
		    field.setValue(Integer.toString(charSheet.getClimbSpeed()));
		    
		    field = (PDField) acroForm.getField( "Burrow" );
		    field.setValue(Integer.toString(charSheet.getBurrowSpeed()));
		    
		    field = (PDField) acroForm.getField( "Touch Armor Class" );
		    field.setValue(Integer.toString(charSheet.getTouch()));
		    
		    field = (PDField) acroForm.getField( "Flat-Footed Armor Class" );
		    field.setValue(Integer.toString(charSheet.getFlatFooted()));
		    
		    if(charSheet.getClimb().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Climb check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getCraft1().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Craft Check 1" );
			    field.setValue("Yes");
		    }

		    if(charSheet.getCraft2().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Craft Check 2" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getCraft3().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Craft Check3" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getAcrobatics().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Acrobatics" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getAppraise().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Appraise Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getBluff().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Bluff Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getDiplomacy().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Diplomacy Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getDisableDevice().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Disable Device Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getDisguise().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Disguise Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getEscapeArtist().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Escape Artist Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getFly().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Fly Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getHandleAnimal().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Handle Animal Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getHeal().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Heal Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getIntimidate().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Intimidate Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getKnowledgeArcana().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Knowledge (Arcana) Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getKnowledgeDungeoneering().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Knowledge (Dungeoneering) Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getKnowledgeEngineering().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Knowledge (Engineering) Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getKnowledgeGeography().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Knowledge (Geography) Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getKnowledgeHistory().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Knowledge (History) Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getKnowledgeLocal().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Knowledge (Local) Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getKnowledgeNature().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Knowledge (Nature) Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getKnowledgeNobility().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Knowledge (Nobility) Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getKnowledgePlanes().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Knowledge (Planes) Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getKnowledgeReligion().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Knowledge (Religion) Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getLinguistics().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Linguistics Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getPerception().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Perception Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getPerform1().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Perform 1 check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getPerform2().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Perform 2 Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getProfession1().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Profession 1 Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getProfession2().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Profession 3 Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getRide().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Ride Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getSenseMotive().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Sense Motive Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getSleightOfHand().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Sleight Of Hand Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getSpellcraft().getClassSkill()) {
			    field = (PDField) acroForm.getField( "SpellCraft Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getStealth().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Stealth Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getSurvival().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Survival" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getSwim().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Swim Check" );
			    field.setValue("Yes");
		    }
		    
		    if(charSheet.getUseMagicDevice().getClassSkill()) {
			    field = (PDField) acroForm.getField( "Use Magic Device Check" );
			    field.setValue("Yes");
		    }
		    
		    //Craft 1 name
		    field = (PDField) acroForm.getField( "Craft 1" );
		    field.setValue("");
		    
		    //Craft 2 name
		    field = (PDField) acroForm.getField( "Craft 2" );
		    field.setValue("");
		    
		    //Craft 3 name
		    field = (PDField) acroForm.getField( "Craft 3" );
		    field.setValue("");
		    
		    //Perform 1 name
		    field = (PDField) acroForm.getField( "Perform 1" );
		    field.setValue("");
		    
		    //Perform 2 name
		    field = (PDField) acroForm.getField( "Perform 2" );
		    field.setValue("");
		    
		    //Profession 1 name
		    field = (PDField) acroForm.getField( "Profession 1" );
		    field.setValue("");
		    
		    //Profession 2 name
		    field = (PDField) acroForm.getField( "Profession 2" );
		    field.setValue("");
		    
		    //iterates through all skills and sets totals
			Skill skill;
			List<Skill> skillList = charSheet.getSkillList();
			for(int i = 0; i < 39; i++) {
				skill = skillList.get(i);
			    field = (PDField) acroForm.getField( "Total Bonus "+(i+1) );
			    field.setValue(Integer.toString(skill.getTotal()));
			}
			
		    //iterates through all skills and sets misc mods
			for(int i = 0; i < 39; i++) {
				skill = skillList.get(i);
			    field = (PDField) acroForm.getField( "Misc Mod. "+(i+1) );
			    field.setValue(Integer.toString(skill.getMiscMod()));
			}
			
		    //iterates through all skills and sets ability mods
			for(int i = 0; i < 39; i++) {
				skill = skillList.get(i);
			    field = (PDField) acroForm.getField( "Ability Mod. "+(i+1) );
			    field.setValue(Integer.toString(skill.getAbilityMod()));
			}
			
		    //iterates through all skills and sets ability mods
			for(int i = 0; i < 3; i++) {
				skill = skillList.get(i);
			    field = (PDField) acroForm.getField( "Ranks "+(i+1) );
			    field.setValue(Integer.toString(skill.getRanks()));
			}
		    //iterates through all skills and sets ability mods
			for(int i = 3; i < 39; i++) {
				skill = skillList.get(i);
			    field = (PDField) acroForm.getField( "Rank "+(i+1) );
			    field.setValue(Integer.toString(skill.getRanks()));
			}
			
		    field = (PDField) acroForm.getField( "Total Will save" );
		    field.setValue(Integer.toString(charSheet.getWill()));
			
		    field = (PDField) acroForm.getField( "Total Reflex Save" );
		    field.setValue(Integer.toString(charSheet.getReflex()));
		    
		    field = (PDField) acroForm.getField( "Total Fortitude Save" );
		    field.setValue(Integer.toString(charSheet.getFortitude()));
		    
		    field = (PDField) acroForm.getField( "Base Save Fortitude" );
		    field.setValue(Integer.toString(charSheet.getFortitudeBase()));
		    
		    field = (PDField) acroForm.getField( "Misc Modifier Fortitude" );
		    field.setValue(Integer.toString(charSheet.getFortitudeMiscMod()));
		    
		    field = (PDField) acroForm.getField( "Base Save Reflex" );
		    field.setValue(Integer.toString(charSheet.getReflexBase()));
		    
		    field = (PDField) acroForm.getField( "Misc Modifier Reflex" );
		    field.setValue(Integer.toString(charSheet.getReflexMiscMod()));
		    
		    field = (PDField) acroForm.getField( "Base SaveWill" );
		    field.setValue(Integer.toString(charSheet.getWillBase()));
		    
		    field = (PDField) acroForm.getField( "Misc Modifier Will" );
		    field.setValue(Integer.toString(charSheet.getWillMiscMod()));
		    
		    field = (PDField) acroForm.getField( "Spell Resistance" );
		    field.setValue(Integer.toString(charSheet.getSpellResistance()));
		    
		    field = (PDField) acroForm.getField( "Total CMB" );
		    field.setValue(Integer.toString(charSheet.getCMB()));
		    
		    field = (PDField) acroForm.getField( "Total CMD" );
		    field.setValue(Integer.toString(charSheet.getCMD()));
		    
		    field = (PDField) acroForm.getField( "Size Modifier" );
		    field.setValue(Integer.toString(charSheet.getSizeMod()));
		    
		    field = (PDField) acroForm.getField( "Ability Score Dexterity" );
		    field.setValue(Integer.toString(charSheet.getDex()));
		    
		    field = (PDField) acroForm.getField( "Ability Modifier Dexterity" );
		    field.setValue(Integer.toString(charSheet.getDexMod()));
		    
		    field = (PDField) acroForm.getField( "Ability Score Strength" );
		    field.setValue(Integer.toString(charSheet.getStr()));
		    
		    field = (PDField) acroForm.getField( "Ability Modifier Strength" );
		    field.setValue(Integer.toString(charSheet.getStrMod()));
		    
		    field = (PDField) acroForm.getField( "Ability Score Constitution" );
		    field.setValue(Integer.toString(charSheet.getCon()));
		    
		    field = (PDField) acroForm.getField( "Ability Modifier Constitution" );
		    field.setValue(Integer.toString(charSheet.getConMod()));
		    
		    field = (PDField) acroForm.getField( "Ability Score Intelligence" );
		    field.setValue(Integer.toString(charSheet.getInt()));
		    
		    field = (PDField) acroForm.getField( "Ability Modifier Intelligence" );
		    field.setValue(Integer.toString(charSheet.getIntMod()));
		    
		    field = (PDField) acroForm.getField( "Ability Score Wisdom" );
		    field.setValue(Integer.toString(charSheet.getWis()));
		    
		    field = (PDField) acroForm.getField( "Ability Modifier Wisdom" );
		    field.setValue(Integer.toString(charSheet.getWisMod()));
		    
		    field = (PDField) acroForm.getField( "Ability Score Charisma" );
		    field.setValue(Integer.toString(charSheet.getCha()));
		    
		    field = (PDField) acroForm.getField( "Ability Modifier Charisma" );
		    field.setValue(Integer.toString(charSheet.getChaMod()));
			
		    //fort ability mod
		    field = (PDField) acroForm.getField( "Con Modifier" );
		    field.setValue(Integer.toString(charSheet.getConMod()));
		    
		    //wis ability mod
		    field = (PDField) acroForm.getField( "Wis Modifier" );
		    field.setValue(Integer.toString(charSheet.getWisMod()));
			
		    field = (PDField) acroForm.getField( "Str Modifier" );
		    field.setValue(Integer.toString(charSheet.getStrMod()));
		    
		    field = (PDField) acroForm.getField( "Base Attack Bonus" );
		    field.setValue(Integer.toString(charSheet.getBaseAttackBonus()));
		    
		    field = (PDField) acroForm.getField( "Initiative Misc Modifier" );
		    field.setValue(Integer.toString(charSheet.getInitiativeMiscMod()));
		    
		    field = (PDField) acroForm.getField( "Copper" );
		    field.setValue(Integer.toString(charSheet.getCP()));
		    
		    field = (PDField) acroForm.getField( "Silver" );
		    field.setValue(Integer.toString(charSheet.getSP()));
		    
		    field = (PDField) acroForm.getField( "Gold" );
		    field.setValue(Integer.toString(charSheet.getGP()));
		    
		    field = (PDField) acroForm.getField( "Platinum" );
		    field.setValue(Integer.toString(charSheet.getPP()));
		    
		    

			List<String> spellList = charSheet.getZeroSpellList();
			int size = spellList.size();
			String spells = "";
			for(int i = 0; i < size; i++) {
				if(i == 0) {
					spells = spells + spellList.get(i);
				}else {
					spells = spells + ", "+ spellList.get(i);
				}
			}
			
		    field = (PDField) acroForm.getField( "Spell Name Level 0 ~1" );
		    field.setValue(spells);
		    
		    
		    
		}
	}
	
	public static void printVars() throws IOException
	{
	    	
	        PDDocument pdfDocument = PDDocument.load(new File("C:\\Users\\Ilaky\\Desktop\\Assignment4.0\\Assignment4.0\\src\\CharacterSheet\\FillablePathfinderCharacterSheet.pdf"));
	        PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
	        PDAcroForm acroForm = docCatalog.getAcroForm();
	        List<PDField> fields = acroForm.getFields();
	        for (PDField field : fields)
	        {
	            list(field);
	        }
	    
	}

	static void list(PDField field)
	{
	    System.out.println(field.getFullyQualifiedName());
	    System.out.println(field.getPartialName());
	    if (field instanceof PDNonTerminalField)
	    {
	        PDNonTerminalField nonTerminalField = (PDNonTerminalField) field;
	        for (PDField child : nonTerminalField.getChildren())
	        {
	            list(child);
	        }
	    }
	}
}
