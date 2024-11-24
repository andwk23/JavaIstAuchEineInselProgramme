public class doubleProblems {
    public static void main( String[] args )
    {
        double d = 0.0;
        while ( d != 1.0 ) {           // Problematic Vergleich!
            d += 0.1;
            System.out.println( d );
            if (d >= 1.0)
            {
                break;
            }
        }
    }
}
