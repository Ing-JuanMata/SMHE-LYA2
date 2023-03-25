package codigo;

import analisis.Lexer;
import analisis.SintaxPrueba;
import herramientas.TablaErrores;
import herramientas.TablaFunciones;
import herramientas.TablaSimbolos;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.undo.UndoManager;
import say.swing.JFontChooser;
import java_cup.runtime.Symbol;

public class FrmPrincipal extends javax.swing.JFrame {

    private String archivo = "";
    private NumeroLinea NumLinea;
    public static ArrayList<Symbol> tokens = new ArrayList<>();
    public static TablaSimbolos tablaSimbolos = new TablaSimbolos();
    public static TablaErrores errores = new TablaErrores();
    public static TablaFunciones funciones = new TablaFunciones();
    //private ArrayList<TextColor> colores = new ArrayList<>();

    private final UndoManager administradorCambios;

    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SmartHealth");
        NumLinea = new NumeroLinea(txtEntrada);
        scrollEntrada.setRowHeaderView(NumLinea);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Atlas.png")).getImage());

        // Administrador de cambios en sintaxis
        administradorCambios = new UndoManager();                //construye una instancia de UndoManager

        txtEntrada.getDocument().addUndoableEditListener(new UndoableEditListener() {
            public void undoableEditHappened(UndoableEditEvent e) {
                administradorCambios.addEdit(e.getEdit());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        barraHerramientas = new javax.swing.JToolBar();
        sep0 = new javax.swing.JToolBar.Separator();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        sep1 = new javax.swing.JToolBar.Separator();
        btnCortar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();
        sep2 = new javax.swing.JToolBar.Separator();
        sep3 = new javax.swing.JToolBar.Separator();
        btnCorrer = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        scrollEntrada = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextPane();
        panelConsola = new javax.swing.JPanel();
        scrollConsola = new javax.swing.JScrollPane();
        txtError = new javax.swing.JTextArea();
        lblConsola = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuNuevo = new javax.swing.JMenuItem();
        Fuente = new javax.swing.JMenuItem();
        mnuAbrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuCerrar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuGuardar = new javax.swing.JMenuItem();
        mnuGuardarC = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuLexico = new javax.swing.JMenuItem();
        menuSintactico = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuFunciones = new javax.swing.JMenuItem();
        menuSimbolos = new javax.swing.JMenuItem();
        menuErrores = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraHerramientas.setBackground(new java.awt.Color(255, 255, 255));
        barraHerramientas.setRollover(true);

        sep0.setForeground(new java.awt.Color(255, 255, 255));
        sep0.setEnabled(false);
        sep0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sep0.setOpaque(true);
        barraHerramientas.add(sep0);

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrirArchivo.png"))); // NOI18N
        btnAbrir.setToolTipText("Abrir archivo");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setPreferredSize(new java.awt.Dimension(40, 37));
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnAbrir);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardarArchivo.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar archivo");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnGuardar);

        sep1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        barraHerramientas.add(sep1);

        btnCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cortarArchivo.png"))); // NOI18N
        btnCortar.setToolTipText("Cortar");
        btnCortar.setFocusable(false);
        btnCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCortar.setPreferredSize(new java.awt.Dimension(40, 37));
        btnCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnCortar);

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/copiarArchivo.png"))); // NOI18N
        btnCopiar.setToolTipText("Copiar");
        btnCopiar.setFocusable(false);
        btnCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnCopiar);

        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pegarArchivo.png"))); // NOI18N
        btnPegar.setToolTipText("Pegar");
        btnPegar.setFocusable(false);
        btnPegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnPegar);
        barraHerramientas.add(sep2);
        barraHerramientas.add(sep3);

        btnCorrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/correrArchivo.png"))); // NOI18N
        btnCorrer.setToolTipText("Ejecutar archivo");
        btnCorrer.setFocusable(false);
        btnCorrer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCorrer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrerActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnCorrer);

        getContentPane().add(barraHerramientas, java.awt.BorderLayout.NORTH);

        jSplitPane1.setDividerLocation(480);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setResizeWeight(1);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1230, 650));

        txtEntrada.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEntradaKeyReleased(evt);
            }
        });
        scrollEntrada.setViewportView(txtEntrada);

        jSplitPane1.setTopComponent(scrollEntrada);

        panelConsola.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelConsola.setFocusable(false);
        panelConsola.setPreferredSize(new java.awt.Dimension(1230, 150));
        panelConsola.setLayout(new java.awt.BorderLayout());

        scrollConsola.setPreferredSize(new java.awt.Dimension(166, 50));

        txtError.setEditable(false);
        txtError.setColumns(20);
        txtError.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtError.setRows(5);
        scrollConsola.setViewportView(txtError);

        panelConsola.add(scrollConsola, java.awt.BorderLayout.CENTER);

        lblConsola.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblConsola.setText("Consola");
        panelConsola.add(lblConsola, java.awt.BorderLayout.NORTH);

        jSplitPane1.setBottomComponent(panelConsola);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jMenuBar2.setPreferredSize(new java.awt.Dimension(189, 30));

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuLogo.png"))); // NOI18N
        jMenu5.setEnabled(false);
        jMenu5.setFocusable(false);
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuBar2.add(jMenu5);

        jMenu3.setText("Archivo");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        mnuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuNuevo.setText("Nuevo");
        mnuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuevoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuNuevo);

        Fuente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Fuente.setText("Fuente");
        Fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuenteActionPerformed(evt);
            }
        });
        jMenu3.add(Fuente);

        mnuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuAbrir.setText("Abrir");
        mnuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAbrirActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAbrir);
        jMenu3.add(jSeparator1);

        mnuCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCerrar.setText("Cerrar");
        mnuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCerrar);
        jMenu3.add(jSeparator2);

        mnuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuGuardar.setText("Guardar");
        mnuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarActionPerformed(evt);
            }
        });
        jMenu3.add(mnuGuardar);

        mnuGuardarC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuGuardarC.setText("Guardar como");
        mnuGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarCActionPerformed(evt);
            }
        });
        jMenu3.add(mnuGuardarC);

        jMenuBar2.add(jMenu3);

        jMenu1.setText("Ver");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        menuLexico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuLexico.setText("Analisis Léxico");
        menuLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLexicoActionPerformed(evt);
            }
        });
        jMenu1.add(menuLexico);

        menuSintactico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSintactico.setText("Analisis Sintactico");
        menuSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSintacticoActionPerformed(evt);
            }
        });
        jMenu1.add(menuSintactico);

        jMenu4.setText("Tablas");

        menuFunciones.setText("Tabla de funciones");
        menuFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionesActionPerformed(evt);
            }
        });
        jMenu4.add(menuFunciones);

        menuSimbolos.setText("Tabla de simbolos");
        menuSimbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSimbolosActionPerformed(evt);
            }
        });
        jMenu4.add(menuSimbolos);

        menuErrores.setText("Tabla de errores");
        menuErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuErroresActionPerformed(evt);
            }
        });
        jMenu4.add(menuErrores);

        jMenu1.add(jMenu4);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc=" analizadorLexico ">
    private void analizarLexico() throws IOException {
        tablaSimbolos = new TablaSimbolos();
        tokens.clear();
        String expr = txtEntrada.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        Symbol t;
        while ((t = lexer.next_token()).sym != analisis.sym.EOF) {
        }
        //tokens.forEach(token -> System.out.println(analisis.sym.terminalNames[token.sym]));
    }
    //</editor-fold>

    private void mnuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevoActionPerformed
        int op = javax.swing.JOptionPane.showConfirmDialog(this, "Desea guardar?");
        if (op == -1 || op == 2) {
            return;
        } else if (op == 0) {
            mnuGuardarActionPerformed(evt);
        }
        txtEntrada.setText("");
        archivo = "";
        this.setTitle("SMHE - Nuevo Archivo");
    }//GEN-LAST:event_mnuNuevoActionPerformed

    private void mnuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAbrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_mnuAbrirActionPerformed

    private void mnuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarActionPerformed
        if ("".equals(archivo)) {
            mnuGuardarActionPerformed(evt);
        }
        System.exit(0);
    }//GEN-LAST:event_mnuCerrarActionPerformed

    private void mnuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarActionPerformed
        guardarArchivo();
    }//GEN-LAST:event_mnuGuardarActionPerformed

    private void mnuGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarCActionPerformed
        guardarCArchivo();
    }//GEN-LAST:event_mnuGuardarCActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            //txtTokens.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        txtEntrada.cut();
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        txtEntrada.copy();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        txtEntrada.paste();
    }//GEN-LAST:event_btnPegarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarArchivo();
    }//GEN-LAST:event_btnGuardarActionPerformed

    /*private void colorear() throws IOException {
        colores.clear();
        LexerColor lexer;
        int posicion = txtEntrada.getCaretPosition();
        try {
            java.io.File entrada = new java.io.File("color.encrypter");
            java.io.FileOutputStream output = new java.io.FileOutputStream(entrada);
            txtEntrada.setText(txtEntrada.getText().replaceAll("[\r]+", ""));
            byte[] bytes = txtEntrada.getText().getBytes();
            output.write(bytes);
            lexer = new LexerColor(new BufferedReader(new InputStreamReader(new FileInputStream(entrada), "UTF8")));
            while (true) {
                TextColor color = lexer.yylex();
                if (color == null) {
                    break;
                } else {
                    colores.add(color);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        }
        Functions.colorTextPane(colores, txtEntrada, new Color(40, 40, 40));
        txtEntrada.setCaretPosition(posicion);
    }*/
    private void btnCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrerActionPerformed
        if (txtEntrada.getText().isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay código fuente para realizar el análisis");
        } else {
            analisisSintactico();
        }
    }//GEN-LAST:event_btnCorrerActionPerformed
    private void analisisSintactico() {
        errores = new TablaErrores();
        tablaSimbolos = new TablaSimbolos();
        funciones = new TablaFunciones();
        tokens.clear();
        txtError.setText("");

        String ST = txtEntrada.getText();
        Lexer lex = new Lexer(new java.io.StringReader(ST));
        SintaxPrueba sintax = new SintaxPrueba(lex);
        try {
            sintax.parse();
        } catch (Exception ex) {
            System.out.println("Algo salio mal: " + ex.getMessage());
            System.out.println(ex.getStackTrace()[0].getClassName() + ex.getStackTrace()[0].getLineNumber());
        }

        if (errores.getErrores().isEmpty()) {
            txtError.setText("Analisis realizado correctamente");
            txtError.setForeground(new Color(25, 111, 61));
        } else {
            txtError.setForeground(Color.red);
            for (String st : errores.getErrores()) {
                txtError.setText(txtError.getText() + st + "\n");
            }
        }
    }
    private void FuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuenteActionPerformed
        JFontChooser fc = new JFontChooser();
        JOptionPane.showMessageDialog(null, fc, "Elegir fuente", JOptionPane.PLAIN_MESSAGE);
        txtEntrada.setFont(fc.getSelectedFont());
    }//GEN-LAST:event_FuenteActionPerformed

    private void txtEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyReleased
        /*try {
            //if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_SPACE) {
            colorear();
            //}
        } catch (IOException ex) {
            System.out.println("Error inesperado");
        }*/
    }//GEN-LAST:event_txtEntradaKeyReleased

    private void menuSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSintacticoActionPerformed
        if (txtEntrada.getText().isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay código fuente para realizar el análisis");
        } else {
            analisisSintactico();
        }
    }//GEN-LAST:event_menuSintacticoActionPerformed

    private void menuLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLexicoActionPerformed
        if (txtEntrada.getText().isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay código fuente para realizar el análisis");
            return;
        }

        try {
            analizarLexico();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        if (!tokens.isEmpty()) {
            Tabla tabla = new Tabla("Tabla de tokens");
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            modelo.setColumnCount(0);
            modelo.addColumn("LEXEMA");
            modelo.addColumn("COMPONENTE LEXICO");
            modelo.addColumn("LINEA");
            tokens.forEach(token -> {
                String sym = analisis.sym.terminalNames[token.sym];
                int linea = token.left + 1;
                switch (sym) {

                    case "REL_MENOR" ->
                        modelo.addRow(new Object[]{"<", "REL_MENOR", linea});
                    case "REL_MAYOR" ->
                        modelo.addRow(new Object[]{">", "REL_MAYOR", linea});
                    case "REL_IGUAL" ->
                        modelo.addRow(new Object[]{"==", "REL_MAYOR", linea});
                    case "REL_DIFERENTE" ->
                        modelo.addRow(new Object[]{"!=", "REL_DIFERENTE", linea});
                    case "REL_MAYOR_IGUAL" ->
                        modelo.addRow(new Object[]{">=", "REL_MAYOR_IGUAL", linea});
                    case "REL_MENOR_IGUAL" ->
                        modelo.addRow(new Object[]{"<=", "REL_MENOR_IGUAL", linea});
                    case "AR_SUMA" ->
                        modelo.addRow(new Object[]{"+", "AR_SUMA", linea});
                    case "AR_RESTA" ->
                        modelo.addRow(new Object[]{"-", "AR_RESTA", linea});
                    case "AR_MULTIPLICACION" ->
                        modelo.addRow(new Object[]{"*", "AR_MULTIPLICACION", linea});
                    case "AR_DIVISION" ->
                        modelo.addRow(new Object[]{"/", "AR_DIVISION", linea});
                    case "NEGACION" ->
                        modelo.addRow(new Object[]{"!", "NEGACION", linea});
                    case "LOGICO_AND" ->
                        modelo.addRow(new Object[]{"||", "LOGICO_AND", linea});
                    case "LOGICO_OR" ->
                        modelo.addRow(new Object[]{"&&", "LOGICO_OR", linea});
                    case "INC" ->
                        modelo.addRow(new Object[]{"++", "INC", linea});
                    case "DEC" ->
                        modelo.addRow(new Object[]{"--", "DEC", linea});
                    case "ASIGNACION" ->
                        modelo.addRow(new Object[]{"=", "ASIGNACION", linea});
                    case "PARENTESIS_ABIERTO" ->
                        modelo.addRow(new Object[]{"(", "PARENTESIS_ABIERTO", linea});
                    case "PARENTESIS_CERRADO" ->
                        modelo.addRow(new Object[]{")", "PARENTESIS_CERRADO", linea});
                    case "LLAVE_ABIERTA" ->
                        modelo.addRow(new Object[]{"{", "LLAVE_ABIERTA", linea});
                    case "LLAVE_CERRADA" ->
                        modelo.addRow(new Object[]{"}", "LLAVE_CERRADA", linea});
                    case "CORCHETE_ABIERTO" ->
                        modelo.addRow(new Object[]{"[", "CORCHETE_ABIERTO", linea});
                    case "CORCHETE_CERRADO" ->
                        modelo.addRow(new Object[]{"]", "CORCHETE_CERRADO", linea});
                    case "COMA" ->
                        modelo.addRow(new Object[]{",", "COMA", linea});
                    case "PUNTO_COMA" ->
                        modelo.addRow(new Object[]{";", "PUNTO_COMA", linea});
                    case "NUMERO" ->
                        modelo.addRow(new Object[]{token.value, "NUMERO", linea});
                    case "OP_BOOLEANO" ->
                        modelo.addRow(new Object[]{((boolean) token.value) ? "verdadero" : "falso", "OP_BOOLEANO", linea});
                    case "IDENTIFICADOR" ->
                        modelo.addRow(new Object[]{token.value, "IDENTIFICADOR", linea});
                    case "error" ->
                        modelo.addRow(new Object[]{token.value, "error", linea});
                    default ->
                        modelo.addRow(new Object[]{sym.toLowerCase(), sym, linea});
                }
            });
            tabla.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            //txtTokens.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuLexicoActionPerformed

    private void menuFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionesActionPerformed
        if (funciones.tieneDatos()) {
            Tabla tabla = new Tabla("tabla de funciones");
            funciones.mostrarTabla((javax.swing.table.DefaultTableModel) tabla.getModel());
            tabla.setVisible(true);
            return;
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Es posible que no se haya hecho un intento de compilacion, favor de tratar de compilar para crear las tablas", "tabla de funciones vacia", javax.swing.JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuFuncionesActionPerformed

    private void menuSimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSimbolosActionPerformed
        if (tablaSimbolos.tieneDatos()) {
            Tabla tabla = new Tabla("tabla de simbolos");
            tablaSimbolos.verTabla((javax.swing.table.DefaultTableModel) tabla.getModel());
            tabla.setVisible(true);
            return;
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Es posible que no se haya hecho un intento de compilacion, favor de tratar de compilar para crear las tablas", "tabla de simbolos vacia", javax.swing.JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuSimbolosActionPerformed

    private void menuErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuErroresActionPerformed
        InfoErrores info = new InfoErrores(errores.infoErrores());
        info.setVisible(true);
    }//GEN-LAST:event_menuErroresActionPerformed

    // Funciones
    //Pendiente
    private void nuevoArchivo() {
        if (txtEntrada.getText().equals("")) {
            return;
        }
        int op = javax.swing.JOptionPane.showConfirmDialog(this, "Desea guardar?");
        if (op == -1 || op == 2) {
            return;
        } else if (op == 0) {
            guardarArchivo();
        }
        txtEntrada.setText("");
        archivo = "";
    }

    private void abrirArchivo() {
        JFileChooser fc = getJFileChooser();
        fc.setCurrentDirectory(new java.io.File(System.getProperty("user.dir")));
        fc.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("ARCHIVOS SMHE", "smhe", "SMHE"));
        int state = fc.showOpenDialog(this.getJFrame());
        String s1, sl;

        if (state == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            if (!(f.getName().endsWith(".smhe") || f.getName().endsWith(".SMHE"))) {
                JOptionPane.showMessageDialog(null, "Solo los archivos con extensión .smhe son admitidos");
                abrirArchivo();
                return;
            }
            try {
                archivo = f.getAbsolutePath();
                BufferedReader br = new BufferedReader(new FileReader(f));

                sl = br.readLine();
                while ((s1 = br.readLine()) != null) {
                    sl = sl + "\n" + s1;
                }
                txtEntrada.setText(sl);
                //analizarLexico();
                //colorear();

                br.close();    //cierra el flujo
                this.setTitle("SMHE - " + f.getName());
            } catch (IOException ex) {
                showMessageDialog(null, ex);
            }
        }
    }
    //Pendiente

    private void guardarArchivo() {
        if (archivo.equals("")) {
            guardarCArchivo();
            return;
        }
        try {
            //Flujos de Caracteres
            java.io.FileWriter fcs = new java.io.FileWriter(archivo);
            fcs.write(txtEntrada.getText());
            fcs.flush();
            fcs.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Pendiente

    private void guardarCArchivo() {
        javax.swing.JFileChooser f = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("ARCHIVOS SMHE", "smhe", "SMHE");
        f.setFileFilter(filtro);

        String dir = System.getProperty("user.dir");
        File directorio = new File(dir);
        f.setCurrentDirectory(directorio);
        int opcion = f.showSaveDialog(this);
        if (opcion == javax.swing.JFileChooser.APPROVE_OPTION && f.getFileFilter() == filtro) {
            archivo = dir + System.getProperty("file.separator")
                    + (f.getSelectedFile().getName().endsWith(".smhe") ? f.getSelectedFile().getName() : f.getSelectedFile().getName() + ".smhe");
            this.setTitle("SMHE - " + f.getSelectedFile().getName());
            guardarArchivo();
        } else if (opcion == javax.swing.JFileChooser.CANCEL_OPTION || opcion == javax.swing.JFileChooser.ABORT) {
        } else {
            showMessageDialog(this, "Solo archivos de texto");
        }
    }

    public String[] ordenarLista(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i].compareTo(lista[j]) > 0) {
                    String temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
        }
        return lista;
    }

    private static FileFilter textFileFilter = new FileFilter() {

        @Override
        public boolean accept(File f) {
            //acepta directorios y archivos de extensión .txt
            return f.isDirectory() || f.getName().toLowerCase().endsWith("sh");
        }

        @Override
        public String getDescription() {
            //la descripción del tipo de archivo aceptado
            return "Archivos SH";
        }
    };

    private static JFileChooser getJFileChooser() {
        JFileChooser fc = new JFileChooser();                     //construye un JFileChooser
        fc.setDialogTitle("SH - Elige un archivo:");    //se le establece un título
        fc.setMultiSelectionEnabled(false);                       //desactiva la multi-selección
        fc.setFileFilter(textFileFilter);                         //aplica un filtro de extensiones
        return fc;    //retorna el JFileChooser
    }

    JFrame getJFrame() {
        return this;
    }

    // Codigo main
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Fuente;
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCorrer;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPegar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblConsola;
    private javax.swing.JMenuItem menuErrores;
    private javax.swing.JMenuItem menuFunciones;
    private javax.swing.JMenuItem menuLexico;
    private javax.swing.JMenuItem menuSimbolos;
    private javax.swing.JMenuItem menuSintactico;
    private javax.swing.JMenuItem mnuAbrir;
    private javax.swing.JMenuItem mnuCerrar;
    private javax.swing.JMenuItem mnuGuardar;
    private javax.swing.JMenuItem mnuGuardarC;
    private javax.swing.JMenuItem mnuNuevo;
    private javax.swing.JPanel panelConsola;
    private javax.swing.JScrollPane scrollConsola;
    private javax.swing.JScrollPane scrollEntrada;
    private javax.swing.JToolBar.Separator sep0;
    private javax.swing.JToolBar.Separator sep1;
    private javax.swing.JToolBar.Separator sep2;
    private javax.swing.JToolBar.Separator sep3;
    public static javax.swing.JTextPane txtEntrada;
    public static javax.swing.JTextArea txtError;
    // End of variables declaration//GEN-END:variables
}
