public class DArrays_Numbers {
    public static void main(String[] args)
    {
      //  int a[] =new int[3];
        int a[]={100,200,300,400,500}; // different way of declaration ::arrays
        int sum=0;
        for(int i:a) {
            System.out.println("print the numbers :" +i);

            sum = sum + i;
        }
        System.out.println("sum of the number is : " +sum);

        }
    }


