// Add Comparable<CharSequence> later

public class MyString implements CharSequence{
  private char[] data;
  public MyString(CharSequence s){
  }

  public char charAt(int index) {
    return 'a';
  }

  public int length() {
    return 0;
  }

  public CharSequence subSequence(int start, int end) {
    return "";
  }

  public String toString() {
    return "";
  }
}
