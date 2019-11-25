class OutState extends UserState {
  void getin(User user) {
    user.setState(new InState());
  };
  void getout(User user) {
    // do not thing
  };
  void exit(User user) {
    // do not thing
  };

  void hello(User user) {
    System.out.println("Hello, " + user.getName() + " " + user.getValue());
  }

  void increase(User user) {
    // do not thing!
  }
}