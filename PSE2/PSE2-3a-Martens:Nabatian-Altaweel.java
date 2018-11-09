
/**
 * Beschreiben Sie hier die Klasse HomeworkHamster.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HomeworkHamster extends HomeworkHamsterGame{

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
        paule.write("1");
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
        paule.write("2");
        paule.move();
        paule.turnLeft();
        paule.turnLeft();
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.move();
        paule.pickGrain();
        paule.write("3");
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.pickGrain();
        paule.write("4");
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
        paule.write("5");
        paule.putGrain();
        paule.write("4");
        paule.putGrain();
        paule.write("3");
        paule.putGrain();
        paule.write("2");
        paule.putGrain();
        paule.write("1");
        paule.putGrain();
        paule.write("0");
    }
}
