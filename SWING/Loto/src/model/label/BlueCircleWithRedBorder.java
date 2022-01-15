package model.label;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

    public class BlueCircleWithRedBorder extends JLabel {
    	int ray = 40;

        public BlueCircleWithRedBorder() {
            setOpaque(false);
            setPreferredSize(getPreferredSize());
            setLayout(new BorderLayout());
            setForeground(Color.white);
            setBackground(Color.RED);
            setHorizontalAlignment(SwingConstants.CENTER);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(ray, ray);
        }

        @Override
        protected void paintComponent(Graphics g) {
        	
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
            g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
            g2d.setColor(new Color(41,57,133));
            g2d.fill(new Ellipse2D.Double(4, 4, ray-8, ray-8));
            g2d.setColor(new Color(234,57,70));
            g2d.setStroke(new BasicStroke(2));
            g2d.drawOval(1, 1, ray-2, ray-2);
            g2d.dispose();
            super.paintComponent(g);
        }

    }


