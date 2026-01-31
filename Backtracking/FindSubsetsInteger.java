import java.util.ArrayList;
import java.util.List;

public class FindSubsetsInteger {
    public static void findSubsets(int arr[],List<Integer> innerList,int i,List<List<Integer>> result)
    {
        //Base Case
        if( i == arr.length)
        {
            result.add(innerList);
            return;
        }
        List<Integer> checkList = new ArrayList<>(innerList);
        checkList.add(arr[i]);
        //Ask the question
        //For Yes
        findSubsets(arr, checkList, i+1, result);
        //For No
        // innerList.remove(i);    
        findSubsets(arr, innerList, i+1, result);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        findSubsets(arr,innerList,0,result);
        System.out.println(result.toString());
    }
}