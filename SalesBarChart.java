//Cristiano Pereira
//CMP-129-80231
//Lab 2
// September 11th, 2026

import java.util.Scanner;

public class SalesBarChart {
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
            }
}
