/*
 A
BA
CBA
DCBA
EDCBA
FEDCBA
 */

public class Pattern33 {
    public static void main(String[] args) {
        	for(int i=0;i<6;i++)
{
	for(int j=0;j<6;j++)
{
	if(j-i<=0)
	System.out.print((char)(+i-j+65));//instead of star write 5-j
	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
    
}
