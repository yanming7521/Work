package text04;
public class Library {
private String title;
private String author;
private String pub;
public String  gettitle() {
	return title;
}
public String  getauthor() {
	return author;
}
public String  getpub() {
	return pub;
}
public void settitle(String title) {
	this.title=title;
}
public void setauthor(String author) {
	this.author=author;
}
public void setpub(String pub) {
	this.pub=pub;
}
public void print() {
	System.out.println("书名:《"+title+"》   作者:"+author+"   出版社:"+pub);
}
public static void main(String[] args) {
	Library book=new Library();
	Library book0=new Library();
	book0.print();
	book.settitle("三体");
	book.setauthor("刘慈欣");
	book.setpub("中国科幻基石丛书");
	book.print();
}
}
