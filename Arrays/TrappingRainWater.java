public class TrappingRainWater {


    //O(n) time complexity and O(n) space complexity - Bad approach
    static long trappingWater(int arr[], int n) { 
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        //left of first element is the element itself.
        leftMax[0] = arr[0];
        for(int i =1; i<n; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        
        //right of the last element is the element itself.
        rightMax[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--)
        {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        long trappingRainwater = 0;
        //loop
        for(int i =0; i<arr.length; i++)
        {
            //waterlevel = min(left(max) boundary, right(max) boundary)
            long waterLevel = Math.min(leftMax[i], rightMax[i]);
            
            // ans = waterlevel - height (w-x) (if width is not given 1 then -> ans = (waterlevel - height) * wodth)
            trappingRainwater += (waterLevel - arr[i]);
        }
        return trappingRainwater;
    } 
    
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 1, 3};
        System.out.println(trappingWater(arr, 5));
       
    

    }
}
