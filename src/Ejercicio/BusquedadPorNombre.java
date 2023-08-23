package Ejercicio;

import javax.swing.table.DefaultTableModel;

public class BusquedadPorNombre extends javax.swing.JInternalFrame {

    private DefaultTableModel model = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c) {
        return false;
    }
    };

    public BusquedadPorNombre() {
        initComponents();
        ArmarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitulo = new javax.swing.JLabel();
        jTituloSecundario = new javax.swing.JLabel();
        jCatacteres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

        setClosable(true);

        jTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTitulo.setText("Busquedad Por Nombre");

        jTituloSecundario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTituloSecundario.setText("Escriba los primeros caracteres:");

        jCatacteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCatacteresActionPerformed(evt);
            }
        });
        jCatacteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCatacteresKeyReleased(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTituloSecundario)
                        .addGap(18, 18, 18)
                        .addComponent(jCatacteres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTituloSecundario)
                    .addComponent(jCatacteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCatacteresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCatacteresKeyReleased
        BorrarFilas();
        for (Producto prod:Menu.listaProductos){
            if(prod.getDescripcion().startsWith(jCatacteres.getText())){
                model.addRow(new Object[]{
                prod.getCodigo(),
                prod.getDescripcion(),
                prod.getPrecio(),
                prod.getStock()
                });
            }
        }
    }//GEN-LAST:event_jCatacteresKeyReleased

    private void jCatacteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCatacteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCatacteresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCatacteres;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jTituloSecundario;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables
    private void ArmarCabecera() {
        model.addColumn("codigo");
        model.addColumn("Descripcion");
        model.addColumn("Precio");
        model.addColumn("Stock");
        jtProductos.setModel(model);
    }
    private void BorrarFilas(){
        int f=jtProductos.getRowCount()-1;
        for(;f>=0;f--){
            model.removeRow(f);
        }
    }
}
