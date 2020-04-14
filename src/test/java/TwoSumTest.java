package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.TwoSum;

class TwoSumTest {

  @Test
  void testTwoSum() {
    
    TwoSum Solution = new TwoSum();
    
    int[] input = new int[] {3,2,4};
    int target = 6;
    int[] expected = new int[] {1,2};
    
    assertArrayEquals(Solution.twoSum(input, target), expected);
    
    
  }

}
