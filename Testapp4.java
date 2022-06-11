class Testapp4
{
	public static void main(String args[])
	{
		Address a1=new Address(380015,"ahmedabad","Gujarat","india");
		Employee5 e1=new Employee5("Rutvi","1",40000,"satellight ahmedabad");
		Address a1=e1.getaddress();
		System.out.println(e1.getid()+" "+e1.getname()+" "+e1.getsalary()+" "+a1.getcity()+" "+a1.getcntry());
	}
}