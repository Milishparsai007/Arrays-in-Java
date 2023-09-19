//1. Copying an array
//2. Reverse copying an array
//3. Increasing size of an array

public class Challenge_03 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        int b[]=new int[n];
        //1. Copying
        for (int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        System.out.println("elements of b array are : ");
        for (int x:b)
        {
            System.out.print(x+" ");
        }

        //2.Reverse copying array elements
        int c[]=new int[n];
        for (int i=n-1;i>=0;i--)
        {
            c[n-i-1]=a[i];
        }
        System.out.println("\nReverse copy of array a elements are in array c as follows :");
        for (int x:c)
        {
            System.out.print(x+" ");
        }

        //3. Increasing size of an array
        //You cannot increase size of an array once it is declared, it can only be done with the help of another array.
        //let's increase size of our array a to double its size.

        int d[]=new int [2*n];
        for (int i=0;i<n;i++)
        {
            d[i]=a[i];
        }
        a=d;
        System.out.println("\nLength of array a is : "+a.length);

    }
}
