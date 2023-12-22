class Duplicate
{
   
    public static void main(String[] args)
    {
         int Student[]={3,9,18,3,28,6,17,9,3,6} ;
         for(int i=0;i<Student.length;i++) 
            {
             for(int j=i+1;i<Student.length;j++)
                   if( Student[i]==Student[j])
                      {  
                        System.out.println(Student[j]);
                        Student[j]=Student[j+1]; 
                        Student[i]=Student[i+1]; 
                     
                            
         
                      }
                      else
                      {
                       System.out.println("error");
                      
                      }
      
            }      

    }
}