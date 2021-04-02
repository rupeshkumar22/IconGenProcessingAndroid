import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.imgscalr.Scalr;

public class Mine{

	public static void main(String[] args) {
		File imageFile = new File("myimg.jpg");
		String dirPath = ".";
		if (imageFile.exists()) {
			try {

				BufferedImage myImage = ImageIO.read(imageFile);

				BufferedImage ultra = createResizedCopy(myImage, 192, 192);
				BufferedImage xxhdpi = createResizedCopy(myImage, 144, 144);
				BufferedImage xhdpi = createResizedCopy(myImage,96, 96);
				BufferedImage hdpi = createResizedCopy(myImage, 72, 72);
				BufferedImage mdpi = createResizedCopy(myImage, 48, 48);
				BufferedImage ldpi = createResizedCopy(myImage, 36, 36);

				// output files
				File ultraFile = new File(dirPath + "/icon-192.png");
				File xxhdpiFile = new File(dirPath + "/icon-144.png");
				File xhdpiFile = new File(dirPath + "/icon-96.png");
				File hdpiFile = new File(dirPath + "/icon-72.png");
				File mdpiFile = new File(dirPath + "/icon-48.png");
				File ldpiFile = new File(dirPath + "/icon-36.png");

				System.out.println("Creating Files...");

				ultraFile.mkdirs();
				xxhdpiFile.mkdirs();
				xhdpiFile.mkdirs();
				hdpiFile.mkdirs();
				mdpiFile.mkdirs();
				ldpiFile.mkdirs();

				ImageIO.write(mdpi, "PNG", mdpiFile);
				ImageIO.write(ldpi, "PNG", ldpiFile);
				ImageIO.write(hdpi, "PNG", hdpiFile);
				ImageIO.write(xxhdpi, "PNG", xxhdpiFile);
				ImageIO.write(xhdpi, "PNG", xhdpiFile);
				ImageIO.write(ultra, "PNG", ultraFile);
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("Done");

	}

	public static BufferedImage createResizedCopy(BufferedImage originalImage,
									int scaledWidth, int scaledHeight) {

		return Scalr.resize(originalImage, Scalr.Method.ULTRA_QUALITY,
				scaledWidth, scaledHeight, Scalr.OP_ANTIALIAS);

	}


}
