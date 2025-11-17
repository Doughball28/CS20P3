package SkillBuilders;

public class lesson2 {

	public static void main(String[] args) 
	{
		lesson stA = new lesson();

		System.out.println(stA.getfirstName());
		stA.setfirstName("AAA");
		System.out.println(stA.getfirstName());
		
		System.out.println(stA.getlastName());
		stA.setlastName("...");
		System.out.println(stA.getlastName());
		
		System.out.println(stA.getaddress());
		stA.setaddress("###");
		System.out.println(stA.getaddress());
		
		System.out.println(stA.getstuID());
		stA.setstuID(578430);
		System.out.println(stA.getstuID());
	}

}
