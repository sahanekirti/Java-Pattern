/*
 9
98
987
9876
98765
987654
9876543
98765432
987654321
 */
public class Pattern43 {
    public static void main(String[] args) {
        	for(int i=0;i<9;i++)
	{
	for(int j=0;j<9;j++)
	{
	if(j-i<=0)
	System.out.print(9-j);//
     else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
