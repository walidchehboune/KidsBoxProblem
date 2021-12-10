package com.kidsbox.org;


import java.util.ArrayList;

class Entity{

    private double x;
    private double y;
    public Entity()
    {

    }
    public Entity(double x,double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getY(){return this.x;}
    public double getX(){return this.y;}


    public void setX(double x){this.x = x;}
    public void setY(double y){ this.y = y;}


    //* formule de calcule
    public Double getDistance(Entity a,Entity b){


        return Math.sqrt((Double)(Math.pow((b.getX() - a.getX()),2)+Math.pow((b.getY() - a.getY()),2)));

    }

    //** calculer l'obstacle le plus proche de l'entite courante
    public int GetBoxClose(Entity boxs[]){

            double distance = 0;
            int index = 0;
            distance =  boxs.length > 0 ? this.getDistance(this,boxs[0]) :  distance;
            for(int i = 0;i<boxs.length;i++)
            {

                if(this.getDistance(this,boxs[i])  < distance  )
                {
                    distance = this.getDistance(this,boxs[i]);
                    index = i ;
                }
            }
        //** le +1 pour avoir le meme resulat sur le PDF sinon le tableau box est vide en garde -1
            index = boxs.length > 0 ? index+1 : index;

            return index;
    }

}