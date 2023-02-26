package classes;

public class Test {

	public static void main(String[] args) {
		System.out.println("*********Employeee Information**************");
		
		Employee e1=new Employee();
		e1.setName("arifa");
		e1.setEmpId("p24678");
		e1.setSalary(34000);
		e1.showEmp();
System.out.println("*************customer information*********** ");
		Coustomer c1=new Coustomer();
		c1.setName("eva");
	c1.setphnNo(5872527);
		c1.showCus();
		
		System.out.println("***********product information*************");
	
	
		LocalProduct l1=new LocalProduct();
		ImportedProduct ip1=new ImportedProduct();
		l1.setDiscountRate(40);
		l1.setPid("we45");
		l1.setName("fh");
		l1.setAvailableQuantity(6700);
		l1.setPrice(786.98);
		l1.showInfo();
		ip1.setPid("ty78");
		ip1.setAvailableQuantity(400);
		ip1.setName("baby cloths");
		ip1.setPrice(450);
		ip1.setCountryName("china");
		ip1.showInfo();
		
		
		
	}

}
