package test03;

class Account{
	String name;
	String acc;
	int money;
	static int num;
	public Account() { 
	num++;
	}
	public Account(String acc,String name,int money) {
		this.acc=acc;
		this.name=name;
		this.money=money;
		num++;
	}
	public void in(int money) {
		this.money=money+this.money;
		System.out.println(this.name+" 存入："+money);
	}
	public void out(int money) {
		if(this.money<money) System.out.println("余额不足，取款失败！！");
		else {
		this.money=this.money-money;
		System.out.println(this.name+" 取出："+money);
		}
	}
	public void transfer(Account p1,Account p2,int inout) {
		if(p1.money<inout) System.out.println("余额不足，无法转账！！");
		else {
		p1.money-=inout;
		p2.money+=inout;
		System.out.println(p1.name+"给"+p2.name+"转账："+inout);
		}
	}
	public void say() {
		System.out.println(num+" 账号："+this.acc+" 户名："+this.name+"  存款："+this.money);
	}
	public void sayout() {
		System.out.println(this.name+" 余额："+this.money);
	}
}
class Regular extends Account{
	int time;
	public Regular(String acc,String name,int money,int time) {
		this.acc=acc;
		this.name=name;
		this.money=money;
		this.time=time;
	}
	public void in(int money) {
		System.out.println("不可用！！");
	}
	public void out(int money) {
		System.out.println("不可用！！");
	}
	public void transfer(Account p1,Account p2,int inout) {
		System.out.println("不可用！！");
	}
	public void in(int money,int time) {
		if(this.time>time) System.out.println("不满足定期账户存款业务！！"+(this.time-time)+"天后重试！");
		else {
			this.money=money+this.money;
			System.out.println(this.name+" 存入："+money);
		}
	}
	public void out(int money,int time) {
		if(this.money!=money&&this.time>time) System.out.println("不满足定期账户取款业务！！");
		else {
		this.money=this.money-money;
		System.out.println(this.name+" 取出："+money);
		}
	}
	public void transfer(Account p1,Account p2,int inout,int time) {
		if(p1.money!=inout&&this.time>time) System.out.println("不满足定期账户转账业务！！");
		else {
		p1.money-=inout;
		p2.money+=inout;
		System.out.println(p1.name+"给"+p2.name+"转账："+inout);
		}
	}
	public void say() {
		System.out.println(num+" 定期卡账号："+this.acc+" 户名："+this.name+"  存款："+this.money+"  期限："+this.time);
	}
}
class Credit extends Account{
	int over;
	public Credit(String acc,String name,int money,int over) {
		this.acc=acc;
		this.name=name;
		this.money=money;
		this.over=over;
	}

	public void out(int money) {
		if(this.money+this.over<money) System.out.println("可透支余额不足，取款失败！！");
		else {
		this.money=this.money-money;
		System.out.println(this.name+" 取出："+money);
		}
	}
	public void transfer(Account p1,Account p2,int inout) {
		if(p1.money+this.over<inout) System.out.println("可透支余额不足，无法转账！！");
		else {
		p1.money-=inout;
		p2.money+=inout;
		System.out.println(p1.name+"给"+p2.name+"转账："+inout);
		}
	}
	public void say() {
		System.out.println(num+" 信用卡账号："+this.acc+" 户名："+this.name+"  存款："+this.money+"  可透支："+this.over);
	}
	public void sayout() {
		System.out.println(this.name+" 余额："+this.money+" 可透支金额："+this.over);
	}
}
public class TestAccount {
public static void main(String[] args) {
	Regular p3=new Regular("003","王五",10000,365);
	p3.say();
	Credit p4=new Credit("004","李丽",1000,5000);
	p4.say();
	p3.in(1000,300);
	p3.out(500,300);
	p3.sayout();
	p4.in(2000);
	p4.out(300000);
	p4.sayout();
}
}
