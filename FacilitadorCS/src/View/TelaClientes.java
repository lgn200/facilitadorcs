/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaCadClientes.java
 *
 * Created on 30/05/2010, 18:11:52
 */

package View;

/**
 *
 * @author Leandro
 */
public class TelaClientes extends javax.swing.JFrame {

    /** Creates new form TelaCadClientes */
    public TelaClientes() {
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
        btAlterar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btBusca = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        lbCodUsuario = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbTelCelular = new javax.swing.JLabel();
        lbTelResidencia = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        txCodUsuario = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        txEndereco = new javax.swing.JTextField();
        txBairro = new javax.swing.JTextField();
        txCidade = new javax.swing.JTextField();
        txCpf = new javax.swing.JTextField();
        txEmail = new javax.swing.JTextField();
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
        jSeparator3 = new javax.swing.JSeparator();
        lbEquipamentos = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        taEquipamentos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbPrincipal.setFloatable(false);
        tbPrincipal.setOrientation(1);
        tbPrincipal.setRollover(true);
        tbPrincipal.setPreferredSize(new java.awt.Dimension(70, 70));

        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 12));
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/alterar32x32.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setFocusable(false);
        btAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlterar.setMaximumSize(new java.awt.Dimension(70, 70));
        btAlterar.setPreferredSize(new java.awt.Dimension(70, 70));
        btAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbPrincipal.add(btAlterar);

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
        btBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/buscar32x32.png"))); // NOI18N
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

        lbCodUsuario.setFont(new java.awt.Font("Arial", 0, 14));
        lbCodUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCodUsuario.setText("Código do Cliente:");

        lbNome.setFont(new java.awt.Font("Arial", 0, 14));
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNome.setText("Nome Completo:");

        lbEndereco.setFont(new java.awt.Font("Arial", 0, 14));
        lbEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEndereco.setText("Endereço:");

        lbBairro.setFont(new java.awt.Font("Arial", 0, 14));
        lbBairro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBairro.setText("Bairro:");

        lbCidade.setFont(new java.awt.Font("Arial", 0, 14));
        lbCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCidade.setText("Cidade:");

        lbCPF.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCPF.setText("CPF:");

        lbTelCelular.setFont(new java.awt.Font("Arial", 0, 14));
        lbTelCelular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTelCelular.setText("Tel Celular:");

        lbTelResidencia.setFont(new java.awt.Font("Arial", 0, 14));
        lbTelResidencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTelResidencia.setText("Tel Residencial:");

        lbEmail.setFont(new java.awt.Font("Arial", 0, 14));
        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmail.setText("E-mail:");

        txEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEmailActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel1.setText("Nº");

        lbComplemento.setFont(new java.awt.Font("Arial", 0, 14));
        lbComplemento.setText("Complemento:");

        txComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txComplementoActionPerformed(evt);
            }
        });

        lbUF.setFont(new java.awt.Font("Arial", 0, 14));
        lbUF.setText("UF:");

        lbCEP.setFont(new java.awt.Font("Arial", 0, 14));
        lbCEP.setText("CEP:");

        txCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCEPActionPerformed(evt);
            }
        });

        txTelResidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTelResidencialActionPerformed(evt);
            }
        });

        txTelCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTelCelularActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel2.setText("Cadastro de Clientes");

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

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SC", "PE", "PA", "PR", "RS", "SP", "SE", "AL", "AM", "RN", "RJ", "MT", "MG", "MS", "RO", "RR", "BA", "PB", "TO", "CE" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lbEquipamentos.setFont(new java.awt.Font("Arial", 0, 14));
        lbEquipamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEquipamentos.setText("Equipamentos:");

        taEquipamentos.setColumns(20);
        taEquipamentos.setRows(5);
        jScrollPane2.setViewportView(taEquipamentos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(lbEquipamentos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbNome)
                                        .addComponent(lbCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbTelResidencia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addComponent(lbTelCelular)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lbEmail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(tbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(460, 460, 460)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(lbEndereco)
                            .addGap(5, 5, 5)
                            .addComponent(txEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNum, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(lbComplemento)
                            .addGap(9, 9, 9)
                            .addComponent(txComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lbBairro)
                            .addGap(8, 8, 8)
                            .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(lbCEP)
                            .addGap(8, 8, 8)
                            .addComponent(txCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lbCidade)
                            .addGap(1, 1, 1)
                            .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lbUF)
                            .addGap(8, 8, 8)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTelResidencia)
                        .addComponent(txTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTelCelular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEquipamentos)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEndereco)
                                    .addComponent(txEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(txNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbComplemento)
                                    .addComponent(txComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCEP)
                                    .addComponent(txCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCidade)
                                    .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbUF)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(210, 210, 210)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 12, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEmailActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txEmailActionPerformed

    private void txComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txComplementoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txComplementoActionPerformed

    private void txCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCEPActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txCEPActionPerformed

    private void txTelResidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTelResidencialActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txTelResidencialActionPerformed

    private void txTelCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTelCelularActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txTelCelularActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jComboBox1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBusca;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCodUsuario;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEquipamentos;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTelCelular;
    private javax.swing.JLabel lbTelResidencia;
    private javax.swing.JLabel lbUF;
    private javax.swing.JTextArea taEquipamentos;
    private javax.swing.JToolBar tbPrincipal;
    private javax.swing.JTextField txBairro;
    private javax.swing.JTextField txCEP;
    private javax.swing.JTextField txCidade;
    private javax.swing.JTextField txCodUsuario;
    private javax.swing.JTextField txComplemento;
    private javax.swing.JTextField txCpf;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEndereco;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNum;
    private javax.swing.JTextField txTelCelular;
    private javax.swing.JTextField txTelResidencial;
    // End of variables declaration//GEN-END:variables

}