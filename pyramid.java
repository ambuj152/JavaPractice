public class pyramid {
    /**
     * @param args
     */
    public static void main(String[] args)
       {
         int a = 5;
         for(int i=1;i<=a;i++)
        {
           
            for(int j=0;j<=a-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++)
            {
                System.out.print("*");
            }
                 System.out.println(" "); 
        }
          
        }
    }
    

