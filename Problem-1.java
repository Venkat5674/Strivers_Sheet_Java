import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        // Read an integer from the Scanner
        int number = sc.nextInt();

        // Print the number
        System.out.println(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        Solution sol = new Solution();         
        sol.printNumber(sc);                   
        sc.close();                            
    }
}
