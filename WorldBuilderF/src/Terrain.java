import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
public class Terrain {
char type;
int width;
int height;
int x;
int y;
Color color;

public Terrain(int width1, int height1, int x1, int y1, char type1) {
	this.width= width1;
	this.height = height1;
	this.x = x1; 
	this.y = y1;
	if (type1 == 'G') {                //grass
	this.type = type1;
	this.color = Color.green.brighter(); 
	} else if (type1 == 'H') {                   //hill
	this.type = type1;
	this.color = Color.green;	
	} else if (type1 == 'M') {                      //mountain
	this.type = type1;
	this.color = Color.gray;		
	} else if (type1 == 'D') {             //desert
	this.type = type1;
	this.color = Color.yellow.darker().darker();		
	} else if (type1 == 'R') {                        //river
	this.type = type1;
	this.color = Color.blue.brighter();	
	} else if (type1 == 'F') {                      //forest
	this.type = type1;
	this.color = Color.green.darker();	
	} else if (type1 == 'B') {                //beach
	this.type = type1;
	this.color = Color.yellow.darker();
	} else if (type1 == 'L') {                 //lake/ocean
	this.type = type1;
	this.color = Color.blue.darker();
	}
	
	
	
}
public void drawSelf(Graphics painter) {
	painter.setColor(this.color);
	painter.fillRect(this.x, this.y, this.width, this.height);
}
public Terrain generateNeighbor(int x1, int y1) {
	Terrain neighbor = null;
	double rand1 = Math.random()*100;
	if(this.type == 'G') {
		if(rand1 >= 0.0 && rand1 < 40.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'G');
		} else if (rand1 >= 40.0 && rand1 < 55.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'H');
		} else if (rand1 >= 55.0 && rand1 < 60.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'D');
		} else if (rand1 >= 60.0 && rand1 < 75.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'R');
		} else if (rand1 >= 75.0 && rand1 < 90.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'F');
		} else if (rand1 >= 90.0 && rand1 < 100.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'B');
		} 
	} else if(this.type == 'H') {
		if(rand1 >= 0.0 && rand1 < 20.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'G');
		} else if (rand1 >= 20.0 && rand1 < 60.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'H');
		} else if (rand1 >= 60.0 && rand1 < 75.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'M');
		} else if (rand1 >= 75.0 && rand1 < 85.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'R');
		} else if (rand1 >= 85.0 && rand1 < 95.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'F');
		} else if (rand1 >= 95.0 && rand1 < 100.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'L');
		} 
		
	} else if(this.type == 'M') {
		if(rand1 >= 0.0 && rand1 < 25.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'H');
		} else if (rand1 >= 25.0 && rand1 < 75.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'M');
		} else if (rand1 >= 75.0 && rand1 < 80.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'D');
		} else if (rand1 >= 80.0 && rand1 < 85.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'R');
		} else if (rand1 >= 85.0 && rand1 < 95.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'F');
		} else if (rand1 >= 95.0 && rand1 < 100.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'L');
		} 
	} else if(this.type == 'D') {
		if(rand1 >= 0.0 && rand1 < 30.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'G');
		} else if(rand1 >= 30.0 && rand1 < 35.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'M');
		} else if(rand1 >= 35.0 && rand1 < 90.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'D');
		} else if(rand1 >= 90.0 && rand1 < 100) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'B');
		}
	} else if(this.type == 'R') {
		if(rand1 >= 0.0 && rand1 < 5.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'G');
		} else if(rand1 >= 5.0 && rand1 < 10.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'H');
		} else if(rand1 >=10.0 && rand1 < 15.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'M');
		} else if(rand1 >= 15.0 && rand1 < 65.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'R');
		} else if(rand1 >= 65.0 && rand1 < 70.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'F');
		} else if(rand1 >= 70.0 && rand1 < 80.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'B');
		} else if(rand1>= 80.0 && rand1 < 100.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'L');
		}
 	} else if(this.type == 'F') {
		if(rand1 >= 0.0 && rand1 < 15.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'G');
		} else if(rand1 >= 15.0 && rand1 < 30.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'H');
		} else if(rand1 >=30.0 && rand1 < 40.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'M');
		} else if(rand1 >= 40.0 && rand1 < 50.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'R');
		} else if(rand1 >= 50.0 && rand1 < 95.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'F');
		} else if(rand1>= 95.0 && rand1 < 100.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'L');
		}
	} else if(this.type == 'R') {
		if(rand1 >= 0.0 && rand1 < 15.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'G');
		} else if(rand1 >= 15.0 && rand1 < 30.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'H');
		} else if(rand1 >=30.0 && rand1 < 40.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'M');
		} else if(rand1 >= 40.0 && rand1 < 50.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'R');
		} else if(rand1 >= 50.0 && rand1 < 95.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'F');
		} else if(rand1>= 95.0 && rand1 < 100.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'L');
		}
	} else if(this.type == 'B') {
		if(rand1 >= 0.0 && rand1 < 10.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'G');
		} else if(rand1 >= 10.0 && rand1 < 15.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'D');
		} else if(rand1 >=15.0 && rand1 < 20.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'R');
		} else if(rand1 >= 20.0 && rand1 < 60.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'B');
		} else if(rand1 >= 60.0 && rand1 < 100.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'L');
		}
	} else if(this.type == 'L') {
		if(rand1 >= 0.0 && rand1 < 10.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'R');
		} else if(rand1 >= 10.0 && rand1 < 40.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'B');
		} else if(rand1 >=40.0 && rand1 < 100.0) {
			neighbor = new Terrain(this.width, this.height, x1, y1, 'L');
		
	}
	}
	return neighbor;
}
}
