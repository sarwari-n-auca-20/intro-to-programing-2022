import processing.core.PApplet;
public class Problem03 extends PApplet {

    float rectX;
    float rectY;
    float rectW = 340;
    float rectH = 220;

    float circX;
    float circY;
    float r = 200;

    float smR = 140;

    float circX2;
    float circY2;

    public void settings() {
        fullScreen();
    }

    public void setup() {
//        rectangle setup
        rectX = width / 2f - rectW / 2f;
        rectY = 120;

        circX = width / 4f - r / 2f;
        circY = 220;

        circX2 = 3 * width / 4f + r / 2f;
        circY2 = 220;
    }

    public void draw() {
        background(0, 0, 0);

//        Rectangle
        if (mouseX >= rectX & mouseX <= rectX + rectW & mouseY >= rectY & mouseY <= rectY + rectH) {
            strokeWeight(4);
            stroke(255, 255, 0);
            textSize(30);
            fill(255, 255, 255);
            text("Rectangle", width / 2f - 60, height - 200f);
        } else {
            noStroke();
        }

        fill(120, 90, 200);
        rect(rectX, rectY, rectW, rectH);

//        Circle
        if (mouseX >= circX - r / 2f & mouseX <= circX + r / 2f & mouseY <= circY + r / 2f & mouseY >= circY - r / 2f) {
            strokeWeight(4);
            stroke(255, 255, 0);
            textSize(30);
            fill(255, 255, 255);
            text("Circle", width / 2f - 30, height - 200f);
        } else {
            noStroke();
        }

        fill(255, 0, 0);
        circle(circX, circY, r);


//        Ring

        if (mouseX >= circX2 - r / 2f & mouseX <= circX2 + r / 2f & mouseY <= circY2 + r / 2f & mouseY >= circY2 - r / 2f) {
            strokeWeight(4);
            stroke(255, 255, 0);
            textSize(30);
            fill(255, 255, 255);
            text("Ring", width / 2f - 25, height - 200f);
        } else {
            noStroke();
        }

        fill(45, 2, 255);
        circle(circX2, circY2, r);
        fill(0, 0, 0);
        circle(circX2, circY2, smR);


    }
    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}