package SkillBuilders;

public class lesson2 {

	public static void main(String[] args) 
	{
		lesson stA = new lesson();

		System.out.println(stA.getfirstName());
		System.out.println(stA.getlastName());
		System.out.println(stA.getaddress());
		System.out.println(stA.getstuID());

		System.out.println("-----------------------");
		
		lesson stB = new lesson("derek","Jake","63 Slate Street",124893);
		
		System.out.println(stB.getfirstName());
		System.out.println(stB.getlastName());
		System.out.println(stB.getaddress());
		System.out.println(stB.getstuID());
	}
}
