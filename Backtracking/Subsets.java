public class Subsets {
    public static void Subsets(String str,String ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
                
            }
            System.out.println(ans);
            return;
        }
      


         // Yes choice
        Subsets(str, ans + str.charAt(i), i + 1);

        // No choice 
        Subsets(str, ans, i + 1);
        }
        
       public static void findSubsets(String str, String ans, int i) {
            // Base case
            if (i == str.length()) {
                System.out.println(ans);
                return;
            }
    
            // Yes choice
            Subsets(str, ans + str.charAt(i), i + 1);
    
            // No choice
            Subsets(str, ans, i + 1);
        }
      
    

    
    
    
 

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);

      }
    
}
