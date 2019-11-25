
public class User {
  private String name;
  private UserState state;
  private int value;

  public User(String name, UserState state, int value) {
    this.name = name;
    this.state = state;
    this.value = value;
  }

  public void getin() {
    state.getin(this);
  }
  public void getout() {
    state.getout(this);
  };
  public void exit() {
    state.exit(this);
  };
  public void hello() {
    state.hello(this);
    // TO-DO: update to static method
  };
  public void increase() {
    state.increase(this);
  };
  public void view() {
    state.view(this);
  }
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the value
   */
  public int getValue() {
    return value;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param value the value to set
   */
  public void setValue(int value) {
    this.value = value;
  }

  /**
   * @return the state
   */
  UserState getState() {
    return state;
  }

  /**
   * @param state the state to set
   */
  void setState(UserState state) {
    this.state = state;
  }

}