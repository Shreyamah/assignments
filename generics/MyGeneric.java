
import java.util.List;

public class MyGeneric<T> {
  private List<T> list;

  /**
   * @return list
   */
  public List<T> getList() {

    return this.list;
  }

  /**
   * @param list new value of {@link #getlist}.
   */
  public void setList(List<T> list) {

    this.list = list;
  }

}
