public class invert_pyramid 
    {
        public static void main(String[] args) {
            int n = 5, k;
    
            for (int i = 0; i < n; i++) {
                k = i;
    
                for (int j = 0; j < 2 * n - i - 1; j++) {
                    if (k > 0) {
                        System.out.print("  ");
                        k--;
                    } else {
                        System.out.print("* ");
                    }
                }
                
                System.out.println();
            }
        }
    }
    
    

