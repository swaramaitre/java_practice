public class DataTypes {
    public static void main(String[] args) {
        /*
          byte+short=int
          short+int=int
          long+float=float
          int+float=float
          char+int=int
          char+short=int
          long+double=double
          float+double=double
         */
         byte x = 5;
         int y = 6;
         short z = 8;
         int a = y + z;
         float b = 6.54f + x;
         System.out.println(b);

         //increment and decrement operators
         int i = 56;
         System.out.println(i++); // first b is assigned i (56) then is incremented
         int j = 67;
         int c = ++j; // first j is incremented then c is assigned j (68)
         System.out.println(i);
         System.out.println(++i);
         System.out.println(i);
         int u = 7;
         System.out.println( ++u * 8);
         char ch = 'a';
         System.out.println(++ch);

    }
}
