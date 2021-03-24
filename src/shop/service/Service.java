package shop.service;


import shop.model.Product;

/**The interface Service describe list of services of product component
 *
 * Created by marulin on 15.09.2020.
 */
public interface Service {

    /**
     * Sort array of Products by identification number.
     *
     * @param products - array of Products, that need to be sorted
     */
    void sortByIN(Product[] products);

    /**
     * Filtrate array of Products by type
     *
     * @param products - array of Products, that need to be filtrated
     * @param type - type of Products, that will remain in the array after filtering
     */
    void filtrateByType(Product[] products, String type);

    /**
     * Filtrate array of Products by name
     *
     * @param products - array of Products, that need to be filtrated
     * @param name - name of Products, that will remain in the array after filtering
     *//*
    void filtrateByName(Product[] products, String name);*/
    
}
