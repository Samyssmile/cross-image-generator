package de.abramov;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Main {
    private static final Logger LOGGER =  Logger.getLogger(Main.class.getName());

    private ImageIllustrator imageIllustrator = new ImageIllustrator();

    public static void main(final String[] args)   {
        int width;
        int height;
        int numberOfImages;
        String outPutFolderPath;

        if (args.length != 0 && args.length != 4) {
            LOGGER.info("Invalid amount of arguments. Please use the following arguments: width height numberOfImages outPutFolderPath");
            return;
        }
        if (args.length == 4) {
            LOGGER.info("Creating images with width: " + args[0] + " height: " + args[1] + " and number of images: " + args[2]);
            width = Integer.parseInt(args[0]);
            height = Integer.parseInt(args[1]);
            numberOfImages = Integer.parseInt(args[2]);
            outPutFolderPath = args[3]+File.separator+"all_images";
        }else {
            height = 64;
            width = 64;
            numberOfImages = 5000;
            outPutFolderPath = "train";
            LOGGER.info("Creating images with default values width: " + width + " height: " + height + " and number of images: " + numberOfImages);
        }

        LOGGER.info("Starting application");
        final Main main = new Main();
        main.run(width, height, numberOfImages, outPutFolderPath);
        LOGGER.info("Application finished");

    }

    private void run(int width, int height, int numberOfImages, String outPutFolderPath) {
        createOutputDirectory(new File(outPutFolderPath));

        IntStream.range(0, numberOfImages).parallel().forEach(i -> {
            BufferedImage image = imageIllustrator.drawImage(width, height);
            File outputfile = new File(outPutFolderPath+File.separator+"image" + i + ".jpeg");
            try {
                ImageIO.write(image, "jpeg", outputfile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static void createOutputDirectory(File outPutFolder) {
        LOGGER.info("Output directory: " + outPutFolder.getAbsolutePath());
        if (!outPutFolder.exists()) {
            outPutFolder.mkdirs();
            LOGGER.info("Creating directory: " + outPutFolder.getName());
        }
    }
}