class Looping_practice
{
public static void main(String[] args)
{
Looping_practice lp=new Looping_practice();
lp.print_reverse(9697);
//lp.find_countof_digits(123456);
//lp.fins_sumof_digits(9697);
//lp.reverse_number(1234);
//lp.find_palindrome(131); 
}

void print_reverse(int cake)
{
while(cake>0)

{
System.out.println(cake%10);//9697%10 =7
cake=cake/10; //9697/10= 969.7

}

}
void find_countof_digits(int cake)
{
int count=0;
while(cake>0)
{

count=count+1;
cake=cake/10;

}
System.out.println("total no of counts:"+ count);
}
void fins_sumof_digits(int cake)
{
int sum=0;
while(cake>0)
{

int rem=cake%10;
sum=sum+rem;
cake=cake/10;

}
System.out.println("Sum of digits:"+sum);

}
void reverse_number(int cake)
{
int reverse=0;
while(cake>0)//123//12
{
int rem=cake%10; //4 3
reverse=(reverse*10)+rem;// 0*10+4=4// 4*10+3=43
cake=cake/10;//1234/10=123//123/10=12
}

System.out.println("REverse number is:"+reverse);

}
void find_palindrome(int cake) //12321
{
    int num=cake;
    int reverse = 0;
    while(cake>0)   //123>0 12>0    1>0 
    {
    int rem = cake%10; //1
    reverse = (reverse * 10) + rem; //4 43  432 4321
    cake = cake/10; //0
     }
System.out.println("reverse no:"+reverse);
System.out.println(cake);
if(reverse == num)
    {
    System.out.println("Palindrome"); 
    }
else
    {
    System.out.println("Not Palindrome"); 
    }
}
}
