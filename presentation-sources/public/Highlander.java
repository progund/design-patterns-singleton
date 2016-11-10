public class Highlander{
  public final static Highlander INSTANCE=new Highlander();
  // prevent instantiation
  private Highlander(){}
  // instance methods...
}


// Client code:
//Highlander.INSTANCE.someMethod();
