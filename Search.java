public class Search {
    


    int [] list;
    

    Search(int[] list){
        this.list = list;
        

    }

    public void search(int value){
        int low = 0;
        int high = this.list.length-1;
        
        int mid;
        boolean found = false;
        int iterations = 0;
        while (low < high){
            mid = (low + high)/2;
            iterations ++;
            if (value == this.list[mid]){
                System.out.println("value : " + value + " was found at index " + mid);
                System.out.println("Found After " + iterations + " iterations.");
                found = true;
                break;
            }else if (value > this.list[mid]){
                low = mid + 1;

            }else if (value < this.list[mid]){
                high = mid - 1;
            }
        }
        if (!found){

            System.out.println("value " + value + " was not found.");
            System.out.println("Not Found After " + iterations + " iterations.");

        }
    }

}
