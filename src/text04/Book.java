package text04;
public class Book {
private String title;
private int PageNum;
public String  gettitle() {
	return title;
}
public int getPageNum() {
	return PageNum;
}
public void settitle(String title) {
	this.title=title;
}
public void setPageNum(int num) {
	this.PageNum=num;
}
public void detail() {
	System.out.println("书名:《"+title+"》   总页数:"+PageNum);
}
public static void main(String[] args) {
	Book book1=new Book();
	Book book2=new Book();
	book1.settitle("唐诗三百首");
	book1.setPageNum(189);
	book2.settitle("三体");
	book2.setPageNum(10000);
	book1.detail();
	book2.detail();
}
}
