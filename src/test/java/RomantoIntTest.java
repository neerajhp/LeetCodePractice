package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.RomantoInt;

class RomantoIntTest {

  @Test
  void test() {
    
    RomantoInt soln = new RomantoInt();
    
    assertEquals(soln.Solution("III"), 3);
  }

}
