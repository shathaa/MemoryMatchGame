package memorymatchgame;
import java.awt.*;
import javax.swing.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Random;
import java.util.Vector;
public class MyFrame extends javax.swing.JFrame {
     
    Score playerScore = new Score();
    String TheUserName ;
 
    ButtonGroup radioButtonGroup = new ButtonGroup() ;
        
    
     
  public MyFrame(String rand)
   {
       
   }
    public MyFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        userNameTF1.setEnabled(false);
//        this.passWordLP.setVisible(false);
        this.passWordTF.addMouseListener(new Mouse());
    }
    
    
    
    public class Mouse extends MouseAdapter{
            @Override
            public void mouseClicked(MouseEvent e){
                
                if(emailTM.getText().contains("@")){
          Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        String name = emailTM.getText().substring(0, emailTM.getText().indexOf("@"));
         TheUserName = name + Integer.toString(randomInt);
                userNameTF1.setText(TheUserName);
                
                String condition = "Your password must contian 8 - 20 digits  with:" +
                                   "\n* Letter "+
                                   " and Number ♥ ";
                
                JOptionPane.showMessageDialog(null,condition);
                
                }
                else{
                
                JOptionPane.showMessageDialog(null,"your email isn't Valid ☻ ");
                }
                
                
               
            }
        }
    
    
    public String getUserName(){
    
        return  TheUserName ;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        gameName = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        right = new javax.swing.JLabel();
        cardsPanel = new javax.swing.JPanel();
        startGameCard = new javax.swing.JPanel();
        startGameBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        signInCard = new javax.swing.JPanel();
        signInImg = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        userNameTF = new javax.swing.JTextField();
        passWord = new javax.swing.JLabel();
        passwordTF = new javax.swing.JPasswordField();
        signInBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        PURPLE = new javax.swing.JLabel();
        YELLOW = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        signUpCard = new javax.swing.JPanel();
        signUpImg = new javax.swing.JLabel();
        userName1 = new javax.swing.JLabel();
        userNameTF1 = new javax.swing.JTextField();
        passWord1 = new javax.swing.JLabel();
        signUpBtn1 = new javax.swing.JButton();
        clearBtn1 = new javax.swing.JButton();
        email = new javax.swing.JLabel();
        emailTM = new javax.swing.JTextField();
        confPassWord = new javax.swing.JLabel();
        confPasswordTF = new javax.swing.JPasswordField();
        passWordTF = new javax.swing.JPasswordField();
        signInImg1 = new javax.swing.JLabel();
        PURPLE1 = new javax.swing.JLabel();
        YELLOW1 = new javax.swing.JLabel();
        TIFANY = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBT1 = new javax.swing.JButton();
        gameInterfaceCard = new javax.swing.JPanel();
        playBtn = new javax.swing.JButton();
        scoreBtn = new javax.swing.JButton();
        deletEBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        deleteAcountCard = new javax.swing.JPanel();
        typePassLP = new javax.swing.JLabel();
        passwordDeleteTF = new javax.swing.JPasswordField();
        reasonDeleteLP = new javax.swing.JLabel();
        reason1RB = new javax.swing.JRadioButton();
        reason2RB = new javax.swing.JRadioButton();
        otherRB = new javax.swing.JRadioButton();
        reasonTA = new javax.swing.JTextArea();
        deleteOpBtn = new javax.swing.JButton();
        clearOpBtn = new javax.swing.JButton();
        javax.swing.JButton backBtn1 = new javax.swing.JButton();
        passJL = new javax.swing.JLabel();
        usernameT = new javax.swing.JTextField();
        PURPLE2 = new javax.swing.JLabel();
        YELLOW2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userName3 = new javax.swing.JLabel();
        gameTypeCard = new javax.swing.JPanel();
        monstersBtn = new javax.swing.JButton();
        letterBtn = new javax.swing.JButton();
        numberBtn = new javax.swing.JButton();
        javax.swing.JButton backBtn = new javax.swing.JButton();
        resetPasswordCard = new javax.swing.JPanel();
        signUpImg1 = new javax.swing.JLabel();
        plzPanel = new javax.swing.JPanel();
        plzLP = new javax.swing.JLabel();
        userName2 = new javax.swing.JLabel();
        userNameTF2 = new javax.swing.JTextField();
        passWord2 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        clearBtn2 = new javax.swing.JButton();
        email1 = new javax.swing.JLabel();
        emailTM2 = new javax.swing.JTextField();
        newPassWordTF2 = new javax.swing.JPasswordField();
        signInImg2 = new javax.swing.JLabel();
        PURPLE3 = new javax.swing.JLabel();
        YELLOW3 = new javax.swing.JLabel();
        TIFANY1 = new javax.swing.JLabel();
        backBT2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        confPassWord1 = new javax.swing.JLabel();
        newConfPassWordTF2 = new javax.swing.JPasswordField();
        winCard = new javax.swing.JPanel();
        youWin = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        javax.swing.JButton backBtn3 = new javax.swing.JButton();
        scoreText = new javax.swing.JTextField();
        PURPLE4 = new javax.swing.JLabel();
        bestScoreLP1 = new javax.swing.JLabel();
        totalScoreLP1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();
        Homebtn = new javax.swing.JButton();
        toGameType = new javax.swing.JButton();
        highestscoreText = new javax.swing.JTextField();
        totalText = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Memory Match Game ♥☻");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(527, 570));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        container.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(94, 51, 74));

        gameName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gameName.setForeground(new java.awt.Color(255, 255, 255));
        gameName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/MEMORY_MATCH.png"))); // NOI18N

        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/HEADER.gif"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(imgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameName))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        footer.setBackground(new java.awt.Color(94, 51, 74));

        right.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        right.setForeground(new java.awt.Color(255, 255, 255));
        right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/ALL_RIGHTS_RESEVED.png"))); // NOI18N

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(right)
                .addGap(139, 139, 139))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(right))
        );

        cardsPanel.setBackground(new java.awt.Color(221, 221, 221));
        cardsPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(206, 226, 217), 1, true));
        cardsPanel.setLayout(new java.awt.CardLayout());

        startGameCard.setBackground(new java.awt.Color(206, 226, 217));
        startGameCard.setPreferredSize(new java.awt.Dimension(535, 372));

        startGameBtn.setBackground(new java.awt.Color(225, 225, 225));
        startGameBtn.setForeground(new java.awt.Color(255, 102, 153));
        startGameBtn.setText("START GAME ♥");
        startGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/gameInterface.gif"))); // NOI18N

        javax.swing.GroupLayout startGameCardLayout = new javax.swing.GroupLayout(startGameCard);
        startGameCard.setLayout(startGameCardLayout);
        startGameCardLayout.setHorizontalGroup(
            startGameCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startGameCardLayout.createSequentialGroup()
                .addGroup(startGameCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startGameCardLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(startGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        startGameCardLayout.setVerticalGroup(
            startGameCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startGameCardLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(startGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardsPanel.add(startGameCard, "card2");

        signInCard.setBackground(new java.awt.Color(206, 226, 217));
        signInCard.setPreferredSize(new java.awt.Dimension(521, 382));

        signInImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/signInPic.png"))); // NOI18N

        userName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(242, 101, 31));
        userName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/username.png"))); // NOI18N

        userNameTF.setBackground(new java.awt.Color(221, 210, 219));
        userNameTF.setForeground(new java.awt.Color(102, 102, 102));
        userNameTF.setCaretColor(new java.awt.Color(0, 153, 153));
        userNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTFActionPerformed(evt);
            }
        });

        passWord.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passWord.setForeground(new java.awt.Color(242, 101, 31));
        passWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/password.png"))); // NOI18N

        passwordTF.setBackground(new java.awt.Color(221, 210, 219));
        passwordTF.setForeground(new java.awt.Color(102, 102, 102));
        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });

        signInBtn.setBackground(new java.awt.Color(225, 225, 225));
        signInBtn.setForeground(new java.awt.Color(73, 157, 157));
        signInBtn.setText("SIGN  IN ♥");
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });

        signUpBtn.setBackground(new java.awt.Color(225, 225, 225));
        signUpBtn.setForeground(new java.awt.Color(73, 157, 157));
        signUpBtn.setText("SIGN UP ♥");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        PURPLE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/PURPLE_MONISTER.gif"))); // NOI18N

        YELLOW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/YELLOW_MONISTER.gif"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(206, 226, 217));
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Did you forget your password ? it's OK .. Click here please ☻♥ ,");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signInCardLayout = new javax.swing.GroupLayout(signInCard);
        signInCard.setLayout(signInCardLayout);
        signInCardLayout.setHorizontalGroup(
            signInCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInCardLayout.createSequentialGroup()
                .addGroup(signInCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signInCardLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(PURPLE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signInCardLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(signInImg))
                    .addGroup(signInCardLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(signInCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(signInCardLayout.createSequentialGroup()
                                .addComponent(YELLOW)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passWord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInCardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signInBtn)
                .addGap(30, 30, 30)
                .addComponent(signUpBtn)
                .addGap(155, 155, 155))
        );
        signInCardLayout.setVerticalGroup(
            signInCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signInImg)
                .addGap(55, 55, 55)
                .addGroup(signInCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passWord)
                    .addGroup(signInCardLayout.createSequentialGroup()
                        .addGroup(signInCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PURPLE)
                            .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userName))
                        .addGap(18, 18, 18)
                        .addGroup(signInCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YELLOW, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(signInCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInBtn)
                    .addComponent(signUpBtn))
                .addGap(30, 30, 30))
        );

        cardsPanel.add(signInCard, "card3");

        signUpCard.setBackground(new java.awt.Color(206, 226, 217));
        signUpCard.setPreferredSize(new java.awt.Dimension(535, 372));

        userName1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userName1.setForeground(new java.awt.Color(242, 101, 31));
        userName1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/username.png"))); // NOI18N

        userNameTF1.setBackground(new java.awt.Color(221, 210, 219));
        userNameTF1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userNameTF1.setForeground(new java.awt.Color(0, 153, 153));
        userNameTF1.setCaretColor(new java.awt.Color(0, 153, 153));
        userNameTF1.setDisabledTextColor(new java.awt.Color(102, 0, 153));
        userNameTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTF1ActionPerformed(evt);
            }
        });

        passWord1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passWord1.setForeground(new java.awt.Color(242, 101, 31));
        passWord1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/password.png"))); // NOI18N

        signUpBtn1.setBackground(new java.awt.Color(225, 225, 225));
        signUpBtn1.setForeground(new java.awt.Color(73, 157, 157));
        signUpBtn1.setText("SIGN UP ♥");
        signUpBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtn1ActionPerformed(evt);
            }
        });

        clearBtn1.setBackground(new java.awt.Color(225, 225, 225));
        clearBtn1.setForeground(new java.awt.Color(73, 157, 157));
        clearBtn1.setText("CLEAR ♥");
        clearBtn1.setToolTipText("");
        clearBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn1ActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(242, 101, 31));
        email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/email.png"))); // NOI18N

        emailTM.setBackground(new java.awt.Color(221, 210, 219));
        emailTM.setForeground(new java.awt.Color(102, 102, 102));
        emailTM.setCaretColor(new java.awt.Color(0, 153, 153));
        emailTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTMActionPerformed(evt);
            }
        });

        confPassWord.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        confPassWord.setForeground(new java.awt.Color(242, 101, 31));
        confPassWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/conf_pass.png"))); // NOI18N

        confPasswordTF.setBackground(new java.awt.Color(221, 210, 219));
        confPasswordTF.setForeground(new java.awt.Color(102, 102, 102));
        confPasswordTF.setToolTipText("");

        passWordTF.setBackground(new java.awt.Color(221, 210, 219));
        passWordTF.setForeground(new java.awt.Color(102, 102, 102));
        passWordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passWordTFActionPerformed(evt);
            }
        });

        signInImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/signInPic.png"))); // NOI18N

        PURPLE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/PURPLE_MONISTER.gif"))); // NOI18N

        YELLOW1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/YELLOW_MONISTER.gif"))); // NOI18N

        TIFANY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/TIFANY_MONISTER.gif"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/BLUE_MONISTER.gif"))); // NOI18N

        backBT1.setBackground(new java.awt.Color(225, 225, 225));
        backBT1.setForeground(new java.awt.Color(73, 157, 157));
        backBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/back_ARROW.png.png"))); // NOI18N
        backBT1.setBorder(null);
        backBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBT1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signUpCardLayout = new javax.swing.GroupLayout(signUpCard);
        signUpCard.setLayout(signUpCardLayout);
        signUpCardLayout.setHorizontalGroup(
            signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpCardLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpCardLayout.createSequentialGroup()
                        .addComponent(backBT1)
                        .addGap(72, 72, 72)
                        .addComponent(signUpImg)
                        .addGap(18, 18, 18)
                        .addComponent(signInImg1))
                    .addGroup(signUpCardLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(signUpCardLayout.createSequentialGroup()
                                .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(YELLOW1)
                                    .addComponent(PURPLE1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passWord1)
                                    .addComponent(userName1)))
                            .addGroup(signUpCardLayout.createSequentialGroup()
                                .addComponent(TIFANY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(userNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passWordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpCardLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(signUpCardLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confPassWord))
                    .addComponent(signUpBtn1))
                .addGap(43, 43, 43)
                .addComponent(clearBtn1)
                .addGap(134, 134, 134))
        );
        signUpCardLayout.setVerticalGroup(
            signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signUpImg, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(signUpCardLayout.createSequentialGroup()
                        .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signInImg1)
                            .addGroup(signUpCardLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(backBT1)))
                        .addGap(17, 17, 17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(signUpCardLayout.createSequentialGroup()
                        .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userName1)
                            .addComponent(PURPLE1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TIFANY)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(signUpCardLayout.createSequentialGroup()
                        .addComponent(userNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(emailTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(YELLOW1)
                    .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passWordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passWord1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(confPassWord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(signUpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signUpBtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn1))
                .addContainerGap())
        );

        cardsPanel.add(signUpCard, "card3");

        gameInterfaceCard.setBackground(new java.awt.Color(206, 226, 217));

        playBtn.setBackground(new java.awt.Color(225, 225, 225));
        playBtn.setForeground(new java.awt.Color(255, 102, 153));
        playBtn.setText("P L A Y ");
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });

        scoreBtn.setBackground(new java.awt.Color(225, 225, 225));
        scoreBtn.setForeground(new java.awt.Color(255, 102, 153));
        scoreBtn.setText("L E A D E R   B O R D E R");
        scoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreBtnActionPerformed(evt);
            }
        });

        deletEBtn.setBackground(new java.awt.Color(225, 225, 225));
        deletEBtn.setForeground(new java.awt.Color(255, 102, 153));
        deletEBtn.setText("DELETE ACCOUNT");
        deletEBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletEBtnActionPerformed(evt);
            }
        });

        logOutBtn.setBackground(new java.awt.Color(225, 225, 225));
        logOutBtn.setForeground(new java.awt.Color(255, 102, 153));
        logOutBtn.setText("L O G  O U T");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameInterfaceCardLayout = new javax.swing.GroupLayout(gameInterfaceCard);
        gameInterfaceCard.setLayout(gameInterfaceCardLayout);
        gameInterfaceCardLayout.setHorizontalGroup(
            gameInterfaceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameInterfaceCardLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(gameInterfaceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scoreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletEBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        gameInterfaceCardLayout.setVerticalGroup(
            gameInterfaceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameInterfaceCardLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(playBtn)
                .addGap(18, 18, 18)
                .addComponent(scoreBtn)
                .addGap(18, 18, 18)
                .addComponent(deletEBtn)
                .addGap(18, 18, 18)
                .addComponent(logOutBtn)
                .addGap(91, 91, 91))
        );

        cardsPanel.add(gameInterfaceCard, "card1");

        deleteAcountCard.setBackground(new java.awt.Color(206, 226, 217));

        typePassLP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        typePassLP.setForeground(new java.awt.Color(242, 101, 31));
        typePassLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/typeYourEmail.png"))); // NOI18N

        passwordDeleteTF.setBackground(new java.awt.Color(221, 210, 219));
        passwordDeleteTF.setForeground(new java.awt.Color(102, 102, 102));

        reasonDeleteLP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reasonDeleteLP.setForeground(new java.awt.Color(102, 204, 0));
        reasonDeleteLP.setText("WHY DO YOU WANT TO DELET YOUR ACCOUNT ?  ");

        reason1RB.setBackground(new java.awt.Color(206, 226, 217));
        btnGroup.add(reason1RB);
        reason1RB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reason1RB.setForeground(new java.awt.Color(0, 153, 153));
        reason1RB.setText("didn't like the game ");
        reason1RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reason1RBActionPerformed(evt);
            }
        });

        reason2RB.setBackground(new java.awt.Color(206, 226, 217));
        btnGroup.add(reason2RB);
        reason2RB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reason2RB.setForeground(new java.awt.Color(0, 153, 153));
        reason2RB.setText("didn't like the design");
        reason2RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reason2RBActionPerformed(evt);
            }
        });

        otherRB.setBackground(new java.awt.Color(206, 226, 217));
        btnGroup.add(otherRB);
        otherRB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        otherRB.setForeground(new java.awt.Color(0, 153, 153));
        otherRB.setText("Other");
        otherRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherRBActionPerformed(evt);
            }
        });

        reasonTA.setBackground(new java.awt.Color(221, 210, 219));
        reasonTA.setColumns(20);
        reasonTA.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        reasonTA.setForeground(new java.awt.Color(102, 102, 102));
        reasonTA.setRows(5);
        reasonTA.setText(" HERE ,\n YOU CAN TYPE THE REASON OF DELETING YOUR ACCOUNT ");
        reasonTA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153)));
        reasonTA.setEnabled(false);

        deleteOpBtn.setBackground(new java.awt.Color(225, 225, 225));
        deleteOpBtn.setForeground(new java.awt.Color(73, 157, 157));
        deleteOpBtn.setText("DELETE");
        deleteOpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOpBtnActionPerformed(evt);
            }
        });

        clearOpBtn.setBackground(new java.awt.Color(225, 225, 225));
        clearOpBtn.setForeground(new java.awt.Color(73, 157, 157));
        clearOpBtn.setText("CLEAR");
        clearOpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearOpBtnActionPerformed(evt);
            }
        });

        backBtn1.setForeground(new java.awt.Color(0, 102, 102));
        backBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/back_ARROW.png.png"))); // NOI18N
        backBtn1.setBorder(null);
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        passJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/password.png"))); // NOI18N

        usernameT.setBackground(new java.awt.Color(221, 210, 219));
        usernameT.setForeground(new java.awt.Color(102, 102, 102));
        usernameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTActionPerformed(evt);
            }
        });

        PURPLE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/PURPLE_MONISTER.gif"))); // NOI18N

        YELLOW2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/YELLOW_MONISTER.gif"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 204, 0));
        jLabel3.setText("☹");

        userName3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userName3.setForeground(new java.awt.Color(242, 101, 31));
        userName3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/username.png"))); // NOI18N

        javax.swing.GroupLayout deleteAcountCardLayout = new javax.swing.GroupLayout(deleteAcountCard);
        deleteAcountCard.setLayout(deleteAcountCardLayout);
        deleteAcountCardLayout.setHorizontalGroup(
            deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAcountCardLayout.createSequentialGroup()
                .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteAcountCardLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deleteAcountCardLayout.createSequentialGroup()
                                .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(typePassLP, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(deleteAcountCardLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PURPLE2)
                                    .addComponent(YELLOW2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(deleteAcountCardLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(userName3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(usernameT, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(deleteAcountCardLayout.createSequentialGroup()
                                        .addComponent(passJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(passwordDeleteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(deleteAcountCardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(deleteAcountCardLayout.createSequentialGroup()
                                .addComponent(reason1RB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reason2RB)
                                .addGap(18, 18, 18)
                                .addComponent(otherRB))
                            .addGroup(deleteAcountCardLayout.createSequentialGroup()
                                .addComponent(reasonDeleteLP)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))))
                    .addGroup(deleteAcountCardLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(reasonTA, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteAcountCardLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(deleteOpBtn)
                        .addGap(33, 33, 33)
                        .addComponent(clearOpBtn)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        deleteAcountCardLayout.setVerticalGroup(
            deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAcountCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typePassLP, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteAcountCardLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(usernameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteAcountCardLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PURPLE2))
                    .addGroup(deleteAcountCardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userName3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordDeleteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passJL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YELLOW2))
                .addGap(15, 15, 15)
                .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reasonDeleteLP)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reason1RB)
                    .addComponent(reason2RB)
                    .addComponent(otherRB))
                .addGap(18, 18, 18)
                .addComponent(reasonTA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(deleteAcountCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteOpBtn)
                    .addComponent(clearOpBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        cardsPanel.add(deleteAcountCard, "card3");

        gameTypeCard.setBackground(new java.awt.Color(206, 226, 217));

        monstersBtn.setBackground(new java.awt.Color(225, 225, 225));
        monstersBtn.setForeground(new java.awt.Color(255, 102, 153));
        monstersBtn.setLabel("MONSTERS");
        monstersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monstersBtnActionPerformed(evt);
            }
        });

        letterBtn.setBackground(new java.awt.Color(225, 225, 225));
        letterBtn.setForeground(new java.awt.Color(255, 102, 153));
        letterBtn.setText("LETTERS");
        letterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterBtnActionPerformed(evt);
            }
        });

        numberBtn.setBackground(new java.awt.Color(225, 225, 225));
        numberBtn.setForeground(new java.awt.Color(255, 102, 153));
        numberBtn.setText("NUMBERS");
        numberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(225, 225, 225));
        backBtn.setForeground(new java.awt.Color(255, 102, 153));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/backARROW.gif"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backBtnMouseReleased(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameTypeCardLayout = new javax.swing.GroupLayout(gameTypeCard);
        gameTypeCard.setLayout(gameTypeCardLayout);
        gameTypeCardLayout.setHorizontalGroup(
            gameTypeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameTypeCardLayout.createSequentialGroup()
                .addGroup(gameTypeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameTypeCardLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(gameTypeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(monstersBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(letterBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numberBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(gameTypeCardLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        gameTypeCardLayout.setVerticalGroup(
            gameTypeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameTypeCardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(monstersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(letterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        cardsPanel.add(gameTypeCard, "GameType");

        resetPasswordCard.setBackground(new java.awt.Color(206, 226, 217));
        resetPasswordCard.setPreferredSize(new java.awt.Dimension(521, 382));

        plzPanel.setBackground(new java.awt.Color(226, 170, 245));
        plzPanel.setPreferredSize(new java.awt.Dimension(321, 19));

        plzLP.setForeground(new java.awt.Color(255, 255, 255));
        plzLP.setText("* PLEASE TYPE YOUR USERNAME , EMAIL AND NEW PASSWORD ♥");

        javax.swing.GroupLayout plzPanelLayout = new javax.swing.GroupLayout(plzPanel);
        plzPanel.setLayout(plzPanelLayout);
        plzPanelLayout.setHorizontalGroup(
            plzPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plzPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(plzLP, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        plzPanelLayout.setVerticalGroup(
            plzPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plzPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(plzLP))
        );

        userName2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userName2.setForeground(new java.awt.Color(242, 101, 31));
        userName2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/username.png"))); // NOI18N

        userNameTF2.setBackground(new java.awt.Color(221, 210, 219));
        userNameTF2.setForeground(new java.awt.Color(102, 102, 102));
        userNameTF2.setCaretColor(new java.awt.Color(0, 153, 153));
        userNameTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTF2ActionPerformed(evt);
            }
        });

        passWord2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passWord2.setForeground(new java.awt.Color(242, 101, 31));
        passWord2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/password.png"))); // NOI18N

        submitBtn.setBackground(new java.awt.Color(225, 225, 225));
        submitBtn.setForeground(new java.awt.Color(73, 157, 157));
        submitBtn.setText("SUBMIT ♥");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        clearBtn2.setBackground(new java.awt.Color(225, 225, 225));
        clearBtn2.setForeground(new java.awt.Color(73, 157, 157));
        clearBtn2.setText("CLEAR ♥");
        clearBtn2.setToolTipText("");
        clearBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn2ActionPerformed(evt);
            }
        });

        email1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email1.setForeground(new java.awt.Color(242, 101, 31));
        email1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/email.png"))); // NOI18N

        emailTM2.setBackground(new java.awt.Color(221, 210, 219));
        emailTM2.setForeground(new java.awt.Color(102, 102, 102));
        emailTM2.setCaretColor(new java.awt.Color(0, 153, 153));
        emailTM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTM2ActionPerformed(evt);
            }
        });

        newPassWordTF2.setBackground(new java.awt.Color(221, 210, 219));
        newPassWordTF2.setForeground(new java.awt.Color(102, 102, 102));
        newPassWordTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassWordTF2ActionPerformed(evt);
            }
        });

        signInImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/signInPic.png"))); // NOI18N

        PURPLE3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/PURPLE_MONISTER.gif"))); // NOI18N

        YELLOW3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/YELLOW_MONISTER.gif"))); // NOI18N

        TIFANY1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/TIFANY_MONISTER.gif"))); // NOI18N

        backBT2.setBackground(new java.awt.Color(225, 225, 225));
        backBT2.setForeground(new java.awt.Color(73, 157, 157));
        backBT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/back_ARROW.png.png"))); // NOI18N
        backBT2.setBorder(null);
        backBT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBT2ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/BLUE_MONISTER.gif"))); // NOI18N

        confPassWord1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        confPassWord1.setForeground(new java.awt.Color(242, 101, 31));
        confPassWord1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/conf_pass.png"))); // NOI18N

        newConfPassWordTF2.setBackground(new java.awt.Color(221, 210, 219));
        newConfPassWordTF2.setForeground(new java.awt.Color(102, 102, 102));
        newConfPassWordTF2.setToolTipText("");

        javax.swing.GroupLayout resetPasswordCardLayout = new javax.swing.GroupLayout(resetPasswordCard);
        resetPasswordCard.setLayout(resetPasswordCardLayout);
        resetPasswordCardLayout.setHorizontalGroup(
            resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetPasswordCardLayout.createSequentialGroup()
                .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resetPasswordCardLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(plzPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUpImg1))
                    .addGroup(resetPasswordCardLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backBT2)
                        .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resetPasswordCardLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(signInImg2))
                            .addGroup(resetPasswordCardLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(submitBtn)
                                .addGap(47, 47, 47)
                                .addComponent(clearBtn2))))
                    .addGroup(resetPasswordCardLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resetPasswordCardLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resetPasswordCardLayout.createSequentialGroup()
                                        .addComponent(email1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(emailTM2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resetPasswordCardLayout.createSequentialGroup()
                                        .addComponent(PURPLE3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userName2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(userNameTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resetPasswordCardLayout.createSequentialGroup()
                                        .addComponent(YELLOW3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TIFANY1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(resetPasswordCardLayout.createSequentialGroup()
                                                .addComponent(passWord2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(newPassWordTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resetPasswordCardLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confPassWord1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newConfPassWordTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        resetPasswordCardLayout.setVerticalGroup(
            resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetPasswordCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signUpImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(resetPasswordCardLayout.createSequentialGroup()
                        .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBT2)
                            .addComponent(signInImg2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plzPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PURPLE3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailTM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIFANY1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(newPassWordTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passWord2))
                    .addComponent(YELLOW3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confPassWord1)
                    .addComponent(newConfPassWordTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(resetPasswordCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn2)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        cardsPanel.add(resetPasswordCard, "card3");

        winCard.setBackground(new java.awt.Color(206, 226, 217));

        youWin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        youWin.setForeground(new java.awt.Color(242, 101, 31));
        youWin.setIcon(new javax.swing.ImageIcon("C:\\Users\\a7taj_000\\Documents\\NetBeansProjects\\MemoryMatchGame\\src\\memorymatchgame\\img\\congratulation.png")); // NOI18N

        score.setIcon(new javax.swing.ImageIcon("C:\\Users\\a7taj_000\\Documents\\NetBeansProjects\\MemoryMatchGame\\src\\memorymatchgame\\img\\yourtScore.png")); // NOI18N
        score.setText("Your Score:");

        backBtn3.setForeground(new java.awt.Color(0, 102, 102));
        backBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/back_ARROW.png.png"))); // NOI18N
        backBtn3.setBorder(null);
        backBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn3ActionPerformed(evt);
            }
        });

        scoreText.setBackground(new java.awt.Color(247, 247, 247));
        scoreText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        scoreText.setForeground(new java.awt.Color(102, 0, 102));
        scoreText.setDisabledTextColor(new java.awt.Color(102, 0, 102));
        scoreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreTextActionPerformed(evt);
            }
        });

        PURPLE4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/PURPLE_MONISTER.gif"))); // NOI18N

        bestScoreLP1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        bestScoreLP1.setForeground(new java.awt.Color(242, 101, 31));
        bestScoreLP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/yourHighestScore.png"))); // NOI18N

        totalScoreLP1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        totalScoreLP1.setForeground(new java.awt.Color(242, 101, 31));
        totalScoreLP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/yourTotalScore.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/PINK_MONISTER.gif"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymatchgame/img/YELLOW_MONISTER.gif"))); // NOI18N

        exitbtn.setBackground(new java.awt.Color(225, 225, 225));
        exitbtn.setForeground(new java.awt.Color(73, 157, 157));
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        Homebtn.setBackground(new java.awt.Color(225, 225, 225));
        Homebtn.setForeground(new java.awt.Color(73, 157, 157));
        Homebtn.setText("HOME");
        Homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebtnActionPerformed(evt);
            }
        });

        toGameType.setBackground(new java.awt.Color(225, 225, 225));
        toGameType.setForeground(new java.awt.Color(73, 157, 157));
        toGameType.setText("RE-PLAY");
        toGameType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toGameTypeActionPerformed(evt);
            }
        });

        highestscoreText.setBackground(new java.awt.Color(247, 247, 247));
        highestscoreText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        highestscoreText.setDisabledTextColor(new java.awt.Color(102, 0, 102));
        highestscoreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highestscoreTextActionPerformed(evt);
            }
        });

        totalText.setBackground(new java.awt.Color(247, 247, 247));
        totalText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        totalText.setDisabledTextColor(new java.awt.Color(102, 0, 102));
        totalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout winCardLayout = new javax.swing.GroupLayout(winCard);
        winCard.setLayout(winCardLayout);
        winCardLayout.setHorizontalGroup(
            winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winCardLayout.createSequentialGroup()
                .addGroup(winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(winCardLayout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(youWin))
                        .addGroup(winCardLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(winCardLayout.createSequentialGroup()
                                    .addComponent(toGameType, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(winCardLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(totalScoreLP1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(201, 201, 201))
                                .addGroup(winCardLayout.createSequentialGroup()
                                    .addGroup(winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(winCardLayout.createSequentialGroup()
                                            .addComponent(PURPLE4)
                                            .addGap(10, 10, 10)
                                            .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(winCardLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bestScoreLP1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(scoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(highestscoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(121, 121, 121)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winCardLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(359, 359, 359)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        winCardLayout.setVerticalGroup(
            winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winCardLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(youWin)
                .addGap(18, 18, 18)
                .addGroup(winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score)
                    .addComponent(PURPLE4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(highestscoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bestScoreLP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winCardLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toGameType)
                            .addComponent(Homebtn)
                            .addComponent(exitbtn))
                        .addGap(55, 55, 55))
                    .addGroup(winCardLayout.createSequentialGroup()
                        .addGroup(winCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalScoreLP1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        cardsPanel.add(winCard, "card3");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(footer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameBtnActionPerformed

        cardsPanel.removeAll();
        cardsPanel.add(signInCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_startGameBtnActionPerformed

    private void userNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTFActionPerformed

    private void emailTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTMActionPerformed
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_emailTMActionPerformed

    
    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed

        userNameTF.setText("");
        passwordTF.setText("");
        cardsPanel.removeAll();
        cardsPanel.add(signUpCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
        
        
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void signUpBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtn1ActionPerformed

UserInformation u = new UserInformation();
        
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        String name = emailTM.getText().substring(0, emailTM.getText().indexOf("@"));
        String username = name + Integer.toString(randomInt);
        
        String email = emailTM.getText();

        if (u.isPasswordValid(new String(passWordTF.getPassword()), new String(confPasswordTF.getPassword())) && u.isValidEmail(email)) {
            if (u.addNewUser(TheUserName , new String(passWordTF.getPassword()), email)) {

                JLabel msg = new JLabel("WELCOME TO MEMORY MATCH GAME ☻♥ \n Your username is : " + TheUserName );

                JOptionPane.showMessageDialog(null, msg);

                
                passWordTF.setText("");
                confPasswordTF.setText("");
                emailTM.setText("");

                cardsPanel.removeAll();
                cardsPanel.add(gameInterfaceCard);
                cardsPanel.repaint();
                cardsPanel.revalidate();
            }
        } else if (username.equals("") || new String(passWordTF.getPassword()).equals("") || new String(confPasswordTF.getPassword()).equals("") || email.equals("")) {

            JLabel msg = new JLabel("Fill in your information");

            JOptionPane.showMessageDialog(null, msg);
        } 


    }//GEN-LAST:event_signUpBtn1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
 cardsPanel.removeAll();
        cardsPanel.add(gameInterfaceCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
      
    }//GEN-LAST:event_backBtnActionPerformed

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed

        UserInformation u = new UserInformation();
        String password = new String(passwordTF.getPassword());

        if (u.searchUser(userNameTF.getText(), password)) {

            userNameTF.setText("");
            passwordTF.setText("");
            cardsPanel.removeAll();
            cardsPanel.add(gameInterfaceCard);
            cardsPanel.repaint();
            cardsPanel.revalidate();
        } else {
            if (userNameTF.getText().equals("") && new String(passwordTF.getPassword()).equals("")) {

                JLabel msg = new JLabel("Enter your username and password");

                JOptionPane.showMessageDialog(null, msg);
            } else {
                JLabel msg = new JLabel("Please enter correct username or password");

                JOptionPane.showMessageDialog(null, msg);

                userNameTF.setText("");
                passwordTF.setText("");

            }
        }
    }//GEN-LAST:event_signInBtnActionPerformed

    private void clearBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn1ActionPerformed

        userNameTF1.setText("");
        passWordTF.setText("");
        confPasswordTF.setText("");
        emailTM.setText("");

    }//GEN-LAST:event_clearBtn1ActionPerformed

    private void monstersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monstersBtnActionPerformed
        
     
        PhotoLibrary m = new PhotoLibrary();
        GamePanel game = new GamePanel(m.selectMonster());
       
        cardsPanel.removeAll();
        cardsPanel.add(game);
        cardsPanel.repaint();
        cardsPanel.revalidate();
       
    }//GEN-LAST:event_monstersBtnActionPerformed

    private void backBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseReleased
        // TODO add your handling code here:
        
        
      
    }//GEN-LAST:event_backBtnMouseReleased

    private void backBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBT1ActionPerformed

        // TODO add your handling code here:
        
         cardsPanel.removeAll();
        cardsPanel.add(signInCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_backBT1ActionPerformed

    private void usernameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed

        cardsPanel.removeAll();
        cardsPanel.add(gameInterfaceCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void clearOpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearOpBtnActionPerformed

        passwordDeleteTF.setText("");
        radioButtonGroup.clearSelection();
        reason1RB.setSelected(true);
        reasonTA.setText("");
    }//GEN-LAST:event_clearOpBtnActionPerformed

    private void deleteOpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOpBtnActionPerformed

     
        
        UserInformation u = new UserInformation();

        File f = new File();
        f.deleteReason( usernameT.getText() , reasonTA.getText());

        if (u.deleteUser(usernameT.getText() )) {

            JLabel msg = new JLabel("Your account has deleted");

            JOptionPane.showMessageDialog(null, msg);

            passwordDeleteTF.setText("");
            usernameT.setText("");
            reason1RB.setSelected(true);
            reason2RB.setSelected(false);
            otherRB.setSelected(false);
            reasonTA.setText("");

            cardsPanel.removeAll();
            cardsPanel.add(signInCard);
            cardsPanel.repaint();
            cardsPanel.revalidate();
        } else {

            System.out.println("Erorr!");
        }

        
        
    }//GEN-LAST:event_deleteOpBtnActionPerformed

    private void otherRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherRBActionPerformed

        radioButtonGroup.add(otherRB);
        reasonTA.setEnabled(true);
    }//GEN-LAST:event_otherRBActionPerformed

    private void reason2RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reason2RBActionPerformed

        radioButtonGroup.add(reason2RB);
    }//GEN-LAST:event_reason2RBActionPerformed

    private void reason1RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reason1RBActionPerformed

        radioButtonGroup.add(reason1RB);
        reason1RB.setSelected(true);

    }//GEN-LAST:event_reason1RBActionPerformed

    private void letterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterBtnActionPerformed
        PhotoLibrary letters = new PhotoLibrary();
        GamePanel game = new GamePanel(letters.selectLetter());
        cardsPanel.removeAll();
        cardsPanel.add(game);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_letterBtnActionPerformed

    private void numberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberBtnActionPerformed
        PhotoLibrary numbers = new PhotoLibrary();
        GamePanel game = new GamePanel(numbers.selectNumber());
        cardsPanel.removeAll();
        cardsPanel.add(game);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_numberBtnActionPerformed

    private void userNameTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTF1ActionPerformed

    private void backBT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBT2ActionPerformed
        // TODO add your handling code here:
        
        cardsPanel.removeAll();
        cardsPanel.add(signInCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_backBT2ActionPerformed

    private void emailTM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTM2ActionPerformed

    private void clearBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn2ActionPerformed
        // TODO add your handling code here:
        
        userNameTF2.setText("");
        emailTM2.setText("");
        newPassWordTF2.setText("");
    }//GEN-LAST:event_clearBtn2ActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
              
  UserInformation u = new UserInformation(); 
        String userName = userNameTF2.getText();
        String email = emailTM2.getText();
        String newPassword = new String(newPassWordTF2.getPassword());

        if (u.isPasswordValid(new String(newPassWordTF2.getPassword()), new String(newConfPassWordTF2.getPassword()))) {
            
            if (u.resetPassword(userName , email , newPassword )) {
                userNameTF2.setText("");
                newPassWordTF2.setText("");
                newConfPassWordTF2.setText("");
                emailTM2.setText("");
                
                JOptionPane.showMessageDialog(null,"Your password has changed ☻ ,\n Your new password is : " +newPassword );
           
                cardsPanel.removeAll();
                cardsPanel.add(signInCard);
                cardsPanel.repaint();
                cardsPanel.revalidate();
                
             }
            
           
            
        } else{
            
                 JOptionPane.showMessageDialog(null,"Your Username or Email isn't Valid " );
           
            
            }
        if (new String(newPassWordTF2.getPassword()).equals("") || new String(newConfPassWordTF2.getPassword()).equals("") || email1.equals("")) {

            String msg = "Your Information are not completed ," + "\n please fill in your information and try again ♥";
            JOptionPane.showMessageDialog(null, msg);
        }
        
        
        else{ 
            JOptionPane.showMessageDialog(null, "Your Password OR Confirm Password \n is NOT Valid");
        
        userNameTF2.setText("");
                newPassWordTF2.setText("");
                newConfPassWordTF2.setText("");
                emailTM2.setText("");
        
        }
        
        
        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void userNameTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTF2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         cardsPanel.removeAll();
        cardsPanel.add(resetPasswordCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void newPassWordTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassWordTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassWordTF2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        // TODO add your handling code here:
        

          String ObjButtons[] = {"Yes","No"};
        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Online Examination System",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(PromptResult==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }



    }//GEN-LAST:event_formWindowClosing

    private void backBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn3ActionPerformed
        // TODO add your handling code here:
        
        cardsPanel.removeAll();
        cardsPanel.add(gameInterfaceCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
        
    }//GEN-LAST:event_backBtn3ActionPerformed

    private void scoreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreTextActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
         String ObjButtons[] = {"Yes","No"};
        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Online Examination System",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(PromptResult==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void HomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomebtnActionPerformed
        cardsPanel.removeAll();
        cardsPanel.add(gameInterfaceCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_HomebtnActionPerformed

    private void toGameTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toGameTypeActionPerformed
        cardsPanel.removeAll();
        cardsPanel.add(gameTypeCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_toGameTypeActionPerformed

    private void highestscoreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highestscoreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_highestscoreTextActionPerformed

    private void totalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTextActionPerformed

    private void passWordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passWordTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passWordTFActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed

        cardsPanel.removeAll();
        cardsPanel.add(signInCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void deletEBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletEBtnActionPerformed

        cardsPanel.removeAll();
        cardsPanel.add(deleteAcountCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();

    }//GEN-LAST:event_deletEBtnActionPerformed

    private void scoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreBtnActionPerformed

        leaderBoaredCard leader = new leaderBoaredCard();
        cardsPanel.removeAll();
        cardsPanel.add(leader);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_scoreBtnActionPerformed

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed

        cardsPanel.removeAll();
        cardsPanel.add(gameTypeCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
    }//GEN-LAST:event_playBtnActionPerformed

    
    public JPanel getCardName(){
    
    
       return gameTypeCard ;
    }
    
    
   
  
     
     class Exit implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
     
     public static final String GAME_TYPE =  "GameType";
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebtn;
    private javax.swing.JLabel PURPLE;
    private javax.swing.JLabel PURPLE1;
    private javax.swing.JLabel PURPLE2;
    private javax.swing.JLabel PURPLE3;
    private javax.swing.JLabel PURPLE4;
    private javax.swing.JLabel TIFANY;
    private javax.swing.JLabel TIFANY1;
    private javax.swing.JLabel YELLOW;
    private javax.swing.JLabel YELLOW1;
    private javax.swing.JLabel YELLOW2;
    private javax.swing.JLabel YELLOW3;
    private javax.swing.JButton backBT1;
    private javax.swing.JButton backBT2;
    private javax.swing.JLabel bestScoreLP1;
    private javax.swing.ButtonGroup btnGroup;
    public javax.swing.JPanel cardsPanel;
    private javax.swing.JButton clearBtn1;
    private javax.swing.JButton clearBtn2;
    private javax.swing.JButton clearOpBtn;
    private javax.swing.JLabel confPassWord;
    private javax.swing.JLabel confPassWord1;
    private javax.swing.JPasswordField confPasswordTF;
    private javax.swing.JPanel container;
    private javax.swing.JButton deletEBtn;
    private javax.swing.JPanel deleteAcountCard;
    private javax.swing.JButton deleteOpBtn;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JTextField emailTM;
    private javax.swing.JTextField emailTM2;
    private javax.swing.JButton exitbtn;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel gameInterfaceCard;
    private javax.swing.JLabel gameName;
    public javax.swing.JPanel gameTypeCard;
    private javax.swing.JPanel header;
    private javax.swing.JTextField highestscoreText;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton letterBtn;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton monstersBtn;
    private javax.swing.JPasswordField newConfPassWordTF2;
    private javax.swing.JPasswordField newPassWordTF2;
    private javax.swing.JButton numberBtn;
    private javax.swing.JRadioButton otherRB;
    private javax.swing.JLabel passJL;
    private javax.swing.JLabel passWord;
    private javax.swing.JLabel passWord1;
    private javax.swing.JLabel passWord2;
    private javax.swing.JPasswordField passWordTF;
    private javax.swing.JPasswordField passwordDeleteTF;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JButton playBtn;
    private javax.swing.JLabel plzLP;
    private javax.swing.JPanel plzPanel;
    private javax.swing.JRadioButton reason1RB;
    private javax.swing.JRadioButton reason2RB;
    private javax.swing.JLabel reasonDeleteLP;
    private javax.swing.JTextArea reasonTA;
    private javax.swing.JPanel resetPasswordCard;
    private javax.swing.JLabel right;
    private javax.swing.JLabel score;
    private javax.swing.JButton scoreBtn;
    private javax.swing.JTextField scoreText;
    private javax.swing.JButton signInBtn;
    private javax.swing.JPanel signInCard;
    private javax.swing.JLabel signInImg;
    private javax.swing.JLabel signInImg1;
    private javax.swing.JLabel signInImg2;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JButton signUpBtn1;
    private javax.swing.JPanel signUpCard;
    private javax.swing.JLabel signUpImg;
    private javax.swing.JLabel signUpImg1;
    private javax.swing.JButton startGameBtn;
    private javax.swing.JPanel startGameCard;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton toGameType;
    private javax.swing.JLabel totalScoreLP1;
    private javax.swing.JTextField totalText;
    private javax.swing.JLabel typePassLP;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userName1;
    private javax.swing.JLabel userName2;
    private javax.swing.JLabel userName3;
    private javax.swing.JTextField userNameTF;
    private javax.swing.JTextField userNameTF1;
    private javax.swing.JTextField userNameTF2;
    private javax.swing.JTextField usernameT;
    private javax.swing.JPanel winCard;
    private javax.swing.JLabel youWin;
    // End of variables declaration//GEN-END:variables


    class leaderBoaredCard extends JPanel{
    private leaderBoaredCard(){
        JPanel jPanel1 = new JPanel();
    Vector<Score> score =  playerScore.searchScore();
        for(Score thescore : score )
        {
            jPanel1.add(new JLabel(), thescore);
        }
        }
    
   
}

class GamePanel extends JPanel {

        CardsPanel cards;
        JButton reset = new JButton("Reset");
        JButton back = new JButton("Back");
        JButton exit = new JButton("Exit");
        JPanel options = new JPanel();

        public GamePanel(){}
        public GamePanel(List<String> selectedPhotos) {
            cards = new CardsPanel(selectedPhotos);
            setLayout(new BorderLayout());
            this.setBackground(new java.awt.Color(175,233,217));
            options.setLayout(new GridLayout());
            reset.setBackground(new java.awt.Color(243,177,177));
            reset.setForeground(new java.awt.Color(255, 255, 255));
            back.setBackground(new java.awt.Color(243,177,177));
            back.setForeground(new java.awt.Color(255, 255, 255));
            exit.setBackground(new java.awt.Color(243,177,177));
            exit.setForeground(new java.awt.Color(255, 255, 255));

            options.add(reset);
            options.add(back);
            options.add(exit);
            reset.addActionListener(new Reset());
            exit.addActionListener(new Exit());
            back.addActionListener(new Back());
            add(options, BorderLayout.NORTH);
            add(cards, BorderLayout.CENTER);
            add(cards.mistakes, BorderLayout.SOUTH);
            for (int i = 0; i < 20; i++) {
                cards.shuffle();
            }
        }



        class Reset implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                cards.shuffle();
            }
        }
        
        
          class Back implements ActionListener {

            public void actionPerformed(ActionEvent e) {

         
                cardsPanel.removeAll();
        cardsPanel.add(gameTypeCard);
        cardsPanel.repaint();
        cardsPanel.revalidate();
            }
        }
        

        class Exit implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                String ObjButtons[] = {"Yes","No"};
        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Online Examination System",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(PromptResult==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
            }
        }

    }

    class CardsPanel extends JPanel implements ActionListener {

        Cards allCards[] = new Cards[20];
        int firstCard = 20, secondCard = 20, matches = 0, turns = 0, mismatch = 0;
        Timer time;
        int delay = 500;
        JLabel mistakes = new JLabel("The number of mismatches is: ");
        

        public CardsPanel(List<String> selectedPhotos) {
            
            setLayout(new GridLayout(4, 5, 5, 6));
            this.setBackground(new java.awt.Color(175,233,217));
            mistakes.setForeground(new java.awt.Color(102,102,102));
            int cardNumber = 0;
            for (int i = 0; i < 10; i++) {
                allCards[cardNumber] = new Cards(selectedPhotos.get(i));
                add(allCards[cardNumber]);
                allCards[cardNumber].addActionListener(this);
                cardNumber++;
                allCards[cardNumber] = new Cards(selectedPhotos.get(i));
                add(allCards[cardNumber]);
                allCards[cardNumber].addActionListener(this);
                cardNumber++;
            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int selection = 0;
            for (int c = 0; c < 20; c++) {
                if (e.getSource() == allCards[c]) {
                    selection = c;
                }
            }

            if (firstCard == 20) {
                firstCard = selection;
                allCards[firstCard].flipCard();
            } else if (firstCard != selection) {
                turns++;
                secondCard = selection;
                allCards[selection].flipCard();
                if (allCards[firstCard].getPicture().equals(allCards[secondCard].getPicture())) {
                    matches++;
                    allCards[firstCard].setEnabled(false);
                    allCards[secondCard].setEnabled(false);
                    if (matches == 10) {
                        
                        playerScore.scoreUpdate(turns);
                        cardsPanel.removeAll();
                        cardsPanel.add(winCard);
                        cardsPanel.repaint();
                        cardsPanel.revalidate();
                        scoreText.setEnabled(false);
                        scoreText.setText("" + turns);
                        highestscoreText.setEnabled(false);
                        highestscoreText.setText("" + playerScore.getHighscore());
                        totalText.setEnabled(false);
                        totalText.setText("" + playerScore.getTotalScore());
                        
                       
                      

                    }
                    firstCard = 20;
                } else {
                    mismatch++;
                    mistakes.setText("The number of mismatches is: " + mismatch);
                    Delay();
                }

            }

        }

        public void shuffle() {
            for (int c = 0; c < 20; c++) {
                int spot = (int) (Math.random() * 20d);
                String tempCountry = allCards[spot].getPicture();
                allCards[spot].changePicture(allCards[c].getPicture());
                allCards[c].changePicture(tempCountry);
            }
            for (int c = 0; c < 20; c++) {
                allCards[c].faceDown();
                allCards[c].setEnabled(true);
            }
            matches = 0;
            firstCard = 20;
            secondCard = 20;
            turns = 0;
            mismatch = 0;
            mistakes.setText("The number of mismatches is: ");

        }
        

        private void Delay() {
            ActionListener al = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    allCards[firstCard].flipCard();
                    allCards[secondCard].flipCard();
                    firstCard = 20;
                    time.stop();
                }
            };
            time = new Timer(delay, al);
            time.start();
        }

    
    }

    class Cards extends JButton {

        private ImageIcon imageUp;
        private boolean faceUp = false;
        private String picture;
        PhotoLibrary photos = new PhotoLibrary();
        private ImageIcon imageBack;

        public Cards(String picture) {
            this.picture = picture;
            this.imageUp = new ImageIcon(picture);
            imageBack = new ImageIcon(photos.selectBack());
            this.setSize(50, 50);
            this.setBorder(null); 
            this.setBackground(new java.awt.Color(221,221,221));
         
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public void changePicture(String picture) {
            this.picture = picture;
            this.imageUp = new ImageIcon(picture);
        }

        public void faceUp() {
            super.setIcon(imageUp);
            faceUp = true;
        }

        public void faceDown() {
            super.setIcon(imageBack);
            faceUp = false;
            
        }

        public void flipCard() {
            if (faceUp) {
                faceDown();
            } else {
                faceUp();
            }
        }
    }


}
