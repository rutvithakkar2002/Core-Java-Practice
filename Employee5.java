import java.util.Scanner;
class Employee5
{
	int id;
	String name;
	int salary;
	Address address;
	
	public Employee(int id,String name,int salary,Address address)
	{
		super(name);
		this.id=id;
		this.salary=salary;
		this.address=address;
	}
	public int getid()
	{
		return id;
	}
	public void setid()
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname()
	{
		this.name=name;
	}
	public int getsalary()
	{
		return salary;
	}
	public void setsalary()
	{
		this.salary=salary;
	}
	public String getaddress()
	{
		return address;
	}
	public void setid()
	{
		this.address=address;
	}
}
class Address
{
	int pincode;
	String city;
	String state;
	String cntry;
	
	public Address(int pincode,String city,String state,String cntry)
	{
		super();
		this.pincode=pincode;
		this.city=city;
		this.state=state;
		this.cntry=cntry;
		
	}
	public int getpincode()
	{
		return pincode;
	}
	
	public void setpincode(int pincode)
	{
		this.pincode=pincode;
	}
	public String getcity()
	{
		return city;
	}
	
	public void setcity(String city)
	{
		this.city=city;
	}
	public String getstate()
	{
		return state;
	}
	
	public void setstate(String state)
	{
		this.state=state;
	}
	public int getcountry()
	{
		return cntry;
	}
	
	public void setpincode(String cntry)
	{
		this.cntry=cntry;
	}
}