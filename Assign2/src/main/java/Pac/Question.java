package Pac;

import java.util.Map;

/**
 * TODO shreyama This type ...
 *
 */
public class Question {
  int qid;

  String ques;

  Map<Integer, String> solution;

  /**
   * @return qid
   */
  public int getQid() {

    return this.qid;
  }

  /**
   * @param qid new value of {@link #getqid}.
   */
  public void setQid(int qid) {

    this.qid = qid;
  }

  /**
   * @return ques
   */
  public String getQues() {

    return this.ques;
  }

  /**
   * @param ques new value of {@link #getques}.
   */
  public void setQues(String ques) {

    this.ques = ques;
  }

  /**
   * @return solution
   */
  public Map<Integer, String> getSolution() {

    return this.solution;
  }

  /**
   * @param solution new value of {@link #getsolution}.
   */
  public void setSolution(Map<Integer, String> solution) {

    this.solution = solution;
  }

  public void display() {

    System.out.println(getQid());
    System.out.println(getQues());
    System.out.println(getSolution());
  }
}
