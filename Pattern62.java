/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */

public class Pattern62 {
    public static void main(String[] args) {
        int num=1;
        	for(int i=0;i<5;i++)
	{
        
	int num2=num;
	int diff=4;
	for(int j=0;j<5;j++)
	{
	if(j-i<=0)
	{
	System.out.print(num2+" ");//

	num2=num2+diff;
	diff--;
	}
	}
	System.out.println();
	num++;
	}

    }
}
