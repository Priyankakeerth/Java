class EBcalculator
{
int calculate_units()
{
int units=150;
int price=2;
System.out.println("Three:"+(units*price));

return units*price;

}


public static void main(String[] args)
{
EBcalculator reader= new EBcalculator();

int bill=reader.calculate_units();
System.out.println("one:"+bill);
int amount=500;
//int balance=amount-bill;
//System.out.println(balance);
reader.pay(amount,bill);
//reader.sub(10,20);
}
void pay(int amt, int bill_1)
{
System.out.println("Two:"+(amt-bill_1));
}
/*void sub()
{
int a; int b;
a=a-b;
System.out.println(a);


}*/
}
