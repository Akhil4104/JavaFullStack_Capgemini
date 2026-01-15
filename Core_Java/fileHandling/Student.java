package fileHandling;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Student implements Serializable{
	String name;
	int id;
	Student(){
		
	}
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		Student s1=new Student("Rahul",111);
		File f5=new File("E:\\FILEHANDLING\\StudentData.ser");
		try {
			f5.createNewFile();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		//serialization
		try {
			FileOutputStream foo =new FileOutputStream(f5);
			ObjectOutputStream out=new ObjectOutputStream(foo);
			out.writeObject(s1);
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		//deserialization
		try {
			FileInputStream fio=new FileInputStream(f5);
			ObjectInputStream in=new ObjectInputStream(fio);
			Student s=(Student)in.readObject();
			System.out.println(s.name);
			System.out.println(s.id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
