public class Array {
    public static void main(String[] args)
    {
        int A[]=new int[5]; //method 1 for declaring an array.

        int B[]={1,2,3,4,5}; //MEthod 2 for declaring an array.

        int C[];
        C=new int[5];

        //modify value of B
        B[2]=15;
        for (int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
        System.out.println("");

        //using for each loop
        for (int x:B)
        {
            System.out.print(x+" ");
        }
        System.out.println("");
        //for each loop can be only used to access values of an array, not to modify them.
        for (int x:B)
        {
            System.out.print(x+++" "); //this will print array elements only
        }
        System.out.println("");

        //to change values of an array element we will use counter controlled loops

        for (int i=0;i<B.length;i++)
        {
            B[i]++;
        }

        for (int x:B)
        {
            System.out.print(x+" ");
        }

        //we cannot directly print all the array elements
        System.out.println(B);
        // this will print [I@7b23ec81 something like this(different for every machine)
        //which implies [ for this is an array I for an integer type array and rest is address

        System.out.println(B.length);


    }
}