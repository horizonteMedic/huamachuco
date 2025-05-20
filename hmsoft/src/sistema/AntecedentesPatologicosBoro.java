/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.RegistrarCliente;
//import Clases.FileDownloader;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Clases.clsOperacionesUsuarios;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
//import sun.misc.BASE64Decoder;

/**
 *
 * @author admin
 */
public final class AntecedentesPatologicosBoro extends javax.swing.JInternalFrame {

   clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    DefaultTableModel model;
   Integer num= null;
   public AntecedentesPatologicosBoro() {
      initComponents();
       Dimension min = new Dimension(1065, 630);
    setMinimumSize(min);
    setPreferredSize(min);
    buttonGroup3.add(chkAlergiasMedicAlim);
    buttonGroup3.add(rdbAlergiasNO);
      jtAntecedentes.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/pildora.png")));
       jtAntecedentes.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
         jtAntecedentes.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png")));
         txtMedico.setText(clsGlobales.sNomOperador);
         sbCargarDatosAP();
        habitos();
        
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
      
   }

 private com.toedter.calendar.JDateChooser FechaNacimiento;
 
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        bgFumar = new javax.swing.ButtonGroup();
        bgLicor = new javax.swing.ButtonGroup();
        bgDrogras = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jtAntecedentes = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombrecompleto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FechaPatologicos = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        chkAlergiasMedicAlim = new javax.swing.JRadioButton();
        rdbAlergiasNO = new javax.swing.JRadioButton();
        txtAlergiasMedicAlimDetall = new javax.swing.JTextField();
        jLabel151 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        chkAcciTrabajo = new javax.swing.JRadioButton();
        acciTno = new javax.swing.JRadioButton();
        chkAcciTDescanso = new javax.swing.JRadioButton();
        descaMNO = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        chkEnfeProf = new javax.swing.JRadioButton();
        enferpNO = new javax.swing.JRadioButton();
        chkEnfeLabCalif = new javax.swing.JRadioButton();
        enferNO = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtEnfeLabCalifDetall = new javax.swing.JTextField();
        txtAcciDescansoDetall = new javax.swing.JTextField();
        fechaAcciT = new com.toedter.calendar.JDateChooser();
        fechaEnfeProf = new com.toedter.calendar.JDateChooser();
        jLabel149 = new javax.swing.JLabel();
        txtEspecifiqueDetalleEnfermedades = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        chk1 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        chk4 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        chk7 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        chk11 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        chk13 = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        chk14 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        chk15 = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        chk25 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        chk26 = new javax.swing.JCheckBox();
        jLabel53 = new javax.swing.JLabel();
        chk27 = new javax.swing.JCheckBox();
        jLabel58 = new javax.swing.JLabel();
        chk54 = new javax.swing.JCheckBox();
        jLabel56 = new javax.swing.JLabel();
        chk55 = new javax.swing.JCheckBox();
        jLabel69 = new javax.swing.JLabel();
        chk57 = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        txtotrosap = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        chkVertigos = new javax.swing.JCheckBox();
        chkTifoidea = new javax.swing.JCheckBox();
        chkNeoplasias = new javax.swing.JCheckBox();
        chkQuemaduras = new javax.swing.JCheckBox();
        chkDiscopatias = new javax.swing.JCheckBox();
        chkColumna = new javax.swing.JCheckBox();
        chkEnfReumatica = new javax.swing.JCheckBox();
        chkEnfPulmonares = new javax.swing.JCheckBox();
        chkEnfPiel = new javax.swing.JCheckBox();
        chkTendinitis = new javax.swing.JCheckBox();
        chkOnicomicosis = new javax.swing.JCheckBox();
        chkFracturas = new javax.swing.JCheckBox();
        chkAnemia = new javax.swing.JCheckBox();
        chkObesidad = new javax.swing.JCheckBox();
        chkSordera = new javax.swing.JCheckBox();
        chkAmputacion = new javax.swing.JCheckBox();
        chkIntoxicaciones = new javax.swing.JCheckBox();
        chkDislipidemia = new javax.swing.JCheckBox();
        chkIMA = new javax.swing.JCheckBox();
        chkACV = new javax.swing.JCheckBox();
        chkTBC = new javax.swing.JCheckBox();
        chkets = new javax.swing.JCheckBox();
        chkVIH = new javax.swing.JCheckBox();
        chkFobias = new javax.swing.JCheckBox();
        chkEnfPsiquiatricas = new javax.swing.JCheckBox();
        jLabel75 = new javax.swing.JLabel();
        chkmigraña = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rbFumarSI = new javax.swing.JRadioButton();
        rbFumarNO = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txtNcigarrillos = new javax.swing.JTextField();
        chkCigarrillos = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        rbLicorSI = new javax.swing.JRadioButton();
        rbLicorNO = new javax.swing.JRadioButton();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        txtLicorFrecuencia = new javax.swing.JTextField();
        chkWiscky = new javax.swing.JCheckBox();
        chkVino = new javax.swing.JCheckBox();
        chkCerveza = new javax.swing.JCheckBox();
        chkRon = new javax.swing.JCheckBox();
        chkLicFrecuencia = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtLicorTipoFrecuente = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        rbDrogasSI = new javax.swing.JRadioButton();
        rbDrogasNO = new javax.swing.JRadioButton();
        jLabel107 = new javax.swing.JLabel();
        txtDrogasTipo = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        txtDrogasFrecuencia = new javax.swing.JTextField();
        chkDrogas = new javax.swing.JCheckBox();
        chkFreDrog = new javax.swing.JCheckBox();
        btnNext = new javax.swing.JLabel();
        txtCocaina = new javax.swing.JTextField();
        txtMarihuana = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        rbOtrossi = new javax.swing.JRadioButton();
        rbOtrosno = new javax.swing.JRadioButton();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        txtotros = new javax.swing.JTextField();
        txtotrosfrecuencia = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        chkMedicamento = new javax.swing.JRadioButton();
        medicno = new javax.swing.JRadioButton();
        chkActivFisic = new javax.swing.JRadioButton();
        activifisicano = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMedicamentoDetall = new javax.swing.JTextField();
        txtActivFisicDetall = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        chkCovid = new javax.swing.JCheckBox();
        jLabel142 = new javax.swing.JLabel();
        txtDosis = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        chkNeumococo = new javax.swing.JCheckBox();
        jLabel155 = new javax.swing.JLabel();
        chkRabia = new javax.swing.JCheckBox();
        jLabel156 = new javax.swing.JLabel();
        chkPapilomaHumano = new javax.swing.JCheckBox();
        jLabel157 = new javax.swing.JLabel();
        chkHepatitisA = new javax.swing.JCheckBox();
        jLabel158 = new javax.swing.JLabel();
        chkHepatitisB = new javax.swing.JCheckBox();
        jLabel159 = new javax.swing.JLabel();
        chkGripeInfluenza = new javax.swing.JCheckBox();
        jLabel160 = new javax.swing.JLabel();
        chkAntitetanica = new javax.swing.JCheckBox();
        jLabel161 = new javax.swing.JLabel();
        chkFiebreAmarilla = new javax.swing.JCheckBox();
        jLabel162 = new javax.swing.JLabel();
        chkInfluenza = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtComplicacionesQui = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtHospitalQui = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuirurgicos = new javax.swing.JTable();
        jLabel111 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        txtdiasHospitalizacionQui = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txtOperacionQui = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        btnQui = new javax.swing.JLabel();
        FechaQui = new javax.swing.JTextField();
        jtReproduccion = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        txtMadreDetall = new javax.swing.JTextField();
        txtPadreDetall = new javax.swing.JTextField();
        txtHermanosDetall = new javax.swing.JTextField();
        txtHijosDetall = new javax.swing.JTextField();
        txtEsposConyDetall = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtConadisDetalle = new javax.swing.JTextArea();
        jLabel115 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        txtLimpiar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtImp = new javax.swing.JTextField();
        btnIMP = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        txtCercaSinCorregirOD = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        txtLejosSinCorregirOD = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txtLejosSinCorregirOI = new javax.swing.JTextField();
        txtCercaSinCorregirOI = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        txtEnfermedadesOculares = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        txtReflejosPupilares = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        txtVisionBinocular = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        txtVisionColores = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        txtLejosCorregidaOD = new javax.swing.JTextField();
        txtLejosCorregidaOI = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        txtCercaCorregidaOD = new javax.swing.JTextField();
        txtCercaCorregidaOI = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();

        jLabel6.setText("Cod. Cliente:");

        setClosable(true);
        setTitle("Antecedentes Patológicos");
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1145, 725));
        setMinimumSize(new java.awt.Dimension(1145, 725));
        setPreferredSize(new java.awt.Dimension(1145, 725));
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jtAntecedentes.setName(""); // NOI18N

        jPanel3.setMaximumSize(new java.awt.Dimension(876, 639));
        jPanel3.setMinimumSize(new java.awt.Dimension(876, 639));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ingresar Información"));

        jLabel1.setText("N° Orden :");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });
        txtNorden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombres:");

        nombrecompleto.setEditable(false);

        jLabel8.setText("Sexo :");

        txtSexo.setEditable(false);

        jLabel10.setText("Fecha :");

        FechaPatologicos.setDateFormatString("dd-MM-yyyy");

        jLabel11.setText("Edad :");

        txtEdad.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombrecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel10)
                        .addComponent(FechaPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(nombrecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Marcar todas las enfermedades que ah tenido o tiene"));
        jPanel4.setMaximumSize(new java.awt.Dimension(758, 543));
        jPanel4.setMinimumSize(new java.awt.Dimension(758, 543));

        jLabel150.setText("Alergias a Medicamentos / Alimentos:");

        buttonGroup3.add(chkAlergiasMedicAlim);
        chkAlergiasMedicAlim.setText("SI");
        chkAlergiasMedicAlim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkAlergiasMedicAlimStateChanged(evt);
            }
        });

        buttonGroup3.add(rdbAlergiasNO);
        rdbAlergiasNO.setText("NO");
        rdbAlergiasNO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdbAlergiasNOStateChanged(evt);
            }
        });
        rdbAlergiasNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlergiasNOActionPerformed(evt);
            }
        });

        jLabel151.setText("Especifique:");

        jLabel13.setText("<html>Ha sufrido algún accidente relacionado al trabajo: <br>Si la Respuesta es SI, responder las líneas inferiores <br>Hubo tiempo perdido (descanso médico)</html>");

        buttonGroup4.add(chkAcciTrabajo);
        chkAcciTrabajo.setText("SI");
        chkAcciTrabajo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkAcciTrabajoStateChanged(evt);
            }
        });

        buttonGroup4.add(acciTno);
        acciTno.setText("NO");
        acciTno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                acciTnoStateChanged(evt);
            }
        });

        buttonGroup5.add(chkAcciTDescanso);
        chkAcciTDescanso.setText("SI");

        buttonGroup5.add(descaMNO);
        descaMNO.setText("NO");
        descaMNO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                descaMNOStateChanged(evt);
            }
        });
        descaMNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descaMNOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(chkAcciTrabajo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acciTno))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(chkAcciTDescanso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descaMNO)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAcciTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acciTno, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAcciTDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descaMNO, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel7.setText("fecha Accidente");

        buttonGroup6.add(chkEnfeProf);
        chkEnfeProf.setText("SI");

        buttonGroup6.add(enferpNO);
        enferpNO.setText("NO");
        enferpNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enferpNOActionPerformed(evt);
            }
        });

        buttonGroup7.add(chkEnfeLabCalif);
        chkEnfeLabCalif.setText("SI");

        buttonGroup7.add(enferNO);
        enferNO.setText("NO");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkEnfeLabCalif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkEnfeProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(enferpNO, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(enferNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEnfeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enferpNO, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEnfeLabCalif, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enferNO, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel22.setText("Especifique");

        jLabel39.setText("<html>Ha sido declarado con alguna enfermedad profesional o relacionada al trabajo <br>Si la Respuesta es SI, responder las líneas inferiores <br>Ha sido evaluado para calificación de enfermedad laboral</html>");

        jLabel23.setText("Especifique cual:");

        jLabel25.setText("Fecha:");

        fechaAcciT.setDateFormatString("dd-MM-yyyy");

        fechaEnfeProf.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaEnfeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23)
                            .addComponent(txtEnfeLabCalifDetall, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAcciDescansoDetall))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(fechaAcciT, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaAcciT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtAcciDescansoDetall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaEnfeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addGap(1, 1, 1)
                                .addComponent(txtEnfeLabCalifDetall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jLabel149.setText("Especifique detalles o tratamiento marcada:");

        jLabel5.setText("Alergias");

        chk1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk1.setPreferredSize(new java.awt.Dimension(21, 14));
        chk1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel17.setText("Asma");

        chk4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk4.setPreferredSize(new java.awt.Dimension(21, 14));
        chk4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel20.setText("Bronquitis a repetición");

        chk7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk7.setPreferredSize(new java.awt.Dimension(21, 14));
        chk7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel24.setText("Diabetes1");

        chk11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk11.setPreferredSize(new java.awt.Dimension(21, 14));
        chk11.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel26.setText("Enfermedades del corazón");

        chk13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk13.setPreferredSize(new java.awt.Dimension(21, 14));
        chk13.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel27.setText("Enf. Oculares");

        chk14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk14.setPreferredSize(new java.awt.Dimension(21, 14));
        chk14.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel28.setText("Epilepsia o convulsiones");

        chk15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk15.setPreferredSize(new java.awt.Dimension(21, 14));
        chk15.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel35.setText("Hepatitis");

        chk25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk25.setPreferredSize(new java.awt.Dimension(21, 14));
        chk25.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk25.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel29.setText("Hernias");

        chk26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk26.setPreferredSize(new java.awt.Dimension(21, 14));
        chk26.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk26.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel53.setText("Hipertención Arterial");

        chk27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk27.setPreferredSize(new java.awt.Dimension(21, 14));
        chk27.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk27.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel58.setText("Traumatismo encefalocraneano");
        jLabel58.setPreferredSize(new java.awt.Dimension(38, 11));

        chk54.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk54.setPreferredSize(new java.awt.Dimension(21, 14));
        chk54.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk54.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel56.setText("Tuberculosis");
        jLabel56.setPreferredSize(new java.awt.Dimension(38, 11));

        chk55.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk55.setPreferredSize(new java.awt.Dimension(21, 14));
        chk55.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk55.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel69.setText("Ulcera péptica");
        jLabel69.setPreferredSize(new java.awt.Dimension(38, 11));

        chk57.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk57.setPreferredSize(new java.awt.Dimension(21, 14));
        chk57.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk57.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel30.setText("IMA (Infarto agudo al miocardio)");

        jLabel31.setText("ACV (Acc. Cerebro Vascular)");

        jLabel32.setText("TBC (Tuberculosis)");

        jLabel33.setText("ETS");

        jLabel34.setText("Discopatías");

        jLabel37.setText("Vértigos");

        jLabel38.setText("Enf Reumática");

        jLabel40.setText("Enf Pulmonares");

        jLabel41.setText("Enf de la Piel ");

        jLabel42.setText("Tendinitis");

        jLabel43.setText("Onicomicosis");

        jLabel44.setText("Tifoidea");

        jLabel45.setText("Neoplasias");

        jLabel46.setText("Quemaduras");

        jLabel47.setText("Fracturas");

        jLabel48.setText("Anemia");

        jLabel49.setText("Obesidad");

        jLabel50.setText("Amputación");

        jLabel51.setText("Sordera");

        jLabel148.setText("Otras Patologias: ");

        txtotrosap.setBackground(new java.awt.Color(153, 204, 255));

        jLabel54.setText("Intoxicaciones");

        jLabel55.setText("Dislipidemia");

        jLabel57.setText("Columna");

        jLabel59.setText("Enf Psiquiátricas ");

        jLabel60.setText("VIH");

        jLabel61.setText("Fobias");

        chkVertigos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkVertigos.setPreferredSize(new java.awt.Dimension(21, 14));
        chkVertigos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkVertigos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkTifoidea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkTifoidea.setPreferredSize(new java.awt.Dimension(21, 14));
        chkTifoidea.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkTifoidea.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkNeoplasias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkNeoplasias.setPreferredSize(new java.awt.Dimension(21, 14));
        chkNeoplasias.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkNeoplasias.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkQuemaduras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkQuemaduras.setPreferredSize(new java.awt.Dimension(21, 14));
        chkQuemaduras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkQuemaduras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkQuemaduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkQuemadurasActionPerformed(evt);
            }
        });

        chkDiscopatias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkDiscopatias.setPreferredSize(new java.awt.Dimension(21, 14));
        chkDiscopatias.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkDiscopatias.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkColumna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkColumna.setPreferredSize(new java.awt.Dimension(21, 14));
        chkColumna.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkColumna.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkEnfReumatica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkEnfReumatica.setPreferredSize(new java.awt.Dimension(21, 14));
        chkEnfReumatica.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkEnfReumatica.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkEnfPulmonares.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkEnfPulmonares.setPreferredSize(new java.awt.Dimension(21, 14));
        chkEnfPulmonares.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkEnfPulmonares.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkEnfPiel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkEnfPiel.setPreferredSize(new java.awt.Dimension(21, 14));
        chkEnfPiel.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkEnfPiel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkTendinitis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkTendinitis.setPreferredSize(new java.awt.Dimension(21, 14));
        chkTendinitis.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkTendinitis.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkOnicomicosis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkOnicomicosis.setPreferredSize(new java.awt.Dimension(21, 14));
        chkOnicomicosis.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkOnicomicosis.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkFracturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkFracturas.setPreferredSize(new java.awt.Dimension(21, 14));
        chkFracturas.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkFracturas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkAnemia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkAnemia.setPreferredSize(new java.awt.Dimension(21, 14));
        chkAnemia.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkAnemia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkObesidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkObesidad.setPreferredSize(new java.awt.Dimension(21, 14));
        chkObesidad.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkObesidad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkSordera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkSordera.setPreferredSize(new java.awt.Dimension(21, 14));
        chkSordera.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkSordera.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkSordera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSorderaActionPerformed(evt);
            }
        });

        chkAmputacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkAmputacion.setPreferredSize(new java.awt.Dimension(21, 14));
        chkAmputacion.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkAmputacion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkIntoxicaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkIntoxicaciones.setPreferredSize(new java.awt.Dimension(21, 14));
        chkIntoxicaciones.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkIntoxicaciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkDislipidemia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkDislipidemia.setPreferredSize(new java.awt.Dimension(21, 14));
        chkDislipidemia.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkDislipidemia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkIMA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkIMA.setPreferredSize(new java.awt.Dimension(21, 14));
        chkIMA.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkACV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkACV.setPreferredSize(new java.awt.Dimension(21, 14));
        chkACV.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkTBC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkTBC.setPreferredSize(new java.awt.Dimension(21, 14));
        chkTBC.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkets.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkets.setPreferredSize(new java.awt.Dimension(21, 14));
        chkets.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkVIH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkVIH.setPreferredSize(new java.awt.Dimension(21, 14));
        chkVIH.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chkFobias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkFobias.setPreferredSize(new java.awt.Dimension(21, 14));
        chkFobias.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel75.setText("Migraña");

        chkmigraña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkmigraña.setPreferredSize(new java.awt.Dimension(21, 14));
        chkmigraña.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkmigraña.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chkmigraña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkmigrañaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(chkACV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chk15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chk14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(chk7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(chk4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(chk11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(chk13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(chkTBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkIMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chkTifoidea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkDiscopatias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkNeoplasias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkQuemaduras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkEnfPsiquiatricas))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(chkEnfReumatica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(chkEnfPulmonares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(chkEnfPiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chkIntoxicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkTendinitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkOnicomicosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkFracturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkAnemia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkObesidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkAmputacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkDislipidemia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkSordera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkmigraña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(chkVertigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(84, 84, 84)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chkVIH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkFobias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtotrosap, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chk4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chk7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chk11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chk13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chk25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chk26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chk27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chk54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chk55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(chk57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chk14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkVertigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(chkIMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(chkACV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(chkTBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkNeoplasias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chkDiscopatias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(chkQuemaduras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(chkTifoidea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chkVIH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkFobias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(chkEnfReumatica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(chkEnfPulmonares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(chkEnfPiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(chkTendinitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(chkOnicomicosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(chkFracturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chkAnemia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkObesidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkDislipidemia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIntoxicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkAmputacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkEnfPsiquiatricas)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtotrosap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel148)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(chkSordera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkmigraña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel150)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(chkAlergiasMedicAlim)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rdbAlergiasNO)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel151))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAlergiasMedicAlimDetall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(524, 524, 524)
                                        .addComponent(jLabel36))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel149)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEspecifiqueDetalleEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel149)
                    .addComponent(txtEspecifiqueDetalleEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel150)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkAlergiasMedicAlim)
                        .addComponent(rdbAlergiasNO)
                        .addComponent(jLabel151)
                        .addComponent(txtAlergiasMedicAlimDetall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setText("1.- ANTECEDENTES PATOLÓGICOS PERSONALES");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jtAntecedentes.addTab("Antecedentes Patológicos", jPanel3);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hábitos Nocivos"));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Tabaco");

        bgFumar.add(rbFumarSI);
        rbFumarSI.setText("SI");
        rbFumarSI.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbFumarSIStateChanged(evt);
            }
        });
        rbFumarSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFumarSIActionPerformed(evt);
            }
        });

        bgFumar.add(rbFumarNO);
        rbFumarNO.setText("NO");
        rbFumarNO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbFumarNOStateChanged(evt);
            }
        });
        rbFumarNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFumarNOActionPerformed(evt);
            }
        });

        jLabel16.setText("Número de cigarrilos :");

        txtNcigarrillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNcigarrillosActionPerformed(evt);
            }
        });

        chkCigarrillos.setText("CIGARRILLOS X MES");
        chkCigarrillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCigarrillosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(rbFumarSI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFumarNO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCigarrillos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNcigarrillos, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(chkCigarrillos, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbFumarSI)
                    .addComponent(rbFumarNO)
                    .addComponent(jLabel16)
                    .addComponent(txtNcigarrillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel103.setText("Alcohol");

        bgLicor.add(rbLicorSI);
        rbLicorSI.setText("SI");
        rbLicorSI.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbLicorSIStateChanged(evt);
            }
        });

        bgLicor.add(rbLicorNO);
        rbLicorNO.setText("NO");
        rbLicorNO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbLicorNOStateChanged(evt);
            }
        });

        jLabel104.setText("Tipo más frecuente :");

        jLabel105.setText("Frecuencia :");

        chkWiscky.setText("WISCKY");
        chkWiscky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkWisckyActionPerformed(evt);
            }
        });

        chkVino.setText("VINO");
        chkVino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVinoActionPerformed(evt);
            }
        });

        chkCerveza.setText("CERVEZA");
        chkCerveza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCervezaActionPerformed(evt);
            }
        });

        chkRon.setText("RON");
        chkRon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRonActionPerformed(evt);
            }
        });

        chkLicFrecuencia.setText("1 VEZ X MES");
        chkLicFrecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLicFrecuenciaActionPerformed(evt);
            }
        });

        txtLicorTipoFrecuente.setColumns(20);
        txtLicorTipoFrecuente.setRows(5);
        jScrollPane4.setViewportView(txtLicorTipoFrecuente);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(chkLicFrecuencia)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLicorFrecuencia))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addGap(103, 103, 103)
                                .addComponent(chkRon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkCerveza)
                                .addGap(5, 5, 5)
                                .addComponent(chkVino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkWiscky))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(rbLicorSI)
                                .addGap(18, 18, 18)
                                .addComponent(rbLicorNO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkWiscky, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkVino, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkRon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbLicorSI)
                        .addComponent(rbLicorNO)
                        .addComponent(jLabel104))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkLicFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105)
                    .addComponent(txtLicorFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel106.setText("Drogas");

        bgDrogras.add(rbDrogasSI);
        rbDrogasSI.setText("SI");
        rbDrogasSI.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbDrogasSIStateChanged(evt);
            }
        });

        bgDrogras.add(rbDrogasNO);
        rbDrogasNO.setText("NO");
        rbDrogasNO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbDrogasNOStateChanged(evt);
            }
        });

        jLabel107.setText("Tipo probado o que usa :");

        jLabel108.setText("Frecuencia :");

        txtDrogasFrecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrogasFrecuenciaActionPerformed(evt);
            }
        });

        chkDrogas.setText("CHACCHA HOJA DE COCA");
        chkDrogas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDrogasActionPerformed(evt);
            }
        });

        chkFreDrog.setText("15 DIAS X MES");
        chkFreDrog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFreDrogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbDrogasSI)
                        .addGap(18, 18, 18)
                        .addComponent(rbDrogasNO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel107))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(chkFreDrog)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel108)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkDrogas)
                    .addComponent(txtDrogasTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(txtDrogasFrecuencia))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(chkDrogas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(rbDrogasSI)
                    .addComponent(rbDrogasNO)
                    .addComponent(jLabel107)
                    .addComponent(txtDrogasTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkFreDrog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDrogasFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel108)))
                .addGap(13, 13, 13))
        );

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/siguiente.png"))); // NOI18N
        btnNext.setText("Click aquí para continuar");
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });

        txtCocaina.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtMarihuana.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel12.setText("COCAINA:");

        jLabel141.setText("MARIHUANA:");

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel145.setText("Otros : ");

        buttonGroup2.add(rbOtrossi);
        rbOtrossi.setText("SI");
        rbOtrossi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbOtrossiStateChanged(evt);
            }
        });
        rbOtrossi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOtrossiActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbOtrosno);
        rbOtrosno.setText("NO");
        rbOtrosno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbOtrosnoStateChanged(evt);
            }
        });
        rbOtrosno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOtrosnoActionPerformed(evt);
            }
        });

        jLabel146.setText("Tipo mas frecuente : ");

        jLabel147.setText("Frecuencia : ");

        txtotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtotrosfrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOtrossi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOtrosno))
                    .addComponent(jLabel146)
                    .addComponent(jLabel147)
                    .addComponent(txtotros, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145)
                    .addComponent(rbOtrossi)
                    .addComponent(rbOtrosno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel146)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtotros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel147)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtotrosfrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel9.setText("Medicamentos:");

        jLabel14.setText("Actividad Física:  ");

        buttonGroup8.add(chkMedicamento);
        chkMedicamento.setText("SI");
        chkMedicamento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkMedicamentoStateChanged(evt);
            }
        });

        buttonGroup8.add(medicno);
        medicno.setText("NO");
        medicno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                medicnoStateChanged(evt);
            }
        });
        medicno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicnoActionPerformed(evt);
            }
        });

        buttonGroup9.add(chkActivFisic);
        chkActivFisic.setText("SI");
        chkActivFisic.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkActivFisicStateChanged(evt);
            }
        });

        buttonGroup9.add(activifisicano);
        activifisicano.setText("NO");
        activifisicano.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                activifisicanoStateChanged(evt);
            }
        });
        activifisicano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activifisicanoActionPerformed(evt);
            }
        });

        jLabel15.setText("Especifique:");

        jLabel18.setText("Especifique:");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(chkMedicamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(medicno))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(chkActivFisic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(activifisicano))))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActivFisicDetall, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedicamentoDetall, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(chkMedicamento)
                    .addComponent(medicno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtMedicamentoDetall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(chkActivFisic)
                    .addComponent(activifisicano))
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtActivFisicDetall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(jLabel141)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtMarihuana))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCocaina, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCocaina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarihuana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel141)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("ANTECEDENTES IMNUNOLÓGICOS / VACUNAS:"));

        chkCovid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkCovid.setPreferredSize(new java.awt.Dimension(21, 14));
        chkCovid.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel142.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel142.setText("COVID 19");

        txtDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDosisActionPerformed(evt);
            }
        });

        jLabel152.setText("N°");

        jLabel153.setText("Dosis");

        jLabel154.setText("Neumococo");

        jLabel155.setText("Rabia");
        jLabel155.setPreferredSize(new java.awt.Dimension(38, 11));

        chkRabia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRabiaActionPerformed(evt);
            }
        });

        jLabel156.setText("Papiloma Humano");
        jLabel156.setPreferredSize(new java.awt.Dimension(38, 11));

        chkPapilomaHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPapilomaHumanoActionPerformed(evt);
            }
        });

        jLabel157.setText("Hepatitis A");

        jLabel158.setText("Hepatitis B");
        jLabel158.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel159.setText("Gripe/Influenza");
        jLabel159.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel160.setText("Antitetánica");

        jLabel161.setText("Fiebre Amarilla");
        jLabel161.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel162.setText("Influenza");
        jLabel162.setPreferredSize(new java.awt.Dimension(38, 11));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkHepatitisB)
                            .addComponent(chkHepatitisA)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 83, Short.MAX_VALUE))
                            .addComponent(jLabel160, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAntitetanica)
                            .addComponent(chkFiebreAmarilla)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkInfluenza)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel156, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(chkRabia))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkCovid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkPapilomaHumano))))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkGripeInfluenza)
                            .addComponent(chkNeumococo))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jLabel152)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel153)
                .addGap(0, 248, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(chkAntitetanica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkFiebreAmarilla, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkGripeInfluenza)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(chkNeumococo))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chkRabia))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkPapilomaHumano)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chkCovid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                            .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chkInfluenza))
                            .addGap(1, 1, 1)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkHepatitisA)
                                .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chkHepatitisB)))
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel152)
                            .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel153))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtAntecedentes.addTab("Indicar las Enfermedades", jPanel2);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Antecedentes Quirúrgicos"));

        jLabel109.setText("Fecha");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tbQuirurgicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbQuirurgicos);

        jLabel111.setText("Operación");

        jLabel110.setText("Hospital (Nombre - Lugar) Operación");

        txtdiasHospitalizacionQui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiasHospitalizacionQuiKeyTyped(evt);
            }
        });

        jLabel113.setText("Complicaciones");

        jLabel112.setText("Días Hospitalización");

        btnQui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnQui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel109)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel110)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(FechaQui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHospitalQui, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel111)
                            .addComponent(txtOperacionQui))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtdiasHospitalizacionQui, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel112)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel113)
                            .addComponent(txtComplicacionesQui, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnQui))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(jLabel110))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtOperacionQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQui)
                            .addComponent(txtdiasHospitalizacionQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)
                            .addComponent(txtHospitalQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtComplicacionesQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel113)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel111)
                                .addComponent(jLabel112)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jLabel123.setText("Padre Especifique:");

        jLabel124.setText("Madre Especifique:");

        jLabel125.setText("Hermanos Especifique:");

        jLabel126.setText("Hijos Especifique:");

        jLabel143.setText("Esposa/ Cónyuge Especifique:");

        txtEsposConyDetall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEsposConyDetallActionPerformed(evt);
            }
        });

        txtConadisDetalle.setColumns(20);
        txtConadisDetalle.setRows(5);
        jScrollPane3.setViewportView(txtConadisDetalle);

        jLabel115.setText("Si posee Carné de CONADIS, especifique:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel143)
                    .addComponent(jLabel126)
                    .addComponent(jLabel125)
                    .addComponent(jLabel124)
                    .addComponent(jLabel123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMadreDetall, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPadreDetall, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHermanosDetall, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHijosDetall, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEsposConyDetall, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel115)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(txtPadreDetall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel124)
                    .addComponent(txtMadreDetall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(txtHermanosDetall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(txtHijosDetall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel143)
                    .addComponent(txtEsposConyDetall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtReproduccion.addTab("ANTECEDENTES PATOLOGÍCOS FAMILIARES:", jPanel14);

        jLabel122.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel114.setText("Médico :");

        txtMedico.setEditable(false);

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnGrabar.setText("Agregar/Actualizar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        txtLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        txtLimpiar.setText("Limpiar");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Impirmir N° Orden"));

        txtImp.setBackground(new java.awt.Color(255, 153, 0));
        txtImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpActionPerformed(evt);
            }
        });
        txtImp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpKeyTyped(evt);
            }
        });

        btnIMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnIMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122)
                    .addComponent(jtReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel114)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabar)
                    .addComponent(txtLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtAntecedentes.addTab("Antecedentes", jPanel11);

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.setPreferredSize(new java.awt.Dimension(189, 334));

        jLabel101.setText("V.C. :");

        txtCercaSinCorregirOD.setMaximumSize(new java.awt.Dimension(150, 25));
        txtCercaSinCorregirOD.setPreferredSize(new java.awt.Dimension(150, 25));
        txtCercaSinCorregirOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaSinCorregirODActionPerformed(evt);
            }
        });

        jLabel102.setText("V.L.:");

        jLabel131.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel131.setText("Sin Corregir");

        txtCercaSinCorregirOI.setMaximumSize(new java.awt.Dimension(150, 25));
        txtCercaSinCorregirOI.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel133.setText("O.D");

        jLabel134.setText("O.I");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel102)
                    .addComponent(jLabel101))
                .addGap(6, 6, 6)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel131)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLejosSinCorregirOD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel133)
                                .addGap(13, 13, 13))
                            .addComponent(txtCercaSinCorregirOD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel134))
                            .addComponent(txtCercaSinCorregirOI, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLejosSinCorregirOI, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel131)
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(jLabel134))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCercaSinCorregirOD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101)
                    .addComponent(txtCercaSinCorregirOI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLejosSinCorregirOD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102)
                    .addComponent(txtLejosSinCorregirOI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel138.setText("Enfermedades Oculares :");

        jLabel137.setText("R. P. :");

        jLabel130.setText("V.B.:");

        jLabel129.setText("V.Clrs :");

        jLabel140.setText("V.L.:");

        jLabel139.setText("V.C. :");

        txtCercaCorregidaOD.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCercaCorregidaOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaCorregidaODActionPerformed(evt);
            }
        });

        txtCercaCorregidaOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaCorregidaOIActionPerformed(evt);
            }
        });

        jLabel136.setText("O.D");

        jLabel135.setText("O.I");

        jLabel132.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel132.setText("Corregida");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnfermedadesOculares, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel130)
                                .addComponent(jLabel129)
                                .addComponent(jLabel137)
                                .addComponent(jLabel139))
                            .addComponent(jLabel140))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReflejosPupilares, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVisionBinocular, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVisionColores, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel132)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel136)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel135))))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLejosCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCercaCorregidaOD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLejosCorregidaOI)
                                    .addComponent(txtCercaCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel132)
                .addGap(2, 2, 2)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCercaCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel139))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtLejosCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel140)))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(txtCercaCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLejosCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel136)
                            .addComponent(jLabel135))
                        .addGap(48, 48, 48)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(txtVisionColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130)
                    .addComponent(txtVisionBinocular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137)
                    .addComponent(txtReflejosPupilares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel138)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnfermedadesOculares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtAntecedentes, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        jtAntecedentes.setSelectedIndex(2);
    }//GEN-LAST:event_btnNextMouseClicked

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
    String nro = txtNorden.getText().trim();
    if (nro.isEmpty()) {
        oFunc.SubSistemaMensajeInformacion("Ingrese N° Orden");
        return;
    }

    if (OrdenExiste()) {
        oFunc.SubSistemaMensajeError("La orden " + nro + " ya tiene antecedentes cargados.");
        return;
    }

    String sql =
        "SELECT d.nombres_pa || ' ' || d.apellidos_pa AS nombrecompleto, " +
        "       d.sexo_pa, " +
        "       d.fecha_nacimiento_pa, " +
        "       l.txtcocaina, " +
        "       l.txtmarihuana " +
        "FROM datos_paciente d " +
        "JOIN n_orden_ocupacional n ON d.cod_pa = n.cod_pa " +
        "LEFT JOIN lab_clinico      l ON n.n_orden = l.n_orden " +
        "WHERE n.n_orden = '" + nro + "'";

    oConn.FnBoolQueryExecute(sql);

    try {
        if (!oConn.setResult.next()) {
            oFunc.SubSistemaMensajeError(
                "No se encuentra registro para la orden " + nro +
                "\n1- Intente de nuevo\n2- Si el error persiste, registre al paciente o abra la ex-preocupacional"
            );
            return;
        }


        nombrecompleto.setText(oConn.setResult.getString("nombrecompleto"));
        String sexo = oConn.setResult.getString("sexo_pa");
        txtSexo.setText("M".equalsIgnoreCase(sexo) ? "MASCULINO" : "FEMENINO");

        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
        txtEdad.setText(oFunc.calcularEdad(FechaNacimiento.getCalendar()) + " AÑOS");

        txtCocaina.setText(oConn.setResult.getString("txtcocaina"));
        txtMarihuana.setText(oConn.setResult.getString("txtmarihuana"));

        txtNorden.setEditable(false);

        oPe.fecha(FechaPatologicos);
        muestraVisual();
        Oftalmologia();
        

    } catch (SQLException ex) {
        oFunc.SubSistemaMensajeInformacion("Antecedentes Patológicos: " + ex.getMessage());
    } finally {
        try {
            oConn.sqlStmt.close();
        } catch (SQLException ignore) {}
    }
    }//GEN-LAST:event_txtNordenActionPerformed
    
     
     
     
     
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       AddAP();
       FechaQui.setText(null);
       txtHospitalQui.setText(null);
       txtOperacionQui.setText(null);
       txtdiasHospitalizacionQui.setText(null);
       txtComplicacionesQui.setText(null);
       FechaQui.requestFocusInWindow();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtdiasHospitalizacionQuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiasHospitalizacionQuiKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtdiasHospitalizacionQuiKeyTyped

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenKeyTyped

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_txtLimpiarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if(OrdenExiste() ){
            try {
                System.out.println("ACTUALIZAR");
                Actualizar();
            } catch (IOException ex) {
                Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            if(!txtNorden.getText().isEmpty()){
              if(!OrdenExiste()){
                 if(validar()){ 
                try {
                        if(GrabarAPInfo()){
                           if(tbQuirurgicos.getRowCount()>0 ){
                               if(GrabarAPDetalle()){
                                imp();  
                                limpiar();
                               }
                           }else{
                           imp();
                           limpiar();
                           }
                               
                           oFunc.SubSistemaMensajeInformacion("Se Registro Correctamente");
                       }
                    } catch (SQLException ex) {
                Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
                }    catch (IOException ex) {
                         Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }  
            }   
         }
        }
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void rbFumarSIStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbFumarSIStateChanged
        if(rbFumarSI.isSelected()){
        txtNcigarrillos.setEditable(true);}
    }//GEN-LAST:event_rbFumarSIStateChanged

    private void rbFumarNOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbFumarNOStateChanged
        if(rbFumarNO.isSelected()){
            txtNcigarrillos.setText(null);
        txtNcigarrillos.setEditable(false);
        }
    }//GEN-LAST:event_rbFumarNOStateChanged

    private void rbLicorSIStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbLicorSIStateChanged
        if(rbLicorSI.isSelected()){
        txtLicorTipoFrecuente.setEditable(true);
        txtLicorFrecuencia.setEditable(true);
        }
    }//GEN-LAST:event_rbLicorSIStateChanged

    private void rbLicorNOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbLicorNOStateChanged
        if(rbLicorNO.isSelected()){
           txtLicorFrecuencia.setText(null);
           txtLicorTipoFrecuente.setText(null);
          txtLicorTipoFrecuente.setEditable(false);
        txtLicorFrecuencia.setEditable(false);
        }
    }//GEN-LAST:event_rbLicorNOStateChanged

    private void rbDrogasSIStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbDrogasSIStateChanged
        if(rbDrogasSI.isSelected()){
        txtDrogasTipo.setEditable(true);
        txtDrogasFrecuencia.setEditable(true);
        }
    }//GEN-LAST:event_rbDrogasSIStateChanged

    private void rbDrogasNOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbDrogasNOStateChanged
        if(rbDrogasNO.isSelected()){
            txtDrogasTipo.setText(null);
            txtDrogasFrecuencia.setText(null);
        txtDrogasTipo.setEditable(false);
        txtDrogasFrecuencia.setEditable(false);
        }
    }//GEN-LAST:event_rbDrogasNOStateChanged

    private void btnQuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuiMouseClicked
       Qui();
       String sql = "DELETE FROM antecedentes_patologicos_quirurgicos"
               + " WHERE cod_ap ='" +num+ "' RETURNING cod_ap";
        if (oConn.FnBoolQueryExecute(sql)) {
           try {
               oFunc.SubSistemaMensajeInformacion("Se ha se elimino la Entrada con Éxito");
               oConn.setResult.close();
           } catch (SQLException ex) {
               Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
           }
        } else {
            oFunc.SubSistemaMensajeError("No se pudo eliminar");
        }
       try {
           oConn.sqlStmt.close();
       } catch (SQLException ex) {
           Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnQuiMouseClicked

    private void btnIMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPActionPerformed
       try {     
           ReImp();
       } catch (IOException ex) {
           Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
       }
             
    }//GEN-LAST:event_btnIMPActionPerformed

    private void txtImpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpKeyTyped
       oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtImpKeyTyped

    private void txtImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpActionPerformed
       try {
           ReImp();
       } catch (IOException ex) {
           Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_txtImpActionPerformed

    private void chkCigarrillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCigarrillosActionPerformed
       if(chkCigarrillos.isSelected()){
           txtNcigarrillos.setText(" CIGARRILLOS X MES.");
       }
    }//GEN-LAST:event_chkCigarrillosActionPerformed

    private void chkRonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRonActionPerformed
        if(chkRon.isSelected()){
            txtLicorTipoFrecuente.append("RON, ");
        }
    }//GEN-LAST:event_chkRonActionPerformed

    private void chkCervezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCervezaActionPerformed
        if(chkCerveza.isSelected()){
            txtLicorTipoFrecuente.append(", CERVEZA. ");
        }
    }//GEN-LAST:event_chkCervezaActionPerformed

    private void chkVinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVinoActionPerformed
        if(chkVino.isSelected()){
            txtLicorTipoFrecuente.append(", VINO. ");
        }
    }//GEN-LAST:event_chkVinoActionPerformed

    private void chkWisckyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkWisckyActionPerformed
       if(chkWiscky.isSelected()){
            txtLicorTipoFrecuente.append(", WISCKY. ");
        }
    }//GEN-LAST:event_chkWisckyActionPerformed

    private void chkDrogasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDrogasActionPerformed
        if(chkDrogas.isSelected()){
            txtDrogasTipo.setText("CHACCHA HOJA DE COCA.");
        }
    }//GEN-LAST:event_chkDrogasActionPerformed

    private void chkFreDrogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFreDrogActionPerformed
        if(chkFreDrog.isSelected()){
            txtDrogasFrecuencia.setText("15 DIAS X MES. ");
        }
    }//GEN-LAST:event_chkFreDrogActionPerformed

    private void chkLicFrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLicFrecuenciaActionPerformed
        if(chkLicFrecuencia.isSelected()){
            txtLicorFrecuencia.setText("1 VEZ X MES");
        }
    }//GEN-LAST:event_chkLicFrecuenciaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
   if (txtNorden.getText().trim().isEmpty()) {
        oFunc.SubSistemaMensajeInformacion("Ingrese N° Orden");
        return;
    }

    // 2) SELECT que une datos_paciente, n_orden_ocupacional, antecedentes_patologicos y lab_clinico
    String sql = 
      "SELECT " +
      "  d.nombres_pa || ' ' || d.apellidos_pa AS nombrecompleto, " +
      "  d.sexo_pa, " +
      "  d.fecha_nacimiento_pa, " +
      "  l.txtcocaina, " +
      "  l.txtmarihuana, " +
      "  a.cod_ap, " +
      "  a.fecha_ap,a.edad_ap ," +
      // — todos los chk?… —
      "  a.chk1, a.chk4, a.chk7, a.chk11, a.chk13, " +
      "  a.chk14, a.chk15, a.chk25, a.chk26, a.chk27, a.chk54, a.chk55, a.chk57, " +
      "  a.rbdrogasno, a.rbdrogassi, a.rblicorno, a.rblicorsi, a.rbfumarno, a.rbfumarsi, a.rbotrossi,a.rbotrosno, a.migrana, " +
      "  a.chkcovid, a.txtdosis, " +
      // — condiciones médicas —
      "  a.ima, a.acv, a.tbc, a.vih, a.fobias, a.ets, a.vertigos, a.tifoidea, a.neoplasias, " +
      "  a.quemaduras, a.discopatias, a.columna, a.enf_psiquiatricas, a.enf_reumatica, " +
      "  a.enf_pulmonares, a.enf_piel, a.tendinitis, a.onicomicosis, a.fracturas, " +
      "  a.anemia, a.obesidad, a.dislipidemia, a.intoxicaciones, a.amputacion, a.sordera, " +
      // — detalles y alergias —
      "  a.especifique_detalleenfermedades, a.alergias_medic_alim, a.alergias_medic_alimdetall, " +
      // — accidentes de trabajo —
      "  a.accitrabajo, a.accit_fecha, a.accit_descanso, a.accit_descanso_detal, " +
      // — enfermedad profesional —
      "  a.enfe_prof, a.enfe_profecha, a.enfe_lab_calif, a.enfe_lab_califdetal, " +
      // — vacunas —
      "  a.antitetanica, a.fiebre_amarilla, a.influenza, a.hepatitisa, a.hepatitisb, " +
      "  a.gripe_influenza, a.neumococo, a.rabia, a.papiloma_humano, " +
  
      "  a.medicamento, a.medicamento_detal, a.activ_fisic, a.activ_fisic_detal, " +
      "  a.padre_detall, a.madre_detall, a.hermanos_detall, a.hijos_detall, a.espos_cony_detall, a.conadisdetalle, " +
   
      "  a.txtotros, a.txtotrosfrecuencia, a.txtotrosap " +
      "FROM datos_paciente AS d, n_orden_ocupacional AS n " +
      "  INNER JOIN antecedentes_patologicos AS a ON n.n_orden = a.n_orden " +
      "  LEFT  JOIN lab_clinico          AS l ON n.n_orden = l.n_orden " +
      "WHERE d.cod_pa = n.cod_pa " +
      "  AND n.n_orden = '" + txtNorden.getText().trim() + "'";
    System.out.println(sql);
    try {
      // 3) Ejecuta y carga
      oConn.FnBoolQueryExecute(sql);
      if (oConn.setResult.next()) {
        // ─── Datos Paciente ───
        nombrecompleto.setText(oConn.setResult.getString("nombrecompleto"));
        txtSexo.setText(oConn.setResult.getString("sexo_pa"));
        java.sql.Date dNac = oConn.setResult.getDate("fecha_nacimiento_pa");
        if (dNac != null) {
          FechaNacimiento.setDate(new java.util.Date(dNac.getTime()));
        }
        txtCocaina.setText(oConn.setResult.getString("txtcocaina"));
        txtMarihuana.setText(oConn.setResult.getString("txtmarihuana"));

        // ─── Antecedentes Ocupacionales ───
        // Guarda cod_ap si lo necesitas
        num = oConn.setResult.getInt("cod_ap");

        FechaPatologicos.setDate(oConn.setResult.getDate("fecha_ap"));
        txtEdad.setText(oConn.setResult.getString("edad_ap"));

        // Checkboxes principales
        chk1.setSelected(oConn.setResult.getBoolean("chk1"));
        chk4.setSelected(oConn.setResult.getBoolean("chk4"));
        chk7.setSelected(oConn.setResult.getBoolean("chk7"));
        chk11.setSelected(oConn.setResult.getBoolean("chk11"));
        chk13.setSelected(oConn.setResult.getBoolean("chk13"));
        chk14.setSelected(oConn.setResult.getBoolean("chk14"));
        chk15.setSelected(oConn.setResult.getBoolean("chk15"));
        chk25.setSelected(oConn.setResult.getBoolean("chk25"));
        chk26.setSelected(oConn.setResult.getBoolean("chk26"));
        chk27.setSelected(oConn.setResult.getBoolean("chk27"));
        chk54.setSelected(oConn.setResult.getBoolean("chk54"));
        chk55.setSelected(oConn.setResult.getBoolean("chk55"));
        chk57.setSelected(oConn.setResult.getBoolean("chk57"));

        // Drogas/Licor/Fumar/Migraña
        rbDrogasNO .setSelected(oConn.setResult.getBoolean("rbdrogasno"));
        rbDrogasSI .setSelected(oConn.setResult.getBoolean("rbdrogassi"));
        rbLicorNO  .setSelected(oConn.setResult.getBoolean("rblicorno"));
        rbLicorSI  .setSelected(oConn.setResult.getBoolean("rblicorsi"));
        rbFumarNO  .setSelected(oConn.setResult.getBoolean("rbfumarno"));
        rbFumarSI  .setSelected(oConn.setResult.getBoolean("rbfumarsi"));
        rbOtrossi  .setSelected(oConn.setResult.getBoolean("rbotrossi"));
        rbOtrosno  .setSelected(oConn.setResult.getBoolean("rbotrosno"));
        chkmigraña .setSelected(oConn.setResult.getBoolean("migrana"));

        // Covid y dosis
        chkCovid.setSelected(oConn.setResult.getBoolean("chkcovid"));
        txtDosis.setText(oConn.setResult.getString("txtdosis"));

        // Condiciones médicas
        chkIMA.setSelected(oConn.setResult.getBoolean("ima"));
        chkACV.setSelected(oConn.setResult.getBoolean("acv"));
        chkTBC.setSelected(oConn.setResult.getBoolean("tbc"));
        chkVIH.setSelected(oConn.setResult.getBoolean("vih"));
        chkFobias.setSelected(oConn.setResult.getBoolean("fobias"));
        chkets.setSelected(oConn.setResult.getBoolean("ets"));
        chkVertigos.setSelected(oConn.setResult.getBoolean("vertigos"));
        chkTifoidea.setSelected(oConn.setResult.getBoolean("tifoidea"));
        chkNeoplasias.setSelected(oConn.setResult.getBoolean("neoplasias"));
        chkQuemaduras.setSelected(oConn.setResult.getBoolean("quemaduras"));
        chkDiscopatias.setSelected(oConn.setResult.getBoolean("discopatias"));
        chkColumna.setSelected(oConn.setResult.getBoolean("columna"));
        chkEnfPsiquiatricas.setSelected(oConn.setResult.getBoolean("enf_psiquiatricas"));
        chkEnfReumatica.setSelected(oConn.setResult.getBoolean("enf_reumatica"));
        chkEnfPulmonares.setSelected(oConn.setResult.getBoolean("enf_pulmonares"));
        chkEnfPiel.setSelected(oConn.setResult.getBoolean("enf_piel"));
        chkTendinitis.setSelected(oConn.setResult.getBoolean("tendinitis"));
        chkOnicomicosis.setSelected(oConn.setResult.getBoolean("onicomicosis"));
        chkFracturas.setSelected(oConn.setResult.getBoolean("fracturas"));
        chkAnemia.setSelected(oConn.setResult.getBoolean("anemia"));
        chkObesidad.setSelected(oConn.setResult.getBoolean("obesidad"));
        chkDislipidemia.setSelected(oConn.setResult.getBoolean("dislipidemia"));
        chkIntoxicaciones.setSelected(oConn.setResult.getBoolean("intoxicaciones"));
        chkAmputacion.setSelected(oConn.setResult.getBoolean("amputacion"));
        chkSordera.setSelected(oConn.setResult.getBoolean("sordera"));

        // Detalles y alergias
        txtEspecifiqueDetalleEnfermedades.setText(
            oConn.setResult.getString("especifique_detalleenfermedades"));
        if(oConn.setResult.getBoolean("alergias_medic_alim"))
        chkAlergiasMedicAlim.setSelected(true);
        else
        rdbAlergiasNO.setSelected(true);
        
        txtAlergiasMedicAlimDetall.setText(
            oConn.setResult.getString("alergias_medic_alimdetall"));

        // Accidentes de trabajo
        if(oConn.setResult.getBoolean("accitrabajo"))
        chkAcciTrabajo.setSelected(true);
        else 
        acciTno.setSelected(true); 
        
        java.sql.Date dAcc = oConn.setResult.getDate("accit_fecha");
        if (dAcc != null) {
          fechaAcciT.setDate(new java.util.Date(dAcc.getTime()));
        }
        if(oConn.setResult.getBoolean("accit_descanso"))
        chkAcciTDescanso.setSelected(true);
        else descaMNO.setSelected(true);
        txtAcciDescansoDetall.setText(
            oConn.setResult.getString("accit_descanso_detal"));

        // Enfermedad profesional
        if(oConn.setResult.getBoolean("enfe_prof"))
        chkEnfeProf.setSelected(true);
        else enferpNO.setSelected(true);
        
        java.sql.Date dEnf = oConn.setResult.getDate("enfe_profecha");
        if (dEnf != null) {
          fechaEnfeProf.setDate(new java.util.Date(dEnf.getTime()));
        }
        if(oConn.setResult.getBoolean("enfe_lab_calif"))
        chkEnfeLabCalif.setSelected(true);
        else   enferNO.setSelected(true);
        txtEnfeLabCalifDetall.setText(
            oConn.setResult.getString("enfe_lab_califdetal"));

        // Vacunas
        chkAntitetanica .setSelected(oConn.setResult.getBoolean("antitetanica"));
        chkFiebreAmarilla.setSelected(oConn.setResult.getBoolean("fiebre_amarilla"));
        chkInfluenza     .setSelected(oConn.setResult.getBoolean("influenza"));
        chkHepatitisA    .setSelected(oConn.setResult.getBoolean("hepatitisa"));
        chkHepatitisB    .setSelected(oConn.setResult.getBoolean("hepatitisb"));
        chkGripeInfluenza.setSelected(oConn.setResult.getBoolean("gripe_influenza"));
        chkNeumococo     .setSelected(oConn.setResult.getBoolean("neumococo"));
        chkRabia         .setSelected(oConn.setResult.getBoolean("rabia"));
        chkPapilomaHumano.setSelected(oConn.setResult.getBoolean("papiloma_humano"));

        // Medicamentos actuales
        if(oConn.setResult.getBoolean("medicamento"))
        chkMedicamento.setSelected(true);
        else medicno.setSelected(true);
        
        
        txtMedicamentoDetall .setText   (oConn.setResult.getString("medicamento_detal"));

        // Actividad física
        if(oConn.setResult.getBoolean("activ_fisic"))
        chkActivFisic.setSelected(true);
        else  activifisicano.setSelected(true);
        txtActivFisicDetall  .setText   (oConn.setResult.getString("activ_fisic_detal"));

        // Datos familiares
        txtPadreDetall       .setText   (oConn.setResult.getString("padre_detall"));
        txtMadreDetall       .setText   (oConn.setResult.getString("madre_detall"));
        txtHermanosDetall    .setText   (oConn.setResult.getString("hermanos_detall"));
        txtHijosDetall       .setText   (oConn.setResult.getString("hijos_detall"));
        txtEsposConyDetall   .setText   (oConn.setResult.getString("espos_cony_detall"));
        txtConadisDetalle    .setText   (oConn.setResult.getString("conadisdetalle"));

        // Otros textos
        txtotros             .setText   (oConn.setResult.getString("txtotros"));
        txtotrosfrecuencia   .setText   (oConn.setResult.getString("txtotrosfrecuencia"));
        chkmigraña           .setSelected(oConn.setResult.getBoolean("migrana"));
        txtotrosap           .setText   (oConn.setResult.getString("txtotrosap"));

        // Carga extra de detalles si lo necesitas
        detalleantecedentes();
        muestraVisual();
        Oftalmologia();
        
      } else {
        oFunc.SubSistemaMensajeError(
          "No se encontró ningún registro para la orden " + txtNorden.getText());
      }
    }
    catch (SQLException ex) {
      oFunc.SubSistemaMensajeInformacion(
        "Error al cargar edición: " + ex.getMessage());
    }
    finally {
      try { oConn.setResult.close(); } catch (Exception ignore) {}
      try { oConn.sqlStmt.close();    } catch (Exception ignore) {}
    }
   

    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
      //  cerrarVentana();    // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void rbOtrossiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOtrossiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOtrossiActionPerformed

    private void txtDrogasFrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrogasFrecuenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrogasFrecuenciaActionPerformed

    private void rbFumarNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFumarNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFumarNOActionPerformed

    private void rbFumarSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFumarSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFumarSIActionPerformed

    private void txtotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotrosActionPerformed

    private void rbOtrossiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbOtrossiStateChanged
     if(rbOtrossi.isSelected()){
        txtotros.setEditable(true);
        txtotrosfrecuencia.setEditable(true);
     }
    }//GEN-LAST:event_rbOtrossiStateChanged

    private void rbOtrosnoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbOtrosnoStateChanged
     if(rbOtrosno.isSelected()){
        txtotros.setText(null);
        txtotros.setEditable(false);
        txtotrosfrecuencia.setText(null);          
        txtotrosfrecuencia.setEditable(false);
        
        }
    }//GEN-LAST:event_rbOtrosnoStateChanged

    private void rbOtrosnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOtrosnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOtrosnoActionPerformed

    private void txtCercaCorregidaODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaCorregidaODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCercaCorregidaODActionPerformed

    private void txtCercaSinCorregirODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaSinCorregirODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCercaSinCorregirODActionPerformed

    private void txtCercaCorregidaOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaCorregidaOIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCercaCorregidaOIActionPerformed

    private void chkRabiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRabiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRabiaActionPerformed

    private void txtDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDosisActionPerformed

    private void enferpNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enferpNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enferpNOActionPerformed

    private void descaMNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descaMNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descaMNOActionPerformed

    private void chkPapilomaHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPapilomaHumanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPapilomaHumanoActionPerformed

    private void txtEsposConyDetallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEsposConyDetallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEsposConyDetallActionPerformed

    private void chkQuemadurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkQuemadurasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkQuemadurasActionPerformed

    private void chkSorderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSorderaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSorderaActionPerformed

    private void chkmigrañaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkmigrañaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkmigrañaActionPerformed

    private void txtNcigarrillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNcigarrillosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNcigarrillosActionPerformed

    private void medicnoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_medicnoStateChanged
       
        if(medicno.isSelected()){
        txtMedicamentoDetall.setText(null);
        txtMedicamentoDetall.setEditable(false);
      
        }
    }//GEN-LAST:event_medicnoStateChanged

    private void medicnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicnoActionPerformed

    private void activifisicanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activifisicanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activifisicanoActionPerformed

    private void activifisicanoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_activifisicanoStateChanged
         if(activifisicano.isSelected()){
        txtActivFisicDetall.setText(null);
        txtActivFisicDetall.setEditable(false);
      
        }
    }//GEN-LAST:event_activifisicanoStateChanged

    private void rdbAlergiasNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlergiasNOActionPerformed

    }//GEN-LAST:event_rdbAlergiasNOActionPerformed

    private void rdbAlergiasNOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdbAlergiasNOStateChanged
         if(rdbAlergiasNO.isSelected()){
        txtAlergiasMedicAlimDetall.setText(null);
        txtAlergiasMedicAlimDetall.setEditable(false);
      
        }
    }//GEN-LAST:event_rdbAlergiasNOStateChanged

    private void acciTnoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_acciTnoStateChanged
          if(rdbAlergiasNO.isSelected()){ 
          descaMNO.setSelected(false);
        txtAcciDescansoDetall.setEditable(true);
        txtAcciDescansoDetall.setText(null);
        txtAcciDescansoDetall.setEditable(false);
        fechaAcciT.setDate(null);
      
        }
    }//GEN-LAST:event_acciTnoStateChanged

    private void chkAlergiasMedicAlimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkAlergiasMedicAlimStateChanged
        if(chkAlergiasMedicAlim.isSelected()){
       // txtAlergiasMedicAlimDetall.setText(null);
        txtAlergiasMedicAlimDetall.setEditable(true);
      
        }
    }//GEN-LAST:event_chkAlergiasMedicAlimStateChanged

    private void chkMedicamentoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkMedicamentoStateChanged
        if(chkMedicamento.isSelected()){
        txtMedicamentoDetall.setEditable(true);
      
        }
    }//GEN-LAST:event_chkMedicamentoStateChanged

    private void chkActivFisicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkActivFisicStateChanged
       if(chkActivFisic.isSelected()){
        txtActivFisicDetall.setEditable(true);
      
        }
    }//GEN-LAST:event_chkActivFisicStateChanged

    private void chkAcciTrabajoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkAcciTrabajoStateChanged
         if(chkAcciTrabajo.isSelected()){
            // chkAcciTDescanso.setSelected(true);
             txtAcciDescansoDetall.setText(null);
        txtAcciDescansoDetall.setEditable(true);
      
        }
    }//GEN-LAST:event_chkAcciTrabajoStateChanged

    private void descaMNOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_descaMNOStateChanged
          if(descaMNO.isSelected()){
            // chkAcciTDescanso.isSelected(true);
        txtAcciDescansoDetall.setEditable(false);
      
        }
    }//GEN-LAST:event_descaMNOStateChanged
 private void muestraVisual() {
    String sql = ""
        + "SELECT "
        + "  n.n_orden, "
        + "  CASE WHEN oft.txtcercasincorregirod IS NOT NULL THEN oft.txtcercasincorregirod ELSE o.v_cerca_s_od END AS v_cerca_s_od, "
        + "  CASE WHEN oft.txtcercasincorregiroi IS NOT NULL THEN oft.txtcercasincorregiroi ELSE o.v_cerca_s_oi END AS v_cerca_s_oi, "
        + "  CASE WHEN oft.txtcercacorregidaod IS NOT NULL THEN oft.txtcercacorregidaod "
        + "       WHEN ol.v_cerca_c_od IS NULL THEN o.v_cerca_c_od "
        + "       ELSE ol.v_cerca_c_od END AS ODCC, "
        + "  CASE WHEN oft.txtcercacorregidaoi IS NOT NULL THEN oft.txtcercacorregidaoi "
        + "       WHEN ol.v_cerca_c_oi IS NULL THEN o.v_cerca_c_oi "
        + "       ELSE ol.v_cerca_c_oi END AS OICC, "
        + "  CASE WHEN oft.txtlejossincorregirod IS NOT NULL THEN oft.txtlejossincorregirod ELSE o.v_lejos_s_od END AS v_lejos_s_od, "
        + "  CASE WHEN oft.txtlejossincorregiroi IS NOT NULL THEN oft.txtlejossincorregiroi ELSE o.v_lejos_s_oi END AS v_lejos_s_oi, "
        + "  CASE WHEN oft.txtlejoscorregidaod IS NOT NULL THEN oft.txtlejoscorregidaod "
        + "       WHEN ol.v_lejos_c_od IS NULL THEN o.v_lejos_c_od ELSE ol.v_lejos_c_od END AS ODLC, "
        + "  CASE WHEN oft.txtlejoscorregidaoi IS NOT NULL THEN oft.txtlejoscorregidaoi "
        + "       WHEN ol.v_lejos_c_oi IS NULL THEN o.v_lejos_c_oi ELSE ol.v_lejos_c_oi END AS OILC, "
        + "  CASE WHEN oft.rbtecishihara_normal='TRUE' THEN 'NORMAL' "
        + "       WHEN oft.rbtecishihara_anormal='TRUE' THEN 'ANORMAL' "
        + "       WHEN ol.v_colores IS NULL THEN o.v_colores ELSE ol.v_colores END AS VC, "
        + "  CASE WHEN oft.txtbinocularsincorregir IS NOT NULL THEN oft.txtbinocularsincorregir "
        + "       WHEN ol.v_binocular IS NULL THEN o.v_binocular ELSE ol.v_binocular END AS VB, "
        + "  CASE WHEN oft.txtrp IS NOT NULL THEN oft.txtrp "
        + "       WHEN ol.r_pupilares IS NULL THEN o.r_pupilares ELSE ol.r_pupilares END AS RP, "
        + "  CASE WHEN oft.txtdiagnostico IS NOT NULL THEN oft.txtdiagnostico ELSE o.e_oculares END AS e_oculares "

       
        + "FROM n_orden_ocupacional n "
        + "LEFT JOIN oftalmologia o     ON o.n_orden = n.n_orden "
        + "LEFT JOIN oftalmologia_lo ol ON ol.n_orden = n.n_orden "
        + "LEFT JOIN oftalmologia2021 oft ON oft.n_orden = n.n_orden "
        + "LEFT JOIN anexo7c a          ON a.n_orden = n.n_orden "
        + "WHERE n.n_orden = '" + txtNorden.getText().trim() + "'";
System.out.println(sql);
    oConn.FnBoolQueryExecute(sql);

    try {
        if (oConn.setResult.next()) {
            // oftalmología visual
            txtCercaSinCorregirOD.setText(oConn.setResult.getString("v_cerca_s_od"));
            txtCercaSinCorregirOI.setText(oConn.setResult.getString("v_cerca_s_oi"));
            txtLejosSinCorregirOD .setText(oConn.setResult.getString("v_lejos_s_od"));
            txtLejosSinCorregirOI .setText(oConn.setResult.getString("v_lejos_s_oi"));
            txtCercaCorregidaOD  .setText(oConn.setResult.getString("ODCC"));
            txtCercaCorregidaOI  .setText(oConn.setResult.getString("OICC"));
            txtLejosCorregidaOD  .setText(oConn.setResult.getString("ODLC"));
            txtLejosCorregidaOI  .setText(oConn.setResult.getString("OILC"));
            txtVisionColores     .setText(oConn.setResult.getString("VC"));
            txtVisionBinocular   .setText(oConn.setResult.getString("VB"));
            txtReflejosPupilares .setText(oConn.setResult.getString("RP"));
            txtEnfermedadesOculares.setText(oConn.setResult.getString("e_oculares"));

          
        }
        else {
            oFunc.SubSistemaMensajeError("No se encuentra registros en oftalmologia/anexo7c");
        }
        oConn.sqlStmt.close();
    }
    catch (SQLException ex) {
        oFunc.SubSistemaMensajeInformacion("Error: " + ex.getMessage());
    }
}

  
  
    //empieza anexo
  
   private void anexo16a(){
        String sql = "SELECT n.n_orden, CASE WHEN oft.txtcercasincorregirod is not null THEN oft.txtcercasincorregirod else o.v_cerca_s_od end as v_cerca_s_od,\n" +
"       CASE WHEN oft.txtcercasincorregiroi is not null THEN oft.txtcercasincorregiroi else o.v_cerca_s_oi end as v_cerca_s_oi,\n" +
"       CASE WHEN oft.txtcercacorregidaod is not null THEN oft.txtcercacorregidaod \n" +
"	    WHEN ol.v_cerca_c_od IS NULL THEN o.v_cerca_c_od\n" +
"            else ol.v_cerca_c_od end as ODCC,\n" +
"       CASE WHEN oft.txtcercacorregidaoi is not null THEN oft.txtcercacorregidaoi \n" +
"	    WHEN ol.v_cerca_c_oi IS NULL THEN o.v_cerca_c_oi\n" +
"            else ol.v_cerca_c_oi end as OICC,\n" +
"       CASE WHEN oft.txtlejossincorregirod is not null THEN oft.txtlejossincorregirod else o.v_lejos_s_od end as v_lejos_s_od,\n" +
"       CASE WHEN oft.txtlejossincorregiroi is not null THEN oft.txtlejossincorregiroi else o.v_lejos_s_oi end as v_lejos_s_oi,\n" +
"       CASE WHEN oft.txtlejoscorregidaod is not null THEN oft.txtlejoscorregidaod \n" +
"            WHEN ol.v_lejos_c_od IS NULL THEN o.v_lejos_c_od  ELSE ol.v_lejos_c_od  END as ODLC, \n" +
"       CASE WHEN oft.txtlejoscorregidaoi is not null THEN oft.txtlejoscorregidaoi \n" +
"            WHEN ol.v_lejos_c_oi IS NULL THEN o.v_lejos_c_oi  ELSE ol.v_lejos_c_oi  END as OILC,\n" +
"         \n" +
"       CASE  WHEN oft.rbtecishihara_normal='TRUE' THEN 'NORMAL'\n" +
"             WHEN oft.rbtecishihara_anormal='TRUE'THEN 'ANORMAL'\n" +
"             WHEN ol.v_colores IS NULL THEN o.v_colores  \n" +
"             ELSE ol.v_colores  END as VC,\n" +
"      CASE  WHEN oft.txtbinocularsincorregir IS not NULL THEN oft.txtbinocularsincorregir  \n" +
"	    WHEN ol.v_binocular IS NULL THEN o.v_binocular  \n" +
"            ELSE ol.v_binocular  END as VB,\n" +
"      CASE  WHEN oft.txtrp IS not NULL THEN oft.txtrp\n" +
"	    WHEN ol.r_pupilares IS NULL THEN o.r_pupilares\n" +
"            ELSE ol.r_pupilares  END as RP,\n" +
"      CASE  WHEN oft.txtdiagnostico IS not NULL THEN oft.txtdiagnostico  else o.e_oculares end as e_oculares\n" +
"    FROM n_orden_ocupacional as n\n" +
"     left JOIN oftalmologia as o on (n.n_orden=o.n_orden)\n" +
"     left JOIN oftalmologia_lo as ol on (n.n_orden=ol.n_orden)\n" +
"     left JOIN oftalmologia2021 as oft on (n.n_orden=oft.n_orden)" +
"     WHERE n.n_orden ='" + txtNorden.getText()+ "'";
         oConn.FnBoolQueryExecute(sql);      
             try {
                    if (oConn.setResult.next()) {                        
                        txtCercaSinCorregirOD.setText(oConn.setResult.getString("v_cerca_s_od"));
                        txtCercaSinCorregirOI.setText(oConn.setResult.getString("v_cerca_s_oi"));
                        txtLejosSinCorregirOD.setText(oConn.setResult.getString("v_lejos_s_od"));
                        txtLejosSinCorregirOI.setText(oConn.setResult.getString("v_lejos_s_oi"));
                       
                        txtCercaCorregidaOD.setText(oConn.setResult.getString("ODCC"));
                        txtCercaCorregidaOI.setText(oConn.setResult.getString("OICC"));
                        txtLejosCorregidaOD.setText(oConn.setResult.getString("ODLC"));
                        txtLejosCorregidaOI.setText(oConn.setResult.getString("OILC"));
                        txtVisionColores.setText(oConn.setResult.getString("VC"));
                        txtVisionBinocular.setText(oConn.setResult.getString("VB"));
                        txtReflejosPupilares.setText(oConn.setResult.getString("RP"));
                        
                       txtEnfermedadesOculares.setText(oConn.setResult.getString("e_oculares"));
                        
                       
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registros en oftalmologia");
                    }
                    oConn.sqlStmt.close();
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
            }
        
    }
  //termina
  private void detalleantecedentes(){
//    String [] titulos={"N°Orden","Hospital","Operacion","Dias","complicaciones","Fecha"};
    String [] registros = new String[5];
      String sql = "SELECT cod_ap,hospital_operacion, operacion, dias_hospitalizado, complicaciones, \n" +
                    "       fecha\n" +
                    "  FROM antecedentes_patologicos_quirurgicos "
               + "WHERE cod_ap ='" + num + "'";

    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("fecha");
                    registros[1]= oConn.setResult.getString("hospital_operacion");
                    registros[2]= oConn.setResult.getString("operacion");
                    registros[3]= oConn.setResult.getString("dias_hospitalizado");
                    registros[4]=oConn.setResult.getString("complicaciones");
                    
                     model.addRow(registros);
                }
                  // Coloca el Modelo de Nueva Cuenta
                  tbQuirurgicos.setModel(model);
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       try {
           oConn.sqlStmt.close();
       } catch (SQLException ex) {
           Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
       }
  }
    private void Oftalmologia(){
        String Sql="SELECT CASE  WHEN oft.txtdiagnostico IS not NULL THEN UPPER(oft.txtdiagnostico)  else UPPER(o.e_oculares) end as e_oculares,e_oculares1 "
                + " from n_orden_ocupacional as n"
                + " inner join oftalmologia as o ON(n.n_orden = o.n_orden) "
                + " left JOIN oftalmologia2021 as oft on (n.n_orden=oft.n_orden)\n" 
                +" where n.n_orden='"+ txtNorden.getText().toString()+  "'";
        System.out.println(Sql);
        oConn.FnBoolQueryExecute(Sql);      
             try {
                    if (oConn.setResult.next()) {
                        String enf=oConn.setResult.getString("e_oculares");
                        String enf1=oConn.setResult.getString("e_oculares1");
                        oFunc.SubSistemaMensajeInformacion(enf);
                        if((enf != null && !"".equals(enf))|| (enf1!=null && !"".equals(enf1) )){
                           if(!enf.contains("NINGUNA") ){
                               chk14.setSelected(true);
                           }
                            
                        }else{
                            oFunc.SubSistemaMensajeError("No se encuentra registro de enfermedades ocualres");
                        }
                    }
                    oConn.sqlStmt.close();
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Oftlamologia" + ex.getMessage().toString());
        
            }
    }
    
    
   

// Helper para convertir NULL a cadena vacía y evitar NullPointerException
private String nullToEmpty(String s) {
    return (s == null ? "" : s);
}
    
    
    
   
    public boolean OrdenImp() {

        boolean bResultado = false;
        if (!txtImp.getText().isEmpty()) {
            String sQuery;

            sQuery = "Select n_orden from antecedentes_patologicos Where n_orden =" + txtImp.getText().toString();

            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);

            // Capturo el Error
            try {

                // Verifico que haya habido resultados
                if (oConn.setResult.next()) {
                    // Resultado
                    bResultado = true;

                }

                // Cierro los Resultados
                oConn.sqlStmt.close();

            } catch (SQLException ex) {

            }
        }
        return bResultado;

    }
   
    public boolean OrdenExiste()
    {
        boolean bResultado=false;
        if(!txtNorden.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from antecedentes_patologicos Where n_orden ="+txtNorden.getText();
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
            }
            // Cierro los Resultados
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
        }
        }       
        return bResultado;
        }
/*    
private boolean GrabarAPInfo() throws SQLException{
        boolean bResult = false;
        
        String strSqlStmt;
		 String nameUser="";
                 String elDniUser="";
		if(oFunc.validarEmpresa(txtNorden.getText().toString().trim()))
                {nameUser="AGARCIA";
                elDniUser="42664426";
                }
                else
                {nameUser=clsGlobales.sUser; 
                elDniUser=clsGlobales.sDniOperador;
                }             
             strSqlStmt="INSERT INTO antecedentes_patologicos("
                     + "n_orden, edad_ap, fecha_ap, dni_user, chk1, "
                     + "chk4, chk7, chk11,  chk13," 
                     + "chk14, chk15, " 
                     + "chk25, chk26, chk27,  chk54, chk55, chk57, chk58,rbdrogasno, rbdrogassi, rblicorno,"
                     + "chkcovid,txtdosis,rbOtrossi, rbOtrosno,"
                     + "rblicorsi, rbfumarno, rbfumarsi,user_registro, ";      
  //campos adicionales
             strSqlStmt += "ima, acv, tbc, vih, fobias,ets, \"vértigos\", tifoidea, neoplasias, "
      + "quemaduras, discopatías, columna, enf_psiquiátricas, enf_reumática, "
      + "enf_pulmonares, enf_piel, tendinitis, onicomicosis, fracturas, "
      + "anemia, obesidad, dislipidemia, intoxicaciones, amputación, sordera, "
      + "especifique_detalleenfermedades, alergias_medic_alim, "
      + "alergias_medic_alimdetall, accitrabajo, accit_fecha, accit_descanso, "
      + "accit_descanso_detal, enfe_prof, enfe_profecha, enfe_lab_calif, "
      + "enfe_lab_califdetal, antitetánica, fiebre_amarilla, influenza, "
      + "hepatitisa, hepatitisb, gripe_influenza, neumococo, rabia, "
      + "papiloma_humano, medicamento, medicamento_detal, "
      + "activ_fisic, activ_fisic_detal, padre_detall, madre_detall, "
      + "hermanos_detall, hijos_detall, espos_cony_detall, conadisdetalle, ";             
                    
            String  Query="Values('"+txtNorden.getText()+"','"+txtEdad.getText()+"','"+FechaPatologicos.getDate()+"','"+elDniUser+"','";
                    Query+= chk1.isSelected()+"','"+chk4.isSelected()+"','"+chk7.isSelected()+"','";
                    Query+= chk11.isSelected()+"','"+chk13.isSelected()+"','"+chk14.isSelected()+"','"+chk15.isSelected()+"','";
                    Query+= chk25.isSelected()+"','"+chk26.isSelected()+"','"+chk27.isSelected()+"','";               
                    Query+= chk54.isSelected()+"','"+chk55.isSelected()+"','"+chk57.isSelected()+"','";                             
                    Query+= rbDrogasNO.isSelected()+"','"+rbDrogasSI.isSelected()+"','"+rbLicorNO.isSelected()+"','"
                            +chkCovid.isSelected()+"','"+txtDosis.getText().trim()+"','"+rbOtrossi.isSelected()+"','"+rbOtrosno.isSelected()+"','"+rbLicorSI.isSelected()+"',"
                   + "'"+rbFumarNO.isSelected()+"','"+rbFumarSI.isSelected()+"','"+nameUser+"',";                      
             
             Query     += chkIMA.isSelected()           + ",'"
                        + chkACV.isSelected()           + ",'"                        
                        + chkVIH.isSelected()           + ",'"
                        + chkFobias.isSelected()        + ",'"
                        + chkets.isSelected()           + ",'"
                        + chkVertigos.isSelected()      + ",'"
                        + chkTifoidea.isSelected()      + ",'"
                        + chkNeoplasias.isSelected()    + ",'"
                        + chkQuemaduras.isSelected()    + ",'"
                        + chkDiscopatias.isSelected()   + ",'"
                        + chkColumna.isSelected()       + ",'"
                        + chkEnfPsiquiátricas.isSelected()+ ",'"
                        + chkEnfReumatica.isSelected()  + ",'"
                        + chkEnfPulmonares.isSelected() + ",'"
                        + chkEnfPiel.isSelected()       + ",'"
                        + chkTendinitis.isSelected()    + ",'"
                        + chkOnicomicosis.isSelected()  + ",'"
                        + chkFracturas.isSelected()     + ",'"
                        + chkAnemia.isSelected()        + ",'"
                        + chkObesidad.isSelected()      + ",'"
                        + chkDislipidemia.isSelected()  + ",'"
                        + chkIntoxicaciones.isSelected()+ ",'"
                        + chkAmputacion.isSelected()    + ",'"
                        + chkSordera.isSelected()       + ",'"
                     
                        + "'" + txtEspecifiqueDetalleEnfermedades.getText().trim() + "', '"   
                        + chkAlergiasMedicAlim.isSelected() + "','" // tiene si y no 
                        + txtAlergiasMedicAlimDetall.getText().trim() + "','"
                        + chkAcciTrabajo.isSelected()   + "','" // tiene si y no 

                        + (fechaAcciT.getDate()!=null 
                             ? new SimpleDateFormat("dd-MM-yyyy").format(fechaAcciT.getDate()) 
                             : "") + "','"
                        + chkAcciTDescanso.isSelected()  + "','"
                        + txtAcciDescansoDetall.getText().trim() + "','"
                        + chkEnfeProf.isSelected()       + "','"
                        + (fechaEnfeProf.getDate()!=null
                             ? new SimpleDateFormat("dd-MM-yyyy").format(fechaEnfeProf.getDate())
                             : "") + "','"
                        + chkEnfeLabCalif.isSelected()   + "','"
                        + txtEnfeLabCalifDetall.getText().trim() + "','"
                        + chkAntitetánica.isSelected()   + "','"
                        + chkFiebreAmarilla.isSelected() + "','"
                        + chkInfluenza.isSelected()      + "','"
                        + chkHepatitisA.isSelected()     + "','"
                        + chkHepatitisB.isSelected()     + "','"
                        + chkGripeInfluenza.isSelected() + "','"
                        + chkNeumococo.isSelected()      + "','"
                        + chkRabia.isSelected()          + "','"
                        + chkPapilomaHumano.isSelected() + "','"                        
                        + chkMedicamento.isSelected()    + "','"
                        + txtMedicamentoDetall.getText().trim() + "','"
                        + chkActivFisic.isSelected()     + "','"
                        + txtActivFisicDetall.getText().trim() + "','"
                        + txtPadreDetall.getText().trim() + "','"
                        + txtMadreDetall.getText().trim() + "','"
                        + txtHermanosDetall.getText().trim() + "','"
                        + txtHijosDetall.getText().trim() + "','"
                        + txtEsposConyDetall.getText().trim() + "','"
                        + txtConadisDetalle.getText().trim() + "', ";
      
             Query+= "'"+txtDosis.getText()+"') RETURNING cod_ap;";                                  
             System.out.println(Query);
               if (oConn.FnBoolQueryExecute(strSqlStmt + Query)){                
                   oConn.setResult.next();
                   num = Integer.valueOf(oConn.setResult.getString("cod_ap"));                  
                   bResult = true;
                   oConn.setResult.close();
               }                              
                else{
                //oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
               }
               oConn.sqlStmt.close();
                  return bResult;          
               }*/

    
    // arreglado 
private boolean GrabarAPInfo() throws SQLException {
    boolean bResult = false;
    String strSqlStmt;
   
    // Construcción de INSERT: lista de columnas con nuevos campos
    strSqlStmt = "INSERT INTO antecedentes_patologicos(" +
        "n_orden, edad_ap, fecha_ap, dni_user, chk1, " +
        "chk4, chk7, chk11, chk13, " +
        "chk14, chk15, chk25, chk26, chk27, chk54, chk55, chk57, " +
        "rbdrogasno, rbdrogassi, rblicorno, " +
        "chkcovid, txtdosis, rbotrossi, rbotrosno, " +
        "rblicorsi, rbfumarno, rbfumarsi, user_registro, " +
        "ima, acv, tbc, vih, fobias, ets, vertigos, tifoidea, neoplasias, " +
        "quemaduras, discopatias, columna, enf_psiquiatricas, enf_reumatica, " +
        "enf_pulmonares, enf_piel, tendinitis, onicomicosis, fracturas, " +
        "anemia, obesidad, dislipidemia, intoxicaciones, amputacion, sordera, " +
        "especifique_detalleenfermedades, alergias_medic_alim, " +
        "alergias_medic_alimdetall, accitrabajo, accit_fecha, accit_descanso, " +
        "accit_descanso_detal, enfe_prof, enfe_profecha, enfe_lab_calif, " +
        "enfe_lab_califdetal, antitetanica, fiebre_amarilla, influenza, " +
        "hepatitisa, hepatitisb, gripe_influenza, neumococo, rabia, " +
        "papiloma_humano, medicamento, medicamento_detal, " +
        "activ_fisic, activ_fisic_detal, padre_detall, madre_detall, " +
        "hermanos_detall, hijos_detall, espos_cony_detall, conadisdetalle, " +
        "txtotros, txtotrosfrecuencia,migrana, txtotrosap" +
        ") ";

    // Construcción de VALUES (coincidiendo orden y tipo)
    String Query = "VALUES('" +
        txtNorden.getText() + "',' " +                      // n_orden
        txtEdad.getText() + "', '" +                        // edad_ap
        new SimpleDateFormat("yyyy-MM-dd").format(FechaPatologicos.getDate()) + "', '" +
        clsGlobales.sDniOperador + "', " +
        chk1.isSelected() + ", " +
        chk4.isSelected() + ", " +
        chk7.isSelected() + ", " +
        chk11.isSelected() + ", " +
        chk13.isSelected() + ", " +
        chk14.isSelected() + ", " +
        chk15.isSelected() + ", " +
        chk25.isSelected() + ", " +
        chk26.isSelected() + ", " +
        chk27.isSelected() + ", " +
        chk54.isSelected() + ", " +
        chk55.isSelected() + ", " +
        chk57.isSelected() + ", " +
        rbDrogasNO.isSelected() + ", " +
        rbDrogasSI.isSelected() + ", " +
        rbLicorNO.isSelected() + ", " +
        chkCovid.isSelected() + ", '" +
        txtDosis.getText().trim() + "', " +
        rbOtrossi.isSelected() + ", " +
        rbOtrosno.isSelected() + ", " +
        rbLicorSI.isSelected() + ", " +
        rbFumarNO.isSelected() + ", " +
        rbFumarSI.isSelected() + ", '" +
        clsGlobales.sUser + "', " +
        chkIMA.isSelected() + ", " +
        chkACV.isSelected() + ", " +
        chkTBC.isSelected() + ", " +
        chkVIH.isSelected() + ", " +
        chkFobias.isSelected() + ", " +
        chkets.isSelected() + ", " +
        chkVertigos.isSelected() + ", " +
        chkTifoidea.isSelected() + ", " +
        chkNeoplasias.isSelected() + ", " +
        chkQuemaduras.isSelected() + ", " +
        chkDiscopatias.isSelected() + ", " +
        chkColumna.isSelected() + ", " +
        chkEnfPsiquiatricas.isSelected() + ", " +
        chkEnfReumatica.isSelected() + ", " +
        chkEnfPulmonares.isSelected() + ", " +
        chkEnfPiel.isSelected() + ", " +
        chkTendinitis.isSelected() + ", " +
        chkOnicomicosis.isSelected() + ", " +
        chkFracturas.isSelected() + ", " +
        chkAnemia.isSelected() + ", " +
        chkObesidad.isSelected() + ", " +
        chkDislipidemia.isSelected() + ", " +
        chkIntoxicaciones.isSelected() + ", " +
        chkAmputacion.isSelected() + ", " +
        chkSordera.isSelected() + ", '" +
        txtEspecifiqueDetalleEnfermedades.getText().trim() + "', " +
        chkAlergiasMedicAlim.isSelected() + ", '" +
        txtAlergiasMedicAlimDetall.getText().trim() + "', " +
        chkAcciTrabajo.isSelected() + ",";
            
        if(fechaAcciT.getDate() != null)
        Query+= "'" +new SimpleDateFormat("yyyy-MM-dd").format(fechaAcciT.getDate())+"',";
        else
        Query+= "null,"; 

        Query+=chkAcciTDescanso.isSelected() + ", '" +
        txtAcciDescansoDetall.getText().trim() + "', " +
        chkEnfeProf.isSelected() + ",";
                
                
        if(fechaEnfeProf.getDate() != null)
        Query+= "'" +new SimpleDateFormat("yyyy-MM-dd").format(fechaEnfeProf.getDate())+"',";
        else
        Query+= "null,"; 

        Query+=
         chkEnfeLabCalif.isSelected() + ", '" +
        txtEnfeLabCalifDetall.getText().trim() + "', " +
        chkAntitetanica.isSelected() + ", " +
        chkFiebreAmarilla.isSelected() + ", " +
        chkInfluenza.isSelected() + ", " +
        chkHepatitisA.isSelected() + ", " +
        chkHepatitisB.isSelected() + ", " +
        chkGripeInfluenza.isSelected() + ", " +
        chkNeumococo.isSelected() + ", " +
        chkRabia.isSelected() + ", " +
        chkPapilomaHumano.isSelected() + ", " +
        chkMedicamento.isSelected() + ", '" +
        txtMedicamentoDetall.getText().trim() + "', " +
        chkActivFisic.isSelected() + ", '" +
        txtActivFisicDetall.getText().trim() + "', '" +
        txtPadreDetall.getText().trim() + "', '" +
        txtMadreDetall.getText().trim() + "', '" +
        txtHermanosDetall.getText().trim() + "', '" +
        txtHijosDetall.getText().trim() + "', '" +
        txtEsposConyDetall.getText().trim() + "', '" +
        txtConadisDetalle.getText().trim() + "', '" +
        txtotros.getText().trim() + "', '" +
        txtotrosfrecuencia.getText().trim() + "', " +
        chkmigraña.isSelected() + ", '" +
        txtotrosap.getText().trim() + "'" +
        ") RETURNING cod_ap;";

    // Depuración
    System.out.println(strSqlStmt + Query);

    // Ejecución
    if (oConn.FnBoolQueryExecute(strSqlStmt + Query)) {
        if (oConn.setResult.next()) {
            num     = oConn.setResult.getInt("cod_ap");
            bResult = true;
        }
        oConn.setResult.close();
    }
    oConn.sqlStmt.close();
    return bResult;
}


public void eliminarTabla(){
       String sql = "DELETE FROM antecedentes_patologicos_quirurgicos"
               + " WHERE cod_ap ='" +num+ "' RETURNING cod_ap";
        if (oConn.FnBoolQueryExecute(sql)) {
       
        } else {
            oFunc.SubSistemaMensajeError("No se pudo eliminar");
        }
       try {
           oConn.sqlStmt.close();
       } catch (SQLException ex) {
           Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
       }
}



/*
private boolean ActualizarAPInfo()throws SQLException{
    boolean bResult = false;
        String strSqlStmt;
		 String nameUser="";
                 String elDniUser="";
		if(oFunc.validarEmpresa(txtNorden.getText().trim()))
                {nameUser="AGARCIA";
                elDniUser="42664426";
                }
                else
                {nameUser=clsGlobales.sUser; 
                elDniUser=clsGlobales.sDniOperador;
                }        
        strSqlStmt="UPDATE antecedentes_patologicos ";       
            String  Query="SET edad_ap='"+txtEdad.getText()+"',fecha_ap='"+FechaPatologicos.getDate()+"',dni_user='"+elDniUser+"',chk7='"+chk7.isSelected()+"',";
                    Query+= "chk11='"+chk11.isSelected()+"',chk13='"+chk13.isSelected()+"',chk14='"+chk14.isSelected()+ "chk15='"+chk15.isSelected()+"',chk16='"+chkIMA.isSelected()+"',chk17='"+chkACV.isSelected()+"',chk18='"+chkTBC.isSelected()+"',";
                    Query+= "chk19='"+chkets.isSelected()+"',chk20='"+chkVIH.isSelected()+"',chk21='"+chkFobias.isSelected()+"',"
                            + "chk25='"+chk25.isSelected()+"',chk26='"+chk26.isSelected()+"',"
                            + "chk27='"+chk27.isSelected()+"',";
                    
      
             
                    Query+= "chk54='"+chk54.isSelected()+"',chk55='"+chk55.isSelected()+"',"
                            + "chk57='"+chk57.isSelected()+"',chk58='"+chkVertigos.isSelected()+"',chk59='"+chkTifoidea.isSelected()+"',chk60='"+chkNeoplasias.isSelected()+"',"
                            + "chk61='"+chkQuemaduras.isSelected()+"',";
                    Query+= "chk62='"+chkDiscopatias.isSelected()+"',chk63='"+chkColumna.isSelected()+"',chk64='"+chkEnfPsiquiátricas.isSelected()+"',chk65='"+chkEnfReumatica.isSelected()+"',"
                            + "chk66='"+chkEnfPulmonares.isSelected()+"',chk67='"+chkEnfPiel.isSelected()+"',chk68='"+chkTendinitis.isSelected()+"',chk69='"+chkOnicomicosis.isSelected()+"',"
                            + "chk70='"+chkFracturas.isSelected()+"',";
                    Query+= "chk71='"+chkAnemia.isSelected()+"',chk72='"+chkObesidad.isSelected()+"',chk73='"+chkSordera.isSelected()+"',chk74='"+chkAmputacion.isSelected()+"',";
                    
                    Query+= "rbdrogasno='"+rbDrogasNO.isSelected()+"',rbdrogassi='"+rbDrogasSI.isSelected()+"',"
                            + "rblicorno='"+rbLicorNO.isSelected()+"',rblicorsi='"+rbLicorSI.isSelected()+"',rbfumarno='"+rbFumarNO.isSelected()+"',"
                            + "rbfumarsi='"+rbFumarSI.isSelected()+"',"+"rbotrossi='"+rbOtrossi.isSelected()+"',"+"rbotrosno='"+rbOtrosno.isSelected()+"',";
                  
                     if(txtDrogasFrecuencia.getText().trim().length()>= 1){
                         Query+= "txtdrogasfrecuencia='"+ txtDrogasFrecuencia.getText()+"',";                         
                     }
                     if(txtDrogasTipo.getText().trim().length()>= 1){
                         Query+= "txtdrogastipo='"+txtDrogasTipo.getText()+"',";
                     }
                     if(txtLicorTipoFrecuente.getText().trim().length()>= 1){
                         
                         Query+= "txtlicortipofrecuente='"+txtLicorTipoFrecuente.getText() +"',";
                     }
                     if(txtLicorFrecuencia.getText().trim().length()>= 1){
                         
                         Query+= "txtLicorFrecuencia='"+txtLicorFrecuencia.getText()+"',";
                     }
                     if(txtNcigarrillos.getText().trim().length()>= 1){
                        
                         Query+= "txtncigarrillos='"+txtNcigarrillos.getText()+"',";
                     }
                     //actualizar
                     if(txtotros.getText().trim().length()>= 1){
                         Query+= "txtotros='"+ txtotros.getText()+"',";                         
                     }
                     if(txtotrosfrecuencia.getText().trim().length()>= 1){
                         Query+= "txtotrosfrecuencia='"+ txtotrosfrecuencia.getText()+"',";                         
                     }
                     Query += "user_registro     = '" + nameUser + "', ";
                     // acaba
                     
                     if(txtotrosap.getText().trim().length()>= 1){
                         Query+= "txtotrosap='"+txtotrosap.getText()+"',";
                     }
                     
                     Query+= "chkcovid='"+chkCovid.isSelected()+"',";
                   Query += "ima                = " + chkIMA.isSelected()           + ", "
          + "acv                = " + chkACV.isSelected()           + ", "
          + "tbc                = " + chkTBC.isSelected()           + ", "
          + "vih                = " + chkVIH.isSelected()           + ", "
          + "fobias             = " + chkFobias.isSelected()        + ", "
          + "vértigos           = " + chkVertigos.isSelected()      + ", "
          + "tifoidea           = " + chkTifoidea.isSelected()      + ", "
          + "neoplasias         = " + chkNeoplasias.isSelected()    + ", "
          + "quemaduras         = " + chkQuemaduras.isSelected()    + ", "
          + "discopatías        = " + chkDiscopatias.isSelected()   + ", "
          + "columna            = " + chkColumna.isSelected()       + ", "
          + "enf_psiquiátricas  = " + chkEnfPsiquiatricas.isSelected()+ ", "
          + "enf_reumática      = " + chkEnfReumatica.isSelected()  + ", "
          + "enf_pulmonares     = " + chkEnfPulmonares.isSelected() + ", "
          + "enf_piel           = " + chkEnfPiel.isSelected()       + ", "
          + "tendinitis         = " + chkTendinitis.isSelected()    + ", "
          + "onicomicosis       = " + chkOnicomicosis.isSelected()  + ", "
          + "fracturas          = " + chkFracturas.isSelected()     + ", "
          + "anemia             = " + chkAnemia.isSelected()        + ", "
          + "obesidad           = " + chkObesidad.isSelected()      + ", "
          + "dislipidemia       = " + chkDislipidemia.isSelected()  + ", "
          + "intoxicaciones     = " + chkIntoxicaciones.isSelected()+ ", "
          + "amputación         = " + chkAmputacion.isSelected()    + ", "
          + "sordera            = " + chkSordera.isSelected()       + ", ";

             Query+= "txtdosis='"+txtDosis.getText()+"'";
             Query+= " where n_orden='"+txtNorden.getText()+"' RETURNING cod_ap;";
//             oFunc.SubSistemaMensajeError(strSqlStmt+Query);
               if (oConn.FnBoolQueryExecute(strSqlStmt + Query)){
                 bResult = true;
                 oConn.setResult.close();
                
               }else{
             //oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
               }
               oConn.sqlStmt.close();
               return bResult;   
        } */
    
    

private boolean ActualizarAPInfo() throws SQLException {
    boolean bResult = false;
    String strSqlStmt, Query;

    // Inicio de UPDATE
    strSqlStmt = "UPDATE antecedentes_patologicos ";

    // Construcción de SET incluyendo todos los campos
    Query = "SET "
        + "edad_ap='"    + txtEdad.getText().trim()                        + "', "
        + "fecha_ap='"   + new SimpleDateFormat("yyyy-MM-dd").format(FechaPatologicos.getDate()) + "', "
        + "dni_user='"   + clsGlobales.sDniOperador                                      + "', "
        + "chk1="        + chk1.isSelected()                              + ", "
        + "chk4="        + chk4.isSelected()                              + ", "
        + "chk7="        + chk7.isSelected()                              + ", "
        + "chk11="       + chk11.isSelected()                             + ", "
        + "chk13="       + chk13.isSelected()                             + ", "
        + "chk14="       + chk14.isSelected()                             + ", "
        + "chk15="       + chk15.isSelected()                             + ", "
        + "chk25="       + chk25.isSelected()                             + ", "
        + "chk26="       + chk26.isSelected()                             + ", "
        + "chk27="       + chk27.isSelected()                             + ", "
        + "chk54="       + chk54.isSelected()                             + ", "
        + "chk55="       + chk55.isSelected()                             + ", "
        + "chk57="       + chk57.isSelected()                             + ", "
        + "rbdrogasno="  + rbDrogasNO.isSelected()                        + ", "
        + "rbdrogassi="  + rbDrogasSI.isSelected()                        + ", "
        + "rblicorno="   + rbLicorNO.isSelected()                         + ", "
        + "rbotrossi="   + rbOtrossi.isSelected()                         + ", "
        + "rbotrosno="   + rbOtrosno.isSelected()                         + ", "
        + "chkcovid="    + chkCovid.isSelected()                          + ", "
        + "txtdosis='"   + txtDosis.getText().trim()                      + "', "
        + "rblicorsi="   + rbLicorSI.isSelected()                         + ", "
        + "rbfumarno="   + rbFumarNO.isSelected()                         + ", "
        + "rbfumarsi="   + rbFumarSI.isSelected()                         + ", "
        + "ima="         + chkIMA.isSelected()                            + ", "
        + "acv="         + chkACV.isSelected()                            + ", "
        + "tbc="         + chkTBC.isSelected()                            + ", "
        + "vih="         + chkVIH.isSelected()                            + ", "
        + "fobias="      + chkFobias.isSelected()                         + ", "
        + "ets="         + chkets.isSelected()                            + ", "
        + "vertigos="    + chkVertigos.isSelected()                       + ", "
        + "tifoidea="    + chkTifoidea.isSelected()                       + ", "
        + "neoplasias="  + chkNeoplasias.isSelected()                     + ", "
        + "quemaduras="  + chkQuemaduras.isSelected()                     + ", "
        + "discopatias=" + chkDiscopatias.isSelected()                    + ", "
        + "columna="     + chkColumna.isSelected()                        + ", "
        + "enf_psiquiatricas=" + chkEnfPsiquiatricas.isSelected()         + ", "
        + "enf_reumatica="     + chkEnfReumatica.isSelected()            + ", "
        + "enf_pulmonares="    + chkEnfPulmonares.isSelected()           + ", "
        + "enf_piel="          + chkEnfPiel.isSelected()                 + ", "
        + "tendinitis="        + chkTendinitis.isSelected()              + ", "
        + "onicomicosis="      + chkOnicomicosis.isSelected()            + ", "
        + "fracturas="         + chkFracturas.isSelected()               + ", "
        + "anemia="            + chkAnemia.isSelected()                  + ", "
        + "obesidad="          + chkObesidad.isSelected()                + ", "
        + "dislipidemia="      + chkDislipidemia.isSelected()            + ", "
        + "intoxicaciones="    + chkIntoxicaciones.isSelected()          + ", "
        + "amputacion="        + chkAmputacion.isSelected()              + ", "
        + "sordera="           + chkSordera.isSelected()                 + ", "
        + "especifique_detalleenfermedades='" + txtEspecifiqueDetalleEnfermedades.getText().trim() + "', "
        + "alergias_medic_alim=" + chkAlergiasMedicAlim.isSelected()      + ", "
        + "alergias_medic_alimdetall='" + txtAlergiasMedicAlimDetall.getText().trim() + "', "
        + "accitrabajo="       + chkAcciTrabajo.isSelected()             + ", ";
        if(fechaAcciT.getDate() != null)
        Query+= "accit_fecha='" +new SimpleDateFormat("yyyy-MM-dd").format(fechaAcciT.getDate())+"',";
        else
        Query+= "accit_fecha=null,";
        
        Query+= "accit_descanso=" + chkAcciTDescanso.isSelected()+ ", "

        + "accit_descanso_detal='" + txtAcciDescansoDetall.getText().trim() + "', "
        + "enfe_prof="         + chkEnfeProf.isSelected()                + ", ";
        if(fechaEnfeProf.getDate() != null)
        Query+= "enfe_profecha='" +new SimpleDateFormat("yyyy-MM-dd").format(fechaEnfeProf.getDate())+"',";
        else
        Query+= "enfe_profecha=null,";                

        Query+="enfe_lab_calif="    + chkEnfeLabCalif.isSelected()            + ", "
        + "enfe_lab_califdetal='" + txtEnfeLabCalifDetall.getText().trim() + "', "
        + "antitetanica="      + chkAntitetanica.isSelected()            + ", "
        + "fiebre_amarilla="   + chkFiebreAmarilla.isSelected()          + ", "
        + "influenza="         + chkInfluenza.isSelected()               + ", "
        + "hepatitisa="        + chkHepatitisA.isSelected()              + ", "
        + "hepatitisb="        + chkHepatitisB.isSelected()              + ", "
        + "gripe_influenza="   + chkGripeInfluenza.isSelected()          + ", "
        + "neumococo="         + chkNeumococo.isSelected()               + ", "
        + "rabia="             + chkRabia.isSelected()                   + ", "
        + "papiloma_humano="   + chkPapilomaHumano.isSelected()          + ", "
        + "medicamento="       + chkMedicamento.isSelected()             + ", "
        + "medicamento_detal='" + txtMedicamentoDetall.getText().trim() + "', "
        + "activ_fisic="       + chkActivFisic.isSelected()              + ", "
        + "activ_fisic_detal='" + txtActivFisicDetall.getText().trim() + "', "
        + "padre_detall='"     + txtPadreDetall.getText().trim()         + "', "
        + "madre_detall='"     + txtMadreDetall.getText().trim()         + "', "
        + "hermanos_detall='"  + txtHermanosDetall.getText().trim()      + "', "
        + "hijos_detall='"     + txtHijosDetall.getText().trim()         + "', "
        + "espos_cony_detall='" + txtEsposConyDetall.getText().trim()      + "', "
        + "conadisdetalle='"   + txtConadisDetalle.getText().trim()        + "', "
        + "txtotros='"          + txtotros.getText().trim()               + "', "
        + "txtotrosfrecuencia='" + txtotrosfrecuencia.getText().trim()      + "', "
        + "migrana="   + chkmigraña.isSelected()          + ", "
        + "txtotrosap='"        + txtotrosap.getText().trim()              + "', "
        + "user_registro='"     + clsGlobales.sUser                               + "' "
        + "WHERE n_orden='"     + txtNorden.getText().trim()               + "' RETURNING cod_ap;";

    // Depuración
    System.out.println(strSqlStmt + Query);

    // Ejecución
    if (oConn.FnBoolQueryExecute(strSqlStmt + Query)) {
        bResult = true;
        oConn.setResult.close();
    }
    oConn.sqlStmt.close();
    return bResult;
}

   
private void ReImp() throws IOException{
if(!txtImp.getText().isEmpty()){
            if(OrdenImp()){
                if (imprimir1(Integer.valueOf(txtImp.getText()))){
                imprimir2(Integer.valueOf(txtImp.getText()));
                 }
            }else {oFunc.SubSistemaMensajeError("Numero de Orden no Existe"); txtImp.setText(null); txtImp.requestFocus();
            }
            
            
            }else{
           
        
        }

}
private boolean GrabarAPDetalle() {
         boolean bResult = false;
                     eliminarTabla(); 
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String Fecha, HospitalQui, OperacionQui, diasHospitalizacionQui, ComplicacionesQui;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbQuirurgicos.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            Fecha = tbQuirurgicos.getModel().getValueAt(iFila, 0).toString();
            HospitalQui = tbQuirurgicos.getModel().getValueAt(iFila, 1).toString();
            OperacionQui = tbQuirurgicos.getModel().getValueAt(iFila, 2).toString();
            diasHospitalizacionQui = tbQuirurgicos.getModel().getValueAt(iFila, 3).toString();
            ComplicacionesQui = tbQuirurgicos.getModel().getValueAt(iFila, 4).toString();
        
           
           strSqlStmt="INSERT INTO antecedentes_patologicos_quirurgicos(cod_ap, fecha, hospital_operacion, operacion, dias_hospitalizado, complicaciones)";
                                      
                    strSqlStmt = strSqlStmt + " Values ('";
//                    oFunc.SubSistemaMensajeError(String.valueOf(num));
                    strSqlStmt += num+"','";
                    strSqlStmt += Fecha+"','";
                    strSqlStmt += HospitalQui+"','";
                    strSqlStmt += OperacionQui+"','";
                    strSqlStmt += diasHospitalizacionQui+"','";
                    strSqlStmt += ComplicacionesQui+"')";
                       System.out.println(strSqlStmt);

                    // Ejecuta la Sentencia
                    if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                        bResult = true;
                        
                                  
                    }
             try {
                 oConn.sqlStmt.close();
             } catch (SQLException ex) {
                 Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
             }
                  }
         return bResult;
    }
public void Actualizar() throws IOException{
     if(!txtNorden.getText().isEmpty()){
                 if(validar()){ 
                     try {
                         if(ActualizarAPInfo()){
                                
                             if(tbQuirurgicos.getRowCount()>0 ){
                                 if(GrabarAPDetalle()){                                    
                                 }
                             }else{                                 
                             }
                             oFunc.SubSistemaMensajeInformacion("Se Actualizo Correctamente");
                             imp();
                             limpiar();
                         }
                     } catch (SQLException ex) {
                         Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }  
              
         }
}
private boolean ActualizarAPDetalle()
    {
         boolean bResult = false;
                      
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String Fecha, HospitalQui, OperacionQui, diasHospitalizacionQui, ComplicacionesQui;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbQuirurgicos.getRowCount();iFila++)
        {
             try {
                 //Obtiene dato contenido en una celda de la tabla
                 Fecha = tbQuirurgicos.getModel().getValueAt(iFila, 0).toString();
                 HospitalQui = tbQuirurgicos.getModel().getValueAt(iFila, 1).toString();
                 OperacionQui = tbQuirurgicos.getModel().getValueAt(iFila, 2).toString();
                 diasHospitalizacionQui = tbQuirurgicos.getModel().getValueAt(iFila, 3).toString();
                 ComplicacionesQui = tbQuirurgicos.getModel().getValueAt(iFila, 4).toString();
                 
                 
                 strSqlStmt="UPDATE antecedentes_patologicos_quirurgicos ";
                 strSqlStmt = strSqlStmt + " SET fecha='"+ Fecha+"',hospital_operacion='"+ HospitalQui+"',"
                         + "operacion='"+ OperacionQui+"',dias_hospitalizado='"+diasHospitalizacionQui+"',"
                         + "complicaciones='"+ComplicacionesQui+"' ";
                 strSqlStmt+="where cod_ap='"+num+"'";
                 // Ejecuta la Sentencia
                 if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                     bResult = true;
                     
                 }
                 oConn.sqlStmt.close();
             } catch (SQLException ex) {
                 Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
             }
                  }
         return bResult;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaPatologicos;
    private javax.swing.JTextField FechaQui;
    private javax.swing.JRadioButton acciTno;
    private javax.swing.JRadioButton activifisicano;
    private javax.swing.ButtonGroup bgDrogras;
    private javax.swing.ButtonGroup bgFumar;
    private javax.swing.ButtonGroup bgLicor;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnIMP;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel btnQui;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk11;
    private javax.swing.JCheckBox chk13;
    private javax.swing.JCheckBox chk14;
    private javax.swing.JCheckBox chk15;
    private javax.swing.JCheckBox chk25;
    private javax.swing.JCheckBox chk26;
    private javax.swing.JCheckBox chk27;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk54;
    private javax.swing.JCheckBox chk55;
    private javax.swing.JCheckBox chk57;
    private javax.swing.JCheckBox chk7;
    private javax.swing.JCheckBox chkACV;
    private javax.swing.JRadioButton chkAcciTDescanso;
    private javax.swing.JRadioButton chkAcciTrabajo;
    private javax.swing.JRadioButton chkActivFisic;
    private javax.swing.JRadioButton chkAlergiasMedicAlim;
    private javax.swing.JCheckBox chkAmputacion;
    private javax.swing.JCheckBox chkAnemia;
    private javax.swing.JCheckBox chkAntitetanica;
    private javax.swing.JCheckBox chkCerveza;
    private javax.swing.JCheckBox chkCigarrillos;
    private javax.swing.JCheckBox chkColumna;
    private javax.swing.JCheckBox chkCovid;
    private javax.swing.JCheckBox chkDiscopatias;
    private javax.swing.JCheckBox chkDislipidemia;
    private javax.swing.JCheckBox chkDrogas;
    private javax.swing.JCheckBox chkEnfPiel;
    private javax.swing.JCheckBox chkEnfPsiquiatricas;
    private javax.swing.JCheckBox chkEnfPulmonares;
    private javax.swing.JCheckBox chkEnfReumatica;
    private javax.swing.JRadioButton chkEnfeLabCalif;
    private javax.swing.JRadioButton chkEnfeProf;
    private javax.swing.JCheckBox chkFiebreAmarilla;
    private javax.swing.JCheckBox chkFobias;
    private javax.swing.JCheckBox chkFracturas;
    private javax.swing.JCheckBox chkFreDrog;
    private javax.swing.JCheckBox chkGripeInfluenza;
    private javax.swing.JCheckBox chkHepatitisA;
    private javax.swing.JCheckBox chkHepatitisB;
    private javax.swing.JCheckBox chkIMA;
    private javax.swing.JCheckBox chkInfluenza;
    private javax.swing.JCheckBox chkIntoxicaciones;
    private javax.swing.JCheckBox chkLicFrecuencia;
    private javax.swing.JRadioButton chkMedicamento;
    private javax.swing.JCheckBox chkNeoplasias;
    private javax.swing.JCheckBox chkNeumococo;
    private javax.swing.JCheckBox chkObesidad;
    private javax.swing.JCheckBox chkOnicomicosis;
    private javax.swing.JCheckBox chkPapilomaHumano;
    private javax.swing.JCheckBox chkQuemaduras;
    private javax.swing.JCheckBox chkRabia;
    private javax.swing.JCheckBox chkRon;
    private javax.swing.JCheckBox chkSordera;
    private javax.swing.JCheckBox chkTBC;
    private javax.swing.JCheckBox chkTendinitis;
    private javax.swing.JCheckBox chkTifoidea;
    private javax.swing.JCheckBox chkVIH;
    private javax.swing.JCheckBox chkVertigos;
    private javax.swing.JCheckBox chkVino;
    private javax.swing.JCheckBox chkWiscky;
    private javax.swing.JCheckBox chkets;
    private javax.swing.JCheckBox chkmigraña;
    private javax.swing.JRadioButton descaMNO;
    private javax.swing.JRadioButton enferNO;
    private javax.swing.JRadioButton enferpNO;
    private com.toedter.calendar.JDateChooser fechaAcciT;
    private com.toedter.calendar.JDateChooser fechaEnfeProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTabbedPane jtAntecedentes;
    private javax.swing.JTabbedPane jtReproduccion;
    private javax.swing.JRadioButton medicno;
    private javax.swing.JTextField nombrecompleto;
    private javax.swing.JRadioButton rbDrogasNO;
    private javax.swing.JRadioButton rbDrogasSI;
    private javax.swing.JRadioButton rbFumarNO;
    private javax.swing.JRadioButton rbFumarSI;
    private javax.swing.JRadioButton rbLicorNO;
    private javax.swing.JRadioButton rbLicorSI;
    private javax.swing.JRadioButton rbOtrosno;
    private javax.swing.JRadioButton rbOtrossi;
    private javax.swing.JRadioButton rdbAlergiasNO;
    private javax.swing.JTable tbQuirurgicos;
    private javax.swing.JTextField txtAcciDescansoDetall;
    private javax.swing.JTextField txtActivFisicDetall;
    private javax.swing.JTextField txtAlergiasMedicAlimDetall;
    private javax.swing.JTextField txtCercaCorregidaOD;
    private javax.swing.JTextField txtCercaCorregidaOI;
    private javax.swing.JTextField txtCercaSinCorregirOD;
    private javax.swing.JTextField txtCercaSinCorregirOI;
    private javax.swing.JTextField txtCocaina;
    private javax.swing.JTextField txtComplicacionesQui;
    private javax.swing.JTextArea txtConadisDetalle;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtDrogasFrecuencia;
    private javax.swing.JTextField txtDrogasTipo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEnfeLabCalifDetall;
    private javax.swing.JTextField txtEnfermedadesOculares;
    private javax.swing.JTextField txtEspecifiqueDetalleEnfermedades;
    private javax.swing.JTextField txtEsposConyDetall;
    private javax.swing.JTextField txtHermanosDetall;
    private javax.swing.JTextField txtHijosDetall;
    private javax.swing.JTextField txtHospitalQui;
    private javax.swing.JTextField txtImp;
    private javax.swing.JTextField txtLejosCorregidaOD;
    private javax.swing.JTextField txtLejosCorregidaOI;
    private javax.swing.JTextField txtLejosSinCorregirOD;
    private javax.swing.JTextField txtLejosSinCorregirOI;
    private javax.swing.JTextField txtLicorFrecuencia;
    private javax.swing.JTextArea txtLicorTipoFrecuente;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtMadreDetall;
    private javax.swing.JTextField txtMarihuana;
    private javax.swing.JTextField txtMedicamentoDetall;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtNcigarrillos;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtOperacionQui;
    private javax.swing.JTextField txtPadreDetall;
    private javax.swing.JTextField txtReflejosPupilares;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtVisionBinocular;
    private javax.swing.JTextField txtVisionColores;
    private javax.swing.JTextField txtdiasHospitalizacionQui;
    private javax.swing.JTextField txtotros;
    private javax.swing.JTextField txtotrosap;
    private javax.swing.JTextField txtotrosfrecuencia;
    // End of variables declaration//GEN-END:variables

void sbCargarDatosAP(){
        
          String [] titulos={"Fecha","Hospital(Nombre - Lugar)","Operación","Días","Complicaciones"};
          model = new DefaultTableModel(null,titulos){
            
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
          
          };
          tbQuirurgicos.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbQuirurgicos.setModel(model);          
          tbQuirurgicos.getColumnModel().getColumn(0).setPreferredWidth(90);
          tbQuirurgicos.getColumnModel().getColumn(1).setPreferredWidth(400);
          tbQuirurgicos.getColumnModel().getColumn(2).setPreferredWidth(200);
          tbQuirurgicos.getColumnModel().getColumn(3).setPreferredWidth(50);
          tbQuirurgicos.getColumnModel().getColumn(4).setPreferredWidth(200);
}
void AddAP(){
    //SimpleDateFormat formato = new SimpleDateFormat("yyyy");
   
    String [] registros = new String[5];
    model = (DefaultTableModel) tbQuirurgicos.getModel();
    if(!txtNorden.getText().isEmpty()){
                   if(validarQui()){  
                    registros[0]= FechaQui.getText();
                    registros[1]= txtHospitalQui.getText();
                    registros[2]= txtOperacionQui.getText();
                    registros[3]= txtdiasHospitalizacionQui.getText();
                    registros[4]= txtComplicacionesQui.getText();
               
                   
                model.addRow(registros);  
                tbQuirurgicos.setModel(model);
                        }
                 }
       
                else{oFunc.SubSistemaMensajeError("Falto Llenar algo");
                          
                 //}
                   
    } 
        
}

private boolean validarQui(){
boolean bResultado=true;
  if(txtNorden.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese N° Orden"); bResultado = false;}
    if(FechaQui.getText().isEmpty()){bResultado = false;}
    if(txtHospitalQui.getText().isEmpty()){bResultado = false;}
    if(txtOperacionQui.getText().isEmpty()){bResultado = false;}
    if(txtdiasHospitalizacionQui.getText().isEmpty()){bResultado = false;}
    if(txtComplicacionesQui.getText().isEmpty()){bResultado = false;}
  
   return bResultado;
}
private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaPatologicos.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    if(bgDrogras.isSelected(null)){oFunc.SubSistemaMensajeError("Usa drogas?");bResultado = false;}
    if(bgFumar.isSelected(null)){oFunc.SubSistemaMensajeError("Fuma?");bResultado = false;}
    if(bgLicor.isSelected(null)){oFunc.SubSistemaMensajeError("bebe Licor?");bResultado = false;}
  
   return bResultado;
}



private void limpiar(){
num = null;    
txtNorden.setText(null);
FechaNacimiento.setDate(null);
FechaPatologicos.setDate(null);
FechaQui.setText(null);
nombrecompleto.setText(null);
txtSexo.setText(null);
txtEdad.setText(null);
txtNcigarrillos.setText(null);
txtLicorTipoFrecuente.setText(null);
txtLicorFrecuencia.setText(null);
txtDrogasTipo.setText(null);
txtDrogasFrecuencia.setText(null);
txtCocaina.setText(null);
txtMarihuana.setText(null);
txtotrosap.setText(null);
txtotrosap.setText(null);
bgDrogras.clearSelection();
bgFumar.clearSelection();
bgLicor.clearSelection();
buttonGroup2.clearSelection();

buttonGroup3.clearSelection();
buttonGroup4.clearSelection();
buttonGroup5.clearSelection();
buttonGroup6.clearSelection();
buttonGroup7.clearSelection();
buttonGroup8.clearSelection();
buttonGroup9.clearSelection();


chk1.setSelected(false);
chk7.setSelected(false);
//chk9.setSelected(false);
chkAntitetanica.setSelected(false);
chkFiebreAmarilla.setSelected(false);
chkInfluenza.setSelected(false);
chkHepatitisA.setSelected(false);
chkHepatitisB.setSelected(false);        
chkGripeInfluenza.setSelected(false);        
 chkNeumococo.setSelected(false);       
 chkRabia.setSelected(false);
chkPapilomaHumano.setSelected(false);
 chkMedicamento.setSelected(false);        
 chkActivFisic.setSelected(false); 
 fechaAcciT.setDate(null);
txtEnfeLabCalifDetall.setText(null);        
         
         
chk11.setSelected(false);
chk13.setSelected(false);
chk14.setSelected(false);
chk15.setSelected(false);
chkIMA.setSelected(false);
chkACV.setSelected(false);
chkTBC.setSelected(false);
chkets.setSelected(false);
chkVIH.setSelected(false);
chkFobias.setSelected(false);
chk25.setSelected(false);
chk26.setSelected(false);
chk27.setSelected(false);
txtotrosap.setText(null);
txtEspecifiqueDetalleEnfermedades.setText(null);
txtAlergiasMedicAlimDetall.setText(null);
txtAcciDescansoDetall.setText(null);
txtEnfeLabCalifDetall.setText(null);
txtMedicamentoDetall.setText(null);
txtActivFisicDetall.setText(null);
txtPadreDetall.setText(null);
txtMadreDetall.setText(null);
txtHermanosDetall.setText(null);
txtHijosDetall.setText(null);
txtEsposConyDetall.setText(null);
txtConadisDetalle.setText(null);
//chk33.setSelected(false);
//chk35.setSelected(false);
//chk38.setSelected(false);
//chk41.setSelected(false);
//chk42.setSelected(false);
//chk43.setSelected(false);
//chk44.setSelected(false);
//chk45.setSelected(false);
//chk46.setSelected(false);
//chk47.setSelected(false);
//chk48.setSelected(false);
//chk49.setSelected(false);
//chk50.setSelected(false);
//chk51.setSelected(false);
//chk52.setSelected(false);
//chk53.setSelected(false);
chk54.setSelected(false);
chk55.setSelected(false);
//chk56.setSelected(false);
chk57.setSelected(false);
//chk58.setSelected(false);
//chk59.setSelected(false);
//chk60.setSelected(false);
//chk61.setSelected(false);
//chk62.setSelected(false);
//chk63.setSelected(false);
//chk64.setSelected(false);
//chk65.setSelected(false);
//chk67.setSelected(false);
//chk68.setSelected(false);
//chk69.setSelected(false);
//chk70.setSelected(false);
//chk71.setSelected(false);
//chk72.setSelected(false);
//chk73.setSelected(false);
//chk74.setSelected(false);

jtAntecedentes.setSelectedIndex(0);
txtNorden.setEditable(true);
txtNorden.requestFocus();
Qui();
habitos();
chkCovid.setSelected(false);
//fechaCovid.setDate(null);
buttonGroup1.clearSelection();
txtDosis.setText(null);
chkmigraña.setSelected(false);
}
public void habitos(){
        txtNcigarrillos.setEditable(false);
        txtNcigarrillos.setText(null);
        txtLicorTipoFrecuente.setEditable(false);
        txtLicorTipoFrecuente.setText(null);
        txtLicorFrecuencia.setEditable(false);
        txtLicorFrecuencia.setText(null);
        txtDrogasTipo.setEditable(false);
        txtDrogasTipo.setText(null);
        txtotros.setEditable(false);
        txtotrosfrecuencia.setText(null);
        txtDrogasFrecuencia.setEditable(false);
        txtDrogasFrecuencia.setText(null);
}
public void Qui(){
sbCargarDatosAP();
txtHospitalQui.setText(null);
txtOperacionQui.setText(null);
txtdiasHospitalizacionQui.setText(null);
txtComplicacionesQui.setText(null);
}
public void imp() throws IOException {
        if (imprimir1(Integer.valueOf(txtNorden.getText()))) {
            imprimir2(Integer.valueOf(txtNorden.getText()));
        }
}
    private boolean imprimir1(Integer num) {
        boolean im = false;
        int seleccion = JOptionPane.showOptionDialog(
                this, // Componente padre
                "¿Desea Imprimir Hoja 1 de 2 ?", //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");
        if (seleccion != -1) {
            if ((seleccion + 1) == 1) {
                printer1(num);
                im = true;
            } else {
                // PRESIONO NO
            }
        }
        return im;
    }
    private void imprimir2(Integer num) throws IOException {
        int seleccion = JOptionPane.showOptionDialog(
                this, // Componente padre
                "¿Ingrese la misma hoja para imprimir Reverso - Hoja 2 de 2 ?", //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");
        if (seleccion != -1) {
            if ((seleccion + 1) == 1) {
                printer2(num);
            } else {
                // PRESIONO NO
            }
        }
    }

 
private void printer1(Integer cod) {
    try {
      String reportFile = null;
     
                          if(oFunc.validarEmpresaBoro(cod.toString().trim())){
                              reportFile= "ficha_antecedente_patologico_boro.jasper";
                          }
                          else
                              
         reportFile= "ficha_antecedente_patologico.jasper";
        if (reportFile == null || reportFile.isEmpty()) {
            throw new Exception("Error: No se pudo determinar el reporte a imprimir.");
        }                         
        
            String master = System.getProperty("user.dir") +
                                "/reportes/"+reportFile;

        
        
        System.out.println("Cargando reporte: " + master);
               Map parameters = new HashMap();
        parameters.put("Norden", cod);
         
            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del ficha antecedente patologico.");
                //System.exit(2);
            } 
            JasperReport masterReport = null;
            try 
            {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } 
            
            
            catch (JRException e) 
            {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            } 
            //JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
                           
              //      JasperViewer.viewReport(myPrint,false);
            
           // JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
            //JasperPrintManager.printReport(jasperPrint,true);
            JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(master);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("FORMATO ANTENCEDENTES PATOLOGICOS");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                    JasperPrintManager.printReport(myPrint,true);
                    
    } catch (SQLException | JRException e) {
        e.printStackTrace();
    } catch (Exception e) {
        System.err.println("Error en la impresión del reporte: " + e.getMessage());
    }
}


 
    
 /*   private void printer1(Integer cod) {
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
        try {
            String master = System.getProperty("user.dir") + "/reportes/ficha_antecedente_patologico_Digitalizado_Alicel.jasper"; // cambio ficha_antecedente_patologico_Digitalizado_Alicel pero el nornal es             String master = System.getProperty("user.dir") + "/reportes/ficha_antecedente_patologico_Digitalizado_Alicel.jasper"; // cambio ficha_antecedente_patologico_Digitalizado_Alicel pero el nornal es 

            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del ficha antecedente patologico.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }           
            //JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
            //JasperViewer.viewReport(myPrint,false);
            //JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
            //JasperPrintManager.printReport(jasperPrint, true);          
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(master);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("ANTEDECENTES PATOLOGICOS");
                   //viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                    JasperPrintManager.printReport(myPrint,true);            
        } catch (JRException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    
    
    public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
       try {
           oConn.sqlStmt.close();
       } catch (SQLException ex) {
           Logger.getLogger(AntecedentesPatologicosBoro.class.getName()).log(Level.SEVERE, null, ex);
       }
    this.dispose();
      //  System.exit(0);
    }
private void printer2(Integer cod) throws IOException{
               
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
               
                 try {
                     String master="";
                
                 if(oFunc.validarEmpresaBoro(cod.toString().trim())){
  
                     master = System.getProperty("user.dir") +
                                "/reportes/ficha_antecedente_patologico_2_boro.jasper";
                              }
                 else
                     master = System.getProperty("user.dir") +
                                "/reportes/ficha_antecedente_patologico_2.jasper";                                                 
               
                 
                     
            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del ficha antecedente patologico.");
                //System.exit(2);
            } 
            JasperReport masterReport = null;
            try 
            {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } 
            
            
            catch (JRException e) 
            {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            } 
            //JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
                           
              //      JasperViewer.viewReport(myPrint,false);
            
           // JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
            //JasperPrintManager.printReport(jasperPrint,true);
            JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(master);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("FORMATO ANTENCEDENTES PATOLOGICOS");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                    JasperPrintManager.printReport(myPrint,true);
                   } catch (JRException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }
   
   

}
