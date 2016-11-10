public class Highlander{
  private static Highlander instance = new Highlander();
  // prevent instantiation
  private Highlander(){}
  // public access! Create the instance on first call
  public static Highlander getInstance(){
    return instance;
  }
  // instance methods...
}
// Client code:
//Highlander.getInstance().someMethod();
