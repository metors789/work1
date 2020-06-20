public class Fibonacci {
    static int[] fi=new int[201];
	public static void main(String[] args) {
		int i,j,m,n;
		for(i=1;i<=200;i++)
		{
			System.out.println("Fibonacci.of"+"["+i+"] == " +of(i));
		}
	}
	public static int of(int a) {
		int y = 0;
		if (a==1) {fi[1]=1;y=1;
		}
		if (a==2) {fi[2]=1;y=1;
		}
		if(a>2) {
			fi[a]=fi[a-1]+fi[a-2];
			y=fi[a];
		}
		return y;
	}
}
