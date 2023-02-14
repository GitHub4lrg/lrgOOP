/*
 * creating interface here instead of a class like before
 * Interfaces contain method definitions w/o any implementation
 */
public interface Animal {
    /**
     * All animals must have a form of making sound
     */
    void sound();
    /**
     * All animals must have a form of movement
     */
    void move();
}
