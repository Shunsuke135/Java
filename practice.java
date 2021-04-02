BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );

int x = Integer.parseInt( br.readLine() );
int y = Integer.parseInt( br.readLine() );

if( x > y )
    System.out.println( "xはyより大きい。" );