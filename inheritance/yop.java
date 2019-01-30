public  class book
{
String bookname,departmentname,authorname;
yop d;
public book(String bname,String dename,String aname,int ye)
{
bookname=bname;
departmentname=dename;
d=new yop();
d.setyop(ye);
}
public void setbookname(String bname){
bookname=bname;
}
public String getbookname(){
return bookname;
}
public void setdepartmentname(String dename){
departmentname=dename;
}
public String getdepartmentname()
{
	return departmentname;
}
public void setauthorname(String aname){
	authorname=aname;
}
public String getauthorname()
{
	return authorname;
}

public void books(){
	System.out.print("details of books ");
	}
}
public class yop{
int year;
public void setyop(int year){
this.year=year;
}}