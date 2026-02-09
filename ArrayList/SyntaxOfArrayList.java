package ArrayList;

import java.util.ArrayList;

public class SyntaxOfArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        //Adding an element in the ArrayList -> TC : O(1)
        list.add(1);
        list.add(2);

        //Adding an element in the ArrayList with index -> TC : O(1)
        list.add(1,100);
        list.add(2,20);

        //Getting an element in the ArrayList
        list.get(0);

        //Removing an element in the ArrayList
        // list.remove(0);

        //Set an element in the AL
        list.set(1, 10);


        //Check if contains or not ?
        System.out.println(list.contains(10));
        System.out.println(list.contains(100));

        //Loop on a ArrayList
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }

        
        list.add(102);
        list.add(101);
        list.add(100);
        list.add(109);
        list.add(18);
        
        System.out.println("\n"+ list);

        int max = Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i) > max)
            {
                max = list.get(i);
            }
        }

        System.out.println("\n"+ max);
        

        //Swapping in an array 
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;

        //Swap
        int i = 1;
        int j = 3;
        System.out.println("SWaaping");
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);

        System.out.println(list);

    }
}
