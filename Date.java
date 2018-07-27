/**
 * Essa classe mantem a data no formato dia/mes/ano
 * 
 * @author Leonardo Ernesto <leonardo.ernesto>
 * @version 1.0
 */
public class Date
{
    /** 
     * dia da data, 1-31 baseado no mes
     */
    private int day;
    /** 
     * mes da data, 1-12
     */
    private int month;
    /** 
     * ano da data, qualquer valor > 0
     */
    private int year;

    /**
     * Array contendo o numero de dias em cada mes do ano
     */
    private static final int[] DAYS_PER_MONTH = 
    { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    /**
     * Construtor sem parametros assume data inicial 01/01/2000
     * @see #setDate
     */
    public Date()
    {
        setDate( 1, 1, 2000 );
    }

    /**
     * Construtor Date
     * @param theDay   o dia 
     * @param theMonth o mes
     * @param theYear  o ano
     * @see #setDate
     */
    public Date( int theDay, int theMonth, int theYear )
    {
        setDate( theDay, theMonth, theYear );
    }

    /**
     * Altera a data de acordo com os valores fornecidos
     * @param theDay o novo dia
     * @param theMonth o novo mes
     * @param theYear o novo ano
     */
    public void setDate( int theDay, int theMonth, int theYear )
    {
        year  = checkYear( theYear );
        month = checkMonth( theMonth );
        day   = checkDay( theDay );       
    }

    /** 
     * Metodo auxiliar para verificar mes valido
     * @param testMonth
     * @return testMonth se for valido; 1 caso contrario
     */
    private int checkMonth( int testMonth )
    {
        if ( testMonth > 0 && testMonth <= 12 ) // validate month
        {
            return testMonth;
        }
        else // month is invalid 
        { 
            return 1; // maintain object in consistent state
        } 
    }

    /** 
     * Metodo auxiliar para verificar ano valido
     * @param testYear
     * @return testYear se for valido; 1 caso contrario
     */
    private int checkYear( int testYear )
    {
        if ( testYear > 0 ) // validate year
        {
            return testYear;
        }
        else // year is invalid
        {
            return 1;
        } 
    } 

    /** 
     * Metodo auxiliar para verificar dia valido
     * @param testDay
     * @return testDay se for valido; 1 caso contrario
     */
    private int checkDay( int testDay )
    {
        // check if day in range for month
        if ( testDay > 0 && testDay <= DAYS_PER_MONTH[ month ] )
        {
            return testDay;
        }

        // check for leap year
        if ( month == 2 && testDay == 29 && ( year % 400 == 0 || 
                ( year % 4 == 0 && year % 100 != 0 ) ) )
        {
            return testDay;
        }

        return 1;
    }
    
    /**
     * @return o dia da data
     */
    public int getDay()
    {
        return day;
    }

    /**
     * @return o mes da data
     */
    public int getMonth()
    {
        return month;
    }
    /**
     * @return o ano da data
     */
    public int getYear() { 
        return year;
    }

    /**
     * @return data
     */ 
    public Date getDate() {
        return new Date( getDay(), getMonth(), getYear() ); 
    } 
    /** 
     * @return Date como String no formato (DD/MM/AAAA)
     */
    @Override
    public String toString()
    { 
        return String.format( "%02d/%02d/%04d", 
                getDay(), getMonth(), getYear() ); 
    }

    //-----------------------------------------------------------
    // inclua metodos adicionais aqui, se necessarios
}