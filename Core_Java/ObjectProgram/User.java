package ObjectProgram;

public class User {
	private String username;
	private String passwd;
	
	public void Set(String username,String passwd) {
	    if(username=="") {
	    	this.username="Username can't be empty";
	    }
		else if(username!="") {
			this.username=username;
		}
	    if(passwd.length()==0) {
	    	this.passwd="Password can't be empty";
	    }
	    else if(passwd.length()>6) {
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
