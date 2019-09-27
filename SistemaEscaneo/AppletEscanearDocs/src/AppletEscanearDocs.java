
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import sun.misc.BASE64Decoder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class AppletEscanearDocs extends javax.swing.JApplet {
static String ImagenBase64;
static final String imagenCheck = "iVBORw0KGgoAAAANSUhEUgAAADYAAAA2CAMAAAC7m5rvAAAAllBMVEX////x+PH+/v71+vX4+/hVs1g+qEJXs1tDq0dHrEtXs1pMr1A3pTtXtFs2pTqc0p9Ws1o1pTqf06Gf1KE2pTtWs1lVsllzwHa537t9xIA7p0AyozbB48N6w308qEBLrk8yozfC48M7pz8xozZCqkfC48RVs1lDqkdGrEtEq0jE5MVUslhEq0c8qEFZtFxEq0lJrU2c0p6jcPg5AAAABXRSTlMAAAAAAMJrBrEAAAABYktHRACIBR1IAAAACXBIWXMAAABIAAAASABGyWs+AAAA0UlEQVRIx+2TWQ/CIBCE8aiCaL3q2Wpbrbbe+v//nIDaJ4LsxjQxYd54+DLDzi4hTk5/rBqK8loYqk0ZhVMdyjnr1oFUT1Dc7wOpgaSGIwzljzEJAyg1QXm9qGr+haNUwqCahNPvLc/mesrstViGkS6hueXVmsdJqvEyJmxsGOfxNoJRQpniduV7bznDvBBc8vHzrDfqILn3XDxAy7nMGaall23LmfI7kpNq2X43zpK7XG/Qq1RzucNvWXKY7aUFhlK9IyiRM8RQpPnAUE5Ov9ETnXcRfIwTqlYAAAAldEVYdGRhdGU6Y3JlYXRlADIwMTgtMTItMTBUMjA6Mzc6NDQtMDY6MDBMKKDGAAAAJXRFWHRkYXRlOm1vZGlmeQAyMDE4LTEyLTEwVDIwOjM3OjQ0LTA2OjAwPXUYegAAAABJRU5ErkJggg==";
/**
     * Initializes the applet AppletEscanearDocs
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(AppletEscanearDocs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppletEscanearDocs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppletEscanearDocs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppletEscanearDocs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void printLines(String name, InputStream ins) throws Exception {
    String line = null;
    BufferedReader in = new BufferedReader(
        new InputStreamReader(ins));
    while ((line = in.readLine()) != null) {
        //System.out.println(name + " " + line);
        ImagenBase64 = line;
    }
    }
    
    public static BufferedImage decodeToImage(String imageString) {

        BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
    
    public String RegresarDocumento(){
        return ImagenBase64;
    }
    
    private static int runProcess(String command) throws Exception {
    Process pro = Runtime.getRuntime().exec(command);
    printLines(command + " stdout:", pro.getInputStream());
    printLines(command + " stderr:", pro.getErrorStream());
    pro.waitFor();
   // System.out.println(command + " exitValue() " + pro.exitValue());
    return pro.exitValue();
  }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Muestra = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Escanear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Muestra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Muestra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Muestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Muestra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
        int k =  runProcess("java -jar C:\\EscanerKomitachi\\EscanearDocumentos.jar");
        
        if(ImagenBase64.substring(0,5).equals("iVBOR")){
        BufferedImage img=decodeToImage(imagenCheck);      // acquired image as BufferedImage
        ImageIcon icon = new ImageIcon(img);
        Muestra.setIcon(icon);
        Muestra.setText("Documento Escaneado!");
        }
        } catch (Exception e) {
          e.printStackTrace();
        }
    System.out.println(ImagenBase64);
    System.out.println(ImagenBase64.substring(0,4));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Muestra;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
