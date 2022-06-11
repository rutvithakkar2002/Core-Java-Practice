public class Stringsubstring
{
	public static void main(String[] args) 
	{
		char x[]={'r','o','y','a','l'};	
		String str="royal";
		String strx=new String(x);
		String g = "jony jony yes papa";
		System.out.println(g.substring(5));
		System.out.println(g.substring(5,15));//first arg inclusive ->start at 5th index, second arg exclusive -->end point is(15-1)
		
		System.out.println(g.replace('j', 'r'));
		System.out.println(g.replace("jony", "rony"));
	}
}