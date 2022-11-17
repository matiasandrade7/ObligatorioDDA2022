/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iuEscritorio;

import Controlador.ControladorVistaSimularLlamada;
import Modelo.Puesto;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahue
 */
import Controlador.ControladorVistaSimularLlamada;
import Excepciones.CIException;
import Excepciones.LlamadaException;
import Modelo.Cliente;
import Modelo.Llamada;
import Modelo.Sector;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class VistaSimularLlamadaImpl extends javax.swing.JFrame implements IVistaSimularLlamada {

    /**
     * Creates new form VistaAtenderLlamadasImpl
     */
    public VistaSimularLlamadaImpl(java.awt.Frame parent, boolean modal) {
        initComponents();
        setLocationRelativeTo(parent);
        bloquearNumeros();
        this.finalizarBtn.setEnabled(false);
        this.controlador = new ControladorVistaSimularLlamada(this);
        setDefaultCloseOperation(0);
    }

    private ControladorVistaSimularLlamada controlador;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel5 = new javax.swing.JLabel();
        iniciarBtn = new javax.swing.JButton();
        finalizarBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        one = new javax.swing.JButton();
        four = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        asterisk = new javax.swing.JButton();
        two = new javax.swing.JButton();
        five = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        three = new javax.swing.JButton();
        six = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        hash = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaMensaje = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("mensaje de \nla central \ntelefonica:");
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Mensaje de\nla central\ntelefonica:");
        jScrollPane2.setViewportView(jTextArea2);

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Mensaje de");

        jLabel2.setText("Mensaje de");

        jLabel3.setText("   la central");

        jLabel4.setText("telefonica:");

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setRollover(true);

        jLabel5.setText("Simulador de llamadas");
        jToolBar1.add(jLabel5);

        iniciarBtn.setBackground(new java.awt.Color(255, 255, 255));
        iniciarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iniciarBtn.setForeground(new java.awt.Color(153, 255, 153));
        iniciarBtn.setText("Iniciar");
        iniciarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iniciarBtnMousePressed(evt);
            }
        });
        iniciarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBtnActionPerformed(evt);
            }
        });

        finalizarBtn.setBackground(new java.awt.Color(255, 255, 255));
        finalizarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finalizarBtn.setForeground(new java.awt.Color(255, 0, 51));
        finalizarBtn.setText("Finalizar");
        finalizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarBtnActionPerformed(evt);
            }
        });

        salirBtn.setBackground(new java.awt.Color(255, 255, 255));
        salirBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setForeground(new java.awt.Color(0, 0, 0));
        one.setText("1");
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(255, 255, 255));
        four.setForeground(new java.awt.Color(0, 0, 0));
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(255, 255, 255));
        seven.setForeground(new java.awt.Color(0, 0, 0));
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        asterisk.setBackground(new java.awt.Color(255, 255, 255));
        asterisk.setForeground(new java.awt.Color(0, 0, 0));
        asterisk.setText("*");
        asterisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asteriskActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setForeground(new java.awt.Color(0, 0, 0));
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(255, 255, 255));
        five.setForeground(new java.awt.Color(0, 0, 0));
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(255, 255, 255));
        eight.setForeground(new java.awt.Color(0, 0, 0));
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(255, 255, 255));
        zero.setForeground(new java.awt.Color(0, 0, 0));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setForeground(new java.awt.Color(0, 0, 0));
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(255, 255, 255));
        six.setForeground(new java.awt.Color(0, 0, 0));
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(255, 255, 255));
        nine.setForeground(new java.awt.Color(0, 0, 0));
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        hash.setBackground(new java.awt.Color(255, 255, 255));
        hash.setForeground(new java.awt.Color(0, 0, 0));
        hash.setText("#");
        hash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashActionPerformed(evt);
            }
        });

        jTextAreaMensaje.setColumns(20);
        jTextAreaMensaje.setRows(5);
        jScrollPane3.setViewportView(jTextAreaMensaje);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iniciarBtn)
                                .addGap(18, 18, 18)
                                .addComponent(finalizarBtn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(asterisk, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(four, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(two, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirBtn)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalizarBtn)
                    .addComponent(iniciarBtn))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(two)
                                .addComponent(three))
                            .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(four)
                            .addComponent(five)
                            .addComponent(six))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seven)
                            .addComponent(eight)
                            .addComponent(nine))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(asterisk)
                            .addComponent(zero)
                            .addComponent(hash)
                            .addComponent(salirBtn))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void iniciarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBtnActionPerformed
        try {
            inicializar();
            jTextAreaMensaje.setText("Ingrese su cédula seguida de la tecla numeral");
            controlador.setFechaInicio(LocalDate.now());
            controlador.setHoraInicio(LocalTime.now());
            desbloquearNumeros();
        } catch (LlamadaException e) {
            mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_iniciarBtnActionPerformed

    private void iniciarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarBtnMousePressed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        if (controlador.getEstaCiIngresada()) {
            altaLlamada("1");
        }
        ingresarNumeroCI("1");
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if (controlador.getEstaCiIngresada()) {
            altaLlamada("2");
        }
        ingresarNumeroCI("2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        if (controlador.getEstaCiIngresada()) {
            altaLlamada("3");
        }
        ingresarNumeroCI("3");
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if (controlador.getEstaCiIngresada()) {
            altaLlamada("4");
        }
        ingresarNumeroCI("4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if (controlador.getEstaCiIngresada()) {
            altaLlamada("5");
        }
        ingresarNumeroCI("5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        if (controlador.getEstaCiIngresada()) {
            altaLlamada("6");
        }
        ingresarNumeroCI("6");
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if (controlador.getEstaCiIngresada()) {
            altaLlamada("7");
        }
        ingresarNumeroCI("7");
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if (controlador.getEstaCiIngresada()) {
            altaLlamada("8");
        }
        ingresarNumeroCI("8");
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if (controlador.getEstaCiIngresada()) {
            altaLlamada("9");
        }
        ingresarNumeroCI("9");
    }//GEN-LAST:event_nineActionPerformed

    private void asteriskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asteriskActionPerformed
        if (controlador.getEstaCiIngresada()) {
            //Cambiar por un error. Si presiona un * para ingresar por sector
            jTextAreaMensaje.setText("INGRESE UN NUMERO DE SECTOR VALIDO");

        }
        ingresarNumeroCI("*");
    }//GEN-LAST:event_asteriskActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if (controlador.getEstaCiIngresada()) {
            //Cambiar por un error. Si presiona un 0 para ingresar por sector
            jTextAreaMensaje.setText("INGRESE UN NUMERO DE SECTOR VALIDO");

        }
        ingresarNumeroCI("0");
    }//GEN-LAST:event_zeroActionPerformed

    private void hashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashActionPerformed
        if (controlador.getEstaCiIngresada()) {
            //Cambiar por un error. Si presiona un # para ingresar por sector
            jTextAreaMensaje.setText("INGRESE UN NUMERO DE SECTOR VALIDO");

        }
        ingresarNumeroCI("#");
    }//GEN-LAST:event_hashActionPerformed

    private void finalizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarBtnActionPerformed
        controlador.finalizarLlamada();
        this.bloquearNumeros();
    }//GEN-LAST:event_finalizarBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed

        if (controlador.getHoraComienzoLlamada() != null) {
            controlador.finalizarLlamada();
        }else{
            controlador.finalizarLlamadaEnEspera();
        }
        
        this.dispose();
    }//GEN-LAST:event_salirBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asterisk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton eight;
    private javax.swing.JButton finalizarBtn;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton hash;
    private javax.swing.JButton iniciarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextAreaMensaje;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton salirBtn;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

    @Override
    public void inicializar() throws LlamadaException {
        controlador.inicializar();
    }

    @Override
    public void altaLlamada(String numeroSectorElegido) {
        LocalDate fecha = controlador.getFechaInicio();
        LocalTime hora = controlador.getHoraInicio();
        try {
            Llamada llamada = controlador.altaLlamada(numeroSectorElegido);
            Sector unSector = controlador.getSector(numeroSectorElegido);
            this.bloquearNumeros();
            if (llamada.getPuesto() != null) {
                mostrarDatosLlamada(llamada.getPuesto());
                String msg = "Llamada en curso... ud. se está comunicando con el sector ";
                msg += unSector.getNombre() + "\n";
                msg += "Y está siendo atendido por " + llamada.getTrabajador() + "\n";
                msg += " Su llamada se ha iniciado en " + fecha + " " + hora;
                jTextAreaMensaje.setText(msg);
                this.finalizarBtn.setEnabled(true);
            } else {
                String msg = "“Aguarde en línea, Ud. se encuentra a ";
                msg += unSector.cantidadDeLlamadasASerAtendido();
                msg += " llamadas de ser atendido, la espera estimada es de ";
                msg += Float.toString(unSector.cantidadDeMinutosDeEspera()) + " minutos";
                jTextAreaMensaje.setText(msg);
            }
        } catch (LlamadaException ex) {
            mostrarError(ex.getMessage());
        }

    }

    @Override
    public void mostrarDatosLlamada(Puesto p) {
        String msg = "Llamada en curso... ud. se está comunicando con el sector ";
        msg += p.getSector() + "\n";
        msg += "Y está siendo atendido por " + p.getTrabajador() + "\n";
        msg += " Su llamada se ha iniciado en " + controlador.getFechaInicio() + " " + controlador.getHoraInicio();
        jTextAreaMensaje.setText(msg);
        this.finalizarBtn.setEnabled(true);
    }

    @Override
    public void finalizarLlamada(int ultimaDuracionLlamada, float ultimoCosto, float ultimoSaldo) {
        String msg = "Llamada finalizada...Duracion: " + ultimaDuracionLlamada + "\n ";
        msg += "Costo: " + ultimoCosto;
        msg += "Su saldo es de: " + ultimoSaldo;
        jTextAreaMensaje.setText(msg);
        controlador.resetDatos();
        iniciarBtn.setEnabled(true);
        finalizarBtn.setEnabled(false);
    }

    @Override
    public void mostrarSectores() {
        bloquearNumeros();
        iniciarBtn.setEnabled(false);
        ArrayList<Sector> sectores = controlador.getSectores();
        String salt = System.getProperty("line.separator");
        String msj = "Para comunicarse con: " + salt;
        int i = 1;

        for (Sector s : sectores) {
            //Va desbloqueando los botones relacionados al numero de sector
            desbloquearBotonNumeroSector(i);

            msj += s.getNombre() + " digite" + i + salt;
            i++;
        }
        jTextAreaMensaje.setText(msj);
    }

    public void mostrarError(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    private void desbloquearBotonNumeroSector(int numero) {

        switch (numero) {
            case 1:
                one.setEnabled(true);
                break;
            case 2:
                two.setEnabled(true);
                break;
            case 3:
                three.setEnabled(true);
                break;
            case 4:
                four.setEnabled(true);
                break;
            case 5:
                five.setEnabled(true);
                break;
            case 6:
                six.setEnabled(false);
                break;
            case 7:
                seven.setEnabled(false);
                break;
            case 8:
                eight.setEnabled(true);
                break;
            default:
                nine.setEnabled(true);
                break;
        }
    }

    private void bloquearNumeros() {
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        zero.setEnabled(false);
        asterisk.setEnabled(false);
        hash.setEnabled(false);
    }

    private void desbloquearNumeros() {
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        zero.setEnabled(true);
        asterisk.setEnabled(true);
        hash.setEnabled(true);
    }

    private void ingresarNumeroCI(String numero) {
        if (numero.equals("#")) {
            try {
                controlador.validaCI();
                controlador.ingresarUsuario();
                controlador.setEstaCiIngresada(true);
                mostrarSectores();
            } catch (CIException ex) {
                controlador.vaciarCi();
                mostrarError(ex.getMessage());
            }
        } else {
            controlador.agregarNumeroCi(numero);
        }
    }

}
