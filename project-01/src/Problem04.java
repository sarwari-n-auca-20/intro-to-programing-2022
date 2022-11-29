import processing.core.*;

public class Problem04 extends PApplet {
    int x;
    int y;
    int endPoint;
    int scaleOfGrid;

    float xCircle;
    float yCircle;
    int score;


    int randomX;
    int randomY;

    float randomXLocation;
    float randomYLocation;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 4;
        y = 200;

        endPoint = 3 * width / 4;
        scaleOfGrid = max(width, height) / 30;

        xCircle = x + scaleOfGrid / 2f;
        yCircle = y + scaleOfGrid / 2f;

        randomX = Math.round(random(1, (3 * width / 4f - x) / scaleOfGrid));
        randomY = Math.round(random(1, (height - 2 * y) / scaleOfGrid));


        frameRate(5);
    }

    public void draw() {

//        Text header
        textSize(56);
        fill(255, 255, 255);
        text("Game: Collect yellow circle using Arrow Buttons", 200, 100);

//        Text Score
        textSize(36);
        fill(255, 0, 255);
        text("Score: " + score, width / 2f - 50, height - 100);

        noStroke();
        fill(0, 0, 0, 30);
        rect(0, 0, width, height);

//        GRID
        stroke(0, 0, 200);
        for (int i = x; i <= endPoint; i = i + scaleOfGrid) {
            line(i, y, i, height - y);
        }
        for (int j = y; j < height - y; j = j + scaleOfGrid) {
            line(x, j, endPoint, j);
        }

//        Ball Movement
        fill(255, 0, 0);
        noStroke();
        circle(xCircle, yCircle, scaleOfGrid);
        if (key == CODED) {
            if (keyCode == UP && yCircle > y + scaleOfGrid / 2f) {
                yCircle -= scaleOfGrid;
            } else if (keyCode == DOWN && yCircle < height - y - scaleOfGrid) {
                yCircle += scaleOfGrid;
            } else if (keyCode == RIGHT && xCircle < endPoint - scaleOfGrid) {
                xCircle += scaleOfGrid;
            } else if (keyCode == LEFT && xCircle > width / 4f + scaleOfGrid / 2f) {
                xCircle -= scaleOfGrid;
            }
        }

//        Random Ball
        fill(255, 255, 0);
        randomXLocation = (x + randomX * scaleOfGrid) - scaleOfGrid / 2f;
        randomYLocation = y + randomY * scaleOfGrid - scaleOfGrid / 2f;

        circle(randomXLocation, randomYLocation, scaleOfGrid);
        if (xCircle == randomXLocation && yCircle == randomYLocation) {
            randomX = Math.round(random(1, (3 * width / 4f - x) / scaleOfGrid));
            randomY = Math.round(random(1, (height - 2 * y) / scaleOfGrid));
            score++;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}