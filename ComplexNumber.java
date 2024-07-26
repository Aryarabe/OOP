import java.util.Scanner;
class ComplexNumber{
	float real,image;

public ComplexNumber(float r,float i){
	this.real=r;
	this.image=i;
}

public void showC(){
	System.out.println(this.real + " + i" + this.image);
}

public static ComplexNumber sum(ComplexNumber n1, ComplexNumber n2){
	ComplexNumber res= new ComplexNumber(0,0);
	res.real=n1.real + n2.real;
	res.image=n1.image + n2.image;
	return res;
}

public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("The real and imaginary part of first number are:");
	float r=sc.nextFloat();
	float i=sc.nextFloat();
	ComplexNumber n1=new ComplexNumber(r,i);

	System.out.println("The real and imaginary part of second number are:");
	r=sc.nextFloat();
	i=sc.nextFloat();
	ComplexNumber n2=new ComplexNumber(r,i);
	
	System.out.println("The first number is:");
	n1.showC();

	System.out.println("The second number is:");
	n2.showC();

	ComplexNumber res=sum(n1,n2);

	System.out.println("The sum is:");
	res.showC();
}
}
	
