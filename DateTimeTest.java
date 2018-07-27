import java.util.Scanner;
/**
 * Essa classe faz o teste.
 * 
 * @author Leonardo Ernesto <leonardo.ernesto>
 * @version 1.0
 */
public class DateTimeTest 
{
    /**
    * Command-line interface.   
    * @param args que ira receber uma string
    */
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        System.out.println( "Enter the date and time" );
        System.out.print( "Day: " );
        int day = input.nextInt();
        System.out.print( "Month: " );
        int month = input.nextInt();
        System.out.print( "Year: " );
        int year = input.nextInt();

        System.out.print( "Hour: " );
        int hour = input.nextInt();
        System.out.print( "Minute: " );
        int minute = input.nextInt();
        System.out.print( "Second: " );
        int second = input.nextInt();
      
        DateTime dateTime = new DateTime(
            day, month, year, hour, minute, second );
        System.out.printf( "Date and time: %s\n",
            dateTime.toString() );         
      
        int choice = getMenuChoice();
        while ( choice != 7 )
        { 
            switch ( choice )
            { 
                case 1: // add 1 second
                    dateTime.nextSecond();
                    break;
                case 2: // add 1 minute
                    dateTime.nextMinute();
                    break;
                case 3: // and 1 hour
                    dateTime.nextHour();
                    break;
                case 4: // add 1 day
                    dateTime.nextDay();
                    break;
                case 5: // add 1 month
                    dateTime.nextMonth();
                    break;
                case 6: // add arbitrary seconds
                    System.out.print( "Enter seconds to tick: " );
                    int ticks = input.nextInt();
                    for ( int i = 0; i < ticks; i++ ) { 
                        dateTime.nextSecond();
                    } 
                    break;
                default: 
                    System.out.print( "Opção Invalida");
                    break;
                
            } 
            System.out.printf( "Date and time: %s\n",
                dateTime.toString() );         
            choice = getMenuChoice();
        }       
    } 

    /** 
     * faz um menu
     */
    private static int getMenuChoice()
    {
        Scanner input = new Scanner( System.in );
      
        System.out.println( "1. Add 1 Second" );
        System.out.println( "2. Add 1 Minute" );
        System.out.println( "3. Add 1 Hour" );
        System.out.println( "4. Add 1 Day" );
        System.out.println( "5. Add 1 Month" );
        System.out.println( "6. Add seconds" );
        System.out.println( "7. Exit" );
        System.out.print( "Choice: " );
      
        return input.nextInt();
    }   
} 