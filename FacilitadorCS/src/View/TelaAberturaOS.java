/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaAberturaOS.java
 *
 * Created on 17/04/2010, 23:13:01
 */

package View;

/**
 *
 * @author Administrador
 */
public class TelaAberturaOS extends javax.swing.JFrame {

    /** Creates new form TelaAberturaOS */
    public TelaAberturaOS() {
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

        cbAtendente = new javax.swing.JComboBox();
        lbAtendente = new javax.swing.JLabel();
        lbTecnico = new javax.swing.JLabel();
        cbTecnico = new javax.swing.JComboBox();
        lbTituloAbreOS = new javax.swing.JLabel();
        lbCliente = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox();
        btBuscaClienteOS = new javax.swing.JButton();
        btNovoClienteOS = new javax.swing.JButton();
        spDescricaoOS = new javax.swing.JScrollPane();
        taDescricaoOS = new javax.swing.JTextArea();
        lbDataAbertOS = new javax.swing.JLabel();
        txDataOS = new javax.swing.JTextField();
        lbHoraAbertOS = new javax.swing.JLabel();
        txHoraAbertOS = new javax.swing.JTextField();
        lbDescricaoOS = new javax.swing.JLabel();
        lbNumOS = new javax.swing.JLabel();
        txNumOS = new javax.swing.JTextField();
        lbDescontoOS = new javax.swing.JLabel();
        txDescontoOS = new javax.swing.JTextField();
        lbTotalOS = new javax.swing.JLabel();
        txTotalOS = new javax.swing.JTextField();
        spItemOS = new javax.swing.JScrollPane();
        tbItemOS = new javax.swing.JTable();
        tbAberturaOS = new javax.swing.JToolBar();
        btAbrirOS = new javax.swing.JButton();
        btFecharOS = new javax.swing.JButton();
        btSalvarOS = new javax.swing.JButton();
        btLimparOS = new javax.swing.JButton();
        btImpOS = new javax.swing.JButton();
        btEmailOS = new javax.swing.JButton();
        btCancelarOS = new javax.swing.JButton();
        btFecharAberOS = new javax.swing.JButton();
        pbStatusAbertOS = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abertura de Ordem de Serviço");
        setBounds(new java.awt.Rectangle(10, 10, 800, 600));
        setMinimumSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(null);

        cbAtendente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAtendente.setAutoscrolls(true);
        getContentPane().add(cbAtendente);
        cbAtendente.setBounds(90, 117, 226, 20);

        lbAtendente.setFont(new java.awt.Font("Arial", 0, 14));
        lbAtendente.setText("Atendente:");
        lbAtendente.setAutoscrolls(true);
        getContentPane().add(lbAtendente);
        lbAtendente.setBounds(90, 94, 69, 17);

        lbTecnico.setFont(new java.awt.Font("Arial", 0, 14));
        lbTecnico.setText("Técnico:");
        lbTecnico.setAutoscrolls(true);
        getContentPane().add(lbTecnico);
        lbTecnico.setBounds(380, 94, 54, 17);

        cbTecnico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTecnico.setAutoscrolls(true);
        getContentPane().add(cbTecnico);
        cbTecnico.setBounds(380, 117, 226, 20);

        lbTituloAbreOS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTituloAbreOS.setText("Controle de Ordem de Serviço");
        lbTituloAbreOS.setAutoscrolls(true);
        getContentPane().add(lbTituloAbreOS);
        lbTituloAbreOS.setBounds(560, 10, 215, 36);

        lbCliente.setFont(new java.awt.Font("Arial", 0, 14));
        lbCliente.setText("Cliente:");
        lbCliente.setAutoscrolls(true);
        getContentPane().add(lbCliente);
        lbCliente.setBounds(90, 147, 48, 17);

        cbCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCliente.setAutoscrolls(true);
        getContentPane().add(cbCliente);
        cbCliente.setBounds(90, 180, 353, 22);

        btBuscaClienteOS.setText("Busca");
        btBuscaClienteOS.setAutoscrolls(true);
        getContentPane().add(btBuscaClienteOS);
        btBuscaClienteOS.setBounds(460, 180, 61, 23);

        btNovoClienteOS.setText("Novo");
        btNovoClienteOS.setAutoscrolls(true);
        getContentPane().add(btNovoClienteOS);
        btNovoClienteOS.setBounds(528, 180, 61, 23);

        spDescricaoOS.setAutoscrolls(true);

        taDescricaoOS.setColumns(20);
        taDescricaoOS.setRows(5);
        spDescricaoOS.setViewportView(taDescricaoOS);

<<<<<<< .mine
        lbDataAbertOS.setFont(new java.awt.Font("Arial", 0, 14));
        lbDataAbertOS.setText("Data Abertura:");
        lbDataAbertOS.setAutoscrolls(true);
=======
        getContentPane().add(spDescricaoOS);
        spDescricaoOS.setBounds(90, 244, 504, 103);

        lbDataOS.setFont(new java.awt.Font("Arial", 0, 14));
        lbDataOS.setText("Data Abertura:");
        lbDataOS.setAutoscrolls(true);
>>>>>>> .r14
        getContentPane().add(lbDataOS);
        lbDataOS.setBounds(616, 244, 93, 17);
        getContentPane().add(txDataOS);
        txDataOS.setBounds(616, 267, 123, 20);

        lbHoraAbertOS.setFont(new java.awt.Font("Arial", 0, 14));
        lbHoraAbertOS.setText("Hora de Abertura");
        lbHoraAbertOS.setAutoscrolls(true);
        getContentPane().add(lbHoraOS);
        lbHoraOS.setBounds(616, 293, 109, 17);
        getContentPane().add(txHoraOS);
        txHoraOS.setBounds(620, 320, 123, 20);

        lbDescricaoOS.setFont(new java.awt.Font("Arial", 0, 14));
        lbDescricaoOS.setText("Descrição:");
        lbDescricaoOS.setAutoscrolls(true);
        getContentPane().add(lbDescricaoOS);
        lbDescricaoOS.setBounds(90, 221, 67, 17);

        lbNumOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbNumOS.setText("Nº O.S.");
        lbNumOS.setAutoscrolls(true);
        getContentPane().add(lbNumOS);
        lbNumOS.setBounds(90, 51, 46, 17);
        getContentPane().add(txNumOS);
        txNumOS.setBounds(154, 48, 69, 20);

        lbDescontoOS.setFont(new java.awt.Font("Arial", 0, 14));
        lbDescontoOS.setText("Desconto:");
        lbDescontoOS.setAutoscrolls(true);
        getContentPane().add(lbDescontoOS);
        lbDescontoOS.setBounds(547, 477, 90, 17);
        getContentPane().add(txDescontoOS);
        txDescontoOS.setBounds(547, 510, 97, 20);

        lbTotalOS.setFont(new java.awt.Font("Arial", 0, 14));
        lbTotalOS.setText("Total a Pagar:");
        lbTotalOS.setAutoscrolls(true);
        getContentPane().add(lbTotalOS);
        lbTotalOS.setBounds(657, 477, 90, 17);
        getContentPane().add(txTotalOS);
        txTotalOS.setBounds(657, 510, 97, 20);

        spItemOS.setAutoscrolls(true);

        tbItemOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Descrição", "Em estoque", "R$", "Qtd", "Total"
            }
        ));
        spItemOS.setViewportView(tbItemOS);

        getContentPane().add(spItemOS);
        spItemOS.setBounds(90, 365, 664, 94);

        tbAberturaOS.setFloatable(false);
        tbAberturaOS.setOrientation(1);
        tbAberturaOS.setRollover(true);
        tbAberturaOS.setAutoscrolls(true);
        tbAberturaOS.setMaximumSize(new java.awt.Dimension(100, 60));
        tbAberturaOS.setMinimumSize(new java.awt.Dimension(100, 60));
        tbAberturaOS.setPreferredSize(new java.awt.Dimension(100, 60));

        btAbrirOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/novo.png"))); // NOI18N
        btAbrirOS.setText("Abrir OS");
        btAbrirOS.setFocusable(false);
        btAbrirOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAbrirOS.setMaximumSize(new java.awt.Dimension(70, 70));
        btAbrirOS.setMinimumSize(new java.awt.Dimension(70, 70));
        btAbrirOS.setPreferredSize(new java.awt.Dimension(70, 70));
        btAbrirOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbAberturaOS.add(btAbrirOS);

        btFecharOS.setFont(new java.awt.Font("Tahoma", 1, 10));
        btFecharOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/Fechar.png"))); // NOI18N
        btFecharOS.setText("Fechar OS");
        btFecharOS.setFocusable(false);
        btFecharOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFecharOS.setMaximumSize(new java.awt.Dimension(70, 70));
        btFecharOS.setMinimumSize(new java.awt.Dimension(70, 70));
        btFecharOS.setPreferredSize(new java.awt.Dimension(70, 70));
        btFecharOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbAberturaOS.add(btFecharOS);

        btSalvarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/Salvar.png"))); // NOI18N
        btSalvarOS.setText("Salvar");
        btSalvarOS.setFocusable(false);
        btSalvarOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvarOS.setMaximumSize(new java.awt.Dimension(70, 70));
        btSalvarOS.setMinimumSize(new java.awt.Dimension(70, 70));
        btSalvarOS.setPreferredSize(new java.awt.Dimension(70, 70));
        btSalvarOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbAberturaOS.add(btSalvarOS);

        btLimparOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/limpar.png"))); // NOI18N
        btLimparOS.setText("Limpar");
        btLimparOS.setFocusable(false);
        btLimparOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimparOS.setMaximumSize(new java.awt.Dimension(70, 70));
        btLimparOS.setMinimumSize(new java.awt.Dimension(70, 70));
        btLimparOS.setPreferredSize(new java.awt.Dimension(70, 70));
        btLimparOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbAberturaOS.add(btLimparOS);

        btImpOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/imprimir.png"))); // NOI18N
        btImpOS.setText("Imprimir");
        btImpOS.setFocusable(false);
        btImpOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btImpOS.setMaximumSize(new java.awt.Dimension(70, 70));
        btImpOS.setMinimumSize(new java.awt.Dimension(70, 70));
        btImpOS.setPreferredSize(new java.awt.Dimension(70, 70));
        btImpOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbAberturaOS.add(btImpOS);

        btEmailOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/email.png"))); // NOI18N
        btEmailOS.setText("E-mail");
        btEmailOS.setFocusable(false);
        btEmailOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEmailOS.setMaximumSize(new java.awt.Dimension(70, 70));
        btEmailOS.setMinimumSize(new java.awt.Dimension(70, 70));
        btEmailOS.setPreferredSize(new java.awt.Dimension(70, 70));
        btEmailOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbAberturaOS.add(btEmailOS);

        btCancelarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/Cancelar.png"))); // NOI18N
        btCancelarOS.setText("Cancelar");
        btCancelarOS.setFocusable(false);
        btCancelarOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelarOS.setMaximumSize(new java.awt.Dimension(70, 70));
        btCancelarOS.setMinimumSize(new java.awt.Dimension(70, 70));
        btCancelarOS.setPreferredSize(new java.awt.Dimension(70, 70));
        btCancelarOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbAberturaOS.add(btCancelarOS);

        btFecharAberOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagem/Fechar2.png"))); // NOI18N
        btFecharAberOS.setText("Fechar");
        btFecharAberOS.setFocusable(false);
        btFecharAberOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFecharAberOS.setMaximumSize(new java.awt.Dimension(70, 70));
        btFecharAberOS.setMinimumSize(new java.awt.Dimension(70, 70));
        btFecharAberOS.setPreferredSize(new java.awt.Dimension(70, 70));
        btFecharAberOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbAberturaOS.add(btFecharAberOS);

        getContentPane().add(tbAberturaOS);
        tbAberturaOS.setBounds(0, 0, 72, 572);

        pbStatusAbertOS.setAutoscrolls(true);
        getContentPane().add(pbStatusAbertOS);
        pbStatusAbertOS.setBounds(60, 580, 700, 20);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(597, 244, 1, 115);

<<<<<<< .mine
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbAberturaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCliente)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(btBuscaClienteOS)
                        .addGap(7, 7, 7)
                        .addComponent(btNovoClienteOS))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txDescontoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDescontoOS))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotalOS)
                            .addComponent(txTotalOS, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNumOS)
                        .addGap(18, 18, 18)
                        .addComponent(txNumOS, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbDescricaoOS)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(spDescricaoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAtendente))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTecnico)
                                    .addComponent(cbTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDataAbertOS))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbHoraAbertOS))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txHoraAbertOS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txDataOS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbTituloAbreOS, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spItemOS, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pbStatusAbertOS, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btBuscaClienteOS, btNovoClienteOS});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbDescontoOS, lbTotalOS});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txNumOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbNumOS))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbAtendente)
                                    .addComponent(lbTecnico)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbTituloAbreOS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(lbCliente)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscaClienteOS)
                            .addComponent(btNovoClienteOS))
                        .addGap(17, 17, 17)
                        .addComponent(lbDescricaoOS)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(spDescricaoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDataAbertOS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txDataOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbHoraAbertOS)
                                .addGap(11, 11, 11)
                                .addComponent(txHoraAbertOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spItemOS, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDescontoOS)
                            .addComponent(lbTotalOS))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txDescontoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTotalOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbAberturaOS, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(pbStatusAbertOS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

=======
>>>>>>> .r14
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAberturaOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirOS;
    private javax.swing.JButton btBuscaClienteOS;
    private javax.swing.JButton btCancelarOS;
    private javax.swing.JButton btEmailOS;
    private javax.swing.JButton btFecharAberOS;
    private javax.swing.JButton btFecharOS;
    private javax.swing.JButton btImpOS;
    private javax.swing.JButton btLimparOS;
    private javax.swing.JButton btNovoClienteOS;
    private javax.swing.JButton btSalvarOS;
    private javax.swing.JComboBox cbAtendente;
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JComboBox cbTecnico;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAtendente;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbDataAbertOS;
    private javax.swing.JLabel lbDescontoOS;
    private javax.swing.JLabel lbDescricaoOS;
    private javax.swing.JLabel lbHoraAbertOS;
    private javax.swing.JLabel lbNumOS;
    private javax.swing.JLabel lbTecnico;
    private javax.swing.JLabel lbTituloAbreOS;
    private javax.swing.JLabel lbTotalOS;
    private javax.swing.JProgressBar pbStatusAbertOS;
    private javax.swing.JScrollPane spDescricaoOS;
    private javax.swing.JScrollPane spItemOS;
    private javax.swing.JTextArea taDescricaoOS;
    private javax.swing.JToolBar tbAberturaOS;
    private javax.swing.JTable tbItemOS;
    private javax.swing.JTextField txDataOS;
    private javax.swing.JTextField txDescontoOS;
    private javax.swing.JTextField txHoraAbertOS;
    private javax.swing.JTextField txNumOS;
    private javax.swing.JTextField txTotalOS;
    // End of variables declaration//GEN-END:variables

}
