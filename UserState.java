public abstract class UserState {
  abstract void getin(User user);
  abstract void getout(User user);
  abstract void exit(User user);
  abstract void hello(User user);
  abstract void increase(User user);
  void view(User user) {
    System.out.println(user.getState().getClass());
  }
}