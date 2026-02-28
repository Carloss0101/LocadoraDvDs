// Carlos Eduardo Gonçalves  2706946

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioDocumentario extends javax.swing.JFrame {
    private DBDocumentario gp;
    private Documentario d1 = new Documentario();
    
    private static RelatorioDocumentario controleUnico; 
    
    private RelatorioDocumentario() {
        initComponents();
        gp = DBDocumentario.geraDBDocumentario();
    }
    
    //MÉTODO SINGLETON
    public static RelatorioDocumentario geraRelDocumentario(){ 
        if(controleUnico == null){
            controleUnico = new RelatorioDocumentario();
        }
        return controleUnico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabPes2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabDocumentario = new javax.swing.JTable();
        rtTitulo = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        tabPes2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Ano", "Quantidade"
            }
        ));
        tabPes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPes2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPes2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Documentários");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabDocumentario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Ano", "Quantidade"
            }
        ));
        tabDocumentario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDocumentarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabDocumentario);

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTitulo.setText("Relatório de Documentários");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSair)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtTitulo)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btSair)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabPes2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPes2MouseClicked

    }//GEN-LAST:event_tabPes2MouseClicked

    private void tabDocumentarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDocumentarioMouseClicked
        selecionarLinha();
    }//GEN-LAST:event_tabDocumentarioMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        consTabSeries();
    }//GEN-LAST:event_formWindowActivated

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed
    
    public void consTabSeries(){
        DefaultTableModel tabModel = (DefaultTableModel) tabDocumentario.getModel();

        tabModel.setRowCount(0);

        for (Documentario d : gp.getDBDocumentario()){
            tabModel.addRow(new Object[]{
                d.getNome(),
                d.getLancamento(),
                d.getEslq().getQuantidade()
            });
        }
    }
    
    public void selecionarLinha() {
        int posLin = tabDocumentario.getSelectedRow();

        if (posLin >= 0) {

            String nome = tabDocumentario.getValueAt(posLin, 0).toString();

            Documentario d = new Documentario();
            try {
                d.setNome(nome); 

                Documentario documentario = DBDocumentario.geraDBDocumentario().consDocNome(d);

                if (documentario != null) {
                    String mensagem = "=== DETALHES DO DOCUMENTARIO ===\n\n";
                    mensagem += "Nome: " + documentario.getNome() + "\n";
                    mensagem += "Gênero: " + documentario.getGenero() + "\n";
                    mensagem += "Lançamento: " + documentario.getLancamento() + "\n";
                    mensagem += "Tema: " + documentario.getTema() + "\n";
                    mensagem += "Tamanho: " + documentario.getTamanho() + " GB\n";
                    mensagem += "Narrador: " + documentario.getNarrador() + "\n";                    
                    mensagem += "Idioma: " + documentario.getIdioma() + "\n";
                    mensagem += "Local no Estoque: " + documentario.getEslq().getLocal() + "\n"; 
                    mensagem += "Quantidade: " + documentario.getEslq().getQuantidade() + "\n";
                    mensagem += "------------------------\n";
                    mensagem += "Descrição: " + documentario.getDescricao(); 

                    JOptionPane.showMessageDialog(null, mensagem, "Detalhes Documentário", 1);
                }

            } catch (DadoVazioException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Todos os valores precisam ser preenchidos. ",
                    "Relatório de Documentário",
                    0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela primeiro.");
        }
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Saida",
                JOptionPane.YES_NO_OPTION
        );
        if(resp == 0){
            dispose();
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JTable tabDocumentario;
    private javax.swing.JTable tabPes2;
    // End of variables declaration//GEN-END:variables
}
