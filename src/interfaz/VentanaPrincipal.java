package interfaz;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
import main.Login;
import javax.sound.sampled.Clip;

/**
 *
 * @author chris
 */
public class VentanaPrincipal extends javax.swing.JFrame implements Interfaz {

    public String getNombreroot() {
        return nombreroot;
    }

    public static void setNombreroot(String nombreroot) {
        VentanaPrincipal.nombreroot = nombreroot;
    }

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        PanelSuperior.setBackground(Color.white);
        jLabel1.setForeground(Color.white);
        jLabel2.setForeground(Color.white);
        setIconImage(getIconImage());
        setTitle("BDPaq");

    }

    @Override
    public Image getIconImage() {
        Image miIcono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return miIcono;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PanelFondo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelSuperior = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Labelcerrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FieldUsuario = new javax.swing.JTextField();
        FieldContrasena = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BotonInicioSesion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IMG-20230521-WA0005-removebg-preview.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        PanelFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 120, 110));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ciudad.png"))); // NOI18N
        jLabel8.setFocusable(false);
        PanelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -70, 520, 730));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoprincipal.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        PanelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, -20, 200, 510));

        PanelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        PanelSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelSuperiorMouseDragged(evt);
            }
        });
        PanelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelSuperiorMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelSuperiorMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Labelcerrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Labelcerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Labelcerrar.setText("X");
        Labelcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelcerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelcerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelcerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LabelcerrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Labelcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Labelcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 582, Short.MAX_VALUE))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelFondo.add(PanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 30));

        jLabel7.setText("jLabel7");
        PanelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setText("INICIAR SESIÓN");
        PanelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 180, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logopequeño.png"))); // NOI18N
        PanelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("USUARIO");
        PanelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 30));

        FieldUsuario.setBackground(new java.awt.Color(248, 248, 248));
        FieldUsuario.setForeground(new java.awt.Color(204, 204, 204));
        FieldUsuario.setText("Ingresar usuario");
        FieldUsuario.setBorder(null);
        FieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldUsuarioMousePressed(evt);
            }
        });
        FieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsuarioActionPerformed(evt);
            }
        });
        FieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldUsuarioKeyTyped(evt);
            }
        });
        PanelFondo.add(FieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 300, 30));

        FieldContrasena.setBackground(new java.awt.Color(248, 248, 248));
        FieldContrasena.setForeground(new java.awt.Color(204, 204, 204));
        FieldContrasena.setText("********");
        FieldContrasena.setBorder(null);
        FieldContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldContrasenaMousePressed(evt);
            }
        });
        FieldContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldContrasenaKeyTyped(evt);
            }
        });
        PanelFondo.add(FieldContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 300, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        PanelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 283, 300, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CONTRASEÑA");
        PanelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 120, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        PanelFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, 10));

        BotonInicioSesion.setBackground(new java.awt.Color(245, 131, 60));
        BotonInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonInicioSesionMouseEntered(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTRAR");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BotonInicioSesionLayout = new javax.swing.GroupLayout(BotonInicioSesion);
        BotonInicioSesion.setLayout(BotonInicioSesionLayout);
        BotonInicioSesionLayout.setHorizontalGroup(
            BotonInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonInicioSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotonInicioSesionLayout.setVerticalGroup(
            BotonInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonInicioSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelFondo.add(BotonInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 100, 30));

        getContentPane().add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void PanelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_PanelSuperiorMouseDragged

    private void PanelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_PanelSuperiorMousePressed

    private void LabelcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelcerrarMouseClicked
        int res = JOptionPane.showConfirmDialog(null, "¿Estas seguro?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            System.exit(0);
        } else if (res == 1) {

        }

    }//GEN-LAST:event_LabelcerrarMouseClicked

    private void LabelcerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelcerrarMouseEntered

        Labelcerrar.setForeground(Color.white);
        jPanel1.setBackground(Color.red);
    }//GEN-LAST:event_LabelcerrarMouseEntered

    private void LabelcerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelcerrarMouseExited
        Labelcerrar.setForeground(Color.black);
        jPanel1.setBackground(Color.white);
    }//GEN-LAST:event_LabelcerrarMouseExited

    private void FieldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldUsuarioMousePressed
        if (FieldUsuario.getText().equals("Ingresar usuario")) {
            FieldUsuario.setText("");
            FieldUsuario.setForeground(Color.black);

        }
        if (String.valueOf(FieldContrasena.getPassword()).isEmpty()) {
            FieldContrasena.setText("********");
            FieldContrasena.setForeground(Color.gray);
        }


    }//GEN-LAST:event_FieldUsuarioMousePressed

    private void FieldContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldContrasenaMousePressed
        if (String.valueOf(FieldContrasena.getPassword()).equals("********")) {
            FieldContrasena.setText("");
            FieldContrasena.setForeground(Color.black);

        }
        if (FieldUsuario.getText().isEmpty()) {
            FieldUsuario.setText("Ingresar usuario");
            FieldUsuario.setForeground(Color.gray);
        }


    }//GEN-LAST:event_FieldContrasenaMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        notificacion();
        setNombreroot(FieldUsuario.getText());
        Login login = new Login();
        VentanaMenu menu = new VentanaMenu();
        login.setUsuario(FieldUsuario.getText());
        login.setContrasena(new String(FieldContrasena.getPassword()));
        login.CompararCredenciales();
        if (login.inicio == true) {
            menu.LabelRoot.setText(FieldUsuario.getText());
            menu.setVisible(true);
            this.dispose();

        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void LabelcerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelcerrarMousePressed
        Labelcerrar.setBackground(Color.red);

    }//GEN-LAST:event_LabelcerrarMousePressed

    private void BotonInicioSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioSesionMouseEntered
        BotonInicioSesion.setBackground(new Color(249, 72, 39));
    }//GEN-LAST:event_BotonInicioSesionMouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        BotonInicioSesion.setBackground(new Color(249, 72, 39));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited

        BotonInicioSesion.setBackground(new Color(245, 131, 60));
    }//GEN-LAST:event_jLabel2MouseExited

    private void PanelSuperiorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSuperiorMouseEntered

    }//GEN-LAST:event_PanelSuperiorMouseEntered

    private void FieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsuarioActionPerformed

    private void FieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldUsuarioKeyTyped
        FieldUsuario.setForeground(Color.black);
    }//GEN-LAST:event_FieldUsuarioKeyTyped

    private void FieldContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldContrasenaKeyTyped
        FieldContrasena.setForeground(Color.black);
    }//GEN-LAST:event_FieldContrasenaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            // UIManager.setLookAndFeel(new FlatLightLaf());
            FlatArcIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonInicioSesion;
    private javax.swing.JPasswordField FieldContrasena;
    public javax.swing.JTextField FieldUsuario;
    private javax.swing.JLabel Labelcerrar;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void notificacion() {
        try {
            // Carga el archivo de sonido
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(sonido);

            // Obtiene el formato de audio
            AudioFormat format = audioStream.getFormat();

            // Crea una fuente de datos de audio
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Abre el clip de audio
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);

            // Agrega un LineListener para detectar cuando finaliza la reproducción del clip
            clip.addLineListener(new LineListener() {
                @Override
                public void update(LineEvent event) {
                    if (event.getType() == LineEvent.Type.STOP) {
                    }
                }
            });

            // Reproduce el sonido
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }

    //Variables
    public static String nombreroot = "";
    String soundFilePath = "C:\\Users\\chris\\Documents\\NetBeansProjects\\ProyectoFinal\\src\\sonidos\\notificacion.wav";
    File sonido = new File(soundFilePath);
    int xMouse, yMouse;

}
