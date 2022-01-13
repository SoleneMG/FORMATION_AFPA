package lotov2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

    public class BlueCircleLabel extends JLabel {

        public BlueCircleLabel(String text) {
            setOpaque(false);
            setPreferredSize(getPreferredSize());
            setLayout(new BorderLayout());
            String pattern = "[a-zA-Z0-9]{1}";
            String contentLbl = text.matches(pattern) ? "   "+text : "  "+text;
            JLabel txt = new JLabel(contentLbl);
            txt.setHorizontalTextPosition(JLabel.CENTER);
            txt.setForeground(Color.white);
            //setVerticalTextPosition(JLabel.CENTER);
            add(txt);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(25,25);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
            g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
            g2d.setColor(Color.BLUE);
            g2d.fill(new Ellipse2D.Double(0, 0,25, 25));
//            g2d.setColor(Color.blue);
//            g2d.fill(new Ellipse2D.Double(105, 0,100, 100));
//            g2d.setColor(Color.blue);
//            g2d.fill(new Ellipse2D.Double(210, 0,100, 100));
//            g2d.setColor(Color.blue);
//            g2d.fill(new Ellipse2D.Double(315, 0,100, 100));
//            g2d.setColor(Color.blue);
//            g2d.fill(new Ellipse2D.Double(420, 0,100, 100));
            g2d.dispose();
        }

    }


