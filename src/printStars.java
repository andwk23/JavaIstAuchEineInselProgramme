public class printStars {
    public static void main( String[] args ){
        for ( int i = 1; i <= 5; i++ ) {
            for ( int j = 1; j <= i; j++ )
                System.out.print( '*' );
            System.out.println();
        }
        System.out.println();
        int x, y;
        for ( x = 1, y = 2, x++, y++;
              x < 15 || y < 10;
              x += 1, y += 1 )
        {
            System.out.print( '*' );
        }
    }
}
