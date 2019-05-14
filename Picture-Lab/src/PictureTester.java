/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    
    PhotoGuy.image.explore();
    PhotoGuy.image.zeroBlue();
    PhotoGuy.image.explore();
  }
  
  public static void testZeroRed()
  {
    
    PhotoGuy.image.explore();
    PhotoGuy.image.zeroRed();
    PhotoGuy.image.explore();
  }
  
  public static void testNegatePicture()
  {
	 
	  PhotoGuy.image.explore();
	  PhotoGuy.image.negatePicture();
	  PhotoGuy.image.explore();
  }
  public static void testOnlyBlue()
  {
		 
	  PhotoGuy.image.explore();
	  PhotoGuy.image.keepOnlyBlue();
	  PhotoGuy.image.explore();
  }
  
  public static void testOnlyGreen()
  {
		 
	  PhotoGuy.image.explore();
	  PhotoGuy.image.keepOnlyGreen();
	  PhotoGuy.image.explore();
  }
  
  public static void testOnlyRed()
  {
		 
	  PhotoGuy.image.explore();
	  PhotoGuy.image.keepOnlyRed();
	  PhotoGuy.image.explore();
  }
  
  
  public static void testGrayscale()
  {
	  
	  PhotoGuy.image.explore();
	  PhotoGuy.image.grayscale();
	  PhotoGuy.image.explore();
  }
  public static void testFixUnderWater()
  {
	  //Picture beach = new Picture("water.jpg");
	  PhotoGuy.image.explore();
	  PhotoGuy.image.fixUnderwater();
	  PhotoGuy.image.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
	  //Picture caterpillar = new Picture("beach.jpg");
	  PhotoGuy.image.explore();
	  PhotoGuy.image.mirrorVerticalRightToLeft();
	  PhotoGuy.image.explore();
  }
  public static void testMirrorHorizontal()
  {
	  //Picture caterpillar = new Picture("beach.jpg");
	  PhotoGuy.image.explore();
	  PhotoGuy.image.mirrorHorizontal();
	  PhotoGuy.image.explore();
  }
  public static void testMirrrorHorizontalBottomToTop()
  {
	  //Picture caterpillar = new Picture("shrekboiii.jpg");
	  PhotoGuy.image.explore();
	  PhotoGuy.image.mirrorHorizontalBottomToTop();
	  PhotoGuy.image.explore();
  }
  public static void testPictureDiagonal()
  {
	  //Picture caterpillar = new Picture("shrekboiii.jpg");
	  PhotoGuy.image.explore();
	  
	  PhotoGuy.image.pictureDiagonal();
	  PhotoGuy.image.explore();
  }
  public static void testMirrorArms()
  {
	  //Picture caterpillar = new Picture("snowman.jpg");
	  PhotoGuy.image.explore();
	  PhotoGuy.image.mirrorArms();
	  PhotoGuy.image.explore();
	  
	  
  }
  public static void testMirrorGull()
  {
	  //Picture caterpillar = new Picture("seagull.jpg");
	  PhotoGuy.image.explore();
	  PhotoGuy.image.mirrorGull();
	  PhotoGuy.image.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    //Picture caterpillar = new Picture("caterpillar.jpg");
	  PhotoGuy.image.explore();
	  PhotoGuy.image.mirrorVertical();
	  PhotoGuy.image.explore();
  }
  
  public static void testChristmas()
  {
	  PhotoGuy.image.explore();
	  PhotoGuy.image.filterChristmas();
	  PhotoGuy.image.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    //Picture canvas = new Picture("640x480.jpg");
    PhotoGuy.image.createCollage();
    //canvas.createCollage();
    PhotoGuy.image.explore();
  }
  
  public static void testCopy()
  {
	  PhotoGuy.image.explore();
	  PhotoGuy.image.copy(PhotoGuy.image, 20 , 20);
	  PhotoGuy.image.explore();
  }
  
  public static void darkenImage()
	  {
		  PhotoGuy.image.explore();
		  PhotoGuy.image.darkenImage();
		  PhotoGuy.image.explore();
	  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    //Picture swan = new Picture("swan.jpg");
	  PhotoGuy.image.explore();
	  PhotoGuy.image.edgeDetection(10);
	  PhotoGuy.image.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
	//testMirrorGull();
	//testMirrorArms();
	//testPictureDiagonal();
	//testMirrrorHorizontalBottomToTop();
	//testMirrorHorizontal();
	//testMirrorVerticalRightToLeft();
	//testFixUnderWater();
	//testGrayscale();
	// testNegatePicture();
	//testOnlyBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}