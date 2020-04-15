package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.LongestCommonPrefix;
import test.java.*;

class LongestCommonPrefixTest {

  @Test
  void test() {
    
    LongestCommonPrefix soln = new LongestCommonPrefix();
    
    String[] strs = new String[] {"flower","flow","flight"};
    
    assertEquals(soln.Solution(strs), "fl");
  }

}
