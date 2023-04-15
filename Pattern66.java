/*
1        1
12      21
123    321
1234  4321
1234554321
 */

public class Pattern66 {
    public static void main(String[] args) 
    {

     

        for(int i=0;i<5;i++)
        {
        for(int j=0;j<10;j++)
        {
        if(j-i<=0)
        System.out.print(j+1);//
        else if(j+i>=9)
        System.out.print(10-j);//
        else
        System.out.print(" ");
        }
        System.out.println();
        }
        
    }
}

    
       