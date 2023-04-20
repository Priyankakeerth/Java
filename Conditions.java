class Conditions
{
public static void main(String[] args)
{

Conditions ad=new Conditions();
//ad.numbers();
//ad.even_numbers();
//ad.diff();
//ad.threes();
ad.big_numbers();

}
void numbers()
{
int a=1;

while(a<=10)
{

System.out.println("Add number within 10:" +a);
a=a+2;
}

}

void even_numbers()
{

int a=1;
while(a<=10)
{
a=a+1;
System.out.println("Print even numbers within ten:" +a);
a++;

}

}
void diff()
{
int a=1;
while(a<=13)
{
System.out.println("Print Numbers" +a);
a=a+3;

}
}
void threes()
{
int a=1;
while(a<=15)
{
a=a+2;
System.out.println("Print 3 of  numbers" + a);
a++;
}

}
void big_numbers()
{

int a=1;
while(a<=1500)
{

System.out.println("Print Numbers:" +a);
a=a*11;

}




}
}

