package com.vivarium.model;

/**
 * 
 */
public class Rabbit extends Herbivore {

    /**
     * Default constructor
     */
    public Rabbit(int posX,int posY,Vivarium v, float health, float hunger, float vitality,float speed, Sex type) {
        super(posX, posY,v,health,hunger,vitality,speed,type, null, null);
    }

    @Override
    public void evoluate(long dt) {

    }

}