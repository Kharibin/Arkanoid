package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {
    private double speed, direction, dx, dy;
    private boolean isFrozen;


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.direction = direction;
        this.speed = speed;
        isFrozen = true;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(this.x, this.y, 'O');
    }

    @Override
    public void move() {
        if(!isFrozen){
            this.x = this.x + dx;
            this.y = this.y + dy;
        }
    }

    public void start(){
        this.isFrozen = false;
    }

    public void setDirection(){
        this.direction = direction;
        double angle = Math.toRadians(direction);
        dx = Math.cos(angle) * speed;
        dy = -Math.sin(angle) * speed;
    }

    public void checkRebound(int minx, int maxx, int miny, int maxy){

    }
}
