public class ArrayIntitution{

    //Method to manipulate the array
    public static void changeArray(int arr[],int index,int value)
    {
        //Base Condition always first
        if(index == arr.length)
        {
            printArray(arr);
            return;
        }
        //The work
        arr[index] = value;
        changeArray(arr, index + 1, value + 1);
        //BackTracking Step
        arr[index] = arr[index] - 2;
    }

    //To Print the elements of the array
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr,0,0);
        printArray(arr);
    }
}