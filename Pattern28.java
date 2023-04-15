/*
      A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F
 */
public class Pattern28 {
    public static void main(String[] args) {
        	for(int i=0;i<6;i++)
	{
	for(int j=0;j<6;j++)
	{
	if(j+i>=5)
	System.out.print((char)((j+i)-5+65)+" ");
	else
	System.out.print(" ");
	}
	System.out.println("");
	}

    }
    
}
