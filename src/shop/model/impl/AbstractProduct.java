package shop.model.impl;

import shop.model.Product;

import java.util.Date;

public abstract class AbstractProduct implements Product {

    private int in;
    private int width;
    private int height;
    private int id;
    private String name;
    private Date productionDate;
    private String type;

    public int getIN() {
        return in;
    }

    public void setIN(int id) {
        if (in == 0 & id > 0){
            in = id;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0 || width > 100) {
            System.err.println("width should not be 0 or higher than 100");
        } else this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        if (height <= 0 || height >= 100) {
            System.err.println("height should not be 0 or higher than 100");
        } else this.height = height;
    }

    public int getExpiryDate() {
        return this.id;
    }

    public void setExpiryDate(int id){
        if (id <= 0) {
            System.err.println("Error: date cannot be lower or equal 0");
        } else this.id = id;

    }

    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name = name;
    }

    public Date getCreationDate(){
        return productionDate;
    }

    public void setCreationDate(Date productionDate) {

        this.productionDate = productionDate;
    }

    public String getManufacturer()
    {
        return type;
    }

    public void setManufacturer(String type) {

        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String name) {
        this.type = name;
    }

}