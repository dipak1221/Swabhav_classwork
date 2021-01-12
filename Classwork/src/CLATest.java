public class CLATest {
	public static void main(String[] args) {
	
		int sum=0;
		for (int i = 0; i < args.length; i++) {
			sum+=add(sum,Integer.parseInt(args[i]));
		}
		System.out.println("sum of no. is ="+sum);
		
		
	}
	
	

static int add(int a,int b){
		return a+b;
	}

}
