public class ReverseArray {


    //O(n) time complexity and O(n) space complexity - Bad approach
    public static void reverse(int arr[])
    {
        int revarr[] = new int[arr.length];
        for(int i=arr.length-1, j=0; i>=0 && j<revarr.length; i--, j++)
        {
            revarr[j] = arr[i];
        }
        for(int i = 0; i<revarr.length; i++)
        {
            System.out.print(revarr[i]+" ");
        }
        System.out.println();
    }

    //   O(n) time complexity and O(1) space complexity - good approach
    public static void optimizedReverse(int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while(start<end)
        {
            arr[start] = arr[start]^arr[end];
            arr[end] = arr[start]^arr[end];
            arr[start] = arr[start]^arr[end];
            start++;
            end--;
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        reverse(arr);
        optimizedReverse(arr);
    

    }
}
