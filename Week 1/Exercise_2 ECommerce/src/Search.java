public class Search {



    public Product linearSearch(Product[] products,int id){
        for(Product product : products){
            if(product.getProductId() == (id))
                return product;
        }
        return null;
    }


    public Product binarySearch(Product[] sortedArray,int id){
        int left = 0;
        int right = sortedArray.length - 1;
        int mid = -1;
        while (left <= right){
            mid = left + ((right - left) / 2);
            int currId = sortedArray[mid].getProductId();
            if(currId == id)
                return sortedArray[mid];
            else if(currId < id)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }
}
