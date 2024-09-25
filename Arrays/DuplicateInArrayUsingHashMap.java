import java.util.*;

 class Solution {

	public ArrayList<Integer> findDuplicate(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<arr.size(); i++)
		{
			if(map.get(arr.get(i)) == null)
			{
				map.put(arr.get(i), 1);
			}
			else{
				map.put(arr.get(i), map.get(arr.get(i))+1 );
			}
		}
        for(Integer m: map.keySet())
        {
            if(map.get(m) > 1)
            {
                ans.add(m);
            }
        }
        return ans;
	}
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(23);
        arr.add(23);
        Solution ob = new Solution();
        System.out.println(ob.findDuplicate(arr));
    }
}