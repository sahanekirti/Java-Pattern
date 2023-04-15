/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 */
public class Pattern60 {
    public static void main(String[] args) {
        	for(int i=0;i<5;i++)
	{
	int num=1;
	for(int j=0;j<9;j++)
	{
	if(j+i>=4 && j-i<=4)
	{
	System.out.print((char)(num+64));//
	if(j<4)
	num++;
	else
	num--;
	}
	else
	System.out.print(" ");
	}
System.out.println();
	}

    }
}
