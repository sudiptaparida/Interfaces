public class Arrays_Strings {
    public static void main(String[] args) {
        String s[] = new String[3];
        s[0] = "TORONTO";
        s[1] = "PRAGRA";
        s[2] = "MISSISSAUGA";
     //   s[3] = " ONTARIO";
        System.out.println(s.length); //returns length of an array

        for (String i : s) //fro each statement declaration
        {
            System.out.println(i);
        }
    }


}
