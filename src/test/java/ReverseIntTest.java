package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.ReverseInt;

class ReverseIntTest {

  @Test
  void test() {
    
    ReverseInt soln = new ReverseInt();
    
    assertEquals(soln.Solution(123), 321);
    
  }

}
