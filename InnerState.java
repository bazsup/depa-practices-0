class InnerState extends UserState {
  void getin(User user) {
    // do not thing
  };
  void getout(User user) {
    user.setState(new InState());
  };
  void exit(User user) {
    user.setState(new OutState());
  };

  void hello(User user) {
    System.out.println("Hello " + user.getName() + ", " + user.getValue());
  }

  void increase(User user) {
    user.setValue(user.getValue() + 2);
  }
}