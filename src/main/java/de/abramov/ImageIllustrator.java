package de.abramov;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageIllustrator {

    public BufferedImage drawImage(int width, int height) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();

        enableAntialiasing(graphics);
        setWhiteBackground(graphics, width, height);

        int crossSize = Math.min(width, height) / 8;
        int circleSize = crossSize / 2 + 20; // Größere Kreise
        int circleMargin = 50; // Abstand zum Rand

        graphics.setColor(Color.BLACK);
        int crossX = (width - crossSize) / 2;
        int crossY = (height - crossSize) / 2;
        graphics.fillRect(crossX, 0, crossSize, height);
        graphics.fillRect(0, crossY, width, crossSize);

        drawCircle(graphics, circleMargin, circleMargin, circleSize, getRandomColor());
        drawCircle(graphics, width - circleSize - circleMargin, circleMargin, circleSize, getRandomColor());
        drawCircle(graphics, circleMargin, height - circleSize - circleMargin, circleSize, getRandomColor());
        drawCircle(graphics, width - circleSize - circleMargin, height - circleSize - circleMargin, circleSize, getRandomColor());

        return image;
    }

    private void setWhiteBackground(Graphics2D graphics, int width, int height) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, width, height);
    }

    private void enableAntialiasing(Graphics2D graphics) {
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }

    private void drawCircle(Graphics2D graphics, int x, int y, int size, Color color) {
        graphics.setColor(color);
        graphics.fillOval(x, y, size, size);
    }

    private Color getRandomColor() {
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        return new Color(red, green, blue);
    }
}
