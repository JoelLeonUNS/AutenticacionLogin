package presentacion;

import aplicacion.PresentadorLogin;
import javax.swing.JOptionPane;

public class VistaLogin extends javax.swing.JFrame {
    
    private PresentadorLogin pLogin;

    public VistaLogin() {
        initComponents();
        lookAndFeel();
    }
    
    public void setPresentador(PresentadorLogin pLogin) {
        this.pLogin = pLogin;
        addAction();
    }
    
    private void addAction() {
        this.bttn_iniciarSesion.addActionListener(pLogin);
    }
    
     public void iniciar() {
        pack();
         setTitle("Autenticación de Usuario");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
     
    public String getUsuario() {
        return txtFld_usuario.getText();
    }

    public String getClave() {
        return String.copyValueOf(psswrdFld_clave.getPassword());
    }

    public void mensaje(String salida) {
        JOptionPane.showMessageDialog(null, salida);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_login = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        txtFld_usuario = new javax.swing.JTextField();
        lbl_clave = new javax.swing.JLabel();
        bttn_iniciarSesion = new javax.swing.JButton();
        psswrdFld_clave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_login.setBackground(new java.awt.Color(255, 255, 255));
        pnl_login.setPreferredSize(new java.awt.Dimension(450, 540));

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_usuario.setText("Usuario");

        txtFld_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_usuario.setPreferredSize(new java.awt.Dimension(71, 30));

        lbl_clave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_clave.setText("Clave");

        bttn_iniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_iniciarSesion.setText("INICIAR SESIÓN");
        bttn_iniciarSesion.setPreferredSize(new java.awt.Dimension(75, 35));

        psswrdFld_clave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        psswrdFld_clave.setPreferredSize(new java.awt.Dimension(90, 30));

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_usuario)
                    .addComponent(txtFld_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_clave)
                    .addComponent(psswrdFld_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(lbl_usuario)
                .addGap(10, 10, 10)
                .addComponent(txtFld_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_clave)
                .addGap(10, 10, 10)
                .addComponent(psswrdFld_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(bttn_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_iniciarSesion;
    private javax.swing.JLabel lbl_clave;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JPasswordField psswrdFld_clave;
    private javax.swing.JTextField txtFld_usuario;
    // End of variables declaration//GEN-END:variables
}
