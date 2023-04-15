/*
 1
22
333
4444
55555
666666
7777777
88888888
999999999
 */
public class Pattern42 {
    public static void main(String[] args) {
        	for(int i=0;i<9;i++)
{	for(int j=0;j<9;j++)
	{
	if(j-i<=0)
       System.out.print(i+1);//
	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
