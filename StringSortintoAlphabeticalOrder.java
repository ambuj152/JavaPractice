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
               String sortedString = new String(charArray);
              System.out.println("Original String: " + inputString);
                System.out.println("Sorted String: " + sortedString);
        }
    }
    

