public class NQueens {
    public static boolean isSafe(char nums[][],int row,int column)
    {
        //check horizontally
        for(int i=row-1;i>=0;i--)
        {
            if(nums[i][column] == 'Q')
            {
                return false;
            }
        }
        //check left diagonal
        for(int i=row-1,j=column-1;i>=0 && j>=0;i--,j--)
        {
            if(nums[i][j] == 'Q')
            {
                return false;
            }
        }
        //check right diagonal
        for(int i=row-1,j=column+1;i>=0 && j<nums.length;i--,j++)
        {
            if(nums[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }
    public static void printArray(char nums[][])
    {
        System.out.println("------------------Chess Box-------------------");
        for(int i =0;i< nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void placeQueen(char nums[][],int row)
    {
        // Base Condition
        if(row == nums.length)
        {
            printArray(nums);
            return;
        }
        //Work
        for(int j = 0;j<nums.length;j++)
        {
            if(isSafe(nums, row, j))
            {
            nums[row][j] = 'Q';
            placeQueen(nums, row+1);
            nums[row][j] = 'x';
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char nums[][] = new char[n][n];
        for(int i =0;i< nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j] = 'x' ;
            }
        }        
        placeQueen(nums,0);
    }
}
