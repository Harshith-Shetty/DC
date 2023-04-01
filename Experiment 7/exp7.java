import java.util.*; import java.util.Scanner; import javax.swing.*; import java.awt.*; import java.awt.geom.*; 
 public class lamport {     int e[][] = new int[10][10];     int en[][] = new int[10][10];     int ev[] = new int[10];     int i, p, j, k; 
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();     int xpoints[] = new int[5];     int ypoints[] = new int[5]; 
     class draw extends JFrame { 
        private final int ARR_SIZE = 4; 
 
        void drawArrow(Graphics g1, int x1, int y1, int x2, int y2) {             Graphics2D g = (Graphics2D) g1.create();             double dx = x2 - x1, dy = y2 - y1;             double angle = Math.atan2(dy, dx); 
            int len = (int) Math.sqrt(dx * dx + dy * dy); 
            AffineTransform at = AffineTransform.getTranslateInstance(x1, y1);             at.concatenate(AffineTransform.getRotateInstance(angle)); 
            g.transform(at); 
            // Draw horizontal arrow starting in (0, 0) 
            g.drawLine(0, 0, len, 0); 
            g.fillPolygon(new int[] {                     len, 
                    len - ARR_SIZE,                     