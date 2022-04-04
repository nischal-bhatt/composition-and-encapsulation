
public class MainClass {
  public static void main(String[] args)
  {
	  Laptop laptop = new Laptop();
	  System.out.println(laptop);
	  
	  System.out.println(laptop.getProcessor().getBrand());
  
	  Person p = new Person();
	  
	  if (p.setAge(-2))
	  {
		System.out.println(p.getAge());  
	  }else
	  {
		  System.out.println(p.getAge());
		  System.out.println("wrong age enetered");
	  }
  
  }
}
