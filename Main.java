public class Main {
    public static void main(String[] args) {
        
        int input = 10;
        int[] list = new int[input];



        for (int i = 0; i <  list.length;i++){
            list[i] = i *10;
        }

        System.out.print("\n list =  [ ");
        for (int num : list){
            System.out.print(num + ",");
        }
        System.out.print("]\n");

        System.out.println(list);
        Search s = new Search(list);
        s.search(20);
    }
}
