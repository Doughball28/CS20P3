package SkillBuilders;

public class lesson 
{
	private String firstName;
	private String lastName;
	private String address;
	private int stuID;
	
	public lesson()//constructor method
	{
		firstName = "";
		lastName = "";
		address = "";
		stuID = 000000;
	}
	
	public lesson(String f, String l, String ad, int ID )
	{
		firstName = f;
		lastName = l;
		address = ad;
		stuID = ID;
	}
	
	public String getfirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public String getaddress()
	{
		return address;
	}
	public int getstuID()
	{
		return stuID;
	}
	public void setfirstName(String f) 
	{
		firstName = f;
	}
	public void setlastName(String l) 
	{
		lastName = l;
	}
	public void setaddress(String ad) 
	{
		firstName = ad;
	}
	public void setstuID(int ID) 
	{
		stuID = ID;
	}
}
