package Ejercicio;

import static Ejercicio.Menu.listaProductos;



public class CargarDatos extends javax.swing.JInternalFrame {

    public CargarDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtNuevo = new javax.swing.JButton();
        jtGuardar = new javax.swing.JButton();
        jtEliminar = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();

        setClosable(true);

        jDesktopPane3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Gestión de Productos");
        jLabel1.setToolTipText("");

        jLabel2.setText("Codigo");
        jLabel2.setEnabled(false);

        jCodigo.setEnabled(false);

        jLabel3.setText("Descripcion");
        jLabel3.setEnabled(false);

        jDescripcion.setEnabled(false);

        jLabel4.setText("Precio");
        jLabel4.setEnabled(false);

        jPrecio.setEnabled(false);

        jLabel5.setText("Sock");
        jLabel5.setEnabled(false);

        jStock.setEnabled(false);

        jLabel6.setText("Rubro");
        jLabel6.setEnabled(false);

        jtNuevo.setText("Nuevo");
        jtNuevo.setFocusable(false);
        jtNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNuevoActionPerformed(evt);
            }
        });

        jtGuardar.setText("Guardar");
        jtGuardar.setEnabled(false);
        jtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtGuardarActionPerformed(evt);
            }
        });

        jtEliminar.setText("Eliminar");
        jtEliminar.setEnabled(false);
        jtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEliminarActionPerformed(evt);
            }
        });

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "comestible", "limpieza", "perfumería" }));
        jComboBox.setEnabled(false);

        jDesktopPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jDescripcion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jStock, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jtNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jtGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jtEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(43, 43, 43)
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jStock, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(jtNuevo)
                        .addGap(28, 28, 28)
                        .addComponent(jtGuardar)))
                .addGap(18, 18, 18)
                .addComponent(jtEliminar)
                .addGap(66, 66, 66))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtGuardar)
                        .addComponent(jtEliminar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane3)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNuevoActionPerformed
        jLabel2.setEnabled(true);
        jCodigo.setEnabled(true);
        jLabel3.setEnabled(true);
        jDescripcion.setEnabled(true);
        jLabel4.setEnabled(true);
        jPrecio.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel5.setEnabled(true);
        jStock.setEnabled(true);
        jtGuardar.setEnabled(true);
        jtEliminar.setEnabled(true);
        jComboBox.setEnabled(true);
    }//GEN-LAST:event_jtNuevoActionPerformed

    private void jtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtGuardarActionPerformed
        int codigo = Integer.parseInt(jCodigo.getText());
        String descripcion = jDescripcion.getText();
        Double precio = Double.parseDouble(jPrecio.getText());
        int stock = Integer.parseInt(jStock.getText());
        String categoria = jComboBox.getSelectedItem().toString();
        listaProductos.add(new Producto(codigo, descripcion, precio, stock, categoria));
        jCodigo.setText("");
        jDescripcion.setText("");
        jPrecio.setText("");
        jStock.setText("");
        jLabel2.setEnabled(false);
        jCodigo.setEnabled(false);
        jLabel3.setEnabled(false);
        jDescripcion.setEnabled(false);
        jLabel4.setEnabled(false);
        jPrecio.setEnabled(false);
        jLabel6.setEnabled(false);
        jLabel5.setEnabled(false);
        jStock.setEnabled(false);
        jtGuardar.setEnabled(false);
        jtEliminar.setEnabled(false);
        jComboBox.setEnabled(false);
    }//GEN-LAST:event_jtGuardarActionPerformed

    private void jtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEliminarActionPerformed
        jCodigo.setText("");
        jDescripcion.setText("");
        jPrecio.setText("");
        jStock.setText("");
        jLabel2.setEnabled(false);
        jCodigo.setEnabled(false);
        jLabel3.setEnabled(false);
        jDescripcion.setEnabled(false);
        jLabel4.setEnabled(false);
        jPrecio.setEnabled(false);
        jLabel6.setEnabled(false);
        jLabel5.setEnabled(false);
        jStock.setEnabled(false);
        jtGuardar.setEnabled(false);
        jtEliminar.setEnabled(false);
        jComboBox.setEnabled(false);
    }//GEN-LAST:event_jtEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCodigo;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JTextField jDescripcion;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jPrecio;
    private javax.swing.JTextField jStock;
    private javax.swing.JButton jtEliminar;
    private javax.swing.JButton jtGuardar;
    private javax.swing.JButton jtNuevo;
    // End of variables declaration//GEN-END:variables
    
}
