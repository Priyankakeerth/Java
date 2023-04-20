class Story
{
public static void main(String[] args)
{
Story d= new Story();
d.howmany_eaten();
}

void howmany_eaten()
{
int remaining=8;
int first_time=1;
while(first_time<=3)
{
int eaten=remaining/2;

System.out.println("dosa:"+ eaten);
remaining=eaten*3;
first_time=first_time+1;

}

}
}
