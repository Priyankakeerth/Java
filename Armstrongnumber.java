class Armstrongnumber
{
public static void main(String[] args)
{
Armstrongnumber am=new Armstrongnumber();
am.find_armstrong(67679);
}

void find_armstrong(int num)
{
int n=num;
int arms=0;
while(num>0)
{
int rem=num%10; //9 is remainder
arms=arms+(rem*rem*rem*rem*rem); //add rem 5 times becuase didgit 5 
num=num/10;
}
System.out.println(arms);
if(arms==n)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not Armstrong");//output is not armsstrong
}
}
}
