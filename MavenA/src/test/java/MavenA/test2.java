package MavenA;

public class test2 {
int id;
String name;

 public void school(int i,String n){
	 id =i;
	 name = n;
	 }
	
	public void displayinfo(){
		System.out.println(id+" "+name);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     test2 ins=new test2();
     test2 ins2=new test2();
     ins.school(11, "satish");
     ins2.school(12, "kumar");
     ins.displayinfo();
     ins2.displayinfo();
   
	}

}
