class Powerprogram
{
public static void main(String[] args)
{
Power_program pp=new Power_program();
pp.find_power(3,5);//3^5
}
void find_power(int base, int power)
{
int box=1;
while(power>0)
{
box=box*base;//3*3*3*3*3=243 //we can use local variable box initially=1 1*3 is first process once the process done we will minus 1 in power
power=power-1;//power-1 because one time (3) muliplied

}
System.out.println(box);
}
}


