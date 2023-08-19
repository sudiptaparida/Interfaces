public class Object_Array {
    public static void main(String[] args)
    {
      Object a[]=new Object[5];
      a[0]=10;
      a[1]=20.5;
      a[2]="PRAGRA";
      a[3]='P';
      a[4]=true;
      for(Object i:a)
      {
          System.out.println(i);
      }
    }
}
