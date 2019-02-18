import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Valentine {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public static void main(String[] args) {

        drawUpperHeart();
        drawBottomHeart();
        System.out.println();
        System.out.println();
        drawText("HAPPY VALENTINE'S DAY");

    }

    public static void drawUpperHeart() {

        int sideTopBackground = 5;
        int upperHeart = 3;
        int middleTopBackground = 9;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < sideTopBackground; j++) {
                System.out.print(ANSI_BLACK + (char) 10048 + ANSI_RESET);
            }
            for (int k = 0; k < upperHeart; k++) {
                System.out.print(ANSI_PURPLE + (char) 10048 + ANSI_RESET);
            }
            for (int l = 0; l < middleTopBackground; l++) {
                System.out.print(ANSI_BLACK + (char) 10048 + ANSI_RESET);
            }
            for (int k = 0; k < upperHeart; k++) {
                System.out.print(ANSI_PURPLE + (char) 10048 + ANSI_RESET);
            }
            for (int j = 0; j < sideTopBackground; j++) {
                System.out.print(ANSI_BLACK + (char) 10048 + ANSI_RESET);
            }

            sideTopBackground--;
            upperHeart = upperHeart + 2;
            middleTopBackground = middleTopBackground - 2;
            System.out.println();
        }
    }

    public static void drawBottomHeart() {

        int sideBottomBackground = 1;
        int bottomHeart = 23;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < sideBottomBackground; j++) {
                System.out.print(ANSI_BLACK + (char) 10048 + ANSI_RESET);
            }
            for (int k = 0; k < bottomHeart; k++) {
                System.out.print(ANSI_PURPLE + (char) 10048 + ANSI_RESET);
            }
            for (int j = 0; j < sideBottomBackground; j++) {
                System.out.print(ANSI_BLACK + (char) 10048 + ANSI_RESET);
            }

            sideBottomBackground++;
            bottomHeart = bottomHeart - 2;
            System.out.println();
        }
    }

    public static void drawText(String message) {

        BufferedImage image = new BufferedImage(144, 20, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("Dialog", Font.PLAIN, 10));
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString(message, 1, 12);
        try {
            ImageIO.write(image, "png", new File("text.png"));
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

        for (int y = 0; y < 20; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < 144; x++)
                sb.append(
                        image.getRGB(x, y) == -16777216 ? " " : image.getRGB(x, y) == -1 ? "#" : "*");
            if (sb.toString().trim().isEmpty())
                continue;
            System.out.println(sb);

        }

    }

}