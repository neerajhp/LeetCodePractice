package main.java;

public class IsPalindrome {
  
  public boolean solution(int x) {
    
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }

    int rev = 0;
    while (x > rev) {
      rev = rev * 10 + x % 10;
      x /= 10;
    }

    return x == rev || x == rev/10;
  }
}

