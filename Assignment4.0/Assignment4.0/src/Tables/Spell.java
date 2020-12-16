package Tables;
import java.util.List;
import CharacterSheet.CharacterClass;

public class Spell {
	private School school;
	private String name;
	private SpellAlignment alignment;
	private List<CharacterClass> classList;
	
	public Spell(String name, School school, List<CharacterClass> classList, SpellAlignment alignment) {
		this.school = school;
		this.name = name;
		this.alignment = alignment;
		this.classList = classList;
	}
	
	public School getSchool() {
		return this.school;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public SpellAlignment getAlignment() {
		return this.alignment;
	}
	
	public void setAlignment(SpellAlignment alignment) {
		this.alignment = alignment;
	}
	
	public List<CharacterClass> getClassList() {
		return this.classList;
	}
	
	public void setClassList(List<CharacterClass> classList) {
		this.classList = classList;
	}
	
	public void addClass(CharacterClass newClass) {
		this.classList.add(newClass);
	}
}
