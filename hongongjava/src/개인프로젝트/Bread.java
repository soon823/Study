package 개인프로젝트;

public class Bread extends Dao {

	private String bname;
	private String stuff;
	private String recipe;
	
	Bread(){}
	Bread (String bname, String stuff, String recipe){
		this.bname = bname;
		this.stuff = stuff;
		this.recipe = recipe;
	}
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getStuff() {
		return stuff;
	}
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	
	@Override
	public String toString() {
		return "이름 = " + bname + "\n재료 = " + stuff + "\n만드는법 =" + recipe;
	}
	
	
	
}//end class
