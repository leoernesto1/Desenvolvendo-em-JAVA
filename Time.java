/**
 * Essa classe mantem a hora no formato de 24 horas.
 * 
 * @author Leonardo Ernesto <leonardo.ernesto>
 * @version 1.0
 */
public class Time
{
    /**
     * hora, 0-23
     */
    private int hour;   
    /**
     * minuto, 0-59
     */
    private int minute;
    /**
     * segundo, 0-59
     */
    private int second;

    /**
     * Construtor Time assume horario default 00:00:00
     */
    public Time()
    {
        this( 0, 0, 0 );
    }

    /**
     * Construtor Time
     * @param h a hora
     * @param m o minuto
     * @param s o segundo
     */
    public Time( int h, int m, int s ) 
    { 
        setTime( h, m, s );
    }

    /**
     * constructor Time
     * @param time Um objeto Time com o qual inicializar
     */
    public Time( Time time )
    {
        this( time.getHour(), time.getMinute(), time.getSecond() );
    }

    /**
     * Configura um novo valor usando hora universal. Verifica a validade dos
     * dados. Configura valores invalidos como zero.
     * 
     * @param h   a hora
     * @param m   o minuto
     * @param s   o segundo
     * @see #setHour
     * @see #setMinute
     * @see #setSecond
     */
    public void setTime( int h, int m, int s )
    {
        setHour( h ); 
        setMinute( m );
        setSecond( s );
    }

    /**
     * Define nova hora h; se invalida torna-se 0
     * @param h a hora
     */
    private void setHour( int h ) 
    { 
        hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
    }
    
    /**
     * Define novo minuto m; se invalido torna-se 0
     * @param m o minuto
     */
    private void setMinute( int m ) 
    { 
        minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
    }

    /**
     * Define novo segundo s; se invalido torna-se 0
     * @param s o segundo
     */
    private void setSecond( int s ) 
    { 
        second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
    }

    /**
     * @return a hora do Time
     */
    public int getHour() 
    { 
        return hour; 
    }

    /**
     * @return o minuto do Time
     */
    public int getMinute() 
    { 
        return minute; 
    }

    /**
     * @return o segundo do Time
     */
    public int getSecond() 
    { 
        return second; 
    }

    /**
     * @return objeto Time
     */
    public Time getTime()
    {
        return new Time( getHour(), getMinute(), getSecond() ); 
        // sua implementacao vem aqui
    }

    /** 
     * @return String no formato (HH:MM:SS)
     */
    public String toString()
    {
        return String.format( 
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
    }
    //-----------------------------------------------------------
    // inclua metodos adicionais aqui, se necessarios
} 