public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            
            // If target is greater, ignore left half
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        // Target is not present in the array
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 23, 45, 56, 67};
        int target = 10;
        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
