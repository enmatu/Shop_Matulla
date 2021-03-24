package shop.model;

/**
 * The interface @Space describe contract of mutable POJO class,
 * witch represent Space on Shelf as object.
 *
 * Created by marulin on 18.09.2020.
 */

public interface Space {
    /**
     * get Width of space on shelf
     * */
    int getWidth();

    /**
     * Set Width of space on shelf
     * Can't set width with zero or negative value
     *
     * @param width - space width
     */
    void setWidth(int width);

    /**
     * get Height of space on shelf
     * */

    int getHeight();

    /**
     * Set Height of space on shelf
     * Can't set height with zero or negative value
     *
     * @param height - space height
     */
    void setHeight(int height);

}
