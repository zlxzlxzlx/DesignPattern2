package Bridge;

public class AVI implements VideoFile{

	@Override
	public void decode(String type, String fileName) {
		// TODO Auto-generated method stub
		 System.out.println("操作系统："+type+"文件名称："+fileName);  
	}

}
