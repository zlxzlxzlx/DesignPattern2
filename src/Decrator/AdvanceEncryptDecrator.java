package Decrator;

import java.awt.Dialog.ModalExclusionType;

public class AdvanceEncryptDecrator extends EncryptDecrator{

	public AdvanceEncryptDecrator(Encrypt encrypt) {
		super(encrypt);
	}
	@Override
    public String encryptStr(String str) {    
        return this.advanceStr(super.encryptStr(str));
    }
	private String advanceStr(String str) {
		String string=str+"我是高级加密";
		return string;
	}
	

}
