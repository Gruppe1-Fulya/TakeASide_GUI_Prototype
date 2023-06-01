package application.Service;


public class User {
	
	private String email;
	private String first_name;
	private String last_name;
	private String gender;
	private String password;
	private int age;
	
	public User(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
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
	
	public int getAge() {
		return age;
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
	
	public void setPassword(String a) {
		password = a;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	@Override
	public boolean equals(Object anObject){
		if (anObject instanceof User){
			User y = (User) anObject;
			if (getEmail().equals(y.getEmail())){
				return true;
			}
			return false;
	    }
	    return false;
	}

}
