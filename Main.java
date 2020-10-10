import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range of sorted number you want : ");
        int range = in.nextInt();
        int[] list = new int[range];


        for (int i = 0; i <  list.length;i++){
            list[i] = i *10;
        }

        System.out.print("\n list =  [ ");
        for (int num : list){
            System.out.print(num + ",");
        }
        System.out.print("]\n");


        Search s = new Search(list);

        while (true ){
            System.out.println("\nEnter the value you want to search : ");
            int value = in.nextInt();
            s.search(value);


            System.out.println("Do you want to search again '0' -> No anykey-> 'Yes' ");
            int option = in.nextInt();
            if (option == 0 ){
                break;
            }
        }
    }
}
