public class SubarraySum {


    //O(n) time complexity and O(n) space complexity - Bad approach
    public static void printSubarray(int arr[])
    {
       int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++)
        {
           
            for(int j=i; j<arr.length; j++)
            {
                 int sum = 0;
                for(int k=i; k<=j; k++)
                {
                    
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                if(sum>largest)
                    {
                        largest = sum;
                    }
                System.out.println();
            }
            System.out.println();
            
            
        }
        System.out.println("largest sum is: " + largest);
      
    }

    
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        printSubarray(arr);
       
    

    }
}
