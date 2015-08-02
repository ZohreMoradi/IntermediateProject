import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ScanerData {

	List<Worker> workers;
	List<Manager> managers;
	private List<Worker> workersOfManager;

	public ScanerData() {
		// TODO Auto-generated constructor stub
		workers = new ArrayList<Worker>();
		managers = new ArrayList<Manager>();


		while (true) {
			printMessage();
			Scanner scaner = new Scanner(System.in);
			String input = scaner.nextLine();

			switch (input) {
			case "1":
				System.out.println("Worker :");
				setWorkerData();
				continue;
			case "2":
				System.out.println("Manager :");
				setManagerData();
				continue;
			default:
				break;
			}
			break;
		}
	}

	public void setWorkerData() {
		while (true) {

			Scanner scanner = new Scanner(System.in);
			String result = scanner.nextLine();
			if (!result.equals("finished")) {
				String[] workerInfo = result.split(" ");

				String name = workerInfo[0];
				String family = workerInfo[1];
				int age = Integer.parseInt(workerInfo[2]);
				int ID = Integer.parseInt(workerInfo[3]);

				Worker worker = new Worker(name, family, age, ID);
				if (workers.isEmpty() || !workers.contains(worker)) {
					workers.add(worker);
				}
				System.out.print(workers.size());

			} else
				break;

		}
	}

	public void setManagerData() {
		// TODO Auto-generated method stub

		while (true) {
			Scanner scanner = new Scanner(System.in);
			String result = scanner.nextLine();
			if (!result.equals("finished")) {
				String[] managerInfo = result.split(" ");

				String name = managerInfo[0];
				String family = managerInfo[1];
				int age = Integer.parseInt(managerInfo[2]);
				int ID = Integer.parseInt(managerInfo[3]);
				workersOfManager = new ArrayList<Worker>();
				for (int i = 4; i < managerInfo.length; i++) {
					int workerID = Integer.parseInt(managerInfo[i]);
					for (Worker w : workers) {
						if (w.getID() == workerID)
							workersOfManager.add(w);
					}
				}
				Manager manager = new Manager(name, family, age, ID,
						workersOfManager);
				if (!managers.contains(manager)) {
					managers.add(manager);
				}

			} else
				break;

		}
		for (Manager manager : managers) {
			String sep = " ";
			String managerInfo = "";
			String workersOfManagerInfo = "";
			
			if (! manager.getWorkers().isEmpty()) {
				workersOfManager = manager.getWorkers();
				for (Worker worker : workersOfManager) {
					workersOfManagerInfo += (" [" + worker.getName() + sep
							+ worker.getFamily() + sep + worker.getAge() + sep
							+ worker.getID() + "] ");
				}
			}
			managerInfo = ("[" + manager.getName() + sep
					+ manager.getFamily() + sep + manager.getAge() + sep
					+ manager.getID() + sep + workersOfManagerInfo + "]\n");
			System.out.print(managerInfo);

		}

	}

	private static void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("Enter 1,2,3 and Other to Exit");
		System.out.println("1_Worker");
		System.out.println("2_Manager");
	}

}
