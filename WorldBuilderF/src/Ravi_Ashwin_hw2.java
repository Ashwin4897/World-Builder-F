//Ashwin Ravi
//Student ID: 1210037735
import java.util.Scanner;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Ravi_Ashwin_hw2 extends BasicGame {
	static Scanner scan = new Scanner(System.in);
	static int arrayWidth;
	static int arrayHeight;
	static Factory terrainFac;
	static int pixelWidth;
	static int pixelHeight;
	static Terrain[][] terrPixelArray;
	static Terrain[][] aux;
	
	public Ravi_Ashwin_hw2(String title) {
		super(title);
		
	} 
	@Override
	public void render(GameContainer myGame, Graphics painter) throws SlickException {
		// TODO Auto-generated method stub
		for(int i = 0; i < arrayHeight; i++) {
			for(int j = 0; j < arrayWidth; j++) {
				terrPixelArray[i][j].drawSelf(painter);
			}
			
		}
	}

	@Override
	public void init(GameContainer myGame) throws SlickException {
		// TODO Auto-generated method stub
		
		pixelWidth = 500 / arrayWidth;
		pixelHeight = 500 / arrayHeight;
		terrainFac = new Factory();
		terrPixelArray = new Terrain[arrayWidth][arrayHeight];
		aux = new Terrain[arrayWidth][arrayHeight];
		Terrain terr = terrainFac.generateTerrain(pixelWidth, pixelHeight, 1, 1);
		for(int i = 0; i < arrayHeight; i++) {
			for(int j = 0; j < arrayWidth; j++) {
				terrPixelArray[i][j]=terr.generateNeighbor(pixelWidth*j, pixelHeight*i);
			}
		}
	}

	@Override
	public void update(GameContainer myGame, int frameCount) throws SlickException {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter width & height for array of pixels.");
		System.out.println("Width: ");
		arrayWidth = scan.nextInt();
		System.out.println("Height: ");
		arrayHeight = scan.nextInt();
		
		
		try
		{
		
			AppGameContainer appr;
			appr = new AppGameContainer(new Ravi_Ashwin_hw2("2D Landscape Generator"));
			appr.setDisplayMode(500, 500, false);
			appr.start();
			
			
			
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
