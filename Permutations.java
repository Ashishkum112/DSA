import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void returnPermutationalCombinations(String str,String ans)
    {
        //Base Case
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        //Iterate over all the elements
        for(int i=0;i<str.length();i++)
        {
            //Take the character and add
            char ch = str.charAt(i);
            //Remove the character for which the operation is done 
            String newString = str.substring(0,i) + str.substring(i+1,str.length());
            //Recursive Function for further
            returnPermutationalCombinations(newString, ans + ch);
        }
    }



    public static void returnPermutationalCombinationsForInteger(int arr[],List<Integer> innerList,List<List<Integer>> result)
    {
        //Base Case
        if(arr.length == 0)
        {
            result.add(new ArrayList<>(innerList));
            System.out.println(result);
            return;
        }
        // List<Integer> tempList = new ArrayList<>(innerList);
        //Iterate over all the elements
        for(int i=0;i<arr.length;i++)
        {
            //Take the Integer and add
            innerList.add(arr[i]);
            //Remove the Integer for which the operation is done 
            int newArray[] = removeIndexOfArray(arr, i);
            //Recursive Function for further
            returnPermutationalCombinationsForInteger(newArray, innerList   ,result);
            innerList.remove(innerList.size() - 1);
        }
    }
    public static int[] removeIndexOfArray(int arr[],int index)
    {
        int newArray[] = new int[arr.length - 1];
        int j = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if( i == index)
            {     
                continue;
            }
            else{
                newArray[j++] = arr[i];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        String str  = "abc";
        // returnPermutationalCombinations(str,"");
        int arr[] = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        returnPermutationalCombinationsForInteger(arr, innerList,result);
        System.out.println(result);
    }
}
