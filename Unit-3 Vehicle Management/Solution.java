import java.util.*; 
interface Vehicle{ 
void start(); 
void stop(); 
void fuelCapacity(); 
void maxfuelCapacity(); 
void time(); 
} 
class Car implements Vehicle{ 
    public void start(){ 
        System.out.println("Starting the car..."); 
    } 
    public void stop(){ 
        System.out.println("The car has stopped."); 
    } 
    public void fuelCapacity(){ 
        System.out.println("Fuel capacity: 50 liters."); 
    } 
    public void maxfuelCapacity(){ 
        System.out.println("Max Fuel capacity: 60 liters."); 
    } 
    public void time(){ 
        System.out.println("Time per kilometer: 1 minute."); 
    } 
} 
class Bike implements Vehicle{ 
    public void start(){ 
        System.out.println("Starting the bike..."); 
    } 
    public void stop(){ 
        System.out.println("The bike has stopped."); 
    } 
    public void fuelCapacity(){ 
        System.out.println("Fuel capacity: 15 liters."); 
    } 
    public void maxfuelCapacity(){ 
        System.out.println("Max Fuel capacity: 20 liters."); 
    } 
    public void time(){ 
        System.out.println("Time per kilometer: 2 minutes."); 
    } 
} 
public class Solution { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
 
        System.out.println("Choose a vehicle:"); 
        System.out.println("1. Car"); 
        System.out.println("2. Bike"); 
        int c = scan.nextInt(); 
        Vehicle v; 
        if(c == 1){ 
            v = new Car(); 
        } 
        else{ 
            v = new Bike(); 
        } 
        v.start(); 
        v.fuelCapacity(); 
        v.maxfuelCapacity(); 
        v.time(); 
        v.stop(); 
    } 
} 