package shop.model;

import java.util.Date;

/**
 * The interface Product describe contract of mutable POJO class,
 * witch represent Product as object.
 *
 * Created by marulin on 18.09.2020.
 */
public interface Product {

    int getIN();
    void setIN(int id);

    String getName();
    void setName(String name);

    int getWidth();
    void setWidth(int width);

    int getHeight();
    void setHeight(int height);

    int getExpiryDate();
    void setExpiryDate(int id);

    Date getCreationDate();
    void setCreationDate(Date productionDate);

    String getManufacturer();
    void setManufacturer(String type);

    String getType();
    void setType(String name);


}
