//1.finding sum of all elements
//2.searching an element
//3.finding max element
//4.finding second-largest element

public class Challenge_01 {
    public static void main(String[] args) {

        int a[]={3,9,7,8,12,6,15,5,4,10};
        //1.
        int sum1=0,sum2=0;
        for (int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        System.out.println("Sum of array elements is : "+sum1);

        //OR we can use for each loop also
        for (int x:a)
        {
            sum2=sum2+x;
        }
        System.out.println(sum2);

        //2.
        //note:- for searching an element make sure that every element in array is unique
        int key=18,flag=0;//can change as per requirement or can also take user input.
        for(int i=0;i<a.length;i++)
        {
            if(key==a[i])
            {
                System.out.println("key found at "+i+" position");
                System.exit(0);
            }
        }
        System.out.println("key not found");
//        if(flag!=1)
//        {
//            System.out.println("Key not found");
//        }

        //3.
        int max=a[0];
        for (int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println(max);

        //4.
        int max_1=a[0];
        int max_2=a[0];
        for (int i=0;i<a.length;i++)
        {
            if(max_1<a[i])
            {
                max_2=max_1;
                max_1=a[i];
            }
        }
        System.out.println("Largest element : "+max_1);
        System.out.println("Second largest element : "+max_2);



    }
}
