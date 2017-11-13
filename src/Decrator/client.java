package Decrator;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "abcdefg";
        Encrypt strEncrypt = new sinpleEncrypt();
        
        Encrypt reverse = new ReverseEncryptDecrator(strEncrypt);
        
        Encrypt advance = new AdvanceEncryptDecrator(strEncrypt);
        
        System.out.println(advance.encryptStr(str));
        
	}

}
