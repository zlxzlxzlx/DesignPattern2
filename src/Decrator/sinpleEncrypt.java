package Decrator;

import java.util.Scanner;

public class sinpleEncrypt extends Encrypt{

	@Override
	public String encryptStr(String  str) {
		// TODO Auto-generated method stub
		String encrypt=str+str;
		return encrypt;
	}

	

}
