package text;
/*一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？*/
public class Height {
	
public void sheight() {
	double hi=100.0,s=0;
	for(int i=0;i<10;i++) {
	s=hi+hi/2+s;//第i+1次落地+弹起
	hi=hi/2;    //第i+1次弹起
	}
	s=s-hi;     //第十次距离
	System.out.println("第十次落地经过"+s+"米  第十次反弹 "+hi+"米");
}
public static void main(String[] args) {
	Height a = new Height();
	a.sheight();
}
}
