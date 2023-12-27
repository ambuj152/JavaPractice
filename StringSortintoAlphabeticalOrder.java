public class StringSortintoAlphabeticalOrder {
      
        public static void main(String[] args) 
        {
            String inputString = "banana";
             char[] charArray = inputString.toCharArray();
              for (int i = 0; i < charArray.length; i++) 
              {
                for (int j = 0; j < charArray.length - 1; j++)
                 {
                if (charArray[j] > charArray[j + 1])
                {
                char temp = charArray[j];
                charArray[j] = charArray[j + 1];
                charArray[j + 1] = temp;
                }
                }
            }
              System.out.println( inputString);
                System.out.println(charArray);
        }
    }
    

