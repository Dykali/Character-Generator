package CharacterGenerator;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import CharacterSheet.CharacterClass;
import CharacterSheet.CharacterRace;
import CharacterSheet.CharacterSheet;
import Tests.PrintUtils;

public class main {
	public static void runSheetGenerator(String[] args) throws IOException {
		String playerName = args[0];
		int characterLevel = Integer.parseInt(args[1]);
		String charClassArg = args[3];
		String charRaceArg = args[2];

		CharacterClass charClass = CharacterClass.valueOf(charClassArg);
		CharacterRace charRace = CharacterRace.valueOf(charRaceArg);
		
		//generate a random character
		RandomCharacterGenerator charGen = new RandomCharacterGenerator();
		CharacterSheet charSheet = charGen.getRandomCharacterGeneratorSheet(playerName, charClass, charRace);
		
		//Testing
		//PrintUtils.printSheet(charSheet);
		
		//level the character to second level
		if(characterLevel == 2) {
			RandomCharacterLeveler.secondLevel(charSheet);
		}
		
		//Testing
		//PrintUtils.printSheet(charSheet);
		
		PdfFiller.filler(charSheet);
		openPDF();
	}
	
	public static void openPDF() {
		  try {

				File pdfFile = new File("C:\\Users\\Ilaky\\Desktop\\Assignment4.0\\Assignment4.0\\src\\CharacterSheet\\newPathfinderCharacterSheet.pdf");
				if (pdfFile.exists()) {

					if (Desktop.isDesktopSupported()) {
						Desktop.getDesktop().open(pdfFile);
					} else {
						System.out.println("Awt Desktop is not supported!");
					}

				} else {
					System.out.println("File is not exists!");
				}

				//System.out.println("Done");

			  } catch (Exception ex) {
				ex.printStackTrace();
			  }
	}
}
