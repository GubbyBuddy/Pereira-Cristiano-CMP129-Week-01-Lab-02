import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String chart = ""; 
        
        for(int i = 1; i <= 5; i++) {
            System.out.println("Please enter todays sales for store " + i + " :");
            int sales = scanner.nextInt();
            
            String stars = "";
            for (int f = sales; f >= 100; f -= 100){
                stars += "*";
            }
            
            chart += "Store " + i + " : " + stars + "\n";
        }
        
        System.out.print(chart);
        
        scanner.close();
    }
}
