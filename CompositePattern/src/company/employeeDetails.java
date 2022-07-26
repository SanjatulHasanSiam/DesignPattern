package company;

public class employeeDetails {

	public static void main(String[] args) {
		Grade7Employee arc1=new Grade7Employee("Raju", 1925001,"Architect");
		Grade7Employee arc2=new Grade7Employee("Rana", 1925003,"Architect");
		Grade4Employee arcMan=new Grade4Employee("Sunaan", 1925004,"Architect Manager");
		
		arcMan.addEmployee(arc1);
		arcMan.addEmployee(arc2);
		
		Grade7Employee dev1=new Grade7Employee("Siam", 19250025,"Developer");
		Grade7Employee dev2=new Grade7Employee("Hasan", 19250024,"Developer");
		Grade4Employee devMan=new Grade4Employee("Sanjatul", 19250026,"Developer Manager");
		
		devMan.addEmployee(dev1);
		devMan.addEmployee(dev2);
		
		
		Grade7Employee anl1=new Grade7Employee("Ayesha", 19250020,"Analyst");
		Grade7Employee anl2=new Grade7Employee("Rintu", 19250019,"Analyst");
		Grade4Employee anlMan=new Grade4Employee("Anupa",19250018,"Analyst Manager");
		
		anlMan.addEmployee(anl1);
		anlMan.addEmployee(anl2);
		
		Grade2Employee dir=new Grade2Employee("Tahmid", 19250014,"Director");
		
		dir.addEmployee(devMan);
		dir.addEmployee(anlMan);
		dir.addEmployee(arcMan);
		
		System.out.println(dir.showEmployeeDetails());
		
		
		
	}

}
