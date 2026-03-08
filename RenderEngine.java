import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class RenderEngine extends JPanel implements Engine {

    protected List<Displayable> renderList;

    public RenderEngine() {
        renderList = new ArrayList<>();
    }

    @Override
    public void update() {
        System.out.println("Update RenderEngine");
        repaint();
    }

    public void addToRenderList(Displayable d) {
        renderList.add(d);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Displayable d : renderList) {
            d.draw(g);
        }
    }
}
