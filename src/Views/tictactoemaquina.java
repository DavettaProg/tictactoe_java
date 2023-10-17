
package Views;

import java.awt.Color;
import javax.swing.JLabel;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class tictactoemaquina extends javax.swing.JFrame {

    Color miColor = new Color(102, 204, 255);
    boolean estado=true;
    String siguientejuego="O";
    String turno="X";
    JLabel lbs[]=new JLabel[9];
    int vs[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {1,4,7},
        {2,5,8},
        {3,6,9},
        {1,5,9},
        {3,5,7}, 
    };


    public tictactoemaquina() {
        initComponents();

        setLocationRelativeTo(null);
        lbs[0]=jLabel37;
        lbs[1]=jLabel38;
        lbs[2]=jLabel39;
        lbs[3]=jLabel40;
        lbs[4]=jLabel41;
        lbs[5]=jLabel42;
        lbs[6]=jLabel43;
        lbs[7]=jLabel44;
        lbs[8]=jLabel45;

    lblDificultad.setText("Dificultad: Fácil");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lbturno = new javax.swing.JLabel();
        lbpuntajeo = new javax.swing.JLabel();
        lbpuntajex = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lblDificultad = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jButton1.setText("jUGAR DE NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel37.setBackground(new java.awt.Color(102, 204, 255));
        jLabel37.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setOpaque(true);
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel37MousePressed(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(102, 204, 255));
        jLabel38.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setOpaque(true);
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel38MousePressed(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(102, 204, 255));
        jLabel39.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setOpaque(true);
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel39MousePressed(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(102, 204, 255));
        jLabel40.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setOpaque(true);
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel40MousePressed(evt);
            }
        });

        jLabel41.setBackground(new java.awt.Color(102, 204, 255));
        jLabel41.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setOpaque(true);
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel41MousePressed(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(102, 204, 255));
        jLabel42.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setOpaque(true);
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel42MousePressed(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(102, 204, 255));
        jLabel43.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setOpaque(true);
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel43MousePressed(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(102, 204, 255));
        jLabel44.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setOpaque(true);
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel44MousePressed(evt);
            }
        });

        jLabel45.setBackground(new java.awt.Color(102, 204, 255));
        jLabel45.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setOpaque(true);
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel45MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbturno.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lbturno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbturno.setText("Turno de X!");

        lbpuntajeo.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lbpuntajeo.setText("0");

        lbpuntajex.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lbpuntajex.setText("0");

        jLabel46.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel46.setText("O = ");

        lblDificultad.setBackground(new java.awt.Color(255, 255, 255));
        lblDificultad.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lblDificultad.setForeground(new java.awt.Color(255, 255, 255));
        lblDificultad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel48.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel48.setText("X =");

        jLabel49.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel49.setText("MARCADOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel46))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbpuntajeo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addGap(24, 24, 24))
                            .addComponent(lbpuntajex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(205, 205, 205))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(508, 508, 508))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbturno)
                        .addGap(81, 81, 81))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(lblDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbturno)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbpuntajex))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbpuntajeo))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );

        jMenu2.setText("Modo de juego");

        jMenuItem4.setText("JvsJ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Dificultad");

        jMenuItem1.setText("Facil");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Intermedio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Dificil");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       for (int i = 0; i < lbs.length; i++) {
        lbs[i].setText("");
        lbs[i].setBackground(miColor);
    }

    turno = siguientejuego;
    lbturno.setText("Turno de "+turno);
    estado = true;

        if(turno.equals("O")) {
            movimientoMaquina();
    }

        if (siguientejuego.equals("O")) {
            siguientejuego = "X";
    } else {
    siguientejuego = "O";
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MousePressed
        presionar(1);
    }//GEN-LAST:event_jLabel37MousePressed

    private void jLabel38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MousePressed
        presionar(2);
    }//GEN-LAST:event_jLabel38MousePressed

    private void jLabel39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MousePressed
        presionar(3);
    }//GEN-LAST:event_jLabel39MousePressed

    private void jLabel40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MousePressed
        presionar(4);
    }//GEN-LAST:event_jLabel40MousePressed

    private void jLabel41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MousePressed
        presionar(5);
    }//GEN-LAST:event_jLabel41MousePressed

    private void jLabel42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MousePressed
        presionar(6);
    }//GEN-LAST:event_jLabel42MousePressed

    private void jLabel43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MousePressed
        presionar(7);
    }//GEN-LAST:event_jLabel43MousePressed

    private void jLabel44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MousePressed
        presionar(8);
    }//GEN-LAST:event_jLabel44MousePressed

    private void jLabel45MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MousePressed
        presionar(9);
    }//GEN-LAST:event_jLabel45MousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            dificultadActual = Dificultad.FACIL;
            lblDificultad.setText("Dificultad: Fácil");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
            dificultadActual = Dificultad.INTERMEDIO;
            lblDificultad.setText("Dificultad: Intermedio");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
            dificultadActual = Dificultad.DIFICIL;
            lblDificultad.setText("Dificultad: Difícil");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         menuItemJugadorVsJugadorActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
        
    public void menuItemJugadorVsJugadorActionPerformed(java.awt.event.ActionEvent evt) {    
        tictactoe tictactoe= new tictactoe();
        tictactoe.setVisible(true);
     this.dispose();
}
          
    public enum Dificultad {
    FACIL,INTERMEDIO,DIFICIL
    }
    private Dificultad dificultadActual = Dificultad.FACIL;
    
    
    public void presionar (int casilla){
        if (lbs[casilla-1].getText().equals("")&&estado) {
        lbs[casilla-1].setText (turno);   
        comprobarganador();
        cambiarturno();        
        }
        
    }
   
    public void movimientoMaquina() {
     if (dificultadActual == Dificultad.FACIL) {   
        Random rand = new Random();
       
    List<Integer> casillasVacias = new ArrayList<>();
    for (int i = 0; i < 9; i++) {
        if (lbs[i].getText().equals("")) {
            casillasVacias.add(i + 1);
        }
    }    
    if (casillasVacias.isEmpty()) {
        lbturno.setText("¡Es un empate!");
        estado = false; 
        return;
    }    
    int casilla = casillasVacias.get(rand.nextInt(casillasVacias.size()));
    presionar(casilla);
}
    
     else if (dificultadActual == Dificultad.INTERMEDIO) {        
        if (!intentaGanar() && !intentaBloquear() && !jugarCentro() && !jugarEsquina()) {
            jugarLado();
            }   
        }
     else if (dificultadActual == Dificultad.DIFICIL) {        
        int mejorMovimiento = encontrarMejorMovimiento();
        presionar(mejorMovimiento);
    }
    
}
    
    
private boolean intentaGanar() {
    for (int[] linea : vs) {
        if (tieneDosYVacio(linea, "O")) {
            for (int pos : linea) {
                if (lbs[pos-1].getText().equals("")) {
                    presionar(pos);
                    return true;
                }
            }
        }
    }
    return false;
}

private boolean intentaBloquear() {
    for (int[] linea : vs) {
        if (tieneDosYVacio(linea, "X")) {
            for (int pos : linea) {
                if (lbs[pos-1].getText().equals("")) {
                    presionar(pos);
                    return true;
                }
            }
        }
    }
    return false;
}

private boolean jugarCentro() {
    if (lbs[4].getText().equals("")) {
        presionar(5); 
        return true;
    }
    return false;
}

private boolean jugarEsquina() {
    int[] esquinas = {1, 3, 7, 9};
    for (int esquina : esquinas) {
        if (lbs[esquina-1].getText().equals("")) {
            presionar(esquina);
            return true;
        }
    }
    return false;
}

private boolean jugarLado() {
    int[] lados = {2, 4, 6, 8};
    for (int lado : lados) {
        if (lbs[lado-1].getText().equals("")) {
            presionar(lado);
            return true;
        }
    }
    return false;
}

private boolean tieneDosYVacio(int[] linea, String jugador) {
    int contador = 0;
    for (int pos : linea) {
        if (lbs[pos-1].getText().equals(jugador)) {
            contador++;
        }
    }
    return contador == 2 && lineaVacia(linea);
}

private boolean lineaVacia(int[] linea) {
    for (int pos : linea) {
        if (lbs[pos-1].getText().equals("")) {
            return true;
        }
    }
    return false;
}
    
    private int evaluarTablero() {
    
    for (int[] linea : vs) {
        if (lbs[linea[0]-1].getText().equals("O") && lbs[linea[1]-1].getText().equals("O") && lbs[linea[2]-1].getText().equals("O")) {
            return +10;
        } else if (lbs[linea[0]-1].getText().equals("X") && lbs[linea[1]-1].getText().equals("X") && lbs[linea[2]-1].getText().equals("X")) {
            return -10;
        }
    }
    return 0;  
}
  private int minimax(int profundidad, boolean esTurnoMaquina) {
    int score = evaluarTablero();

   
    if (score == 10) {
        return score;
    }

    
    if (score == -10) {
        return score;
    }

    
    if (!hayMovimientosRestantes()) {
        return 0;
    }

    if (esTurnoMaquina) {
        int mejor = -1000;
        for (int i = 0; i < 9; i++) {
            if (lbs[i].getText().equals("")) {
                lbs[i].setText("O");
                mejor = Math.max(mejor, minimax(profundidad + 1, !esTurnoMaquina));
                lbs[i].setText("");
            }
        }
        return mejor;
    } else {
        int mejor = 1000;
        for (int i = 0; i < 9; i++) {
            if (lbs[i].getText().equals("")) {
                lbs[i].setText("X");
                mejor = Math.min(mejor, minimax(profundidad + 1, !esTurnoMaquina));
                lbs[i].setText("");
            }
        }
        return mejor;
    }
}
  private int encontrarMejorMovimiento() {
    int mejorValor = -1000;
    int mejorMovimiento = -1;

    for (int i = 0; i < 9; i++) {
        if (lbs[i].getText().equals("")) {
            lbs[i].setText("O");
            int valorMovimiento = minimax(0, false);
            lbs[i].setText("");

            if (valorMovimiento > mejorValor) {
                mejorMovimiento = i;
                mejorValor = valorMovimiento;
            }
        }
    }
    return mejorMovimiento + 1; 
}
  private boolean hayMovimientosRestantes() {
    for (int i = 0; i < 9; i++) {
        if (lbs[i].getText().equals("")) {
            return true;
        }
    }
    return false;
}
    
  
    public void cambiarturno() {
    if (!estado) { 
        return;
    }
    if (turno.equals("X")) {
        turno = "O";
        lbturno.setText("Turno de " + turno);
        movimientoMaquina(); 
            } else {
        turno = "X";
        lbturno.setText("Turno de " + turno);
        }
    }
     
       public void comprobarganador(){
           
        for (int i = 0; i < vs.length; i++) {
            if (lbs[vs[i][0]-1].getText().equals("X")&&
                    lbs[vs[i][1]-1].getText().equals("X")&&
                    lbs[vs[i][2]-1].getText().equals("X")){
                
                lbs[vs[i][0]-1].setBackground(Color.pink);
                lbs[vs[i][1]-1].setBackground(Color.pink);
                lbs[vs[i][2]-1].setBackground(Color.pink);                                
                lbpuntajex.setText(Integer.toString(Integer.parseInt(lbpuntajex.getText())+1));
                lbturno.setText("Victoria de X");   
                estado=false;
                return;
            }
            
            if (lbs[vs[i][0]-1].getText().equals("O")&&
                    lbs[vs[i][1]-1].getText().equals("O")&&
                    lbs[vs[i][2]-1].getText().equals("O")){
                
                lbs[vs[i][0]-1].setBackground(Color.pink);
                lbs[vs[i][1]-1].setBackground(Color.pink);
                lbs[vs[i][2]-1].setBackground(Color.pink);
                 lbpuntajeo.setText(Integer.toString(Integer.parseInt(lbpuntajeo.getText())+1));               
                 lbturno.setText("Victoria de O");
                 estado=false;
                 return;
            }
                    
       }
            if (estado && esEmpate()) {
                    lbturno.setText("¡Es un empate!");
                    estado = false; // Termina el juego
                    
            }
    }
       
       public boolean esEmpate() {
        for (int i = 0; i < lbs.length; i++) {
            if (lbs[i].getText().equals("")) {
            return false; 
        }
    }
    return true; 
}
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tictactoemaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoemaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoemaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoemaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoemaquina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblDificultad;
    private javax.swing.JLabel lbpuntajeo;
    private javax.swing.JLabel lbpuntajex;
    private javax.swing.JLabel lbturno;
    // End of variables declaration//GEN-END:variables
}
