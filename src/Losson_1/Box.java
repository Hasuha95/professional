package Losson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> listOfFruits;
    private float waight;

    public Box() {
        this.waight = 0.0f;
        this.listOfFruits = new ArrayList<T>();
    }

    public void putFruitInBox(T fruit) {
        listOfFruits.add(fruit);
        waight += fruit.getWaight();
    }

    public float getWaight(){
        return waight;
    }

    public boolean compare(Box box){
        if ( Math.abs(box.getWaight() - this.waight) < 1.0001){
            return true;
        }
     return false;
    }

    public void shiftFruitsIn(Box<T> box){
        for (int i = 0; i < listOfFruits.size(); i++) {
            box.putFruitInBox(listOfFruits.get(i));
        }
        listOfFruits.clear();
        waight=0.0f;
    }

}
