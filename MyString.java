// Add Comparable<CharSequence> later

public class MyString implements CharSequence{
  private char[] data;

  // Creates array from CharSequence given
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index) {
    if (index < 0 || index > data.length) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    } else {
      return data[index];
    }
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end) {
    return "";
  }

  public String toString() {
    return "";
  }

  public static void main(String[] args) {
    MyString s = new MyString("dog");
    try {
      System.out.println(s.charAt(1));
      System.out.println(s.charAt(-1));
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
  }
}
