import java.util.*;
public class PhotoGuy
	{
		static int num=0;
		public static Picture image;
		
		public static void main(String[] args)
		{
			System.out.println("Welcome to PhotoBoi.");
			System.out.println("This is a program that is much easier to use than photshop.");
			System.out.println("Brought to you buy Bo and company.");
			printImages();
			chooseTool();
			
		}
		
		public static void printImages()
		{
			Scanner userImage = new Scanner(System.in);
			System.out.println("Please select an image.");
			System.out.println("1)  A stunning arch." );
			System.out.println("2)  A beautiful beach.");
			System.out.println("3)  A blue moped.");
			System.out.println("4)  A buttefrly.");
			System.out.println("5)  A caterpillar.");
			System.out.println("6)  Cumberland Island.");
			System.out.println("7)  A flower plant.");
			System.out.println("8)  Another flower plant.");
			System.out.println("9)  A gorge.");
			System.out.println("10) A fancy katie.");
			System.out.println("11) A koala.");
			System.out.println("12) The surface of the moon.");
			System.out.println("13) A red motorcycle.");
			System.out.println("14) A robot.");
			System.out.println("15) A gull from the sea.");
			System.out.println("16) A jolly snowman.");
			System.out.println("17) A peaceful swan.");
			System.out.println("18) A temple.");
			System.out.println("19) Water.");
			System.out.println("20) Our personal favorite... shrek.");
			
			int pic = userImage.nextInt();
			switch (pic)
			{
				case 1: image = new Picture ("arch.jpg");
				break;
				
				case 2: image = new Picture ("beach.jpg");
				break;
				
				case 3: image = new Picture ("blueMotorcyle.jpg");
				break;
				
				case 4: image = new Picture ("butterfly1.jpg");
				break;
				
				case 5: image = new Picture ("caterpillar.jpg");
				break;
				
				case 6: image = new Picture ("CumberlandIsland.jpg");
				break;
				
				case 7: image = new Picture ("flower1.jpg");
				break;
				
				case 8: image = new Picture ("flower2.jpg");
				break;
				
				case 9: image = new Picture ("gorge.jpg");
				break;
				
				case 10: image = new Picture ("KatieFancy.jpg");
				break;
				
				case 11: image = new Picture ("koala.jpg");
				break;
				
				case 12: image = new Picture ("moon-surface.jpg");
				break;
				
				case 13: image = new Picture ("redMotorcylce.jpg");
				break;
				
				case 14: image = new Picture ("robot.jpg");
				break;
				
				case 15: image = new Picture ("seagull.jpg");
				break;
				
				case 16: image = new Picture ("snowman.jpg");
				break;
				
				case 17: image = new Picture ("swan.jpg");
				break;
				
				case 18: image = new Picture ("temple.jpg");
				break;
				
				case 19: image = new Picture ("water.jpg");
				break;
				
				case 20: image = new Picture ("shrekboiii.jpg");
				break;
			}
			
			
		}
		
		public static void chooseTool()
		{
			Scanner userTool = new Scanner(System.in);
			System.out.println("Please select a photoshop tool.");
			System.out.println("1)  Grayscale." );
			System.out.println("2)  Negate.");
			System.out.println("3)  Zero blue.");
			System.out.println("4)  Zero red.");
			System.out.println("5)  Mirror veritcal right to left.");
			System.out.println("6)  Mirror horizontal.");
			System.out.println("7)  Mirror horizontal bottom to top.");
			System.out.println("8)  Mirror diagonal.");
			System.out.println("9)  Mirror vertical.");
			System.out.println("10) Edge Detection");
			System.out.println("11) Collage");
			System.out.println("12) Keep only blue.");
			System.out.println("13) Keep only green.");
			System.out.println("14) Keep only red.");
			System.out.println("15) A gull from the sea.");
			System.out.println("16) ");
			int tool = userTool.nextInt();
			switch (tool)
			{
				case 1: PictureTester.testGrayscale();
				break;
				
		 		case 2: PictureTester.testNegatePicture();
				break;
				
				case 3: PictureTester.testZeroBlue();
				break;
				
				case 4: PictureTester.testZeroRed();
				break;
				
				case 5: PictureTester.testMirrorVerticalRightToLeft();
				break;
				
				case 6: PictureTester.testMirrorHorizontal();
				break;
				
				case 7: PictureTester.testMirrrorHorizontalBottomToTop();
				break;
				
				case 8: PictureTester.testPictureDiagonal(); //check functionality 
				break;
				
				case 9: PictureTester.testMirrorVertical();
				break;
				
				case 10: PictureTester.testEdgeDetection();
				break;
				
				case 11: PictureTester.testCollage();
				break;
				
				case 12: PictureTester.testOnlyBlue();
				break;
				
				case 13: PictureTester.testOnlyGreen();
				break;
				
				case 14: PictureTester.testOnlyRed();
				break;
				
				case 15: image = new Picture ("seagull.jpg");
				break;
				
				case 16: image = new Picture ("snowman.jpg");
				break;
				
				case 17: image = new Picture ("swan.jpg");
				break;
				
				case 18: image = new Picture ("temple.jpg");
				break;
				
				case 19: image = new Picture ("water.jpg");
				break;
				
				case 20: image = new Picture ("shrekboiii.jpg");
				break;
			}
			
			
		}
	}
