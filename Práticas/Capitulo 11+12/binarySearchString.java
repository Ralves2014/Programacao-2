int binarySearchString(String[] xs, String x) {
    int low = 0;
    int high = xs.length - 1; 
    int mid = (low + high) / 2;
    
    while (low <= high && xs[mid].compareTo(x) != 0) {
        if (xs[mid].compareTo(x) < 0) {
            low = mid + 1;
        }
        else {
            high = mid - 1; 
        }
        mid = (low + high) / 2;  
    }
    
    if (low > high) 
        mid = -1; // NOT_FOUND;

    return mid;
}

