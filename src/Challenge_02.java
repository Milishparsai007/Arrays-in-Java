//1.Rotating an array
//2.Inserting an element
//3.Deleting an element


import java.util.Scanner;
public class Challenge_02 {
    public static void main(String[] args) {
        //1.
        //Rotating an array means:- 1.Left rotation :- shifting every element to left by one place
        //                          2.right rotation:- "                       " right"          "

        int a[]={5,9,6,10,12,7,3,5,4,2};
        int b[]={5,9,6,10,12,7,3,5,4,2};

        //1.Left rotation
        System.out.println("Array before left rotation");
        for (int x:a)
        {
            System.out.print(x+" ");
        }
        int temp=a[0];  //simply 1st element of array
        System.out.println("");
        System.out.println("Array after left rotation");
        for (int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp; //now store the first element to last index
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println("");

        //2.Right rotation
        System.out.println("Array before right rotation");
        for (int x:b)
        {
            System.out.print(x+" ");
        }
        System.out.println("");
        System.out.println("Array after right rotation");
        int temp1=b[b.length-1]; //store last element to temporary variable
        for (int i= b.length-1;i>=1;i--)
        {
            b[i]=b[i-1];
        }
        b[0]=temp1;
        for (int x:b)
        {
            System.out.print(x+" ");
        }
        System.out.println("");


        //2.Inserting
        int c[]=new int[10];
        //array elements ={1,5,4,6,3,12,8};
        c[0]=1;
        c[1]=5;
        c[2]=4;
        c[3]=6;
        c[4]=3;
        c[5]=12;
        c[6]=8;
        int n=7;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the location at which you want to insert the element : ");
        int loc=sc.nextInt();
        System.out.println("Enter the element : ");
        int element=sc.nextInt();
        if(loc>=n)  //i.e., if element inserted at empty location just after the last element of array then simply do this
        {
            c[n]=element;
        }
        else
        {
            int temp2=c[loc];//temp2=4

            for (int i=n;i>loc;i--)//i=6;i>
            {
                c[i]=c[i-1];
            }
            c[loc]=element;
            n=n+1;

        }
        for (int i=0;i<8;i++)
        {
            System.out.print(c[i]+" ");
        }

        //3.Deleting an element
        System.out.println("");
        System.out.println("Enter the location from which you want to delete element : ");
        int del=sc.nextInt();
        for (int i=del;i<n;i++)
        {
            c[i]=c[i+1];
        }
        n=n-1;
        System.out.println("");
        for (int i=0;i<n;i++)
        {
            System.out.print(c[i]+" ");
        }

    }
}
