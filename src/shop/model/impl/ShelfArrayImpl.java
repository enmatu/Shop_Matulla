package shop.model.impl;

import shop.model.Product;
import shop.model.Shelf;
import shop.model.Space;

import java.util.Random;

public class ShelfArrayImpl implements Shelf {

    public ShelfArrayImpl(int size) {
        if (size <0){
            System.err.println("Size value should be higher than 0");
            ShelfArrayImpl shAr = new ShelfArrayImpl(1);
            shAr.getSpace();
        }

    }


    @Override
    public int getSpace() {
        return 0;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public Space defineSpaceDimension(int index) {
        Random random = new Random();
        SpaceDimension sp = new SpaceDimension();
        for (int i =0; i<=100; i++ ){
            sp.setWidth(random.nextInt());
            sp.setHeight(random.nextInt());
        }
        return null;
    }

    @Override
    public Product getProductAtSpace(int index) {
        return null;
    }

    @Override
    public boolean setProdToShelf(Product product, int index) {
        return false;
    }

    @Override
    public Product removeProdFromShelf(int index) {
        return null;
    }

    @Override
    public Product getProdByIN(int in) {
        return null;
    }
}
