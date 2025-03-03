package com.launcher;



import java.awt.Dimension;



public class VistaGame extends javax.swing.JPanel {
int conta;
Dimension tamañoind = new Dimension(15,15);
Dimension flechaoriginal = new Dimension(22, 35);
Dimension flechaescalada = new Dimension(28, 41);
Dimension comenzaroriginal = new Dimension(260, 50);
Dimension comenzarescalado = new Dimension(280, 60);
String contenido = "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\json\\launcher_universae.json";

String[] rutasembarque = utilidades.getRuta_Embarque(contenido);

String [] rutashemorragia = utilidades.getRuta_Hemorragia(contenido);

String[] rutasextincion = utilidades.getRuta_Extincion(contenido);

String[] rutasepis = utilidades.getRuta_EPIS(contenido);

String[] rutashelicoptero = utilidades.getRuta_Helicoptero(contenido);

String[] rutasascensor = utilidades.getRuta_Ascensor(contenido);

String[] rutasind = utilidades.getRutaind(contenido);
        
String [] rutasflecha = utilidades.getRutaflecha(contenido);

int indicejuego;
    
 public VistaGame() {
        initComponents();
        
 }
public void iniciargame_embarque(){
        utilidades.reescala(bg_grado, rutasembarque[0], new Dimension(870, 480));
        utilidades.reescala(ffbg_game, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Cuadrado_enfocado.png", new Dimension(1000, 420));
        utilidades.reescala(comenzar, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Comenzar.png", new Dimension(260, 50));
        indicejuego = 0;
        
}    
public void iniciargame_hemorragia(){
        utilidades.reescala(bg_grado, rutashemorragia[0], new Dimension(870, 480));
        utilidades.reescala(ffbg_game, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Cuadrado_enfocado.png", new Dimension(1000, 420));
        utilidades.reescala(comenzar, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Comenzar.png", new Dimension(260, 50));
        indicejuego = 1;
        
}    
public void iniciargame_extincion(){
        utilidades.reescala(bg_grado, rutasextincion[0], new Dimension(870, 480));
        utilidades.reescala(ffbg_game, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Cuadrado_enfocado.png", new Dimension(1000, 420));
        utilidades.reescala(comenzar, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Comenzar.png", new Dimension(260, 50));
        indicejuego = 2;
        
}    
public void iniciargame_epis(){
        utilidades.reescala(bg_grado, rutasepis[0], new Dimension(870, 480));
        utilidades.reescala(ffbg_game, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Cuadrado_enfocado.png", new Dimension(1000, 420));
        utilidades.reescala(comenzar, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Comenzar.png", new Dimension(260, 50));
        indicejuego = 3;
        
}    
public void iniciargame_helicoptero(){
        utilidades.reescala(bg_grado, rutashelicoptero[0], new Dimension(870, 480));
        utilidades.reescala(ffbg_game, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Cuadrado_enfocado.png", new Dimension(1000, 420));
        utilidades.reescala(comenzar, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Comenzar.png", new Dimension(260, 50));
        indicejuego = 4;
        
}    
public void iniciargame_ascensor(){
        utilidades.reescala(bg_grado, rutasascensor[0], new Dimension(870, 480));
        utilidades.reescala(ffbg_game, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Cuadrado_enfocado.png", new Dimension(1000, 420));
        utilidades.reescala(comenzar, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Comenzar.png", new Dimension(260, 50));
        indicejuego = 5;
        
}    

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_game = new javax.swing.JPanel();
        izqda = new javax.swing.JLabel();
        drcha = new javax.swing.JLabel();
        bg_grado = new javax.swing.JLabel();
        ffbg_game = new javax.swing.JLabel();
        barrita = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        comenzar = new javax.swing.JLabel();
        bg_indice = new javax.swing.JPanel();
        ind1 = new javax.swing.JLabel();
        ind2 = new javax.swing.JLabel();
        ind3 = new javax.swing.JLabel();
        ind4 = new javax.swing.JLabel();
        ind5 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1550, 880));
        setMinimumSize(new java.awt.Dimension(1550, 880));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1550, 880));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_game.setBackground(new java.awt.Color(10, 38, 72));
        bg_game.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg_game.setMaximumSize(new java.awt.Dimension(1550, 880));
        bg_game.setMinimumSize(new java.awt.Dimension(1550, 880));
        bg_game.setPreferredSize(new java.awt.Dimension(1550, 880));
        bg_game.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        izqda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        izqda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_game/Flecha izquierda.png"))); // NOI18N
        izqda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izqda.setMaximumSize(new java.awt.Dimension(40, 50));
        izqda.setMinimumSize(new java.awt.Dimension(40, 50));
        izqda.setPreferredSize(new java.awt.Dimension(40, 50));
        izqda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                izqdaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                izqdaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                izqdaMouseExited(evt);
            }
        });
        bg_game.add(izqda, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 307, 40, 50));

        drcha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drcha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_game/Flecha derecha.png"))); // NOI18N
        drcha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drcha.setMaximumSize(new java.awt.Dimension(40, 50));
        drcha.setMinimumSize(new java.awt.Dimension(40, 50));
        drcha.setPreferredSize(new java.awt.Dimension(40, 50));
        drcha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drchaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drchaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                drchaMouseExited(evt);
            }
        });
        bg_game.add(drcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1282, 307, 40, 50));

        bg_grado.setBackground(new java.awt.Color(255, 255, 255));
        bg_grado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_grado.setAlignmentX(0.5F);
        bg_grado.setMaximumSize(new java.awt.Dimension(870, 480));
        bg_grado.setMinimumSize(new java.awt.Dimension(870, 480));
        bg_grado.setPreferredSize(new java.awt.Dimension(870, 480));
        bg_game.add(bg_grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 870, 480));

        ffbg_game.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ffbg_game.setAlignmentX(0.5F);
        ffbg_game.setMaximumSize(new java.awt.Dimension(980, 420));
        ffbg_game.setMinimumSize(new java.awt.Dimension(980, 420));
        ffbg_game.setPreferredSize(new java.awt.Dimension(980, 420));
        bg_game.add(ffbg_game, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 130, 980, 420));

        barrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_game/Barrita aislada descripción.png"))); // NOI18N
        bg_game.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 614, -1, -1));

        titulo.setFont(new java.awt.Font("Raleway Medium", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Embarque y desembarque en helicoptero");
        bg_game.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 614, 404, 28));

        txt.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setText("<html>En un campo de prácticas sumido en el desorden y la confusión tienes que encontrar tienes que encontrar y colocar las partes de los EPIs utilizados en la extinción de incendios forestales.<html>");
        bg_game.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 680, 630, 86));
        txt.getAccessibleContext().setAccessibleName("");

        comenzar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_game/Comenzar.png"))); // NOI18N
        comenzar.setMaximumSize(new java.awt.Dimension(260, 50));
        comenzar.setMinimumSize(new java.awt.Dimension(260, 50));
        comenzar.setPreferredSize(new java.awt.Dimension(260, 50));
        comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comenzarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comenzarMouseExited(evt);
            }
        });
        bg_game.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 760, 280, 70));

        bg_indice.setOpaque(false);
        bg_indice.setLayout(new java.awt.GridLayout(1, 0));

        ind1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ind1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_game/PuntoCarruselFilled.png"))); // NOI18N
        ind1.setBorder(null);
        ind1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ind1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ind1MouseClicked(evt);
            }
        });
        bg_indice.add(ind1);

        ind2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_game/PuntoCarruselEmpty.png"))); // NOI18N
        ind2.setBorder(null);
        ind2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ind2.setMaximumSize(new java.awt.Dimension(15, 15));
        ind2.setMinimumSize(new java.awt.Dimension(15, 15));
        ind2.setPreferredSize(new java.awt.Dimension(15, 15));
        ind2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ind2MouseClicked(evt);
            }
        });
        bg_indice.add(ind2);

        ind3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ind3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_game/PuntoCarruselEmpty.png"))); // NOI18N
        ind3.setBorder(null);
        ind3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ind3.setMaximumSize(new java.awt.Dimension(15, 15));
        ind3.setMinimumSize(new java.awt.Dimension(15, 15));
        ind3.setPreferredSize(new java.awt.Dimension(15, 15));
        ind3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ind3MouseClicked(evt);
            }
        });
        bg_indice.add(ind3);

        ind4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ind4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_game/PuntoCarruselEmpty.png"))); // NOI18N
        ind4.setBorder(null);
        ind4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ind4.setMaximumSize(new java.awt.Dimension(15, 15));
        ind4.setMinimumSize(new java.awt.Dimension(15, 15));
        ind4.setPreferredSize(new java.awt.Dimension(15, 15));
        ind4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ind4MouseClicked(evt);
            }
        });
        bg_indice.add(ind4);

        ind5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ind5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images_game/PuntoCarruselEmpty.png"))); // NOI18N
        ind5.setBorder(null);
        ind5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ind5.setMaximumSize(new java.awt.Dimension(15, 15));
        ind5.setMinimumSize(new java.awt.Dimension(15, 15));
        ind5.setPreferredSize(new java.awt.Dimension(15, 15));
        ind5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ind5MouseClicked(evt);
            }
        });
        bg_indice.add(ind5);

        bg_game.add(bg_indice, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 587, 86, 23));

        add(bg_game, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void drchaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drchaMouseClicked
        //IMAGENES 
        
        if (conta >= 4){                                         
                conta=0;
          }else{
                conta ++;
         }
         switch (indicejuego){
             case 0 -> {
                 utilidades.reescala(bg_grado, rutasembarque[conta], new Dimension(870, 480));
             }
             case 1 -> {
                 utilidades.reescala(bg_grado, rutashemorragia[conta], new Dimension(870, 480));
             }
             case 2 -> {
                 utilidades.reescala(bg_grado, rutasextincion[conta], new Dimension(870, 480));
             }
             case 3 -> {
                 utilidades.reescala(bg_grado, rutasepis[conta], new Dimension(870, 480));
             }
             case 4 -> {
                 utilidades.reescala(bg_grado, rutashelicoptero[conta], new Dimension(870, 480));
             }
             case 5 -> {
                 utilidades.reescala(bg_grado, rutasascensor[conta], new Dimension(870, 480));
             }
             default -> {}
         }

    //INDICE
    switch (conta) {
        case 0 -> {
            utilidades.reescala(ind1, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
        }
        case 1 -> {
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
        }
        case 2 -> {
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
        }
        case 3 -> {
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
        }
        case 4 -> {
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[1], new Dimension(tamañoind));
        }
        default -> {}
    }
    }//GEN-LAST:event_drchaMouseClicked

    private void izqdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_izqdaMouseClicked
         if (conta <=0 ){                                         
            conta=4;
         }else{
          conta --;  
        }
          switch (indicejuego){
             case 0 -> {
                 utilidades.reescala(bg_grado, rutasembarque[conta], new Dimension(870, 480));
             }
             case 1 -> {
                 utilidades.reescala(bg_grado, rutashemorragia[conta], new Dimension(870, 480));
             }
             case 2 -> {
                 utilidades.reescala(bg_grado, rutasextincion[conta], new Dimension(870, 480));
             }
             case 3 -> {
                 utilidades.reescala(bg_grado, rutasepis[conta], new Dimension(870, 480));
             }
             case 4 -> {
                 utilidades.reescala(bg_grado, rutashelicoptero[conta], new Dimension(870, 480));
             }
             case 5 -> {
                 utilidades.reescala(bg_grado, rutasascensor[conta], new Dimension(870, 480));
             }
             default -> {}
         }
          //INDICE
           switch (conta) {
        case 0 -> {
            utilidades.reescala(ind1, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
        }
        case 1 -> {
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
        }
        case 2 -> {
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
        }
        case 3 -> {
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
        }
        case 4 -> {
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[1], new Dimension(tamañoind));
        }
        default -> {}
    }
    }//GEN-LAST:event_izqdaMouseClicked

    private void comenzarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comenzarMouseExited
        utilidades.reescala(comenzar, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Comenzar.png", comenzaroriginal);
    }//GEN-LAST:event_comenzarMouseExited

    private void comenzarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comenzarMouseEntered
        utilidades.reescala(comenzar, "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Launcher_Universae\\src\\com\\images_game\\Comenzar.png", comenzarescalado);
    }//GEN-LAST:event_comenzarMouseEntered

    private void izqdaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_izqdaMouseEntered
        utilidades.reescala(izqda, rutasflecha[1], flechaescalada);
    }//GEN-LAST:event_izqdaMouseEntered

    private void izqdaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_izqdaMouseExited
        utilidades.reescala(izqda, rutasflecha[1], flechaoriginal);
    }//GEN-LAST:event_izqdaMouseExited

    private void drchaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drchaMouseEntered
        utilidades.reescala(drcha, rutasflecha[0], flechaescalada);
    }//GEN-LAST:event_drchaMouseEntered

    private void drchaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drchaMouseExited
        utilidades.reescala(drcha, rutasflecha[0], flechaoriginal);
    }//GEN-LAST:event_drchaMouseExited

    private void ind1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ind1MouseClicked
            switch (indicejuego){
             case 0 -> {
                 utilidades.reescala(bg_grado, rutasembarque[0], new Dimension(870, 480));
             }
             case 1 -> {
                 utilidades.reescala(bg_grado, rutashemorragia[0], new Dimension(870, 480));
             }
             case 2 -> {
                 utilidades.reescala(bg_grado, rutasextincion[0], new Dimension(870, 480));
             }
             case 3 -> {
                 utilidades.reescala(bg_grado, rutasepis[0], new Dimension(870, 480));
             }
             case 4 -> {
                 utilidades.reescala(bg_grado, rutashelicoptero[0], new Dimension(870, 480));
             }
             case 5 -> {
                 utilidades.reescala(bg_grado, rutasascensor[0], new Dimension(870, 480));
             }
             default -> {}
         }
            utilidades.reescala(ind1, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
    }//GEN-LAST:event_ind1MouseClicked

    private void ind2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ind2MouseClicked
            switch (indicejuego){
             case 0 -> {
                 utilidades.reescala(bg_grado, rutasembarque[1], new Dimension(870, 480));
             }
             case 1 -> {
                 utilidades.reescala(bg_grado, rutashemorragia[1], new Dimension(870, 480));
             }
             case 2 -> {
                 utilidades.reescala(bg_grado, rutasextincion[1], new Dimension(870, 480));
             }
             case 3 -> {
                 utilidades.reescala(bg_grado, rutasepis[1], new Dimension(870, 480));
             }
             case 4 -> {
                 utilidades.reescala(bg_grado, rutashelicoptero[1], new Dimension(870, 480));
             }
             case 5 -> {
                 utilidades.reescala(bg_grado, rutasascensor[1], new Dimension(870, 480));
             }
             default -> {}
         }
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
    }//GEN-LAST:event_ind2MouseClicked

    private void ind3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ind3MouseClicked
            switch (indicejuego){
             case 0 -> {
                 utilidades.reescala(bg_grado, rutasembarque[2], new Dimension(870, 480));
             }
             case 1 -> {
                 utilidades.reescala(bg_grado, rutashemorragia[2], new Dimension(870, 480));
             }
             case 2 -> {
                 utilidades.reescala(bg_grado, rutasextincion[2], new Dimension(870, 480));
             }
             case 3 -> {
                 utilidades.reescala(bg_grado, rutasepis[2], new Dimension(870, 480));
             }
             case 4 -> {
                 utilidades.reescala(bg_grado, rutashelicoptero[2], new Dimension(870, 480));
             }
             case 5 -> {
                 utilidades.reescala(bg_grado, rutasascensor[2], new Dimension(870, 480));
             }
             default -> {}
         }
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
    }//GEN-LAST:event_ind3MouseClicked

    private void ind4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ind4MouseClicked
           switch (indicejuego){
             case 0 -> {
                 utilidades.reescala(bg_grado, rutasembarque[3], new Dimension(870, 480));
             }
             case 1 -> {
                 utilidades.reescala(bg_grado, rutashemorragia[3], new Dimension(870, 480));
             }
             case 2 -> {
                 utilidades.reescala(bg_grado, rutasextincion[3], new Dimension(870, 480));
             }
             case 3 -> {
                 utilidades.reescala(bg_grado, rutasepis[3], new Dimension(870, 480));
             }
             case 4 -> {
                 utilidades.reescala(bg_grado, rutashelicoptero[3], new Dimension(870, 480));
             }
             case 5 -> {
                 utilidades.reescala(bg_grado, rutasascensor[3], new Dimension(870, 480));
             }
             default -> {}
         } 
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[1], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[0], new Dimension(tamañoind));
    }//GEN-LAST:event_ind4MouseClicked

    private void ind5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ind5MouseClicked
            switch (indicejuego){
             case 0 -> {
                 utilidades.reescala(bg_grado, rutasembarque[4], new Dimension(870, 480));
             }
             case 1 -> {
                 utilidades.reescala(bg_grado, rutashemorragia[4], new Dimension(870, 480));
             }
             case 2 -> {
                 utilidades.reescala(bg_grado, rutasextincion[4], new Dimension(870, 480));
             }
             case 3 -> {
                 utilidades.reescala(bg_grado, rutasepis[4], new Dimension(870, 480));
             }
             case 4 -> {
                 utilidades.reescala(bg_grado, rutashelicoptero[4], new Dimension(870, 480));
             }
             case 5 -> {
                 utilidades.reescala(bg_grado, rutasascensor[4], new Dimension(870, 480));
             }
             default -> {}
         }
            utilidades.reescala(ind1, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind2, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind3, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind4, rutasind[0], new Dimension(tamañoind));
            utilidades.reescala(ind5, rutasind[1], new Dimension(tamañoind));
    }//GEN-LAST:event_ind5MouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barrita;
    private javax.swing.JPanel bg_game;
    private javax.swing.JLabel bg_grado;
    private javax.swing.JPanel bg_indice;
    private javax.swing.JLabel comenzar;
    private javax.swing.JLabel drcha;
    private javax.swing.JLabel ffbg_game;
    private javax.swing.JLabel ind1;
    private javax.swing.JLabel ind2;
    private javax.swing.JLabel ind3;
    private javax.swing.JLabel ind4;
    private javax.swing.JLabel ind5;
    private javax.swing.JLabel izqda;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
    
}
