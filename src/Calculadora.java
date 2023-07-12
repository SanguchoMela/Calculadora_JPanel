import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JPanel rootPanel;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton button_dividir;
    private JButton button_7;
    private JButton button_8;
    private JButton button_9;
    private JButton button_multiplicar;
    private JButton button_4;
    private JButton button_5;
    private JButton button_6;
    private JButton button_menos;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_mas;
    private JButton button_potencia;
    private JButton button_0;
    private JButton button_raiz;
    private JButton button_equal;
    private JLabel cajaTotal;
    private JLabel cajaOp;
    private JButton button_borrarIn;
    private JButton button_borrarTodo;
    private JButton button_percent;
    private JButton button_coma;

    double num1=0;
    double num2=0;
    String operacion;

    public Calculadora() {
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+"1");

            }
        });
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+"2");
            }
        });
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+"3");
            }
        });
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+"4");
            }
        });
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+"5");
            }
        });
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+"6");
            }
        });
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+"7");
            }
        });
        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+"8");
            }
        });
        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+"9");
            }
        });
        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+"0");
            }
        });
        button_coma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cajaTotal.getText() == "0" | cajaTotal.getText() == null){
                    cajaTotal.setText("");
                }
                cajaTotal.setText(cajaTotal.getText()+".");
            }
        });
        //--------------ACCIONES PARA BOTONES DE OPERACIONES BASICAS------------------
        button_mas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cajaTotal.getText());
                operacion = "suma";
                cajaOp.setText(cajaTotal.getText()+" + ");
                cajaTotal.setText("");
            }
        });
        button_menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cajaTotal.getText());
                operacion = "resta";
                cajaOp.setText(cajaTotal.getText()+" - ");
                cajaTotal.setText("");
            }
        });
        button_multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cajaTotal.getText());
                operacion = "multiplicacion";
                cajaOp.setText(cajaTotal.getText()+" * ");
                cajaTotal.setText("");
            }
        });
        button_dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cajaTotal.getText());
                operacion = "division";
                cajaOp.setText(cajaTotal.getText()+" / ");
                cajaTotal.setText("");
            }
        });
        button_potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cajaTotal.getText());
                operacion = "potencia";
                cajaOp.setText(cajaTotal.getText()+" ^ ");
                cajaTotal.setText("");
            }
        });
        button_raiz.addActionListener(new ActionListener() {
            //el registro del numero y la operacion se realizan en el mismo boton
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cajaTotal.getText());
                cajaOp.setText(" √ " + cajaTotal.getText());
                cajaTotal.setText("");

                //Operacion raiz cuadrada realizada
                cajaOp.setText("√" + num1 + " = ");
                double resultado = Math.sqrt(num1);
                cajaTotal.setText(String.valueOf(resultado));
                num1 = resultado;
            }
        });

        //Funciones trigonométricas-------------------------------------------------------------------------------------
        /////SENO/////
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cajaTotal.getText());
                cajaOp.setText("sin(" + cajaTotal.getText() + ")");
                cajaTotal.setText("");

                //Operacion seno realizada
                cajaOp.setText("sin(" + num1 + ") = ");
                double radianes = Math.toRadians(num1);
                double resultado = Math.sin(radianes);
                cajaTotal.setText(String.valueOf(resultado));
                num1 = radianes;
            }
        });
        /////COSENO/////
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cajaTotal.getText());
                cajaOp.setText("cos(" + cajaTotal.getText() + ")");
                cajaTotal.setText("");

                //Operacion coseno realizada
                cajaOp.setText("cos(" + num1 + ") = ");
                double radianes = Math.toRadians(num1);
                double resultado = Math.cos(radianes);
                cajaTotal.setText(String.valueOf(resultado));
                num1 = radianes;
            }
        });
        /////TANGENTE/////
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cajaTotal.getText());
                cajaOp.setText("tan(" + cajaTotal.getText() + ")");
                cajaTotal.setText("");

                //Operacion tangente realizada
                cajaOp.setText("tan(" + num1 + ") = ");
                double radianes = Math.toRadians(num1);
                double resultado = Math.tan(radianes);
                cajaTotal.setText(String.valueOf(resultado));
                num1 = radianes;
            }
        });
        /////PORCENTAJE/////
        button_percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(cajaTotal.getText());
                cajaOp.setText(num1 + " * "+ num2 + "% = ");

                double resultado = num1*(num2/100);
                cajaTotal.setText(String.valueOf(resultado));
                num1 = resultado;
            }
        });
        //Operaciones que se realizan con el boton de igual (=)---------------------------------------------------------
        button_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(cajaTotal.getText());
                if(operacion == "suma"){
                    cajaOp.setText(num1 + " + "+ num2 + " = ");
                    double resultado = num1+num2;
                    cajaTotal.setText(String.valueOf(resultado));
                    num1 = resultado;
                }
                else if(operacion == "resta"){
                    cajaOp.setText(num1 + " - "+ num2 + " = ");
                    double resultado = num1-num2;
                    cajaTotal.setText(String.valueOf(resultado));
                    num1 = resultado;
                }
                else if(operacion == "multiplicacion"){
                    cajaOp.setText(num1 + " * "+ num2 + " = ");
                    double resultado = num1*num2;
                    cajaTotal.setText(String.valueOf(resultado));
                    num1 = resultado;
                }

                else if(operacion == "division"){
                    cajaOp.setText(num1 + " / "+ num2 + " = ");
                    double resultado = num1/num2;
                    cajaTotal.setText(String.valueOf(resultado));
                    num1 = resultado;
                }

                else if(operacion == "potencia"){
                    cajaOp.setText(num1 + " ^ "+ num2 + " = ");
                    double resultado = Math.pow(num1,num2);
                    cajaTotal.setText(String.valueOf(resultado));
                    num1 = resultado;
                }
            }
        });
        /*
        button_borrarIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajaTotal.setText(null);
                //operacion = "";
            }
        });
         */
        button_borrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajaTotal.setText(null);
                cajaOp.setText(null);
                num1 = num2 = 0;
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,500);
        frame.setResizable(true);
    }
}

