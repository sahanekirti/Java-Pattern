/*
 A
BB
CCC
DDDD
EEEEE
 */

public class Pattern23 {
    public static void main(String[] args) {
        
     for(int i=0;i<5;i++)
	{
	for(int j=0;j<5;j++)
	{
	if(j-i<=0)
	System.out.print((char) (i+65));
	}
	System.out.println("");
	}

    }
    
}
