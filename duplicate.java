class Duplicate{
    /**
     * @param args
     */
    public static void main(String[] args) {
   int Student[]={3,9,18,3,28,6,17,9,3} ;
   for(int i=0;i<Student.length;i++) 
   {
    for(int j=i+1;i<Student.length;j++)
    
     if( Student[i]==Student[j])
      
     {  
         System.out.println(Student[j]);
        
         Student[i]=Student[i+1];
         Student[j]=Student[j+1];

         
        
     
     }
      
   }      

    }
}