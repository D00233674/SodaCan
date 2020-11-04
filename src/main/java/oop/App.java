package oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\n*** SodaCan App ***" );
        App app = new App();
        app.start();
    }

    public void start() {
        SodaCan sc1 = new SodaCan();
        //TODO
        // See question P8.5

        System.out.println(sc1.toString());

        System.out.printf("Surface Area : %.2f\n", sc1.getSurfaceArea());
        System.out.printf("Volume : %.2f\n", sc1.getVolume());



    }
}
