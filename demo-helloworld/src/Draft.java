public class Draft {
  public static void main (String[] args) {

    String str = "Hello";
    int i_num = 0;
    byte b_num = 100;
    short s_num = 10000;
    long l_num = 263;
    float f_num = 1.1f;
    double d_num = 1.1;
    char character = 'T';

    //.equals()
    String str1 = "a";
    String str2 = "b";
    String str3 = "c";
    String str4 = "abc";
    boolean TF = str4.equals(str1 + str2 + str3);

    System.out.println(TF);

    // METHODS
    //1) .length()
    System.out.println(str4.length());
    System.out.println("Hello".length());

    //2) .equals()
    //refer to line 18,20

    //3) .charAt()
    System.out.println(str4.charAt(1));
    




  }
}
