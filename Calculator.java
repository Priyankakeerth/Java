class Calculator
{
public static void main(String[] args)
{

Calculator calc=new Calculator();
calc.add();
calc.sub();
calc.mul(10,10);

}
void add()
{
int a=10;
int b=20;
int c= a+b;
System.out.println(c);
}

void sub()
{
System.out.println(20-10);
}
void mul(int no1, int no2)
{
System.out.println(no1*no2);

}
}
