package ObjectProgram;

public class User {
	private String username;
	private String passwd;
	
	public void Set(String username,String passwd) {
		if(username!="") {
			this.username=username;
		}
		if(passwd.length()>6) {
			this.passwd=passwd;
		}
	}
	public String GetUser() {
		return username;
	}
	public String GetPasswd() {
		return passwd;
	}
}
