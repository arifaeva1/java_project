package classes;

public class Customer {
	private String name;                                            //selling date need to implement 
	private double phnNo;
	
	public void setName(String name){
 this.name = name;
 
 }
	public void setphnNo(double phnNo){
this.phnNo= phnNo;
}
	
	public String getName(){
return name;
}
	public double getphnNo(){
return phnNo;
} 
	public void showCus() {
		System.out.println("coustomer name :" +this.name);
		System.out.println("coustomer phnno :"+this.phnNo);
	
	}
}
