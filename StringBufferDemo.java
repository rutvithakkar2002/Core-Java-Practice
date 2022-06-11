public class StringBufferDemo {

	public static void main(String[] args) {
		//StringBuffer  ===  StringBuilder 
		
		StringBuffer sb = new StringBuffer("royaledu");
		System.out.println(sb);
		sb.append("AHMEDABAD");
		System.out.println(sb);   //we can modify String var
	
		String s = new String("royaledu");
		System.out.println(s);
		 s=s.concat("AHMEDBAD");
		System.out.println(s); //drawback of string-->we can not modify in that string, if you want to modify you have to create one variable and assign that value!!	

		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("java");
		System.out.println("----------java----append------");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("edu");
		sb1.append("12345678987654321");
		System.out.println(sb1);
	
	}
}