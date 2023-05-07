package forloop_package;

public class Forloop_programs {

	public static void main(String[] args) {
		Forloop_programs fp=new Forloop_programs();
		//fp.addition_of_number();
		//fp.addition_of_even_number();
//		fp.addition_of_odd_number();
//		fp.multiplication_of_number();
//		fp.print_n_number();
//		fp.print_1();
//		fp.print_even_numbers();
//		fp.print_11_multiplies();
		//fp.find_primeno();
		fp.find_common_divicer(100,200);
		

	}

	
	private void find_common_divicer(int i, int j) {
		int small=i<j?i:j;
		for(int div=2;div<small;div++)
		{
		if(small%div==0 && small%div==0)
		{
			System.out.println(div);
		}
		}
	}


	private void find_primeno() {
		int no=131;
		 int count=0;
		for( int div=2;div<no;div++)
		{
		if(no%div==0)
		{
			System.out.println(div);
			count=count+1;	
		}}
		System.out.println(count);
		if(count==0)
		{
			System.out.println("Prime No");
		}
		else
			System.out.println("Not prime");
	}

	private void print_11_multiplies() {
		for(int i=1;i<=1331;i=i*11)
		{
			System.out.println(i);
		}
		
	}

	private void print_even_numbers() {
		for(int i=2;i<=10;i=i+2)
		{
		System.out.println(i);
	}
	}
	private void print_1() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(1);
		}
		
	}

	private void print_n_number() {
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
		
	}

	private void multiplication_of_number() {
		int mul=1;
		for(int i=1;i<=5;i++) {
			mul=mul*i;
			
		}
		System.out.println(mul);
	}

	private void addition_of_odd_number() {
		int box=0;
		for(int n=1;n<=11;n+=2)
		{
			box=box+n;
		}
		System.out.println(box);
	}

	private void addition_of_even_number() {
		int box=0;
		for(int n=0;n<=10;n+=2)
		{
			box=box+n;
		}
		System.out.println(box);
	}

	private void addition_of_number() {
		int box=0;
		for(int n=1;n<=5;n++)
		{
			 box=box+n;
			
		}
		System.out.println("Addition of n numbers: "+box);
	}
	
	
	

}
