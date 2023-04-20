class Primeno
{
public static void main(String[] args)
{
Primeno p=new Primeno();
p.finding(20);
//p.fun();
}
/*void fun()
{
int a=1;
int no=5;
while(a<=5)
{
System.out.println(a);
a=a+1;
}

}
}*/
void finding(int no)
{
int div=2;
int count=0;
//int no=160;
while(div<no)
{
if(no%div==0)
{
System.out.println(div);
count++;
}
div++;
}

System.out.println("Total count of diviser:"+count);

if(count==0)
{
System.out.println("The given no is prime number");
}
else
{
System.out.println("The given no is NOt prime no");
}
}
}

