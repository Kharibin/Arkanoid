package com.javarush.task.task24.task2413;

import java.util.List;

public class Arkanoid {
    private int height, width;
    private Ball ball;
    private Stand stand;
    private List<Brick> bricks;
    static Arkanoid game;



    public void run(){}

    public static void main(String[] args) {

    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public Arkanoid(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public void move(){
        this.stand.move();
        this.ball.move();
    }

    public void draw(Canvas canvas){
        this.ball.draw(canvas);
        this.stand.draw(canvas);
        for (Brick x: this.bricks) {
            x.draw(canvas);
        }
    }
}
