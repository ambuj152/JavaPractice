public class ReverseString 
{
        public static void main(String[] args) 
        {
         String originalString = "Ambuj yadav";
            String reversedString = reverseString(originalString);
             System.out.println("Original String: " + originalString);
              System.out.println("Reversed String:" + reversedString);
        }
            public static String reverseString(String input) 
        {
              StringBuilder stringBuilder = new StringBuilder(input);
             stringBuilder.reverse();
            return stringBuilder.toString();
        }
           }
    



