import java.util.Scanner;
public class Time2{
	Scanner sc=new Scanner(System.in);
	int hours;
	int minutes;
	int seconds;

Time2(int t){}
Time2(){
	System.out.println("Enter hours");
	this.hours=sc.nextInt();
	System.out.println("Enter minutes");
	this.minutes=sc.nextInt();
	System.out.println("Enter seconds");
	this.seconds=sc.nextInt();
}

Time2 sum(Time2 obj){
	Time2 sum=new Time2(1);
	sum.hours=this.hours + obj.hours;
	sum.minutes=this.minutes + obj.minutes;
	sum.seconds=this.seconds+obj.seconds;
	if(sum.seconds>=60){
		sum.minutes+=1;
		sum.seconds%=60;
	}
	if(sum.minutes>=60){
		sum.hours+=1;
		sum.minutes%=60;
	}
	return sum;
}

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first time");
	Time2 obj1=new Time2();
	System.out.println("Enter the second time");
	Time2 obj2=new Time2();
	Time2 sum=new Time2(1);
	sum=obj1.sum(obj2);

System.out.println("The first time is:" + obj1.hours + ":" + obj1.minutes + ":" + obj1.seconds);
System.out.println("The second time is:" + obj2.hours + ":" + obj2.minutes + ":" + obj2.seconds);
System.out.println("The sum is:" + sum.hours + ":" + sum.minutes + ":" + sum.seconds);
}
}

	



