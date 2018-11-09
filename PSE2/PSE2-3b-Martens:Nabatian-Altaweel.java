
/**
   * Beschreiben Sie hier die Klasse HomeworkHamster.
   * 
   * @author (Ihr Name) 
   * @version (eine Versionsnummer oder ein Datum)
   */
   public class HomeworkHamster extends HomeworkHamsterGame{
        
    int i = 0;
    
     /*
     * Verwirrter Paule!
     * Helfe Paule um durch das Territorium zu laufen und alle Körner in seine Höhle zu bringen
     * Dabei soll Paule alle Körner auf dem Feld aufsammeln und sie in seiner Höhle (rechts unten
     * - Spalte 6 * Zeile 4 bei 0 beginnend) wieder ablegen. 
     */
    @Override
    protected void run(){
        
        
        
        paule.write("Ich weiß nicht wie :'(");
        // Helfe Paule dabei durch das Territorium zu laufen 
        // und alle Körner nachhause zu bringen
        
        while ( paule.frontIsClear() ) {
            paule.move();
        }
        paule.pickGrain();
        i++;
        paule.write(String.valueOf(i));
        paule.turnLeft();
        paule.turnLeft();
        paule.turnLeft();
        paule.move();
        paule.turnLeft();
        paule.turnLeft();
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.pickGrain();
        i++;
        paule.write(String.valueOf(i));
        paule.move();
        paule.turnLeft();
        paule.turnLeft();
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.move();
        paule.pickGrain();
        i++;
        paule.write(String.valueOf(i));
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.pickGrain();
        i++;
        paule.write(String.valueOf(i));
        paule.turnLeft();
        paule.move();
        paule.turnLeft();
        paule.turnLeft();
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.turnLeft();
        paule.turnLeft();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.pickGrain();
        i++;
        paule.write(String.valueOf(i));
        paule.putGrain();
        i--;
        paule.write(String.valueOf(i));
        paule.putGrain();
        i--;
        paule.write(String.valueOf(i));
        paule.putGrain();
        i--;
        paule.write(String.valueOf(i));
        paule.putGrain();
        i--;
        paule.write(String.valueOf(i));
        paule.putGrain();
        i--;
        paule.write(String.valueOf(i));
    }
}
