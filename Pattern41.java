/*
1
12
123
1234
12345
123456
1234567
12345678
123456789
 */
public class Pattern41 {
    public static void main(String[] args) {
        	for(int i=0;i<9;i++)
	{
	for(int j=0;j<9;j++)
	{
	if(j-i<=0)
	System.out.print(j+1);//
	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
