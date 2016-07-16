package BeanPlant.the_DJDJ.JavaText.npc;

import BeanPlant.the_DJDJ.JavaText.handlers.EventHandler;
import BeanPlant.the_DJDJ.JavaText.world.Location;

import java.io.Serializable;

/**
 * A mobile entity object. This is exactly the same as an Entity, with the
 * exception that it has a chance of moving to another location every time a
 * command is entered.
 *
 * @author the_DJDJ
 */
public class MobileEntity extends Entity implements Serializable, EventHandler {
    
    public static final MobileEntity sheep = new MobileEntity("sheep", "a harmless sheep", "a flock of relatively harmless sheep", 10, 0.1f);
    
    /** What percentage chance the entity has of moving every time a command is entered. */
    private float movingChance;

    /** Whether or not the entity can use the up/down directions, ie climbing. */
    private boolean canClimb;
    
    /** The current location of this MobileEntity. */
    private Location location;
    
    /**
     * The default constructor. This assigns the name, the amount of health, and
     * the change of moving that the entity has.
     * 
     * @param name The name of the entity
     * @param single The name given to a single unit of this entity
     * @param plural The name given to multiple units of this entity
     * @param health The amount of health the entity has
     * @param movingChance the chance of moving to a random location that the
     *                     entity has.
     */
    public MobileEntity(String name, String single, String plural, int health, float movingChance){
        
        super(name, single, plural, health);
        
        this.movingChance = movingChance;
        
    }
    
    /**
     * The default constructor. This assigns the name, the amount of health, and
     * the change of moving that the entity has.
     * 
     * @param name The name of the entity
     * @param single The name given to a single unit of this entity
     * @param plural The name given to multiple units of this entity
     * @param health The amount of health the entity has
     * @param movingChance the chance of moving to a random location that the
     *                     entity has.
     * @param location Where this MobileEntity currently is
     */
    public MobileEntity(String name, String single, String plural, int health, float movingChance, Location location){
        
        super(name, single, plural, health);
        
        this.movingChance = movingChance;
        this.location = location;
        
    }
    
    /**
     * The second constructor. This assigns the name, the amount of health, the
     * chance of moving that the entity has, and whether or not the entity is
     * avoidable.
     * 
     * @param name The name of the entity
     * @param single The name given to a single unit of this entity
     * @param plural The name given to multiple units of this entity
     * @param health The amount of health the entity has
     * @param movingChance the chance of moving to a random location that the
     *                     entity has.
     * @param avoidable Whether or not the player can run away from the entity
     */
    public MobileEntity(String name, String single, String plural, int health, float movingChance, boolean avoidable){
        
        super(name, single, plural, health, avoidable);
        
        this.movingChance = movingChance;
        
    }
    
    /**
     * The second constructor. This assigns the name, the amount of health, the
     * chance of moving that the entity has, and whether or not the entity is
     * avoidable.
     * 
     * @param name The name of the entity
     * @param single The name given to a single unit of this entity
     * @param plural The name given to multiple units of this entity
     * @param health The amount of health the entity has
     * @param movingChance the chance of moving to a random location that the
     *                     entity has.
     * @param location Where this MobileEntity currently is
     * @param avoidable Whether or not the player can run away from the entity
     */
    public MobileEntity(String name, String single, String plural, int health, float movingChance, Location location, boolean avoidable){
        
        super(name, single, plural, health, avoidable);
        
        this.movingChance = movingChance;
        this.location = location;
        
    }
    
    /**
     * Returns the chance that the entity has of moving to a random location
     * after each entered command
     * 
     * @return the chance that the entity has of being of mobile
     */
    public double getMovingChance(){
        
        return this.movingChance;
        
    }
    
    /**
     * Sets the chance that the entity has of moving to a random location after
     * each entered command
     * 
     * @param movingChance the chance that the entity has of being of mobile
     */
    public void setMovingChance(float movingChance){
        
        this.movingChance = movingChance;
        
    }
    
    /**
     * Returns the current location of the entity.
     * 
     * @return Where the entity is at the moment
     */
    public Location getLocation(){
        
        return this.location;
        
    }
    
    /**
     * Sets the current location of the entity.
     * 
     * @param location Where the entity is at the moment
     */
    public void setLocation(Location location){
        
        this.location = location;
        
    }
    
    /**
     * Returns whether or not the entity can climb upwards or downwards.
     * 
     * @return whether or not the entity can climb
     */
    public boolean canClimb(){
        
        return this.canClimb;
        
    }
    
    /**
     * Sets whether or not the entity is able to climb vertically
     * 
     * @param canClimb whether or not the entity is able to climb vertically
     */
    public void setCanClimb(boolean canClimb){
        
        this.canClimb = canClimb;
        
    }
    
    /**
     * The method that calculates whether or not the mobile entity will be
     * moving, and, if so, in which direction.
     */
    private void move(){
        
        
        
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public void fireEvent(String event) {
        
        switch(event){
            
            case "GO":
                this.move();
                break;
            
        }
        
    }
    
}
