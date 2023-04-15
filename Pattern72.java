/*
 A   A
 A A
  A
 A A
A   A
 */
public class Pattern72 {
    public static void main(String[] args) {
        	for(int i=0;i<5;i++)
	{
	for(int j=0;j<5;j++)
	{
	if(j-i==0 || j+i==4)
	System.out.print("A");//
	else
	System.out.print(" ");
	}
	System.out.println();
	}


    }
}
