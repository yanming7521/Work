package text01;
public class People {
 public String name;
 public String sex;
 public int age;
 
 public People(String name,String sex) {
  this.name=name;
  this.sex=sex;
 }
 
 public People(String name,String sex,int age) {
  this.name=name;
  this.sex=sex;
  this.age=age;
 }
 
 public void introudce() {
  System.out.println("“大家好！我叫"+this.name+",我是一个"+this.sex+",我今年"+this.age+"岁”");
 }
 
  public static void main(String[] args) {
  
  People p1=new People("小美","女孩",12);
  p1.introudce();
  
  People p2=new People("小刘","男孩",12);
  p2.introudce();
 }

}
