import java.util.*;

import classes.*;
import fileio.*;
import java.io.*;
public class Start {
	private int choice;
	private int option1;
	private int option2;
	private int option3;
	private int option4;
	private int option5;

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Market ma = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
	    Start st=new Start(); 
	    
		System.out.println("_________Welcome ,Our  Market Management Application____________");
	
		//boolean repeat = true;
		
		while(true)
		{
			System.out.println("                What do you want to do?\n");
			System.out.println("	            1. Employee Managing list ");
			System.out.println("	            2. Shop list ");
			System.out.println("	            3. Shop Product list");
			System.out.println("	            4. Product Quantity Add-Sell");
			System.out.println("                    5.customer list");
			System.out.println("	            6. Exit\n");
			System.out.println("     Thank you    ");
       try
	   {
			System.out.print("please ! Enter Your Choice: ");
			st.choice = in.nextInt();
	   }		
				
				
		catch(InputMismatchException mas)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
		
			switch(st.choice)
			{
				case 1:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Employee Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Insert New Employee");
					System.out.println("	2. Removing Existing Employee");
					System.out.println("	3. Show All Employees");
					System.out.println("	4. Search an Employee");
					System.out.println("	5. Go Back:thank you\n");
					
			try
	             {
			             System.out.print(" Enter Your Option: ");
			             st.option1 = in.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}	
					switch(st.option1)
					{
						case 1:
							System.out.println("Insert New Employee");
							System.out.print("Enter Employee ID: ");
							String empId1 = in.next();
							System.out.print("Enter Employee Name: ");
							String name1 = in.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = in.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							ma.insertEmployee(e1);
							System.out.println("done");
							break;
							
						case 2:
						
							System.out.println("************************");
							System.out.println("Remove an Existing Employee");
							System.out.print("Enter Employee ID: ");
							String empId2 = in.next();
					        Employee e2 = ma.getEmployee(empId2);
							
							if(e2 != null)
							{
								ma.removeEmployee(e2);
							}
							System.out.println("**********************");
							break;
							
						case 3:
							System.out.println("Show All Employees");
							ma.showAllEmployees();
							System.out.println("###########all emp#############");
							break;
						
						case 4: 
							System.out.println("Search an Employee");
							System.out.print("Enter Employee ID: ");
							String empId4 = in.next();              //string
							Employee e4 = ma.getEmployee(empId4);
							
							if(e4 !=null){
						        System.out.println("Employee ID: "+e4.getEmpId());
								System.out.println("Employee Name: "+e4.getName()); 
								System.out.println("Employee Salary: "+e4.getSalary());
								}
						       break;
			                      case 5:
						        System.out.println("Going Back......");
								default:
							System.out.println("sorry!Invalid Option");
						break;
						}
						System.out.println("--------------------------------");
						break;	
							case 2:
						System.out.println("You have choosen Shop Management");
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Shop");
					System.out.println("	2. Removie an Existing Shop");
					System.out.println("	3. Show All Shops");
					System.out.println("	4. Search a Shop");
					System.out.println("	5. Go Back:thank you\n");
							
					try {
					System.out.print("Your Option: ");
			             st.option2 = in.nextInt();
	              }		
					
						catch(InputMismatchException mas){	
		           System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
				switch(st.option2)
					{
						case 1:
							System.out.println("Insert New Shop");		
				            System.out.print("Enter Shop Id: ");
							String sid1 = in.next();
							System.out.print("Enter Shop Name: ");
							String name1 = in.next();
	                         Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name1);
							ma.insertShop(s1);
			             break;
							
						case 2:
					    System.out.println("Remove Existing Shop");
						System.out.print("Enter Shop ID: ");	
			             String sid2 = in.next();
							Shop s2 = ma.getShop(sid2);
							if(s2 != null){
							ma.removeShop(s2);
							}
							break;
							case 3:
					         System.out.println("Show All Shops");
							ma.showAllShops();
							System.out.println("###########all shop#############");
							break;
									case 4:
							System.out.println("Search a Shop");
							System.out.print("Enter Shop ID: ");
							String sid4 = in.next();
							Shop s4 = ma.getShop(sid4);
							if(s4 !=null){
						    System.out.println("Shop ID: "+s4.getSid());
								System.out.println("Shop Name: "+s4.getName());
								s4.showAllProducts();
								}
							break;
							 	case 5:
							System.out.println("Going Back......");
							
							break;
							default:
						System.out.println("Invalid Option");
							
							break;
							}
						case 3:
				System.out.println("You have choosen Shop Product Management");
			        System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Product");
					System.out.println("	2. Remove Existing Product");
					System.out.println("	3. Show All Product");
					System.out.println("	4. Search a Product");
					System.out.println("	5. Go Back:thank you\n");
					
						try{
							System.out.print("Your Option: ");
			             st.option3 = in.nextInt();
						}
						catch(InputMismatchException mas){
		System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
		switch(st.option3){
				case 1:
					Product p = null;	
				System.out.println("Insert New Product for a Shop\n");
				System.out.println("Which type of Product do you want to Insert?\n");
							System.out.println("	1. Local Product list ");
							System.out.println("	2. Imported Product list ");
							System.out.println("	3. Go Back:thank you");
							
							System.out.print("Enter Your Product Type: ");
							int type = in.nextInt();
				if(type == 1){
							LocalProduct lp = new LocalProduct();
							System.out.print("Enter Product ID: ");
								String pid1 = in.next();
								System.out.print("Enter Product Name: ");
								String pn1 = in.next();
								System.out.print("Enter Product Available Quantity: ");
								int pq1 = in.nextInt();
								System.out.print("Enter Product Price: ");
								double pp1 = in.nextDouble();
								System.out.print("Enter Discount Rate: ");
								double ds1 = in.nextDouble();
								
								lp.setPid(pid1);
								lp.setName(pn1);
								lp.setAvailableQuantity(pq1);
								lp.setDiscountRate(ds1);				
							p = lp;
						}
				else if(type == 2){
					ImportedProduct ip = new ImportedProduct();
						System.out.print("Enter Product ID: ");
								String pid2 = in.next();
								System.out.print("Enter Product Name: ");
								String pn2 = in.next();
								System.out.print("Enter Product Available Quantity: ");
								int pq2 = in.nextInt();
								System.out.print("Enter Product Price: ");
								double pp2 = in.nextDouble();
								System.out.print("Enter country Name: ");
								String cn1 = in.next();		
						        ip.setPid(pid2);
								ip.setName(pn2);
								ip.setAvailableQuantity(pq2);
								ip.setCountryName(cn1);
								p = ip;
									}
							else if(type == 3){
								System.out.println("Going Back.......");
							}
							else{
								System.out.println("Invalid Type");
							}
							
							if(p!= null){
								System.out.print("Enter Shop ID: ");
								String sid1 = in.next();
								ma.getShop(sid1).insertProduct(p);
							}
							break;
							case 2:
						    System.out.println("Remove Existing Product");
					        System.out.print("Enter Shop sID: ");
							String sid2 = in.next();
							System.out.print("Enter Product ID: ");
							String pid2 = in.next();
							ma.getShop(sid2).removeProduct(ma.getShop(sid2).getProduct(pid2));
							break;
						case 3: 
						    System.out.println("Show All Product in Shop");
							System.out.print("Enter Shop ID: ");
							String sid3 = in.next();
							ma.getShop(sid3).showAllProducts(); 
							break;
							case 4:
							System.out.println("Search a Product\n");
							System.out.print("Enter Shop ID: ");
							String sid4 = in.next();
							System.out.print("Enter Product ID: ");
							String pid4 = in.next();
						   Product p1 = ma.getShop(sid4).getProduct(pid4);
						//if(p1 != null){
							//p1.showInfo();
							//}
						break;
						case 5:
				System.out.println("Going Back..");
				break;
				default:
				System.out.println("Invalid Option");
			break;
					}
				break;
				case 4:
				  System.out.println("You have choosen Product Quantity Add-Sell");
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Add Product");
					System.out.println("	2. Sell Product");
					System.out.println("	3. Show Add Sell History");
					System.out.println("	4. Go Back\n");
						try{
			             System.out.print("Your Option: ");
			             st.option4 = in.nextInt();
	              }		
				catch(InputMismatchException mas){
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
		switch(st.option4){
						case 1:
						System.out.println("Add Product");
							System.out.print("Enter Shop ID: ");
							String sid1 = in.next();
							System.out.print("Enter Product ID: ");
							String pid1 = in.next();
							System.out.print("Enter Add Amount: ");
							int amount1 = in.nextInt();
							if(amount1>0){
								ma.getShop(sid1).getProduct(pid1).addQuantity(amount1);
								frwd.writeInFile(amount1+" Quantity has been Added in Product ID "+ pid1);
							}
							break;
				case 2:
						   System.out.println("Sell Product");
							System.out.print("Enter Shop ID: ");
							String sid2 = in.next();
							System.out.print("Enter Product ID: ");
							String pid2 = in.next();
							System.out.print("Enter Add Amount: ");
							int amount2 = in.nextInt();
							
							if(amount2>0 && amount2<=ma.getShop(sid2).getProduct(pid2).getAvailableQuantity()){
								ma.getShop(sid2).getProduct(pid2).sellQuantity(amount2);
								frwd.writeInFile(amount2+" Quantity has been Sold from Product ID "+ pid2);
							}
							break;
					case 3:
			System.out.println("Show Add-Sell History\n");
							frwd.writeInFile("");
							System.out.println("#########################");
							break;
						case 4:
						System.out.println("going back....");
						break;
		}
				case  5:
					System.out.println("");
						try{
				             System.out.print("Your Option: ");
				             st.option5 = in.nextInt();
		              }		
					catch(InputMismatchException mas){
				System.out.println("Input Mismatch Exception Occured please run again and give valid input");
			     break;
			}
						
	switch(st.option5){
					case 1:
					System.out.println("Add Customer");
						System.out.print("Enter customer name: ");
						String cu1 = in.next();
						System.out.print("Enter phnno : ");
						int am1 = in.nextInt();
						Customer cu=new Customer();
						cu.setName(cu1);
						ma.insertCustomer(cu1);
						break;
		
				case 2:
		System.out.println("Show all customer History\n");
		ma.showallCustomer();
						System.out.println("\n#########################");
						break;
					case 3:
					System.out.println("going back....");
						break;
                    case 4:
					System.out.println("You have choosen to Exit");
					break;
		default:
	System.out.println("Invalid Choice");
				break;
			}
		}
  	}
  }
}
