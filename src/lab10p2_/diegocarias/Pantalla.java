/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab10p2_.diegocarias;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Pantalla extends javax.swing.JFrame {

    static ArrayList<ticket> t = new ArrayList();
    static int cont = 0;

    public Pantalla() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBarr = new javax.swing.JProgressBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_1 = new javax.swing.JList<>();
        bt_mostrarT = new javax.swing.JButton();
        bt_mostrar = new javax.swing.JButton();
        p_color1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_area1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboPrioridad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_asunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_descrip = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_area2 = new javax.swing.JTextArea();
        p_color2 = new javax.swing.JPanel();
        p_color3 = new javax.swing.JPanel();
        bt_preview = new javax.swing.JButton();
        bt_Registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(jl_1);

        bt_mostrarT.setText("Mostrar a Todos");
        bt_mostrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mostrarTActionPerformed(evt);
            }
        });

        bt_mostrar.setText("Mostrar");
        bt_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mostrarActionPerformed(evt);
            }
        });

        p_color1.setBackground(new java.awt.Color(204, 204, 204));

        txt_area1.setColumns(20);
        txt_area1.setRows(5);
        jScrollPane2.setViewportView(txt_area1);

        javax.swing.GroupLayout p_color1Layout = new javax.swing.GroupLayout(p_color1);
        p_color1.setLayout(p_color1Layout);
        p_color1Layout.setHorizontalGroup(
            p_color1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_color1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        p_color1Layout.setVerticalGroup(
            p_color1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_color1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(bt_mostrarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(p_color1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(bt_mostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_mostrarT))
                    .addComponent(p_color1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Overview", jPanel1);

        jLabel1.setText("Prioridad");

        comboPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critica", "Alta", "Media", "Baja", "Muy Baja" }));

        jLabel2.setText("Estado");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abierto", "En Progreso", "En Espera", "Resuelto", "Cerrado" }));

        jLabel3.setText("Asunto");

        jLabel4.setText("Descripcion");

        txt_area2.setColumns(20);
        txt_area2.setRows(5);
        jScrollPane3.setViewportView(txt_area2);

        p_color2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout p_color2Layout = new javax.swing.GroupLayout(p_color2);
        p_color2.setLayout(p_color2Layout);
        p_color2Layout.setHorizontalGroup(
            p_color2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p_color2Layout.setVerticalGroup(
            p_color2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        p_color3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout p_color3Layout = new javax.swing.GroupLayout(p_color3);
        p_color3.setLayout(p_color3Layout);
        p_color3Layout.setHorizontalGroup(
            p_color3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p_color3Layout.setVerticalGroup(
            p_color3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        bt_preview.setText("Preview");
        bt_preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_previewActionPerformed(evt);
            }
        });

        bt_Registrar.setText("Registrar");
        bt_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p_color2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_color3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_preview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(comboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_asunto, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_descrip)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txt_asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_descrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(p_color2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p_color3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_preview)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Registrar)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Ticket", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pBarr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pBarr, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RegistrarActionPerformed
        // TODO add your handling code here:
        int prioridad = comboPrioridad.getSelectedIndex();
        int estado = comboEstado.getSelectedIndex();
        if (txt_asunto.getText().isEmpty() && txt_descrip.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la informacion", "ERROR", 2);
        } else {
            String asunto = txt_asunto.getText();
            String descrip = txt_descrip.getText();
            String p = "";
            String e = "";

            switch (prioridad) {
                case 0:
                    p = "Critica";
                    break;
                case 1:
                    p = "Alta";
                    break;
                case 2:
                    p = "Media";
                    break;
                case 3:
                    p = "Baja";
                    break;
                case 4:
                    p = "Muy baja";
                    break;
            }
            switch (estado) {
                case 0:
                    e = "Abierto";
                    break;
                case 1:
                    e = "En Progreso";
                    break;
                case 2:
                    e = "En espera";
                    break;
                case 3:
                    e = "Resuelto";
                    break;
                case 4:
                    e = "Cerrado";
                    break;
            }
            cont++;
            t.add(new ticket(cont, asunto, e, p, descrip));
            actualizar();
            JOptionPane.showMessageDialog(this, "Registrado", "info", 1);

            Thread hilo = new Thread(new Runnable() {
                @Override
                public void run() {
                    int time = 0;
                    while (time <= cont) {
                        try {
                            pBarr.setMaximum(cont);
                            pBarr.setValue(time);
                            Thread.sleep(1000);
                            time++;
                        } catch (InterruptedException e) {
                            System.out.println("no se");
                        }
                    }
                }
            });
            hilo.start();
        }
    }//GEN-LAST:event_bt_RegistrarActionPerformed

    private void bt_previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_previewActionPerformed
        // TODO add your handling code here:
        txt_area2.setText("");
        if (t.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nada que mostrar", "ERROR", 0);
        } else {
            String asunto = txt_asunto.getText();
            String descrip = txt_descrip.getText();
            String p = comboPrioridad.getSelectedItem().toString();
            String e = comboEstado.getSelectedItem().toString();

            switch (p) {
                case "Critica":
                    p_color2.setBackground(Color.red);
                    break;
                case "Alta":
                    p_color2.setBackground(Color.orange);
                    break;
                case "Media":
                    p_color2.setBackground(Color.yellow);
                    break;
                case "Baja":
                    p_color2.setBackground(Color.green);
                    break;
                case "Muy baja":
                    p_color2.setBackground(Color.blue);
                    break;
            }
            switch (e) {
                case "Abierto":
                    p_color3.setBackground(Color.blue);
                    break;
                case "En Progreso":
                    p_color3.setBackground(Color.magenta);
                    break;
                case "En espera":
                    p_color3.setBackground(Color.orange);
                    break;
                case "Resuelto":
                    p_color3.setBackground(Color.green);
                    break;
                case "Cerrado":
                    p_color3.setBackground(Color.white);
                    break;
            }
            txt_area2.setText(new ticket(t.size(), asunto, e, p, descrip).toString());
        }
    }//GEN-LAST:event_bt_previewActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        txt_asunto.setText("");
        txt_descrip.setText("");
        txt_area1.setText("");
        txt_area2.setText("");
        p_color1.setBackground(Color.lightGray);
        p_color2.setBackground(Color.lightGray);
        p_color3.setBackground(Color.lightGray);
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void bt_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mostrarActionPerformed
        // TODO add your handling code here:
        int seleccion = jl_1.getSelectedIndex();
        if (seleccion == -1) {
            JOptionPane.showMessageDialog(this, "Nada que mostrar", "ERROR", 0);
        } else {
            String e = t.get(seleccion).getEstado();
            switch (e) {
                case "Abierto":
                    p_color1.setBackground(Color.blue);
                    break;
                case "En Progreso":
                    p_color1.setBackground(Color.magenta);
                    break;
                case "En espera":
                    p_color1.setBackground(Color.orange);
                    break;
                case "Resuelto":
                    p_color1.setBackground(Color.green);
                    break;
                case "Cerrado":
                    p_color1.setBackground(Color.white);
                    break;
            }
            txt_area1.setText(t.get(seleccion).toString());
        }
    }//GEN-LAST:event_bt_mostrarActionPerformed

    private void bt_mostrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mostrarTActionPerformed
        // TODO add your handling code here:
        txt_area1.setText("");
        p_color1.setBackground(Color.lightGray);
        txt_area1.setText(t.toString());
    }//GEN-LAST:event_bt_mostrarTActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    void actualizar() {
        DefaultListModel Lista = new DefaultListModel();
        jl_1.setModel(Lista);
        for (ticket object : t) {
            Lista.addElement(object.getAsunto());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Registrar;
    private javax.swing.JButton bt_mostrar;
    private javax.swing.JButton bt_mostrarT;
    private javax.swing.JButton bt_preview;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboPrioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> jl_1;
    private javax.swing.JProgressBar pBarr;
    private javax.swing.JPanel p_color1;
    private javax.swing.JPanel p_color2;
    private javax.swing.JPanel p_color3;
    private javax.swing.JTextArea txt_area1;
    private javax.swing.JTextArea txt_area2;
    private javax.swing.JTextField txt_asunto;
    private javax.swing.JTextField txt_descrip;
    // End of variables declaration//GEN-END:variables
}
