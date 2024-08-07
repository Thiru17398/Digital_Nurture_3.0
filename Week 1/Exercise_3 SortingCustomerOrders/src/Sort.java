public class Sort {

    public void bubbleSort(Order arr[]){

        int len = arr.length;
        Order temp = null;

        for(int i = 0;i < len;i++){
            boolean swapped = false;
            for(int j = 0;j < len - i - 1;j++){
                if(arr[j].getTotalPrice() > arr[j + 1].getTotalPrice()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }

    public static void swap(Order[] orders,int i,int j){
        Order temp = orders[i];
        orders[i] = orders[j];
        orders[j] = temp;
    }

    public static int partion(Order[] orders,int low,int high){
        int i = low - 1;
        double pivot = orders[high].getTotalPrice();
        for(int j = low;j <= high;j++){
            if(orders[j].getTotalPrice() < pivot){
                i++;
                swap(orders,i,j);
            }
        }
        swap(orders,i + 1,high);
        return i + 1;
    }

    public void quickSort(Order[] orders,int low,int high){
            if(low < high){
                int pi = partion(orders,low,high);
                quickSort(orders,low,pi-1);
                quickSort(orders,pi + 1,high);
            }
    }
}
