import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args){ 
        puzzle(); 
    }

    public static void puzzle() { 
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>(); 
        try { 
            Scanner sc = new Scanner(new File("day1.txt"));
            while(sc.hasNextLine()) { 
                int[] lr = calibrateStr(sc.nextLine());
                left.add(lr[0]);
                right.add(lr[1]); 
            }
            sc.close(); 
            
        } catch(Exception e){ 
            System.out.println("File not found!");
        }
    }
    public static int[] calibrateStr(String s) { 
        int[] values = new int[2];
        values[0] = Integer.parseInt(s.substring(0, 5));
        values[1] = Integer.parseInt(s.substring(8, 13)); 
        return values; 
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> data){ 
        ArrayList<Integer> newList = new ArrayList<>(); 
        
        return newList;
    }
}