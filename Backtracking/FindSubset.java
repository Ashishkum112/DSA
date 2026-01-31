import java.util.ArrayList;
import java.util.List;

public class FindSubset {
     public static void checkSubset(String str,String ans,int i)
     {
          //Base
          if(i == str.length())
          {
               if(ans.length() == 0)
               {
                    System.out.println("null");
               }
               else
               {
                    System.out.println(ans);
               }
               return;
          }
          //Work
          //Ask Question
          // For Yes 
          checkSubset(str, ans + str.charAt(i), i+1);
          //For No
          checkSubset(str, ans, i+1);
     }
     public static void checkSubset(String str,String ans,int i,List<List<Integer>> resultList)
     {
          //Base
          if(i == str.length())
          {
               List<Integer> innerList = new ArrayList<>();
               if(ans.length() == 0)
               {
                    System.out.println("null");
               }
               else
               {
                    System.out.println(ans);
               }
               if(ans == "")
               {
                    resultList.add(new ArrayList<>());
               }
               else
               {
                    innerList.add(Integer.parseInt(ans));
                    resultList.add(innerList);
               }
               // System.out.println(resultList);
               return;
          }
          //Work
          //Ask Question
          // For Yes 
          checkSubset(str, ans + str.charAt(i), i+1,resultList);
          //For No
          checkSubset(str, ans, i+1,resultList);
     }
     public static void main(String[] args) {
        String str = "abc";
        String empString = "";
        int initial = 0;
     //    checkSubset(str,empString,initial);
        int n = 123;
        String convertN = String.valueOf(n);
     //    checkSubset(convertN,empString,initial);
        int arr[] = {1,2,3};
        StringBuilder sb = new StringBuilder();
        for( int x : arr)
        {
          sb.append(x);
        }
        List<List<Integer>> resultList = new ArrayList<>();
        checkSubset(sb.toString(),empString,initial,resultList);
        System.out.println(resultList.toString());

     }   
}
