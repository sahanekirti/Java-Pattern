/*
 A
AB
ABC
ABCD
ABCDE
ABCD
ABC
AB
A
 */

public class Pattern25 {
    public static void main(String[] args) {
        	for(int i=0;i<9;i++)
	{
	for(int j=0;j<5;j++)
	{
	if(j-i<=0 && j+i<=8 )
	System.out.print((char)(j+65));
	else
	System.out.print("");
	}
	System.out.println("");
	}

    }
    
}
