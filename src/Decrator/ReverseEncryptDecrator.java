package Decrator;

public class ReverseEncryptDecrator extends EncryptDecrator{

	public ReverseEncryptDecrator(Encrypt encrypt) {
		super(encrypt);
	
	}
	@Override
    public String encryptStr(String str) {    
        return this.reverseStr(super.encryptStr(str));
    }
	private String reverseStr(String str) {
		
		  StringBuffer sb=new StringBuffer(str);
	         sb=sb.reverse();//×Ö·û´®µÄ·­×ª
		  return sb.toString();
	}

}
