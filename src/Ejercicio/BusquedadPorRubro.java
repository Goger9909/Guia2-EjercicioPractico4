package Ejercicio;

import javax.swing.table.DefaultTableModel;

public class BusquedadPorRubro extends javax.swing.JInternalFrame {

    private DefaultTableModel model = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public BusquedadPorRubro() {
        initComponents();
        ArmarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitulo = new javax.swing.JLabel();
        jTituloSecundario = new javax.swing.JLabel();
        jRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

        setClosable(true);

        jTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTitulo.setText("Busquedad Por Rubro");

        jTituloSecundario.setText("Elija Rubro");

        jRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "comestible", "limpieza", "perfumería" }));
        jRubro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRubroItemStateChanged(evt);
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
                        .addGap(50, 50, 50)
                        .addComponent(jTituloSecundario)
                        .addGap(18, 18, 18)
                        .addComponent(jRubro, 0, 169, Short.MAX_VALUE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTituloSecundario)
                    .addComponent(jRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRubroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRubroItemStateChanged
        BorrarFilas();
        String rubroSeleccionado = jRubro.getSelectedItem().toString();

        for (Producto prod : Menu.listaProductos) {
            if (prod.getRubro().equals(rubroSeleccionado)) {
                model.addRow(new Object[]{
                    prod.getCodigo(),
                    prod.getDescripcion(),
                    prod.getPrecio(),
                    prod.getStock()
                });
            }
        }
    }//GEN-LAST:event_jRubroItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jRubro;
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

    private void BorrarFilas() {
        int f = jtProductos.getRowCount() - 1;
        for (; f >= 0; f--) {
            model.removeRow(f);
        }
    }
}
