class Neonprogram
{
public static void main(String[] args)
{

int base=9; int power=2;
Neonprogram np=new Neonprogram();
int sumresult=np.sumof_digits(16);
System.out.println(sumresult);
int squareresult=np.square_program(4,2);
System.out.println(squareresult);

if(sumresult==base)
{
System.out.println("The given number is Neon NUmber");
}
else
{
System.out.println("Not Neon Number");
}


}


int sumof_digits(int num)
{
int sum=0;
while(num>0)
{
int rem=num%10;
sum=sum+rem;
num=num/10;
}
return sum;
}

int square_program(int base, int power)
{
 int box=1;
while(power>0)
{
box=box*base;
power=power-1;

}
return box;
}
}
