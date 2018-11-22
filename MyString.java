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

  // Returns -1 if s is larger, 1 if s is smaller, 0 is equal
  // Throws NullPointerException is s is null
  // Throws ClassCastException
  public int compareTo(CharSequence s) throws ClassCastException {
    int result = 0;
    if (s == null) {
      throw new NullPointerException("Cannot compare");
    }
    int shorter = s.length();
    if (s.length() > data.length) {
      shorter = data.length;
    }
    for (int i = 0; i < shorter; i++) {
      if (data[i] < s.charAt(i)) {
        return -1;
      } else if (s.charAt(i) < data[i]) {
        return 1;
      }
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
    MyString t = new MyString("catsound");
    try {
      System.out.println(s); // test toString
      System.out.println("Char at index 1: " + s.charAt(1)); // test charAt
      //System.out.println(s.charAt(-1)); // To test exception
      System.out.println("Length of MyString: " + s.length()); // test length
      System.out.println("From start to index 3: " + s.subSequence(0,3)); // test sub
      System.out.println("From index 3 to end: " + s.subSequence(3,8)); // test sub
      //System.out.println(s.subSequence(4,2)); // To test exception
      //System.out.println(s.subSequence(2,20)); // To test exception
      //System.out.println(s.subSequence(-1,8)); // To test exception
      System.out.println("Comparing catsound to dogsound: " + s.compareTo(t)); // test compareTo
      System.out.println("Comparing dogsound to catsound: " + t.compareTo(s)); // test compareTo
      System.out.println("Comparing dogsound to dogsound: " + s.compareTo("dogsound")); // test compareTo
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    } catch (NullPointerException f) {
      System.out.println(f);
    }
  }
}
