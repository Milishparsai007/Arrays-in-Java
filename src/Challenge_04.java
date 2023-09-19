//1. Adding two matrices
//2. Multiplication of two matrices
//3. Sorting Array of strings


public class Challenge_04 {
    public static void main(String[] args) {

        int A[][]={{1,5,4},{3,6,7},{8,2,4}};
//        int B[][]={{8,2,4},{1,5,4},{3,6,7}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        int C[][]=new int[3][3];
        int D[][]=new int[3][3];


        for (int i=0;i<A.length;i++)
        {
            for (int j=0;j<A[0].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for (int x[]:C)
        {
            for (int y:x)
            {
                System.out.format("%02d ",y);
            }
            System.out.println();
        }

        //2. Multiplication
        for (int i=0;i<A.length;i++)
        {
            for (int j=0;j<A[0].length;j++)
            {
                D[i][j]=0;
                for (int k=0;k<A[0].length;k++)
                {
                    D[i][j]=D[i][j] + A[i][k]*B[k][j];
                }
            }
        }
        for (int x[]:D)
        {
            for (int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }

        //3. Sorting array of strings
        String arr[]={"java","python","ada","pascal","smalltank","basic"};
        //In java we have a package in java called util in which we have a class called Arrays inside which we have a method
        //called sort. usin gthis we can sort a array without applying any logic

        java.util.Arrays.sort(arr);
        for (String x:arr)
        {
            System.out.println(x);
        }

    }
}
