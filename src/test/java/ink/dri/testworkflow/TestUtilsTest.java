package ink.dri.testworkflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestUtilsTest {

  TestUtils testUtils = new TestUtils();

  @Test
  void checkContainsX() {
    Assertions.assertFalse(testUtils.checkContainsX("asdf"));
    Assertions.assertTrue(testUtils.checkContainsX("asdfxde"));
//    Assertions.assertTrue(testUtils.checkContainsX("asdXkdi"));
  }

  @Test
  void checkContainsY() {
    Assertions.assertFalse(testUtils.checkContainsX("asdf"));
  }
}