package Metodo;
/*se importan las librerias a usar */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    /* se crean las variables para las personas y el tamaño
     se crea el array pers de la clase personas*/
    Persona p;
    public Persona pers[];
    int t;

    //se inicializan todos los componentes de la ventana
    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        Menucargar = new javax.swing.JMenuItem();
        Menuguardar = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenuItem();
        JOpciones = new javax.swing.JMenu();
        jAddperson = new javax.swing.JMenuItem();
        jMagperso = new javax.swing.JMenuItem();
        ButtonAcercaDe = new javax.swing.JMenu();
        AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programa De Almacenamiento de Datos");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nube_de_almacenamiento.jpg"))); // NOI18N

        MenuArchivo.setText("Archivos");
        MenuArchivo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                MenuArchivoComponentAdded(evt);
            }
        });
        MenuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArchivoActionPerformed(evt);
            }
        });

        Menucargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Menucargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folder_add.png"))); // NOI18N
        Menucargar.setText("Cargar");
        Menucargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenucargarActionPerformed(evt);
            }
        });
        MenuArchivo.add(Menucargar);

        Menuguardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        Menuguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        Menuguardar.setText("Guardar");
        Menuguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuguardarActionPerformed(evt);
            }
        });
        MenuArchivo.add(Menuguardar);

        MenuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir-de-gnome-icono-7637-16.png"))); // NOI18N
        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuSalir);

        jMenuBar1.add(MenuArchivo);

        JOpciones.setText("Opciones");

        jAddperson.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jAddperson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group_add.png"))); // NOI18N
        jAddperson.setText("Agregar Personas");
        jAddperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddpersonActionPerformed(evt);
            }
        });
        JOpciones.add(jAddperson);

        jMagperso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMagperso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/table.png"))); // NOI18N
        jMagperso.setText("Lista de Personas");
        jMagperso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMagpersoActionPerformed(evt);
            }
        });
        JOpciones.add(jMagperso);

        jMenuBar1.add(JOpciones);

        ButtonAcercaDe.setText("A Cerca De");
        ButtonAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAcercaDeActionPerformed(evt);
            }
        });

        AcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/information.png"))); // NOI18N
        AcercaDe.setText("Creadores");
        AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDeActionPerformed(evt);
            }
        });
        ButtonAcercaDe.add(AcercaDe);

        jMenuBar1.add(ButtonAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(474, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuArchivoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_MenuArchivoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuArchivoComponentAdded

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        //se hace para cerrar el programa cuando se hace click en la opcion salir 
        System.exit(0);
    }//GEN-LAST:event_MenuSalirActionPerformed

    private void jMagpersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMagpersoActionPerformed
        /*se hace para cargar la ventana de lista de personas y se le pasa como parametro
         la varible "pers" para poder llamarla en la otra ventana, ademas se usa un try
         para enviar un mensaje de error cuando no se ha agregado una persona a la lista 
         o no se ha cargado una lista dese un archivo*/
        try {
            Listapersonas lista = new Listapersonas(pers, this);
            lista.setVisible(true);

        } catch (Exception e2) {
            JOptionPane.showMessageDialog(this, "ERROR!!! Agregue personas o cargue una lista para continuar");
        }
    }//GEN-LAST:event_jMagpersoActionPerformed

    private void jAddpersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddpersonActionPerformed
        /* 1. se crea un Integer para obtener el tamaño del array donde se almacenaran los objetos
         2. se crea el array y se le asigna el tamaño almacenado en la variable tam
         3. se lanza un mensaje indicando el tamaño con el que se inicio la variable
         4. se crea la ventana y se pasan como parametros el tamaño y la variable del array para poder usarlos 
         en la otra ventana y por ultimo hacemos visible la ventana agregar*/
        int tam = Integer.parseInt(
                JOptionPane.showInputDialog("Entre tamaño de la lista: "));
        pers = new Persona[tam];
        t = tam;

        JOptionPane.showMessageDialog(null,
                "La lista se inicializó con tamaño: " + tam);
        Agregar fa = new Agregar(pers, t);
        fa.setVisible(true);
    }//GEN-LAST:event_jAddpersonActionPerformed

    private void MenuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArchivoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MenuArchivoActionPerformed

    private void MenuguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuguardarActionPerformed
        /* se llama la funcion para guardar la lista*/
        guardarLista();
    }//GEN-LAST:event_MenuguardarActionPerformed

    private void MenucargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenucargarActionPerformed
        /* se llama la funcion para cargar la lista*/
        cargarDatos();
    }//GEN-LAST:event_MenucargarActionPerformed

    private void ButtonAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAcercaDeActionPerformed

    }//GEN-LAST:event_ButtonAcercaDeActionPerformed

    private void AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDeActionPerformed
        /*se llama la ventana acerca de: personas*/
        ACercaDe acerca = new ACercaDe();
        acerca.setVisible(true);
    }//GEN-LAST:event_AcercaDeActionPerformed
    /* se crea esta funcion donde lo que se hace es cargar el archivo de texto creado donde se guardan los datos */

    private void cargarDatos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String string = "";
        

        JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);
        File abre=file.getSelectedFile();
        try {
            /* Apertura del fichero y creacion de BufferedReader para poder
             hacer una lectura comoda (disponer del metodo readLine()).*/
            
            fr = new FileReader(abre);
            br = new BufferedReader(fr);

            /* Lectura del fichero y se cuentan cuantas lineas tiene el fichero
             cada vez que se termine de contar una line se coloca un /n para que haga un salto de linea
             asi cuando la tabla lea el archivo lo lea ordenadamente*/
            String linea;
            String lineas = "";
            int lineasCount = 0;
            while ((linea = br.readLine()) != null) {
                lineas = lineas + linea + "\n";
                lineasCount++;
            }

            /* se crea un nuevo array de tamaño de las lineas contadas
             y se almacena en cada una de las posiciones del array el objeto personas con cada uno de sus atributos*/
            pers = new Persona[lineasCount];
            String[] registros = lineas.split("\n");
            for (int i = 0; i < registros.length; i++) {
                System.out.println("registro:" + registros[i]);
                String[] registro = registros[i].split(",");
                Persona perTmp = new Persona();
                perTmp.tipodoc = registro[0];
                perTmp.ndoc = registro[1];
                perTmp.noms = registro[2];
                perTmp.apells = registro[3];
                perTmp.email = registro[4];
                perTmp.ncel = registro[5];
                perTmp.fnaci = registro[6];

                pers[i] = perTmp;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /* En el finally cerramos el fichero, para asegurarnos
             que se cierra tanto si todo va bien como si salta una excepcion.*/
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(this, "Elmentos cargados");
    }
    /* la funcion guardarlista para crear el fichero */

    private void guardarLista() {
        FileWriter fichero = null;
        PrintWriter pw = null;
        JFileChooser file=new JFileChooser();
        file.showSaveDialog(this);
        File guarda =file.getSelectedFile();
        /* se define un try donde se crea el archivo y su direccion la direccion donde se guarda el archivo*/
        try {
            
    JOptionPane.showMessageDialog(null,
         "El archivo se a guardado Exitosamente",
             "Información",JOptionPane.INFORMATION_MESSAGE);
    
            fichero = new FileWriter(guarda+".txt");
            
            pw = new PrintWriter(fichero);
            /* se crea un for para imprimir los datos de cada una de las persona en el documento*/
            for (Persona p : pers) {
                pw.println(p.tipodoc + "," + p.ndoc + "," + p.noms + "," + p.apells + "," + p.email + "," + p.ncel + "," + p.fnaci);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error escribiendo en el archivo " + ex.getMessage());
        } finally {
            try {
                /* se usa el finally para asegurarse que se cierra el fichero*/
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(this, "Elmentos guardados");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AcercaDe;
    private javax.swing.JMenu ButtonAcercaDe;
    private javax.swing.JMenu JOpciones;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JMenuItem Menucargar;
    private javax.swing.JMenuItem Menuguardar;
    private javax.swing.JMenuItem jAddperson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMagperso;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
