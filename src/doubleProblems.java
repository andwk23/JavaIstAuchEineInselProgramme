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

        heaven:
        while ( true ) {
            hell:
            while ( true )
                break /* continue */ heaven;
            // marke hell: wird nicht erreicht
            // System.out.println( "hell" );
        }
        System.out.println( "heaven" );

        System.out.println();
        // Beispiel: http: als Sprungmarke und //www.tutego.de/ als Kommentar
        http://www.tutego.de/
        System.out.print( "Da gibt's Java-Tipps und -Tricks." );

        System.out.println("\n################################################################\n");
        System.out.println("--- Abbruch eines for-Loops im default-Teil eines switch-case durch break und Sprungmarke ---\n");

        String dnaBases = "CGCAGTTCTTCGGXAC";
        int a = 0, g = 0, c = 0, t = 0;

        loop:
        for ( int i = 0; i < dnaBases.length(); i++ ) {
            switch ( dnaBases.charAt( i ) ) {
                case 'A': case 'a':
                    a++;
                    break;
                case 'G': case 'g':
                    g++;
                    break;
                case 'C': case 'c':
                    c++;
                    break;
                case 'T': case 't':
                    t++;
                    break;
                default:
                    System.err.println( "Unbekannte Nukleinbasen " + dnaBases.charAt( i ) );
                    break loop;
            }
        }
        System.out.printf( "Anzahl: A=%d, G=%d, C=%d, T=%d%n", a, g, c, t );
    }
}
