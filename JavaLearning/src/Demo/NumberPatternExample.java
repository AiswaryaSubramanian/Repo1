package Demo;

public class NumberPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,count=0,m=0,num=10;
        for(i=0;i<num;i++)
        {
            count++;
           
            for(j=0;j<count;j++)
            {
            m++;
                System.out.print(m);
               
            }
            if(num==m)
            {
                break;
            }
            System.out.println();
        }
    }

}
