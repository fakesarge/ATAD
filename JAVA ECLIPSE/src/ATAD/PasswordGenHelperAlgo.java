package ATAD;

import java.util.ArrayList;
import java.util.Arrays;

public class PasswordGenHelperAlgo {
	private int Length = 0;
	private Boolean LwrChar, UpprChar, Numbers, SpecialChars;
	ArrayList<Character> password = new ArrayList<Character>();;
	
	char[] GenArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char[] Special = {'!','@','#','$','%','^','&','*','(',')','_','-','+','=','`','~',';',':','"','.',',','/','?','<','>','|'};

	
	public PasswordGenHelperAlgo() 
	{
		Length = 0;
		LwrChar = false;
		UpprChar = false;
		Numbers = false;
		SpecialChars = false;
		this.password = new ArrayList<Character>(8);
		int pl = 0;
	}
	
	public void update() 
	{
		int pl = password.size();
		for(int k = 0; k > Length; k++) {
					if(LwrChar){password.add(GenArray[(int)(Math.random()*GenArray.length)]);}
					if(UpprChar){password.add(GenArray[(int)(Math.random()*GenArray.length)]);}
					if(SpecialChars){password.add(Special[(int)(Math.random()*Special.length)]);}
					if(Numbers){password.add((char) ((int)(Math.random()*5)+5));}
					if(!LwrChar && !UpprChar && !SpecialChars && !Numbers) {password.add('_');}
			}
	}
		
	
	

	@Override
	public String toString() {
		String out = "";
		for(int i = 0; i < password.size();i++) {out+=password.get(i);}
		return out;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public Boolean getLwrChar() {
		return LwrChar;
	}

	public void setLwrChar(Boolean lwrChar) {
		LwrChar = lwrChar;
	}

	public Boolean getUpprChar() {
		return UpprChar;
	}

	public void setUpprChar(Boolean upprChar) {
		UpprChar = upprChar;
	}

	public Boolean getNumbers() {
		return Numbers;
	}

	public void setNumbers(Boolean numbers) {
		Numbers = numbers;
	}

	public Boolean getSpecialChars() {
		return SpecialChars;
	}

	public void setSpecialChars(Boolean specialChars) {
		SpecialChars = specialChars;
	}
	
}
