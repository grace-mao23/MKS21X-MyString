// Add Comparable<CharSequence> later

public class MyString implements CharSequence{
  private char[] data;

  // Creates array from CharSequence given
  public MyString(CharSequence s){
    char[] data = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
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
