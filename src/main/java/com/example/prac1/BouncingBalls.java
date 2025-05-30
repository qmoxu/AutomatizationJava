package com.example.prac1;

public class BouncingBalls {
    public static void main(String[] args) throws InterruptedException {
        Ball b = new Ball(0.0, 0.0, 0.05, 0.03);

        for (int i = 0; i < 1000; i++) {
            b.move();
            System.out.printf("Ball at (%.2f, %.2f)\n", b.x, b.y);
            Thread.sleep(50);
        }
    }

    static class Ball {
        double x, y, vx, vy;
        Ball(double x, double y, double vx, double vy) {
            this.x = x;
            this.y = y;
            this.vx = vx;
            this.vy = vy;
        }

        void move() {
            if (x + vx < 0 || x + vx > 1) vx = -vx;
            if (y + vy < 0 || y + vy > 1) vy = -vy;
            x += vx;
            y += vy;
        }
    }
}
