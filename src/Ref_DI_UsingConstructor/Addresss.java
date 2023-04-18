package Ref_DI_UsingConstructor;

public class Addresss {
	private String cityname;
	private String areaname;
	
	public Addresss(String cityname,String areaname) {
		super();
		this.cityname=cityname;
		this.areaname=areaname;
	}
	public String toString() {
		return "Address [cityname="+cityname+",areaname="+areaname+"]";
	}
	

}
