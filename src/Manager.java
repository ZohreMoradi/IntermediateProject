import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	private String name;
	private String family;
	private int age;
	private int ID;
	private List<Worker> workers; 
	

	public Manager(String name, String family, int age, int ID, List<Worker> workersOfManager){
		this.setName(name);
		this.setFamily(family);
		this.setAge(age) ;
		this.setID(ID);
		this.setWorkers(workersOfManager); 
	}
	public Manager(String name2, String family2, int age2, int iD2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object m) {
		// TODO Auto-generated method stub
		Manager input = (Manager) m;
		if (this.getID() == input.ID)
			return true;
		else
			return false;
	}

	public List<Worker> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
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
