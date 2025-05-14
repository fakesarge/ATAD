package ATAD;

import java.util.ArrayList;

public class PasswordGeneratorMethod {

	private int Length;
	private Boolean LwrChar, UpprChar, Numbers, SpecialChars;
	String password = "";
	
	public PasswordGeneratorMethod(int Length,Boolean LwrChar,Boolean UpprChar,Boolean Numbers,Boolean SpecialChars)
	{
		this.Length = Length;
		this.LwrChar = LwrChar;
		this.UpprChar = UpprChar;
		this.Numbers = Numbers;
		this.SpecialChars = SpecialChars;
		char[] GenArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] Special = {'!','@','#','$','%','^','&','*','(',')','_','-','+','=','`','~',';',':','"','.',',','/','?','<','>','|'};

	} 
	
	private int numOfParam() 
	{int output = 0;if(LwrChar){output++;}if(UpprChar){output++;}if(Numbers){output++;}if(SpecialChars){output++;}return output;
	}
	
	public String getPassword()
	{
		sefsfefsef
		while(password.length()>=this.Length) {
		int choice = (int)(Math.random()*this.numOfParam());
		System.out.println(choice);
		//Numbers
		if(choice==0)
		{
			password+= ""+ (int)Math.random()*10;
		}
		}
		return password;
	} 
	
 
	

}
