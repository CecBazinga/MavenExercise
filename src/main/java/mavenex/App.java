package mavenex;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Log.setupLogger();
        
        TheMostSimpleClass tMSC = new TheMostSimpleClass();
        
        tMSC.speak();
    }
}