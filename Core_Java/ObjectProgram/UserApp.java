package ObjectProgram;

public class UserApp {

	public static void main(String[] args) {
		User u=new User();
		u.Set("","123456abcd");
		System.out.println("username: "+u.GetUser());
		System.out.println("Password: "+u.GetPasswd());	

	}

}
