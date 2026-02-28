// Carlos Eduardo Gonçalves  2706946

import javax.swing.JOptionPane;

public class FormDocumentario extends javax.swing.JFrame {
    private static FormDocumentario controleUnico;
    private DBDocumentario gp;
    
    private FormDocumentario() {
        gp = DBDocumentario.geraDBDocumentario(); 
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormDocumentario geraFormDocumentario() {  
        if (controleUnico == null) {
            controleUnico = new FormDocumentario();
        }
        return controleUnico;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtTitulo = new javax.swing.JLabel();
        rtNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rtQuantidade = new javax.swing.JLabel();
        cxQuantidade = new javax.swing.JTextField();
        cxGenero = new javax.swing.JTextField();
        rtGenero = new javax.swing.JLabel();
        cxDescricao = new javax.swing.JTextField();
        rtDescricao = new javax.swing.JLabel();
        rtLancamento = new javax.swing.JLabel();
        cxLancamento = new javax.swing.JTextField();
        cxTamanho = new javax.swing.JTextField();
        rtTamanho = new javax.swing.JLabel();
        cxNarrador = new javax.swing.JTextField();
        rtNarrador = new javax.swing.JLabel();
        rtTema = new javax.swing.JLabel();
        cxTema = new javax.swing.JTextField();
        rtLocal = new javax.swing.JLabel();
        cxLocal = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btConsDocumentario = new javax.swing.JButton();
        rtIdioma = new javax.swing.JLabel();
        cxIdioma = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Documentários");

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTitulo.setText("Gerenciamento de Documentários");

        rtNome.setText("Nome:");

        cxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeActionPerformed(evt);
            }
        });

        rtQuantidade.setText("Quantidade:");

        cxQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxQuantidadeActionPerformed(evt);
            }
        });

        rtGenero.setText("Genero:");

        rtDescricao.setText("Descrição:");

        rtLancamento.setText("Ano Lançamento:");

        rtTamanho.setText("Tamanho (Gigas):");

        rtNarrador.setText("Narrador:");

        rtTema.setText("Tema:");

        rtLocal.setText("Local:");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btConsultar.setText("Pesquisar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btConsDocumentario.setText("Consultar os Documentários...");
        btConsDocumentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsDocumentarioActionPerformed(evt);
            }
        });

        rtIdioma.setText("Idioma:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConsDocumentario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair)
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtTitulo)
                        .addGap(0, 120, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rtTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtNarrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtLancamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(rtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxTema)
                            .addComponent(cxLocal)
                            .addComponent(cxIdioma)
                            .addComponent(cxNarrador, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxTamanho, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxLancamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxGenero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxQuantidade)
                            .addComponent(cxNome))))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtQuantidade)
                    .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtGenero)
                    .addComponent(cxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtDescricao)
                    .addComponent(cxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtLancamento)
                    .addComponent(cxLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTamanho)
                    .addComponent(cxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNarrador)
                    .addComponent(cxNarrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTema)
                    .addComponent(cxTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtLocal)
                    .addComponent(cxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtIdioma)
                    .addComponent(cxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btConsultar)
                    .addComponent(btEditar)
                    .addComponent(btExcluir))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsDocumentario)
                    .addComponent(btSair))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxQuantidadeActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        cadastrarDocumentario();
    }//GEN-LAST:event_btInserirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarDocumentario();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        editarDocumentario();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        deletarDocumentario();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConsDocumentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsDocumentarioActionPerformed
        RelatorioDocumentario.geraRelDocumentario().setVisible(true);
    }//GEN-LAST:event_btConsDocumentarioActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
       sair();
    }//GEN-LAST:event_btSairActionPerformed

    public Documentario validarDados() {
        Documentario d = new Documentario();
        
        try {
            d.setNome(cxNome.getText());
            d.getEslq().setQuantidade(Integer.parseInt(cxQuantidade.getText()));
            d.setGenero(cxGenero.getText());
            d.setDescricao(cxDescricao.getText());
            d.setLancamento(Integer.parseInt(cxLancamento.getText()));
            d.setTamanho(Integer.parseInt(cxTamanho.getText()));
            d.setTema(cxTema.getText());
            d.setNarrador(cxNarrador.getText());
            d.setIdioma(cxIdioma.getText());
            d.getEslq().setLocal(cxLocal.getText());
            
            return d;
        } catch (DadoVazioException e) {
            JOptionPane.showMessageDialog(
                null,
                "Todos os valores precisam ser preenchidos. ",
                "Cadastro de Documentários",
                0);
            return null;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Os valores de Quantidade, Lançamento, Tamanho, Duração e Classificação precisam ser inteiros.",
                "Cadastro de Documentários",
                0);
            return null;
        } catch (QuantidadeInvalidaException e) {
            JOptionPane.showMessageDialog(
                null,
                "Quantidade Inválidas. Precisa ser maior que 0.",
                "Cadastro de Documentários",
                0);
            return null;
        }
    }
    
    public void cadastrarDocumentario() {
        Documentario d = validarDados();
        
        if(d != null) {
            Documentario inserirDoc = gp.inserirDocumentario(d);
            JOptionPane.showMessageDialog(
                   null,
                   "Documentário " + inserirDoc.getNome() + " Cadastrado.",
                   "Cadastro de Documentários",
                   1);
            limpar();
        } 
    }
    
    public void consultarDocumentario() {
        Documentario d = new Documentario();
        try {
            d.setNome(cxNome.getText());
        } catch (DadoVazioException ex) {
            JOptionPane.showMessageDialog(
                   null,
                   "Nome inválido. A pesquisa é feita pelo nome.",
                   "Cadastro de Filmes",
                   0);
            return;
        }
        
        d = gp.consDocNome(d);
        
        cxNome.setText(d.getNome());
        cxQuantidade.setText(String.valueOf(d.getEslq().getQuantidade()));        
        cxGenero.setText(d.getGenero());
        cxDescricao.setText(d.getDescricao());
        cxLancamento.setText(String.valueOf(d.getLancamento()));
        cxTamanho.setText(String.valueOf(d.getTamanho()));

        cxTema.setText(d.getTema());
        cxNarrador.setText(d.getNarrador());
        cxIdioma.setText(d.getIdioma());

        cxLocal.setText(d.getEslq().getLocal());

    }
    
    public void editarDocumentario() {
        Documentario d = validarDados();
        
        if (d == null) {
            return; 
        }
        try {    
           d = gp.editDocumentario(d);
                
            if(d != null) {
                JOptionPane.showMessageDialog(
                       null,
                       "Documentário Editado com Sucesso.",
                       "Cadastro de Documentários",
                       1);
            }
            limpar();
        } catch (DadoVazioException ex) {
            JOptionPane.showMessageDialog(
                       null,
                       "Todos os valores precisam ser preenchidos.",
                       "Cadastro de Documentários",
                       0);
        } catch (QuantidadeInvalidaException ex) {
            JOptionPane.showMessageDialog(
                       null,
                       "Quantidade Inválidas. Precisa ser maior que 0.",
                       "Cadastro de Documentários",
                       0);
        }
    }
    
    public void deletarDocumentario() {
        Documentario d = new Documentario();
        try {
            d.setNome(cxNome.getText());
        } catch (DadoVazioException ex) {
            JOptionPane.showMessageDialog(
                   null,
                   "Nome inválido. A Deleção é feita pelo nome.",
                   "Cadastro de Documentários",
                   0);
            return;
        }
        
        boolean res = gp.delDocumentario(d);
        
        if(res) {
            limpar();
            JOptionPane.showMessageDialog(
                null,
                "Documentário deletado com sucesso.",
                "Cadastro de Documentários",
                1);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Documentário não encontrado.",
                "Cadastro de Documentários",
                0);
        }
    }
    
    
    public void limpar() {
        cxNome.setText("");
        cxQuantidade.setText("");        
        cxGenero.setText("");
        cxDescricao.setText("");
        cxLancamento.setText("");
        cxTamanho.setText("");
        cxTema.setText("");
        cxNarrador.setText("");
        cxIdioma.setText("");
        cxLocal.setText("");
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
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormDocumentario().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsDocumentario;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxDescricao;
    private javax.swing.JTextField cxGenero;
    private javax.swing.JTextField cxIdioma;
    private javax.swing.JTextField cxLancamento;
    private javax.swing.JTextField cxLocal;
    private javax.swing.JTextField cxNarrador;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxQuantidade;
    private javax.swing.JTextField cxTamanho;
    private javax.swing.JTextField cxTema;
    private javax.swing.JLabel rtDescricao;
    private javax.swing.JLabel rtGenero;
    private javax.swing.JLabel rtIdioma;
    private javax.swing.JLabel rtLancamento;
    private javax.swing.JLabel rtLocal;
    private javax.swing.JLabel rtNarrador;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtQuantidade;
    private javax.swing.JLabel rtTamanho;
    private javax.swing.JLabel rtTema;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
