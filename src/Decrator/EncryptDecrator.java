package Decrator;

public class EncryptDecrator extends Encrypt{

    private Encrypt encrypt;
    
    public EncryptDecrator(Encrypt encrypt){
        this.encrypt = encrypt;
    }

	@Override
	public String encryptStr(String str) {
		// TODO Auto-generated method stub
		return encrypt.encryptStr(str);
	}




}
