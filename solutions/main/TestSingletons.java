package main;

public class TestSingletons{
  public static void main(String[] args){
    // Public static INSTANCE:
    System.out.println(pub.RootUser.INSTANCE);
    // enum.INSTANCE:
    System.out.println(en.RootUser.INSTANCE);
    // Classic with lazy init and getIntance():
    System.out.println(lazy.RootUser.getInstance());
  }
}
