import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.imageio.ImageIO;
import java.io.File;


public class Main {

    JFrame displayZoneFrame;
    RenderEngine renderEngine;

    public Main() throws Exception {
        displayZoneFrame = new JFrame("Java Labs");
        displayZoneFrame.setSize(400, 600);
        displayZoneFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        renderEngine = new RenderEngine();

        Sprite test = new Sprite(200,300,
                ImageIO.read(new File("./img/tree.png")),64,64);
        renderEngine.addToRenderList(test);


        Timer renderTimer = new Timer(50, (time) -> renderEngine.update());
        renderTimer.start();

        displayZoneFrame.getContentPane().add(renderEngine);

        displayZoneFrame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
    }
}
