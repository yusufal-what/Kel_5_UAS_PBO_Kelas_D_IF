package Projectuas_pbo;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class kalkulator extends javax.swing.JFrame {
    
    double currentResult = 0;
    String operator = "";
    boolean startNewNumber = true;
    
    public kalkulator() {
        initComponents();
        this.setResizable(false); 
    }
    
      private void performCalculation(String op) {
        double input = Double.parseDouble(isilahnomor.getText());
        if (!operator.isEmpty()) {
            calculateFinalResult();
        } else {
            currentResult = input;
        }
        operator = op;
        startNewNumber = true;
    }

    private void performCalculation() {
        if (!operator.isEmpty()) {
            calculateFinalResult();
        }
    }

    private void toggleButtons(boolean enable) {
    delete.setEnabled(enable);
    clear.setEnabled(enable);
    akar.setEnabled(enable);
    no7.setEnabled(enable);
    bagi.setEnabled(enable);
    persen.setEnabled(enable);
    kurang.setEnabled(enable);
    no1.setEnabled(enable);
    no2.setEnabled(enable);
    no3.setEnabled(enable);
    no5.setEnabled(enable);
    tambah.setEnabled(enable);
    no0.setEnabled(enable);
    no00.setEnabled(enable);
    titik.setEnabled(enable);
    samadengan.setEnabled(enable);
    plusmin.setEnabled(enable);
    no9.setEnabled(enable);
    no8.setEnabled(enable);
    no6.setEnabled(enable);
    no4.setEnabled(enable);
    kali.setEnabled(enable);
    isilahnomor.setEnabled(enable);
    convert.setEnabled(enable);
    jbtnLog.setEnabled(enable);
    jbtnPi.setEnabled(enable);
    jbtnXpangkatY.setEnabled(enable);
    jbtnXY2.setEnabled(enable);
    jbtnXY3.setEnabled(enable);
    jbtnSin.setEnabled(enable);
    jbtnSinh.setEnabled(enable);
    Cos.setEnabled(enable);
    jbtnCosh.setEnabled(enable);
    Hex.setEnabled(enable);
    Tan.setEnabled(enable);
    jbtnTanh.setEnabled(enable);
    Bin.setEnabled(enable);
    in.setEnabled(enable);
    Inx.setEnabled(enable);
    decimal.setEnabled(enable);
    factorial.setEnabled(enable);
    e.setEnabled(enable);
    Mod.setEnabled(enable);
    Octal.setEnabled(enable);

    
}

    private void calculateFinalResult() {
     try {
        double input = 0; 
        if (!isilahnomor.getText().isEmpty()) {
            input = Double.parseDouble(isilahnomor.getText());
        }
        switch (operator) {
            case "+" -> currentResult += input;
            case "-" -> currentResult -= input;
            case "X" -> currentResult *= input;
            case "/" -> {
                if (input != 0) {
                    currentResult /= input;
                } else {
                    isilahnomor.setText("Error: Division by zero");
                    return;
                }
            }
            case "mod" -> currentResult %= input;
            case "pangkat" -> currentResult = Math.pow(currentResult, input);
            case "sin" -> currentResult = Math.sin(Math.toRadians(currentResult));
            case "cos" -> currentResult = Math.cos(Math.toRadians(currentResult));
            case "tan" -> currentResult = Math.tan(Math.toRadians(currentResult));
            case "tanh" -> currentResult = Math.tanh(currentResult);
            case "sinh" -> currentResult = Math.sinh(currentResult);
            case "cosh" -> currentResult = Math.cosh(currentResult);
            case "log" -> {
                if (currentResult > 0 && input > 0) {
                    currentResult = Math.log(input) / Math.log(currentResult); 
                } else {
                    isilahnomor.setText("Error: Logarithm requires positive numbers");
                    return;
                }
            }
            case "ln" -> currentResult = Math.log(currentResult);
            case "inx" -> currentResult = Math.log10(currentResult); 
            case "sqrt" -> currentResult = Math.sqrt(currentResult);
            case "cbrt" -> currentResult = Math.cbrt(currentResult);
            case "factorial" -> currentResult = factorial((int) currentResult); 
            case "hex" -> isilahnomor.setText(Integer.toString((int) currentResult, 16).toUpperCase());
            case "octal" -> isilahnomor.setText(Integer.toString((int) currentResult, 8));
            case "bin" -> isilahnomor.setText(Integer.toString((int) currentResult, 2)); 
            case "pi" -> currentResult = currentResult * Math.PI;
            case "e" -> currentResult = Math.E;
        }

        if (!operator.equals("hex") && !operator.equals("octal")) {
            isilahnomor.setText(String.valueOf(currentResult));
        }

        isilahnomor.setText(String.valueOf(currentResult));
        operator = ""; 

    } catch (NumberFormatException e) {
        isilahnomor.setText("Invalid input!");
    }
    }
    
    private double factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    
    private String mode;
    private void appendNumber(String number) {
        if (startNewNumber) {
            isilahnomor.setText(number);
            startNewNumber = false;
        } else {
            isilahnomor.setText(isilahnomor.getText() + number);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isilahnomor = new javax.swing.JTextField();
        ONBUTTON = new javax.swing.JRadioButton();
        OFFFBUTTON = new javax.swing.JRadioButton();
        clear = new javax.swing.JButton();
        akar = new javax.swing.JButton();
        no7 = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        persen = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        no1 = new javax.swing.JButton();
        no2 = new javax.swing.JButton();
        no3 = new javax.swing.JButton();
        no5 = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        no00 = new javax.swing.JButton();
        titik = new javax.swing.JButton();
        samadengan = new javax.swing.JButton();
        plusmin = new javax.swing.JButton();
        no9 = new javax.swing.JButton();
        no8 = new javax.swing.JButton();
        no6 = new javax.swing.JButton();
        no4 = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        no0 = new javax.swing.JButton();
        jbtnSin = new javax.swing.JButton();
        jbtnSinh = new javax.swing.JButton();
        Cos = new javax.swing.JButton();
        jbtnCosh = new javax.swing.JButton();
        jbtnXpangkatY = new javax.swing.JButton();
        jbtnLog = new javax.swing.JButton();
        jbtnPi = new javax.swing.JButton();
        jbtnXY2 = new javax.swing.JButton();
        Hex = new javax.swing.JButton();
        Tan = new javax.swing.JButton();
        in = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        jbtnXY3 = new javax.swing.JButton();
        jbtnTanh = new javax.swing.JButton();
        Bin = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        Inx = new javax.swing.JButton();
        e = new javax.swing.JButton();
        Mod = new javax.swing.JButton();
        Octal = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        Box = new javax.swing.JComboBox<>();
        jisi2 = new javax.swing.JTextField();
        jisi1 = new javax.swing.JTextField();
        jKolom1 = new javax.swing.JTextField();
        jKolom2 = new javax.swing.JTextField();
        jKolom3 = new javax.swing.JTextField();
        jKolom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        convertB = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        standard = new javax.swing.JMenuItem();
        scientific = new javax.swing.JMenuItem();
        menuunit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        isilahnomor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        isilahnomor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        isilahnomor.setToolTipText("\"\"");
        isilahnomor.setActionCommand("<Not Set>");
        isilahnomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isilahnomorActionPerformed(evt);
            }
        });
        isilahnomor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                isilahnomorKeyTyped(evt);
            }
        });

        ONBUTTON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ONBUTTON.setText("ON");
        ONBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONBUTTONActionPerformed(evt);
            }
        });

        OFFFBUTTON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OFFFBUTTON.setText("OFF");
        OFFFBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFFFBUTTONActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("C");
        clear.setToolTipText("");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        akar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        akar.setText("√");
        akar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akarActionPerformed(evt);
            }
        });

        no7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no7.setText("7");
        no7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no7ActionPerformed(evt);
            }
        });

        bagi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bagi.setText("÷");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        persen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        persen.setText("%");
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });

        kurang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        no1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no1.setText("1");
        no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no1ActionPerformed(evt);
            }
        });

        no2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no2.setText("2");
        no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no2ActionPerformed(evt);
            }
        });

        no3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no3.setText("3");
        no3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no3ActionPerformed(evt);
            }
        });

        no5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no5.setText("5");
        no5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no5ActionPerformed(evt);
            }
        });

        tambah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        no00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no00.setText("00");
        no00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no00ActionPerformed(evt);
            }
        });

        titik.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titik.setText(".");
        titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titikActionPerformed(evt);
            }
        });

        samadengan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        samadengan.setText("=");
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });

        plusmin.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        plusmin.setText("±");
        plusmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminActionPerformed(evt);
            }
        });

        no9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no9.setText("9");
        no9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no9ActionPerformed(evt);
            }
        });

        no8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no8.setText("8");
        no8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no8ActionPerformed(evt);
            }
        });

        no6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        no6.setText("6");
        no6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no6ActionPerformed(evt);
            }
        });

        no4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        no4.setText("4");
        no4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no4ActionPerformed(evt);
            }
        });

        kali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kali.setText("X");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("DEL");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        no0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no0.setText("0");
        no0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no0ActionPerformed(evt);
            }
        });

        jbtnSin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnSin.setText("Sin");
        jbtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinActionPerformed(evt);
            }
        });

        jbtnSinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnSinh.setText("Sinh");
        jbtnSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinhActionPerformed(evt);
            }
        });

        Cos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cos.setText("Cos");
        Cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CosActionPerformed(evt);
            }
        });

        jbtnCosh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnCosh.setText("Cosh");
        jbtnCosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCoshActionPerformed(evt);
            }
        });

        jbtnXpangkatY.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnXpangkatY.setText("x^y");
        jbtnXpangkatY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXpangkatYActionPerformed(evt);
            }
        });

        jbtnLog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnLog.setText("Log");
        jbtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogActionPerformed(evt);
            }
        });

        jbtnPi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnPi.setText("π");
        jbtnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPiActionPerformed(evt);
            }
        });

        jbtnXY2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnXY2.setText("x^2");
        jbtnXY2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXY2ActionPerformed(evt);
            }
        });

        Hex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Hex.setText("Hex");
        Hex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HexActionPerformed(evt);
            }
        });

        Tan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Tan.setText("Tan");
        Tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanActionPerformed(evt);
            }
        });

        in.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        in.setText("In");
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });

        decimal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        decimal.setText("Dec");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        jbtnXY3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnXY3.setText("x^3");
        jbtnXY3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXY3ActionPerformed(evt);
            }
        });

        jbtnTanh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnTanh.setText("Tanh");
        jbtnTanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanhActionPerformed(evt);
            }
        });

        Bin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bin.setText("Bin");
        Bin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinActionPerformed(evt);
            }
        });

        factorial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        factorial.setText("n!");
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });

        Inx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Inx.setText("Inx");
        Inx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InxActionPerformed(evt);
            }
        });

        e.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        e.setText("e");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        Mod.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Mod.setText("Mod");
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });

        Octal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Octal.setText("Octal");
        Octal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OctalActionPerformed(evt);
            }
        });

        convert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        convert.setText("Convert");
        convert.setToolTipText("");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        Box.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Option", "Distance", "Speed", "Time" }));
        Box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxActionPerformed(evt);
            }
        });

        jisi2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jisi2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jisi1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jisi1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jisi1ActionPerformed(evt);
            }
        });

        jKolom1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jKolom1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jKolom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKolom1ActionPerformed(evt);
            }
        });

        jKolom2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jKolom2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jKolom3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jKolom3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jKolom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jKolom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        convertB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        convertB.setText("Convert");
        convertB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        convertB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBActionPerformed(evt);
            }
        });

        file.setText("File");
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });

        standard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        standard.setText("Standard");
        standard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardActionPerformed(evt);
            }
        });
        file.add(standard);

        scientific.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        scientific.setText("Scientific");
        scientific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scientificActionPerformed(evt);
            }
        });
        file.add(scientific);

        menuunit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuunit.setText("Unit Conversion");
        menuunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuunitActionPerformed(evt);
            }
        });
        file.add(menuunit);

        jMenuBar1.add(file);

        edit.setText("Edit");
        jMenuBar1.add(edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(no7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(no00, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(plusmin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(akar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(no4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ONBUTTON)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(OFFFBUTTON))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(no6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnXY2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnXY3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Hex, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbtnCosh, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Tan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbtnTanh, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jbtnXpangkatY, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Inx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Octal, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(isilahnomor, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jKolom1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jKolom2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jKolom3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Box, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(convertB, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jKolom, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isilahnomor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Box, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OFFFBUTTON)
                            .addComponent(ONBUTTON))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jKolom1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jKolom2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusmin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mod, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jKolom3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(convertB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCosh, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jKolom, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnXpangkatY, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnTanh, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inx, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnXY2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no00, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnXY3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hex, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Octal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OFFFBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFFBUTTONActionPerformed
        toggleButtons(false);
        isilahnomor.setText("");
    }//GEN-LAST:event_OFFFBUTTONActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        performCalculation("-");
    }//GEN-LAST:event_kurangActionPerformed

    private void no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no1ActionPerformed
        appendNumber("1");
    }//GEN-LAST:event_no1ActionPerformed

    private void no2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no2ActionPerformed
        appendNumber("2");
    }//GEN-LAST:event_no2ActionPerformed

    private void no3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no3ActionPerformed
        appendNumber("3");
    }//GEN-LAST:event_no3ActionPerformed

    private void no5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no5ActionPerformed
        appendNumber("5");
    }//GEN-LAST:event_no5ActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        performCalculation("+");
    }//GEN-LAST:event_tambahActionPerformed

    private void no00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no00ActionPerformed
        appendNumber("00");
    }//GEN-LAST:event_no00ActionPerformed

    private void titikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titikActionPerformed
        if (!isilahnomor.getText().contains(".")) {
            isilahnomor.setText(isilahnomor.getText() + ".");
            startNewNumber = false;
        }
    }//GEN-LAST:event_titikActionPerformed

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganActionPerformed
        calculateFinalResult();
        operator = "";
    }//GEN-LAST:event_samadenganActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(true);
        this.setSize(350, 580);
    }//GEN-LAST:event_formWindowActivated

    private void akarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akarActionPerformed
        double input = Double.parseDouble(isilahnomor.getText());
        currentResult = Math.sqrt(input); 
        isilahnomor.setText(String.valueOf(currentResult));
        startNewNumber = true;
    }//GEN-LAST:event_akarActionPerformed

    private void no6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no6ActionPerformed
        appendNumber("6");
    }//GEN-LAST:event_no6ActionPerformed

    private void no4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no4ActionPerformed
        appendNumber("4");
    }//GEN-LAST:event_no4ActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
        double input = Double.parseDouble(isilahnomor.getText());
        currentResult = input / 100; 
        isilahnomor.setText(String.valueOf(currentResult));
        startNewNumber = true;
    }//GEN-LAST:event_persenActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        performCalculation("X");
    }//GEN-LAST:event_kaliActionPerformed

    private void no8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no8ActionPerformed
        appendNumber("8");
    }//GEN-LAST:event_no8ActionPerformed

    private void no7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no7ActionPerformed
        appendNumber("7");
    }//GEN-LAST:event_no7ActionPerformed

    private void no9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no9ActionPerformed
        appendNumber("9");
    }//GEN-LAST:event_no9ActionPerformed

    private void plusminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminActionPerformed
        double input = Double.parseDouble(isilahnomor.getText());
        input *= -1;  
        isilahnomor.setText(String.valueOf(input));
    }//GEN-LAST:event_plusminActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        isilahnomor.setText("");
        currentResult = 0;
        operator = "";
        startNewNumber = true;
    }//GEN-LAST:event_clearActionPerformed

    private void ONBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONBUTTONActionPerformed
        toggleButtons(true);
    }//GEN-LAST:event_ONBUTTONActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        performCalculation("/");
    }//GEN-LAST:event_bagiActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String currentText = isilahnomor.getText();
        if (currentText.length() > 0) {
            isilahnomor.setText(currentText.substring(0, currentText.length() - 1));
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void no0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no0ActionPerformed
        appendNumber("0");
    }//GEN-LAST:event_no0ActionPerformed

    private void jbtnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinActionPerformed
        operator = "sin"; 
        currentResult = Double.parseDouble(isilahnomor.getText());
        calculateFinalResult();
    }//GEN-LAST:event_jbtnSinActionPerformed

    private void jbtnSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinhActionPerformed
        performCalculation("sinh");   
    }//GEN-LAST:event_jbtnSinhActionPerformed

    private void CosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CosActionPerformed
        operator = "cos"; 
        currentResult = Double.parseDouble(isilahnomor.getText());
        calculateFinalResult();
    }//GEN-LAST:event_CosActionPerformed

    private void jbtnCoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCoshActionPerformed
        performCalculation("cosh");  
    }//GEN-LAST:event_jbtnCoshActionPerformed

    private void jbtnXpangkatYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXpangkatYActionPerformed
        performCalculation("pangkat");
    }//GEN-LAST:event_jbtnXpangkatYActionPerformed

    private void jbtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogActionPerformed
        operator = "log"; 
        currentResult = Double.parseDouble(isilahnomor.getText());
        isilahnomor.setText("");
    }//GEN-LAST:event_jbtnLogActionPerformed

    private void jbtnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPiActionPerformed
       performCalculation("pi");
       currentResult = Double.parseDouble(isilahnomor.getText());
       isilahnomor.setText("");
    }//GEN-LAST:event_jbtnPiActionPerformed

    private void jbtnXY2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXY2ActionPerformed
         double ops = Double.parseDouble(String.valueOf(isilahnomor.getText()));
        ops = (ops * ops);
        isilahnomor.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnXY2ActionPerformed

    private void HexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HexActionPerformed
        mode = "hex";
    }//GEN-LAST:event_HexActionPerformed

    private void TanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanActionPerformed
        operator = "tan"; 
        currentResult = Double.parseDouble(isilahnomor.getText());
        calculateFinalResult();
    }//GEN-LAST:event_TanActionPerformed

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        performCalculation("ln");
    }//GEN-LAST:event_inActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        mode = "decimal";
    }//GEN-LAST:event_decimalActionPerformed

    private void jbtnXY3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXY3ActionPerformed
         double ops = Double.parseDouble(String.valueOf(isilahnomor.getText()));
        ops = (ops * ops * ops);
        isilahnomor.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnXY3ActionPerformed

    private void jbtnTanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTanhActionPerformed
        performCalculation("tanh");
    }//GEN-LAST:event_jbtnTanhActionPerformed

    private void BinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinActionPerformed
        mode = "binary";
    }//GEN-LAST:event_BinActionPerformed

    private void isilahnomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isilahnomorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isilahnomorActionPerformed

    private void isilahnomorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isilahnomorKeyTyped
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE)
                || (c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_isilahnomorKeyTyped

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed
        performCalculation("factorial");
    }//GEN-LAST:event_factorialActionPerformed

    private void InxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InxActionPerformed
        performCalculation("inx");
    }//GEN-LAST:event_InxActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        performCalculation("e");
    }//GEN-LAST:event_eActionPerformed

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModActionPerformed
        performCalculation("mod");
    }//GEN-LAST:event_ModActionPerformed

    private void OctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OctalActionPerformed
        mode = "octal";
    }//GEN-LAST:event_OctalActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
        try {
        int input;
        switch (mode) {
            case "decimal" -> {
                input = Integer.parseInt(isilahnomor.getText());
                isilahnomor.setText(
                        "Binary: " + Integer.toString(input, 2) +
                                " Hex: " + Integer.toString(input, 16).toUpperCase() +
                                " Octal: " + Integer.toString(input, 8)
                );
                }

            case "binary" -> {
                input = Integer.parseInt(isilahnomor.getText(), 2);
                isilahnomor.setText(
                        "Decimal: " + input +
                                " Hex: " + Integer.toString(input, 16).toUpperCase() +
                                " Octal: " + Integer.toString(input, 8)
                );
                }

            case "hex" -> {
                input = Integer.parseInt(isilahnomor.getText(), 16);
                isilahnomor.setText(
                        "Decimal: " + input +
                                " Binary: " + Integer.toString(input, 2) +
                                " Octal: " + Integer.toString(input, 8)
                );
                }

            case "octal" -> {
                input = Integer.parseInt(isilahnomor.getText(), 8);
                isilahnomor.setText(
                        "Decimal: " + input +
                                " Binary: " + Integer.toString(input, 2) +
                                " Hex: " + Integer.toString(input, 16).toUpperCase()
                );
                }

            default -> isilahnomor.setText("Invalid mode selected.");
        }
    } catch (NumberFormatException e) {
        isilahnomor.setText("Invalid input!");
    }
    }//GEN-LAST:event_convertActionPerformed

    private void BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxActionPerformed

    private void menuunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuunitActionPerformed
        this.setResizable(true);
        this.setSize(1341, 580);
        isilahnomor.setSize(660, 60);
    }//GEN-LAST:event_menuunitActionPerformed

    private void convertBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBActionPerformed
        
        try {
        double dst1 = Double.parseDouble(jisi1.getText());
        double dst2 = Double.parseDouble(jisi2.getText());
        double dst3;

        if (Box.getSelectedItem().equals("Distance")) {
            jKolom1.setText("Distance = ");
            jKolom2.setText("Speed X");
            jKolom3.setText("Time");
            dst3 = dst1 * dst2;
        } else if (Box.getSelectedItem().equals("Speed")) {
            jKolom1.setText("Speed = ");
            jKolom2.setText("Distance /");
            jKolom3.setText("Time");
            dst3 = dst1 / dst2;
        } else if (Box.getSelectedItem().equals("Time")) {
            jKolom1.setText("Time = ");
            jKolom2.setText("Distance /");
            jKolom3.setText("Speed");
            dst3 = dst1 / dst2;
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid conversion type!");
            return;
        }

        String value = String.format("%.2f", dst3);
        jKolom.setText(value);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter valid numbers!",
                "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_convertBActionPerformed

    private void jKolom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKolom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jKolom1ActionPerformed

    private void jisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jisi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jisi1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jisi1.setText("");
    jisi2.setText("");
    jKolom.setText("");
    jKolom1.setText("");
    jKolom2.setText("");
    jKolom3.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void standardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardActionPerformed
        this.setResizable(true);
        this.setSize(350, 580);
    }//GEN-LAST:event_standardActionPerformed

    private void scientificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scientificActionPerformed
        this.setResizable(true);
        this.setSize(695, 580);
        isilahnomor.setSize(660, 60);
    }//GEN-LAST:event_scientificActionPerformed

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new kalkulator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bin;
    private javax.swing.JComboBox<String> Box;
    private javax.swing.JButton Cos;
    private javax.swing.JButton Hex;
    private javax.swing.JButton Inx;
    private javax.swing.JButton Mod;
    private javax.swing.JRadioButton OFFFBUTTON;
    private javax.swing.JRadioButton ONBUTTON;
    private javax.swing.JButton Octal;
    private javax.swing.JButton Tan;
    private javax.swing.JButton akar;
    private javax.swing.JButton bagi;
    private javax.swing.JButton clear;
    private javax.swing.JButton convert;
    private javax.swing.JButton convertB;
    private javax.swing.JButton decimal;
    private javax.swing.JButton delete;
    private javax.swing.JButton e;
    private javax.swing.JMenu edit;
    private javax.swing.JButton factorial;
    private javax.swing.JMenu file;
    private javax.swing.JButton in;
    private javax.swing.JTextField isilahnomor;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jKolom;
    private javax.swing.JTextField jKolom1;
    private javax.swing.JTextField jKolom2;
    private javax.swing.JTextField jKolom3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbtnCosh;
    private javax.swing.JButton jbtnLog;
    private javax.swing.JButton jbtnPi;
    private javax.swing.JButton jbtnSin;
    private javax.swing.JButton jbtnSinh;
    private javax.swing.JButton jbtnTanh;
    private javax.swing.JButton jbtnXY2;
    private javax.swing.JButton jbtnXY3;
    private javax.swing.JButton jbtnXpangkatY;
    private javax.swing.JTextField jisi1;
    private javax.swing.JTextField jisi2;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JMenuItem menuunit;
    private javax.swing.JButton no0;
    private javax.swing.JButton no00;
    private javax.swing.JButton no1;
    private javax.swing.JButton no2;
    private javax.swing.JButton no3;
    private javax.swing.JButton no4;
    private javax.swing.JButton no5;
    private javax.swing.JButton no6;
    private javax.swing.JButton no7;
    private javax.swing.JButton no8;
    private javax.swing.JButton no9;
    private javax.swing.JButton persen;
    private javax.swing.JButton plusmin;
    private javax.swing.JButton samadengan;
    private javax.swing.JMenuItem scientific;
    private javax.swing.JMenuItem standard;
    private javax.swing.JButton tambah;
    private javax.swing.JButton titik;
    // End of variables declaration//GEN-END:variables
}
