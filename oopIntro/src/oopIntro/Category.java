package oopIntro;

public class Category {
//önce field sonra constructer sonra getter and setter
	private int id;
	private String name;

	public Category () {
		
	}
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) { // void bir şey yapacağım demek
		this.id = id;
	}

	public String getName() {
		return name + "!";
	}

	public void setName(String name) {
		this.name = name;
	}

}
