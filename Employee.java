package classes;

public class Employee {
	private String name;                                            //joining and regine date need to implement 
	private String empId;
	private double salary;
	  
	public void setName(String name){
    this.name = name;
 }
	public void setEmpId(String empId){
    this.empId = empId;
                  }
	public void setSalary(double salary){
    this.salary = salary;
              }
	
	public String getName(){
    return name;
}
	public String getEmpId(){
    return empId;
} 
	public double getSalary(){
    return salary;
} 
	public void showAllEmployees() {
		System.out.println("employee name :" +this.name);
		System.out.println("employee empId :"+this.empId);
		System.out.println("employee salary :"+this.salary);
	}
}
