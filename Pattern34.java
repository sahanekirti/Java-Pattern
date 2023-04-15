/*
A
BG
CHM
DINS
EJOTY
FKPUZ_
 */
public class Pattern34 {
    public static void main(String[] args) {
        	int num=0;
	for(int i=0;i<6;i++)
	{
	int num2=num;
	int def=5;
	for(int j=0;j<6;j++)
	{
	if(j-i<=0)
	{
	System.out.print((char)(num2+65));
	num2= num2+def;

	}
	}
	System.out.println();
	num++;
	}

    }
    
}
