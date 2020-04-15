package main.java;

import java.util.Map;

public class RomantoInt {

  public int Solution(String s) {

    int val = 0;
    int temp, check;

    for(int i = 0, n = s.length() ; i < n ; i++) { 
      
      temp = charMap(s.charAt(i));
          
      if(i + 1 < n) {
        check = charMap(s.charAt(i+1));
        if (check > temp) {
          temp = check - temp;
          i += 1;
        } 
      }
      val += temp;
    }
    return val;
  }

  private int charMap(char c) {
    if (c == 'I') 
      return 1; 
    if (c == 'V') 
      return 5; 
    if (c == 'X') 
      return 10; 
    if (c == 'L') 
      return 50; 
    if (c == 'C') 
      return 100; 
    if (c == 'D') 
      return 500; 
    if (c == 'M') 
      return 1000; 

    return -1; 
  } 
}


