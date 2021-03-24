package shop.model;

/**
 * The interface Shelf describe contract of mutable shelf
 * is an object that is designed to place products
 * on it with a certain number of places
 * and a certain size of each place *
 *
 * Created by marulin on 18.09.2020.
 */
public interface Shelf {

    /**
     *
     * @return number of shelf spaces
     */
    int getSpace();

    /**
     *
     * @return number of free shelf spaces
     */
    int getFreeSpace();

    /**
     * Define dimension of space using class {@link java.util.Random}
     * range between 0 and 100
     *
     * @param index - index of space
     * @return Space object with dimension
     */

    Space defineSpaceDimension(int index);

    /**
     * Get product object at specified space of shelf
     *
     * @param index - index of space
     * @return product object at space - if space are full
     *         null - if space are empty
     */
    Product getProductAtSpace(int index);

    /**
     * Insert product object to specified space of shelf
     * Can't insert to full space
	 * Can't insert product object with incorrect IN (<0) or IN by default (0)
     * Can't insert product object if width or height do not match (width or height of product > width or height of space)
     *
     * @param product - product object for insert
     * @param index - index of slot
     * @return true - if product was inserted
     *         false - if not
     */
    boolean setProdToShelf(Product product, int index);

    /**
     * Remove product object from specified space of shelf
     *
     * @param index - index of space
     * @return product object that has been removed - if space was full
     *         null - if space was empty
     */
    Product removeProdFromShelf(int index);

    /**
     * Get product object with specified identification number
     *
     * @param in - identification number
     * @return product object with specified identification number - if it is present in shelf
     *         null - if it is absent in shelf
     */
    Product getProdByIN(int in);
}