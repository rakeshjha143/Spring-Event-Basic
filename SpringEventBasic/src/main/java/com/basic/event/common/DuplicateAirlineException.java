package com.basic.event.common;

/**
 * @author JHA
 *
 */
public class DuplicateAirlineException extends Exception {

  private static final long serialVersionUID = -8890080495441147845L;

  private String message;
  private Object[] args;

  public DuplicateAirlineException(String name) {
    this.message = String.format("There is already an user with the name - %s", name);
  }

  public DuplicateAirlineException(Object[] args) {
    this.args = args;
  }

  public DuplicateAirlineException(String message, Object[] args) {
    this.message = message;
    this.args = args;
  }

  /**
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * @param message the message to set
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * @return the args
   */
  public Object[] getArgs() {
    return args;
  }

  /**
   * @param args the args to set
   */
  public void setArgs(Object[] args) {
    this.args = args;
  }
}
