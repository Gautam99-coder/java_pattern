import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class bmw {
    public static void main(String[] args) {
        int width = 800;   // image width
        int height = 400;  // image height

        // Create a blank image
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Get graphics object to draw
        Graphics2D g = image.createGraphics();

        // Set background color to white
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        // Anti-aliasing for smoother edges
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw BMW car body (simplified side view)
        g.setColor(Color.BLUE);
        g.fillRoundRect(100, 200, 600, 100, 50, 50); // main body
        g.fillRect(150, 150, 400, 70); // top cabin

        // Draw wheels
        g.setColor(Color.BLACK);
        g.fillOval(180, 280, 80, 80); // front wheel
        g.fillOval(540, 280, 80, 80); // rear wheel

        // Draw windows
        g.setColor(Color.CYAN);
        g.fillRect(160, 160, 120, 60); // front window
        g.fillRect(300, 160, 140, 60); // middle window
        g.fillRect(450, 160, 120, 60); // rear window

        // Draw headlight
        g.setColor(Color.YELLOW);
        g.fillOval(650, 220, 40, 30);

        // Draw tail light
        g.setColor(Color.RED);
        g.fillOval(80, 220, 40, 30);

        // Save the image as PNG
        try {
            ImageIO.write(image, "png", new File("BMW_Car.png"));
            System.out.println("BMW car image created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Dispose graphics
        g.dispose();
    }
}
