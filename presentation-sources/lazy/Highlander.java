public class Highlander{
  private static Highlander instance;
  private Highlander(){} // prevent instantiation
  public static Highlander getInstance(){
    if(instance == null){ // only first time this is true
      instance = new Highlander();
    }
    return instance;
  }
  // instance methods
}
// Client code:
//Highlander.getInstance().someMethod();
