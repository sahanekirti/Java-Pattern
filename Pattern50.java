/*
1
12
123
1234
12345
1234
123
12
1
 */
public class Pattern50 {
    public static void main(String[] args) {
        	for(int i=0;i<9;i++)
	{
	for(int j=0;j<5;j++)
	{
	if(j-i<=0 && j+i<=8)
	System.out.print(j+1);//
	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
