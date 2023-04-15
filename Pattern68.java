/*
 1        1
12      12
123    123
1234  1234
1234512345

 */
public class Pattern68 {
    public static void main(String[] args) {
        	for(int i=0;i<5;i++)
	{
	for(int j=0;j<10;j++)
	{
	if(j-i<=0)
	System.out.print(j+1);//
	else if(j+i>=9)
	System.out.print((j+i)-8);//
	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
