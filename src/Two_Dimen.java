public class Two_Dimen {
    public static void main(String[] args) {

        //Declaring 2-d Arrays
        int A[][] = new int[5][5];
        int B[][]={{1,2,3},{4,5,6},{7,8,9}};
        int C[][];
        C=new int[5][5];

//        int []D[]=new int [5][5];
//        int []E,F[];
//        E=new int [5];  //This is an single dimension array.
//        //BUT
//        F=new int[5][5];
//        //This is an 2-d array because, int []E,F[]; can be broken as
//        //int []E; and int []F[];
//
//        int []e,f,g,h; //these all are 1-D arrays.

        //Printing array elements

        for (int i=0;i<B.length;i++)  //B.length will give the length of references
        {
            for (int j=0;j<B[0].length;j++)   //B[0].length will give the length of array that are pointed by references
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }

        for (int x[]:B)
        {
            for (int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Jagged array :- 2-D array with non-uniform columns.
        int J[][];
        J=new int [3][];
        J[0]=new int[2];
        J[1]=new int[3];
        J[2]=new int[4];

        for (int i=0;i<J.length;i++)
        {
            for (int j=0;j<J[i].length;j++)
            {
                System.out.print(J[i][j]+" ");
            }
            System.out.println("");
        }
        //this will print array with number of columns as given
        System.out.println();

        //using for each loop
        for (int x[]:J)
        {
            for (int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
