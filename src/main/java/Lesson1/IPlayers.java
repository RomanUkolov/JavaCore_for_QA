package Lesson1;
/**
 * JavaCoreForQA_HomeWork1
 *
 * @autor Roman Ukolov
 * @version 26.03.2022
 *
 */

public interface IPlayers {
    public double run(Track track);
    public double swim(Pool pool);
    public double jump(Wall wall);
    public String getName();
}
