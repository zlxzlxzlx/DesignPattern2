package Facade;

public class EncryptFacade {

	private FileReader reader;  
	private FileEncrypt encrypt;  
	private FileWriter writer; 
	public EncryptFacade(){
		reader=new FileReader();
		writer=new FileWriter();
		encrypt=new FileEncrypt();
	}
	public void fileEncrypt(){
		reader.read();
		writer.write();
		encrypt.encrypt();
	}
}
