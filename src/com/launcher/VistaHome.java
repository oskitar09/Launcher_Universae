package com.launcher;

import java.awt.Dimension;


public class VistaHome extends javax.swing.JPanel {
Dimension escalado = new Dimension (410,320);
Dimension original = new Dimension (380,290);
String ubicacion = "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\json\\launcher_universae.json";
String[] rutas_home = utilidades.getRuta_Home(ubicacion);

    public VistaHome() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_content = new javax.swing.JPanel();
        embarque = new javax.swing.JLabel();
        hemorragia = new javax.swing.JLabel();
        extincion = new javax.swing.JLabel();
        epis = new javax.swing.JLabel();
        helicoptero = new javax.swing.JLabel();
        ascensor = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1550, 880));
        setMinimumSize(new java.awt.Dimension(1550, 880));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1550, 880));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_content.setBackground(new java.awt.Color(255, 255, 255));
        bg_content.setMaximumSize(new java.awt.Dimension(1550, 880));
        bg_content.setMinimumSize(new java.awt.Dimension(1550, 880));
        bg_content.setOpaque(false);
        bg_content.setPreferredSize(new java.awt.Dimension(1550, 880));

        embarque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        embarque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_home/HomeButton0.png"))); // NOI18N
        embarque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        embarque.setMaximumSize(new java.awt.Dimension(380, 290));
        embarque.setMinimumSize(new java.awt.Dimension(380, 290));
        embarque.setPreferredSize(new java.awt.Dimension(380, 290));
        embarque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                embarqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                embarqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                embarqueMouseExited(evt);
            }
        });

        hemorragia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hemorragia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_home/HomeButton1.png"))); // NOI18N
        hemorragia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hemorragia.setMaximumSize(new java.awt.Dimension(380, 290));
        hemorragia.setMinimumSize(new java.awt.Dimension(380, 290));
        hemorragia.setPreferredSize(new java.awt.Dimension(380, 290));
        hemorragia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hemorragiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hemorragiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hemorragiaMouseExited(evt);
            }
        });

        extincion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extincion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_home/HomeButton2.png"))); // NOI18N
        extincion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        extincion.setMaximumSize(new java.awt.Dimension(380, 290));
        extincion.setMinimumSize(new java.awt.Dimension(380, 290));
        extincion.setPreferredSize(new java.awt.Dimension(380, 290));
        extincion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extincionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                extincionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                extincionMouseExited(evt);
            }
        });

        epis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        epis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_home/HomeButton3.png"))); // NOI18N
        epis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        epis.setMaximumSize(new java.awt.Dimension(380, 290));
        epis.setMinimumSize(new java.awt.Dimension(380, 290));
        epis.setPreferredSize(new java.awt.Dimension(380, 290));
        epis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                episMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                episMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                episMouseExited(evt);
            }
        });

        helicoptero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helicoptero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_home/HomeButton4.png"))); // NOI18N
        helicoptero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helicoptero.setMaximumSize(new java.awt.Dimension(380, 290));
        helicoptero.setMinimumSize(new java.awt.Dimension(380, 290));
        helicoptero.setPreferredSize(new java.awt.Dimension(380, 290));
        helicoptero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helicopteroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helicopteroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helicopteroMouseExited(evt);
            }
        });

        ascensor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ascensor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_home/HomeButton5.png"))); // NOI18N
        ascensor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ascensor.setMaximumSize(new java.awt.Dimension(380, 290));
        ascensor.setMinimumSize(new java.awt.Dimension(380, 290));
        ascensor.setPreferredSize(new java.awt.Dimension(380, 290));
        ascensor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ascensorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ascensorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ascensorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_contentLayout = new javax.swing.GroupLayout(bg_content);
        bg_content.setLayout(bg_contentLayout);
        bg_contentLayout.setHorizontalGroup(
            bg_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_contentLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(bg_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_contentLayout.createSequentialGroup()
                        .addComponent(embarque, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(hemorragia, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(extincion, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg_contentLayout.createSequentialGroup()
                        .addComponent(epis, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(helicoptero, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ascensor, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        bg_contentLayout.setVerticalGroup(
            bg_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_contentLayout.createSequentialGroup()
                .addGroup(bg_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(embarque, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hemorragia, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extincion, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(bg_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(epis, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helicoptero, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ascensor, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        add(bg_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void embarqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_embarqueMouseClicked
        VistaGame vg = new VistaGame();
        utilidades.imp(bg_content, vg);
        vg.iniciargame_embarque();
        
    }//GEN-LAST:event_embarqueMouseClicked

    private void embarqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_embarqueMouseEntered
        utilidades.reescala(embarque, rutas_home[0], escalado);
    }//GEN-LAST:event_embarqueMouseEntered

    private void embarqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_embarqueMouseExited
        utilidades.reescala(embarque, rutas_home[0], original);
    }//GEN-LAST:event_embarqueMouseExited

    private void hemorragiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hemorragiaMouseClicked
        VistaGame vg = new VistaGame();
        utilidades.imp(bg_content, vg);
        vg.iniciargame_hemorragia();
    }//GEN-LAST:event_hemorragiaMouseClicked

    private void hemorragiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hemorragiaMouseEntered
        utilidades.reescala(hemorragia, rutas_home[1], escalado);
    }//GEN-LAST:event_hemorragiaMouseEntered

    private void hemorragiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hemorragiaMouseExited
        utilidades.reescala(hemorragia, rutas_home[1], original);
    }//GEN-LAST:event_hemorragiaMouseExited

    private void extincionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extincionMouseClicked
        VistaGame vg = new VistaGame();
        utilidades.imp(bg_content, vg);
        vg.iniciargame_extincion();
    }//GEN-LAST:event_extincionMouseClicked

    private void extincionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extincionMouseEntered
        utilidades.reescala(extincion, rutas_home[2], escalado);
    }//GEN-LAST:event_extincionMouseEntered

    private void extincionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extincionMouseExited
        utilidades.reescala(extincion, rutas_home[2], original);
    }//GEN-LAST:event_extincionMouseExited

    private void episMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_episMouseClicked
        VistaGame vg = new VistaGame();
        utilidades.imp(bg_content, vg);
        vg.iniciargame_epis();
    }//GEN-LAST:event_episMouseClicked

    private void episMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_episMouseEntered
        utilidades.reescala(epis, rutas_home[3], escalado);
    }//GEN-LAST:event_episMouseEntered

    private void episMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_episMouseExited
        utilidades.reescala(epis, rutas_home[3], original);
    }//GEN-LAST:event_episMouseExited

    private void helicopteroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helicopteroMouseClicked
        VistaGame vg = new VistaGame();
        utilidades.imp(bg_content, vg);
        vg.iniciargame_helicoptero();
    }//GEN-LAST:event_helicopteroMouseClicked

    private void helicopteroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helicopteroMouseEntered
        utilidades.reescala(helicoptero, rutas_home[4], escalado);
    }//GEN-LAST:event_helicopteroMouseEntered

    private void helicopteroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helicopteroMouseExited
        utilidades.reescala(helicoptero, rutas_home[4], original);
    }//GEN-LAST:event_helicopteroMouseExited

    private void ascensorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ascensorMouseClicked
        VistaGame vg = new VistaGame();
        utilidades.imp(bg_content, vg);
        vg.iniciargame_ascensor();
    }//GEN-LAST:event_ascensorMouseClicked

    private void ascensorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ascensorMouseEntered
        utilidades.reescala(ascensor, rutas_home[5], escalado);
    }//GEN-LAST:event_ascensorMouseEntered

    private void ascensorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ascensorMouseExited
        utilidades.reescala(ascensor, rutas_home[5], original);
    }//GEN-LAST:event_ascensorMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ascensor;
    private javax.swing.JPanel bg_content;
    private javax.swing.JLabel embarque;
    private javax.swing.JLabel epis;
    private javax.swing.JLabel extincion;
    private javax.swing.JLabel helicoptero;
    private javax.swing.JLabel hemorragia;
    // End of variables declaration//GEN-END:variables
}
