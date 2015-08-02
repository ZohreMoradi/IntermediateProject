public class Worker {

	private String name;
	private String family;
	private int age;
	private int ID;

	public Worker(String name, String family, int age, int ID) {
		this.setName(name);
		this.setFamily(family);
		this.setAge(age) ;
		this.setID(ID);
	}

	@Override
	public boolean equals(Object w) {
		// TODO Auto-generated method stub
		Worker input = (Worker) w;
		if (this.getID() == input.ID)
			return true;
		else
			return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}



}
