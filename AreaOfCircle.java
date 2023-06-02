import java.util.Scanner;
class AreaOfCircle{
public static int area(float b){
float c;
c=(22*(b*b))/7;
System.out.println("area of circle is = "+c);
return 0;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
float a;
System.out.println("Enter the radies of circle");
a=sc.nextInt();
area(a);
}
}