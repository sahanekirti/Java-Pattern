/*
 1
121
12321
1234321
123454321
 */

public class Pattern57 {
    public static void main(String[] args) {
        	for(int i=0;i<9;i=i+2)
	{
	int num=1;
	for(int j=0;j<9;j++)
    	{
	if(j-i<=0)
	{
	System.out.print(num);//
	}
	if(2*j-i<0)
	num++;
	else
	num--;
	}
	System.out.println();
	}

    }
}
