/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaUsuario.java
 *
 * Created on 16/04/2010, 19:41:51
 */

package View;

/**
 *
 * @author Leandro
 */
public class TelaUsuario extends javax.swing.JFrame {

    /** Creates new form TelaUsuario */
    public TelaUsuario() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPrincipal = new javax.swing.JToolBar();
        btNovo = new javax.swing.JButton();
        btBusca = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        lbCodUsuario = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbAcesso = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbFuncao = new javax.swing.JLabel();
        lbTelCelular = new javax.swing.JLabel();
        lbTelResidencia = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        lbConfirmaSenha = new javax.swing.JLabel();
        txCodUsuario = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        cbAcesso = new javax.swing.JComboBox();
        txEndereco = new javax.swing.JTextField();
        txBairro = new javax.swing.JTextField();
        txCidade = new javax.swing.JTextField();
        txCpf = new javax.swing.JTextField();
        txFuncao = new javax.swing.JTextField();
        txEmail = new javax.swing.JTextField();
        txUsuario = new javax.swing.JTextField();
        pwSenha = new javax.swing.JPasswordField();
        pwConfSenha = new javax.swing.JPasswordField();
        rbAtivo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txNum = new javax.swing.JTextField();
        lbComplemento = new javax.swing.JLabel();
        txComplemento = new javax.swing.JTextField();
        lbUF = new javax.swing.JLabel();
        lbCEP = new javax.swing.JLabel();
        txCEP = new javax.swing.JTextField();
        txTelResidencial = new javax.swing.JTextField();
        txTelCelular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        tbPrincipal.setFloatable(false);
        tbPrincipal.setOrientation(1);
        tbPrincipal.setRollover(true);

        btNovo.setFont(new java.awt.Font("Tahoma", 1, 12));
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/Novo.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.setMaximumSize(new java.awt.Dimension(70, 70));
        btNovo.setMinimumSize(new java.awt.Dimension(70, 70));
        btNovo.setPreferredSize(new java.awt.Dimension(70, 70));
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbPrincipal.add(btNovo);

        btBusca.setFont(new java.awt.Font("Tahoma", 1, 12));
        btBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/Buscar.png"))); // NOI18N
        btBusca.setText("Busca");
        btBusca.setFocusable(false);
        btBusca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBusca.setMaximumSize(new java.awt.Dimension(70, 70));
        btBusca.setMinimumSize(new java.awt.Dimension(70, 70));
        btBusca.setPreferredSize(new java.awt.Dimension(70, 70));
        btBusca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbPrincipal.add(btBusca);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/Salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setFocusable(false);
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setMaximumSize(new java.awt.Dimension(70, 70));
        btSalvar.setMinimumSize(new java.awt.Dimension(70, 70));
        btSalvar.setPreferredSize(new java.awt.Dimension(70, 70));
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbPrincipal.add(btSalvar);

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/Cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setMaximumSize(new java.awt.Dimension(70, 70));
        btCancelar.setMinimumSize(new java.awt.Dimension(70, 70));
        btCancelar.setPreferredSize(new java.awt.Dimension(70, 70));
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbPrincipal.add(btCancelar);

        btFechar.setFont(new java.awt.Font("Tahoma", 1, 12));
        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/Fechar2.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.setFocusable(false);
        btFechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFechar.setMaximumSize(new java.awt.Dimension(70, 70));
        btFechar.setMinimumSize(new java.awt.Dimension(70, 70));
        btFechar.setPreferredSize(new java.awt.Dimension(70, 70));
        btFechar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbPrincipal.add(btFechar);

        getContentPane().add(tbPrincipal);
        tbPrincipal.setBounds(10, 11, 72, 350);

        lbCodUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCodUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCodUsuario.setText("Código:");
        getContentPane().add(lbCodUsuario);
        lbCodUsuario.setBounds(100, 60, 150, 20);

        lbNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNome.setText("Nome Completo:");
        getContentPane().add(lbNome);
        lbNome.setBounds(150, 90, 104, 17);

        lbAcesso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAcesso.setText("Acesso:");
        getContentPane().add(lbAcesso);
        lbAcesso.setBounds(160, 350, 50, 17);

        lbEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEndereco.setText("Endereço:");
        getContentPane().add(lbEndereco);
        lbEndereco.setBounds(150, 160, 65, 17);

        lbBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbBairro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBairro.setText("Bairro:");
        getContentPane().add(lbBairro);
        lbBairro.setBounds(420, 190, 42, 20);

        lbCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCidade.setText("Cidade:");
        getContentPane().add(lbCidade);
        lbCidade.setBounds(270, 220, 49, 17);

        lbCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCPF.setText("CPF:");
        getContentPane().add(lbCPF);
        lbCPF.setBounds(470, 120, 40, 17);

        lbFuncao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbFuncao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFuncao.setText("Função:");
        getContentPane().add(lbFuncao);
        lbFuncao.setBounds(150, 250, 52, 17);

        lbTelCelular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTelCelular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTelCelular.setText("Tel Celular:");
        getContentPane().add(lbTelCelular);
        lbTelCelular.setBounds(400, 280, 73, 17);

        lbTelResidencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTelResidencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTelResidencia.setText("Tel Residencial:");
        getContentPane().add(lbTelResidencia);
        lbTelResidencia.setBounds(150, 280, 101, 17);

        lbEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmail.setText("E-mail:");
        getContentPane().add(lbEmail);
        lbEmail.setBounds(150, 310, 43, 17);

        lbUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Usuário:");
        getContentPane().add(lbUsuario);
        lbUsuario.setBounds(150, 390, 60, 17);

        lbSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSenha.setText("Senha:");
        getContentPane().add(lbSenha);
        lbSenha.setBounds(510, 360, 45, 17);

        lbConfirmaSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbConfirmaSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConfirmaSenha.setText("Confirmar Senha:");
        getContentPane().add(lbConfirmaSenha);
        lbConfirmaSenha.setBounds(450, 390, 111, 17);
        getContentPane().add(txCodUsuario);
        txCodUsuario.setBounds(210, 60, 60, 20);
        getContentPane().add(txNome);
        txNome.setBounds(260, 90, 440, 20);

        cbAcesso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbAcesso);
        cbAcesso.setBounds(210, 350, 140, 20);
        getContentPane().add(txEndereco);
        txEndereco.setBounds(220, 160, 370, 20);
        getContentPane().add(txBairro);
        txBairro.setBounds(470, 190, 230, 20);
        getContentPane().add(txCidade);
        txCidade.setBounds(320, 220, 300, 20);
        getContentPane().add(txCpf);
        txCpf.setBounds(510, 120, 190, 20);
        getContentPane().add(txFuncao);
        txFuncao.setBounds(210, 250, 181, 20);

        txEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txEmail);
        txEmail.setBounds(200, 310, 500, 20);
        getContentPane().add(txUsuario);
        txUsuario.setBounds(220, 390, 140, 20);
        getContentPane().add(pwSenha);
        pwSenha.setBounds(560, 360, 140, 20);

        pwConfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwConfSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(pwConfSenha);
        pwConfSenha.setBounds(560, 390, 140, 20);

        rbAtivo.setText("Ativo");
        getContentPane().add(rbAtivo);
        rbAtivo.setBounds(370, 350, 60, 23);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nº");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 160, 20, 17);
        getContentPane().add(txNum);
        txNum.setBounds(620, 160, 80, 20);

        lbComplemento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbComplemento.setText("Complemento:");
        getContentPane().add(lbComplemento);
        lbComplemento.setBounds(150, 190, 91, 17);

        txComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(txComplemento);
        txComplemento.setBounds(250, 190, 160, 20);

        lbUF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbUF.setText("UF:");
        getContentPane().add(lbUF);
        lbUF.setBounds(630, 220, 22, 17);

        lbCEP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCEP.setText("CEP:");
        getContentPane().add(lbCEP);
        lbCEP.setBounds(150, 220, 32, 17);

        txCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCEPActionPerformed(evt);
            }
        });
        getContentPane().add(txCEP);
        txCEP.setBounds(190, 220, 70, 20);

        txTelResidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTelResidencialActionPerformed(evt);
            }
        });
        getContentPane().add(txTelResidencial);
        txTelResidencial.setBounds(250, 280, 140, 20);

        txTelCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTelCelularActionPerformed(evt);
            }
        });
        getContentPane().add(txTelCelular);
        txTelCelular.setBounds(470, 280, 140, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Usuário do Sistema");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 20, 210, 17);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Acesso"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setMinimumSize(new java.awt.Dimension(800, 64));
        jTable1.setPreferredSize(new java.awt.Dimension(800, 64));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 450, 680, 110);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(90, 11, 10, 550);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SC", "PE", "PA", "PR", "RS", "SP", "SE", "AL", "AM", "RN", "RJ", "MT", "MG", "MS", "RO", "RR", "BA", "PB", "TO", "CE" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(660, 220, 40, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(150, 340, 550, 10);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 120, 131, 17);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(290, 120, 140, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(150, 150, 551, 10);

        jButton1.setText("...");
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 250, 30, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txTelResidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTelResidencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTelResidencialActionPerformed

    private void txTelCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTelCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTelCelularActionPerformed

    private void txCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCEPActionPerformed

    private void txEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEmailActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void pwConfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwConfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwConfSenhaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txComplementoActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBusca;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbAcesso;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAcesso;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCodUsuario;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbConfirmaSenha;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbFuncao;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTelCelular;
    private javax.swing.JLabel lbTelResidencia;
    private javax.swing.JLabel lbUF;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pwConfSenha;
    private javax.swing.JPasswordField pwSenha;
    private javax.swing.JRadioButton rbAtivo;
    private javax.swing.JToolBar tbPrincipal;
    private javax.swing.JTextField txBairro;
    private javax.swing.JTextField txCEP;
    private javax.swing.JTextField txCidade;
    private javax.swing.JTextField txCodUsuario;
    private javax.swing.JTextField txComplemento;
    private javax.swing.JTextField txCpf;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEndereco;
    private javax.swing.JTextField txFuncao;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNum;
    private javax.swing.JTextField txTelCelular;
    private javax.swing.JTextField txTelResidencial;
    private javax.swing.JTextField txUsuario;
    // End of variables declaration//GEN-END:variables

}
