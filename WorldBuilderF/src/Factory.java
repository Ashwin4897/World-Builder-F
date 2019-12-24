
public class Factory {
	char auxType;
	Terrain terr;
public Factory() {
	
}
public Terrain generateTerrain(int width2, int height2, int xpos, int ypos) {
	double rand = Math.random()*100;
	if (rand >= 0.0 && rand < 12.5) {
		this.auxType = 'G';
		this.terr = new Terrain(width2, height2, xpos, ypos, auxType);
	} else if (rand >= 12.5 && rand < 25.0) {
		this.auxType = 'H';
		this.terr = new Terrain(width2, height2, xpos, ypos, auxType);
	} else if (rand >= 25.0 && rand < 37.5) {
		this.auxType = 'M';
		this.terr = new Terrain(width2, height2, xpos, ypos, auxType);
	} else if (rand >= 37.5 && rand < 50.0) {
		this.auxType = 'D';
		this.terr = new Terrain(width2, height2, xpos, ypos, auxType);
	} else if (rand >= 50.0 && rand < 62.5) {
		this.auxType = 'R';
		this.terr = new Terrain(width2, height2, xpos, ypos, auxType);
	} else if (rand >= 62.5 && rand < 75.0) {
		this.auxType = 'F';
		this.terr = new Terrain(width2, height2, xpos, ypos, auxType);
	} else if (rand >= 75.0 && rand < 87.5) {
		this.auxType = 'B';
		this.terr = new Terrain(width2, height2, xpos, ypos, auxType);
	} else if (rand >= 87.5 && rand < 100.0) {
		this.auxType = 'L';
		this.terr = new Terrain(width2, height2, xpos, ypos, auxType);
	}
	
	return terr;	
}

}

