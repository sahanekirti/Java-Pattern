/*\
1
12
123
1234
12345
 */
public class Pattern35 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
	{
	for(int j=0;j<5;j++)
	{
	if(j-i<=0)
	System.out.print(j+1);//in vertical line take j+1 equation
	else
	System.out.print(" ");
	}
	System.out.println();
	}


    }
}
