package test;
abstract class Role{
	private String name;
	private String sex;
	private int age;
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Role() {
		System.out.println("抽象类无参构造方法");
	}
	public Role(String name,String sex,int age) {
		this.name=name;
		this.sex=sex;
		this.age=age;
		System.out.println("抽象类有参构造方法");
	}
	abstract public void play();
}
class Employee extends Role{
	int salary;
	static int id;
	public Employee() {
		
	}
	public Employee(String name,String sex,int age) {
		super(name,sex,age);
		setName(name);
		setSex(sex);
		setAge(age);
		id++;
	}
	public Employee(String name,String sex,int age,int salary) {

		setName(name);
		setSex(sex);
		setAge(age);
		this.salary=salary;
		id++;
	}
	public void play() {
		System.out.println("职工编号:"+id+" 姓名:"+getName()+" 性别:"+getSex()+" 年龄:"+getAge()+" 工资:"+salary);
	}
	final void sing() {
		System.out.print("公司名称：翔远");
	}
}
class Manager extends Employee{
	final String vehicle="volk";
}
public class TestRole {
public static void main(String[] args) {

	Employee e1=new Employee("李四","男",25);
	e1.play();
	Employee e2=new Employee("张三","男",26,3000);
	e2.play();
	Manager ma=new Manager();
	ma.sing();
	System.out.println("  车辆:"+ma.vehicle);
	}
}
