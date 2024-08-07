public class Search {



    public Book linearSearch(Book[] books,String title){
        for(Book book : books){
            if(book.getName().toLowerCase().compareTo(title.toLowerCase()) == 0)
                return book;
        }
        return null;
    }


    public Book binarySearch(Book[] sortedArray,String title){
        int left = 0;
        int right = sortedArray.length - 1;
        int mid = -1;
        while (left <= right){
            mid = left + ((right - left) / 2);
            String currTitle = sortedArray[mid].getName();
            int res = currTitle.toLowerCase().compareTo(title.toLowerCase());
            if(res == 0)
                return sortedArray[mid];
            else if(res < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }
}
