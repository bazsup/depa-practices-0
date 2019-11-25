class InState extends UserState {
  void getin(User user) {
    user.setState(new InnerState());
  };
  void getout(User user) {
    user.setState(new OutState());
  };
  void exit(User user) {
    user.setState(new OutState());
  };

  void hello(User user) {
    System.out.println(user.getName() + " " + user.getValue());
  }

  void increase(User user) {
    user.setValue(user.getValue() + 1);
  }
}