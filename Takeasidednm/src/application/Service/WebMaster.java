package application.Service;

public class WebMaster {
	private String Id;
	private String first_name;
	private String last_name;
	private String gender;
	private String tNo;
	
	public WebMaster(String Id) {
		this.Id = Id;
	}
	
	public String getId() {
		return Id;
	}
	
	public String getName() {
		return first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getTNo() {
		return tNo;
	}
	
	public void setName(String a) {
		first_name = a;
	}
	
	public void setLastName(String a) {
		last_name = a;
	}
	
	public void setGender(String a) {
		gender = a;
	}
	
	public void setTNo(String a) {
		tNo = a;
	}
	
	@Override
	public boolean equals(Object anObject){
		if (anObject instanceof WebMaster){
			WebMaster y = (WebMaster) anObject;
			if (getId().equals(y.getId())){
				return true;
			}
			return false;
	    }
	    return false;
	}

}
