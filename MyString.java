public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;

  // Creates array from CharSequence given
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

  // Returns character at index given
  // Throws IndexOutOfBoundsException if index is negative or too large
  public char charAt(int index) {
    if (index < 0 || index > data.length) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    return data[index];
  }

  // Returns length
  public int length() {
    return data.length;
  }

  // Returns charSequence of chars from start inclusive to end exclusive
  // Throws exception if either start or end is negative or too large
  public CharSequence subSequence(int start, int end) {
    if (start < 0 || end < 0 || end > data.length || start > end) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    String c = ""; // a String is a CharSequence
    for (int i = start; i < end; i++) {
      c += data[i];
    }
    return c;
  }

  public int compareTo(CharSequence s) throws ClassCastException {
    int result = 0;
    if (s == null) {
      throw new NullPointerException("Cannot compare");
    }
    return 0;
  }

  public String toString() {
    String result = "";
    for (int i = 0; i < data.length; i++) {
      result += data[i];
    }
    return result;
  }

  public static void main(String[] args) {
    MyString s = new MyString("dogsound");
    try {
      System.out.println(s); // test toString
      System.out.println("Char at index 1: " + s.charAt(1)); // test charAt
      System.out.println("Length of MyString: " + s.length()); // test length
      System.out.println("From start to index 3: " + s.subSequence(0,3)); // test sub
      System.out.println("From index 3 to end: " + s.subSequence(3,8)); // test sub
      //System.out.println(s.subSequence(4,2)); // To test exception
      //System.out.println(s.subSequence(2,20)); // To test exception
      //System.out.println(s.subSequence(-1,8)); // To test exception
      //System.out.println(s.charAt(-1)); // To test exception
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
  }
}
