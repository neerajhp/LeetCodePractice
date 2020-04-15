package test.java;

import org.junit.jupiter.api.Test;
import main.java.IsPalindrome;

class IsPalindromeTest {

  @Test
  void test() {
    
    IsPalindrome soln = new IsPalindrome();
    
    assert(soln.solution(121));

    
  }

}
