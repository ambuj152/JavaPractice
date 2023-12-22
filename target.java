/*Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.*/

class target{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=5;
        int num= arr.length-1;
        for(int i=0;i<num;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.print(arr[i]+",");
                     System.out.print(arr[j]);

                     
                     arr[j]=arr[j+1];  
                }arr[i]=arr[i+1];
            }
        }
    }
}