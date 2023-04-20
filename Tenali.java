class Tenali
{
public static void main(String[] args)
{
Tenali story = new Tenali(); 
//story.find_security(1024); 
story.find_flowers(7);
//story.print_1();
}
void print_1()
{
int count=1;
while(count<=10)
{
System.out.println(1+"");
count=count+1;
  //count = count+1;
    //System.out.println(count);
//count=count+2;
}

}
void find_security(int beats)
{
int security = 0; 
while(beats>1)
{
//System.out.println("Each security gets "+ (beats/2));
beats = beats/2; 
security = security +1;
}
System.out.println("total no of securities:"+ security);
}

void find_flowers(int temples)
{
//initially flower cout is 1
//untill temple cout becomes 0
//flower count is flower*2
//temple is temple-1
int flowers=1;
while(temples>0)
{

flowers=flowers*2;
temples=temples-1;

}
System.out.println("Total flowers count"+flowers);
}

}

