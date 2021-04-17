package student;
import java.util.Scanner;

 class Student1 {
	String name;
	String clas;
	int age;
	int txt;
	char nv;
	
	public Student1 (String clas, String name, int age, int txt, char nv) {
	this.name = name;
	this.age = age;
	this.clas = clas;
	this.txt = txt;
	this.nv = nv;
	}

	public void say() {
		System.out.println("班级:"+clas+" 姓名:"+name+" 年龄:"+age+" 性别:"+nv+" 成绩:"+txt);
	}
}

 public class Student{
	 public static void main(String[] args) {
		    String name;
			String clas;
			int age;
			int txt;
			char nv;
			Scanner in= new Scanner(System.in);
	for(int i=1;i<4;i++) {
		clas = in.next();
		name = in.next();
		age = in.nextInt();
		txt = in.nextInt();
		nv = in.next().charAt(0);
		Student1 pi = new Student1(clas, name, age, txt, nv);
		pi.say();
	}

	in.close();
	}
 }
