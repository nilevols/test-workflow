package ink.dri.testworkflow;

/**
 * class description
 *
 * @author ShenYang
 */
public class TestUtils1 {

  public boolean checkContainsX(String text) {
    for (char c : text.toCharArray()) {
      if (c == 'x' || c == 'X')
        return true;
    }
    return false;
  }

  public boolean checkContainsY(String text) {
    for (char c : text.toCharArray()) {
      if (c == 'y' || c == 'Y')
        return true;
    }
    return false;
  }

}
