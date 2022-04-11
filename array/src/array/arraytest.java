package array;

public class arraytest {

	public static void main(String[] args) {
		int a[]= {2,4,7,1,5};
		int b[]=new int[5];
		int i,s=0;
		for (i=0;i<=4;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (i=0;i<=4;i++)
		{
			s=s+a[i];
		}
		System.out.println("sum="+s);
		for (i=0;i<=04;i++)
			{a[i]=a[i]*2;}
		for (i=0;i<=4;i++)
			{
				b[i]=a[i];
			}
		for (i=0;i<=4;i++)
			System.out.print(b[i]+"  ");
		System.out.println();
		
		// TODO Auto-generated method stub

	}

}
