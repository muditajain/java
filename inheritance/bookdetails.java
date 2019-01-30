import java.util.*;
class bookdetails{
public static void main(String[] args){
Scanner input =new Scanner(System.in);
bookdetails mybook[] = new book[2];
for(int count=0;count<(mybook.length);count++)
{
System.out.println("enter book name:");
String bookname=input.nextLine();

System.out.println("enter department name:");
String departmentname=input.nextLine();
System.out.println("enter author name:");
String authorname=input.nextLine();
System.out.println("enter yop:"+"\nyear");
int year=input.nextInt();
input.nextLine();
mybook[count] = new book(bookname,authorname,departmentname,year);
System.out.println("bookname"+"\t"+"departmentname"+"\t"+"authorname");
System.out.print(bookname+"\t"+departmentname+"\t"+mybook[count]);
mybook[count].bookdetails();
}
}
}
write a java program to move all 0's  to the end of an array.maintain the relative order of the order (non zero)array elements