
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
boolean canPlaySounds = true;

void setup() {
  
  //Find a Where's Waldo picture and drop it into this sketch.     
  PImage waldo = loadImage("whereWaldo.jpeg"); // Change this to match your file name.
  size(600, 400); 
  // Resize your waldo picture to the same size as the sketch
  waldo.resize(600, 400);
  // Make the waldo image your sketch background
background(waldo);
}

void draw() {

      // If the user presses the mouse .......
      if(mousePressed){
          // Use this print statement to help you find the location of Waldo to use in the code below
           //println("X: " + mouseX + " Y: " + mouseY); 
    
          // Check if the location of the mouse is anywhere on the image of Waldo.
          // If it is, print “Waldo found!”  Use the text() command to write it on the sketch.
          
          if(mouseX > 492 && mouseX < 529 && mouseY > 299 && mouseY < 362){
            fill(#FFFFFF);
            noStroke();
            rect(225,10, 150, 50);
            fill(000000);
            textSize(25);
            text("Waldo Found!", 225, 43);
                if (canPlaySounds) {
                    playWoohoo();
                } 
          }else{
            
          // However, if the mouse is not on Waldo, print "Not here!" 
          // Use the text() command to write it on the sketch. 
          fill(#FFFFFF);
            noStroke();
            rect(225,10, 150, 50);
            fill(000000);
            textSize(25);
          text("Not here!", 225, 43);
                if (canPlaySounds) {
                    playDoh();
                }       
          }       
      }
}

/*********************  This code is needed to play sounds. ********************
              Remove the comment markers below, but DON'T CHANGE THE CODE */
              


import ddf.minim.*;
Minim minim = new Minim(this); 

AudioSample woohoo;
void playWoohoo() {
     if (woohoo == null) 
         woohoo = minim.loadSample("homer-woohoo.wav");
     woohoo.stop();
     woohoo.trigger();
}

AudioSample doh;
void playDoh() {
     if (doh == null)
         doh = minim.loadSample("homer-doh.wav"); 
     doh.stop();
     doh.trigger();
}
