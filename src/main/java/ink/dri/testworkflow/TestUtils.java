package ink.dri.testworkflow;

/**
 * class description
 *
 * @author ShenYang
 */
public class TestUtils {

  public boolean checkContainsX(String text) {
    for (char c : text.toCharArray()) {
      if (c == 'x' || c == 'X')
        return true;
    }
    return false;
  }

}
