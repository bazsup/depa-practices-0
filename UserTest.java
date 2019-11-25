class UserTest {
  public static void main(String args[]) {
    UserState userState = new OutState();
    User user = new User("Supawit", userState, 1);

    // System.out.println(user.getClass());
    user.view();
    user.hello();

    user.getin();
    user.view();

    user.hello();
    user.increase();
    user.hello();

    user.getin();
    user.view();

    user.getin();
    user.view();

    user.hello();
    user.increase();
    user.hello();

    user.exit();
    user.view();

    user.exit();
    user.view();

  }
}