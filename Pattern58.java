/*
    1
   121
  12321
 1234321
123454321
 */

public class Pattern58 {
    public static void main(String[] args) {
        	for(int i=0;i<5;i++)
          {
	int num=1;
	for(int j=0;j<9;j++)
         {
	if(j+i>=4 && j-i<=4)
	{
	System.out.print(num);//
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
