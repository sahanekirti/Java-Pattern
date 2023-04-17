public class Pattern122 {
    public static void main(String[] args) {
        for(int i=0;i<9;i++)
        {
            for (int j=0;j<9;j++)
            {
                if(i==0|| j==8||i==8|| j==4 || i==4 || j==0)
            
            {
                System.out.print("*"+" ");

            }
        else
    {
        System.out.print(" "+" ");

    }}
       System.out.println();
        }
    }
}
