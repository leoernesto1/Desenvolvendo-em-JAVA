 /**
 * Essa classe faz o formato data e hora
 * 
 * @author Leonardo Ernesto <leonardo.ernesto>
 * @version 1.0
 */
public class DateTime extends Date
{   
    /**
     * O horario da correspondente data
     */
    private Time theTime;
    
    /**
     * Construtor com valores defaults assumidos por Time e Date
     */
    public DateTime()
    {
        theTime = new Time();
    }

    /**
     * Construtor com valores de data fornecidos e 
     * valores default de Time
     * @param theDay o dia
     * @param theMonth o mes
     * @param theYear o ano
     */
    
    public DateTime(int theDay, int theMonth, int theYear)
    {
        super( theDay, theMonth, theYear );
        theTime = new Time();
    }

    /**
     * Construtor com valores fornecidos de Date e Time 
     * @param theDay o dia
     * @param theMonth o mes
     * @param theYear o ano
     * @param theHour a hora
     * @param theMinute o minuto
     * @param theSecond o segundo
     */
    
    public DateTime(int theDay, int theMonth, int theYear,
                    int theHour, int theMinute, int theSecond)
    {
        super( theDay, theMonth, theYear );
        theTime = new Time( theHour, theMinute, theSecond );
    }

    /**
     * Altera o DateTime de acordo com os valores fornecidos
     * @param theDay o dia
     * @param theMonth o mes
     * @param theYear o ano
     * @param theHour a hora
     * @param theMinute o minuto
     * @param theSecond o segundo
     */

    public void setDateTime( int theDay, int theMonth, int theYear,
            int theHour, int theMinute, int theSecond )
    {   
        super.setDate( theDay, theMonth, theYear );
        theTime.setTime( theHour, theMinute, theSecond );
    } 
    
    /**
     * @return o objeto DateTime
     */
    public DateTime getDateTime() { 
        return new DateTime( getDay(), getMonth(), getYear(), 
            theTime.getHour(), theTime.getMinute(), theTime.getSecond() ); 
    } 

    /**
     * @return o objeto Time do DateTime
     */
    
    public Time getTime() { 
        return theTime;
    } 

    /**
     * Retorna dia + 1
     */
    public void nextDay() { 
        int[] mes = 
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if ( getDay() + 1 <= mes[ getMonth() ] ) { 
            setDate( getDay() + 1, getMonth(), getYear() ); 
        } 
        else if ( getMonth() == 2 && getDay() + 1 == 29 && ( getYear() % 400 == 
            0 || ( getYear() % 4 == 0 && getYear() % 100 != 0 ) ) ) {  
            setDate(getDay() + 1, getMonth() , getYear());
        } 
        else { 
            setDate( getDay() + 1 , getMonth(), getYear() ); 
            nextMonth(); 
        } 
    } 
    
    /**
     * Retorna mes + 1
     */
    public void nextMonth() { 
        if ( getMonth() + 1 <= 12 ) {  
            setDate( getDay(), getMonth() + 1 , getYear() ); 
        } 
        else {  
            setDate(getDay(), getMonth() + 1 , getYear() + 1);
        }  
    }  

    /**
     * Retorna segundo + 1
     */
    public void nextSecond() { 
        if ( theTime.getSecond() == 59 ) { 
            if ( theTime.getMinute() == 59 ) { 
                if ( theTime.getHour() == 23 ) { 
                    theTime.setTime( theTime.getHour() + 1, 
                        theTime.getMinute() + 1, theTime.getSecond() + 1 );  
                    nextDay();  
                } 
                else { 
                    theTime.setTime( theTime.getHour() + 1, 
                        theTime.getMinute() + 1, theTime.getSecond() + 1 ); 
                } 
            } 
            else { 
                theTime.setTime( theTime.getHour(), theTime.getMinute() + 1, 
                    theTime.getSecond() + 1 ); 
            }  
        }  
        else { 
            theTime.setTime( theTime.getHour(), theTime.getMinute(), 
                theTime.getSecond() + 1 ); 
        }  
    } 
    
    /**
     * Retorna minuto + 1
     */
    public void nextMinute() { 
        if ( theTime.getMinute() == 59 ) { 
            if ( theTime.getHour() == 23 ) { 
                theTime.setTime( theTime.getHour() + 1, 
                    theTime.getMinute() + 1, theTime.getSecond() );  
                nextDay(); 
            }  
            else { 
                theTime.setTime( theTime.getHour() + 1, 
                    theTime.getMinute() + 1, theTime.getSecond() );  
            }
        }
        else { 
            theTime.setTime( theTime.getHour(), theTime.getMinute() + 1, 
                theTime.getSecond() ); 
        }
    }                        
    /**
     * Retorna a hora + 1
     */
    public void nextHour() { 

        if ( theTime.getHour() == 23 ) { 
            theTime.setTime( theTime.getHour() + 1, theTime.getMinute(), 
                theTime.getSecond()); 
            nextDay();
        } 
        else { 
            theTime.setTime( theTime.getHour() + 1, theTime.getMinute(), 
                theTime.getSecond() );
        }  
    } 
    /** 
     * @return DateTime como String no formato DD/MM/AAAA HH:MM:SS
     */
    @Override
    public String toString()
    { 
        return String.format( "%s %s", super.toString(), theTime ); 
    }
    //-----------------------------------------------------------
    // inclua metodos adicionais aqui, se necessarios
    
}
