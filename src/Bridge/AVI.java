package Bridge;

public class AVI implements VideoFile{

	@Override
	public void decode(String type, String fileName) {
		// TODO Auto-generated method stub
		 System.out.println("����ϵͳ��"+type+"�ļ����ƣ�"+fileName);  
	}

}
