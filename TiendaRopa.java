import javax.swing.*;
import java.awt.event.*;

public class TiendaRopa extends JFrame implements ActionListener,ItemListener{
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private JLabel etiqueta5;
    
    private JComboBox <String> combo1;
    private JComboBox <String> combo2;
    private JComboBox <String> combo3;
    private JComboBox <String> combo4;
    private JComboBox <String> combo5;
    private JComboBox <String> combo6;
    private JComboBox <String> combo7;
    private JComboBox <String> combo8;

    private JButton boton1;
    private JTextArea areatexto1;
    String eleccion = "";  
   
    public TiendaRopa(){
        setLayout(null);
  
        etiqueta1 = new JLabel("Pantalon");		//pantalon
        etiqueta1.setBounds(10,10,200,20);
        add(etiqueta1);

        etiqueta2 = new JLabel("Camisa");		//camisa
        etiqueta2.setBounds(10,160,200,20);
        add(etiqueta2);

        etiqueta3 = new JLabel("Calcetas");		//calcetas
        etiqueta3.setBounds(10,270,200,20);
        add(etiqueta3);
        
        etiqueta4 = new JLabel("Infantil");		//ropa infantil
        etiqueta4.setBounds(10,340,200,20);
        add(etiqueta4);

        etiqueta5 = new JLabel("Resumen de tu pedido");	//pedido para area de texto
        etiqueta5.setBounds(250,10,200,20);
        add(etiqueta5);

        combo1 = new JComboBox<String>();	//elegir talla pantalon
        combo1.setBounds(10,40,200,30);
        add(combo1);
        combo1.setEditable(false);
        combo1.addItem("Talla");
        combo1.addItem("CH");
        combo1.addItem("MED");
        combo1.addItem("GDE");
        combo1.addItemListener(this);

        combo2 = new JComboBox<String>();	//elegir color pantalon
        combo2.setBounds(10,80,200,30);
        add(combo2);
        combo2.setEditable(false);
        combo2.addItem("Color");
        combo2.addItem("Azul");
        combo2.addItem("Negro");
        combo2.addItem("Cafe");
        combo2.addItemListener(this);

        combo3 = new JComboBox<String>();	//elegir corte pantalon
        combo3.setBounds(10,120,200,30);
        add(combo3);
        combo3.setEditable(false);
        combo3.addItem("Corte");
        combo3.addItem("Skinny");
        combo3.addItem("Recto");
        combo3.addItem("Vaquero");
        combo3.addItemListener(this);

        combo4 = new JComboBox<String>();	//elegir talla de camisa
        combo4.setBounds(10,190,200,30);
        add(combo4);
        combo4.setEditable(false);
        combo4.setSelectedItem("Talla");
        combo4.addItem("CH");
        combo4.addItem("MED");
        combo4.addItem("GDE");
        combo4.addItemListener(this);

        combo5 = new JComboBox<String>();	//elegir color camisa
        combo5.setBounds(10,230,200,30);
        add(combo5);
        combo5.setEditable(false);
        combo5.setSelectedItem("Color");
        combo5.addItem("Blanca");
        combo5.addItem("Roja");
        combo5.addItem("Azul");
        combo5.addItemListener(this);

        combo6 = new JComboBox<String>();	//elegir calcetas H/M
        combo6.setBounds(10,300,200,30);
        add(combo6);
        combo6.setEditable(false);
        combo6.setSelectedItem("Hombe/Mujer");
        combo6.addItem("Hombre");
        combo6.addItem("Mujer");
        combo6.addItemListener(this);

        combo7 = new JComboBox<String>();	//elegir ropa infantil ninio(a)
        combo7.setBounds(10,370,200,30);
        add(combo7);
        combo7.setEditable(false);
        combo7.setSelectedItem("nino/nina");
        combo7.addItem("Nino");
        combo7.addItem("Nina");
        combo7.addItemListener(this);

        combo8 = new JComboBox<String>();	//elegir meses ropa infantil
        combo8.setBounds(10,410,200,30);
        add(combo8);
        combo8.setEditable(false);
        combo8.setSelectedItem("Talla");
        combo8.addItem("0 - 3 meses");
        combo8.addItem("3 - 6 meses");
        combo8.addItem("6 - 12 meses");
        combo8.addItem("1 - 2 anios");
        combo8.addItem("2 - 3 anios");
        combo8.addItemListener(this);
              
        boton1 = new JButton("HACER PEDIDO");
        boton1.setBounds(250,400,300,40);
        add(boton1);
        boton1.addActionListener(this);

         areatexto1 = new JTextArea();
         areatexto1.setBounds(250,40,300,350);
         add(areatexto1);       
    }
    
    public void itemStateChanged(ItemEvent e) {
        eleccion = "";
        eleccion += "PANTALON\n";
        eleccion += "Talla: " + combo1.getSelectedItem().toString() + "\n";
        eleccion += "Color: " + combo2.getSelectedItem().toString() + "\n";
        eleccion += "Corte: " + combo3.getSelectedItem().toString() + "\n";

        eleccion += "\nCAMISA\n";
        eleccion += "Talla: " + combo4.getSelectedItem().toString() + "\n";
        eleccion += "Color: " + combo5.getSelectedItem().toString() + "\n";

        eleccion += "\nCALCETAS\n";
        eleccion += "Para: " + combo6.getSelectedItem().toString() + "\n";

        eleccion += "\nROPA INFANTIL\n";
        eleccion += "Para: " + combo7.getSelectedItem().toString() + "\n";
        eleccion += "Talla: " + combo8.getSelectedItem().toString() + "\n";  
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
          areatexto1.setText(eleccion);
          eleccion = "";
        }
    }

    public static void main(String args[]){
        TiendaRopa compra1 = new TiendaRopa();
        compra1.setBounds(0,0,570,480);
        compra1.setVisible(true);
        compra1.setResizable(false);
        compra1.setLocationRelativeTo(null);
        compra1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        compra1.setTitle("Registro de compra");
    }

}
