package Ref_DI_UsingConstructor;

public class Student {
	private int sid;
	private String sname;
	private String address;
	
	public  Student(int sid,String sname,String address) {
	    super();
		this.sid=sid;
		this.sname=sname;
		this.address=address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname +"address="+address+ "]";
	}
	

}
