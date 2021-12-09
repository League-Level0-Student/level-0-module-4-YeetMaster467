PImage face;
int x = 506;
int y = 230;
void setup() {
  face = loadImage("homer.jpeg");
  size(800,600);
  face.resize(width,height);
}

void draw() {
  background(face);
  fill(#FFFFFF);
  noStroke();
  ellipse(506,230, 105,80);
  ellipse(372,246, 115,100);
  fill(#000000);
  ellipse(x,y, 25,25);
  ellipse(x - 134, y + 16, 25,25);
  if(mouseX > 506-50 && mouseX < 506+50 && mouseY > 230-40 && mouseY < 230+40){
    x = mouseX;
    y = mouseY;
  }
}
