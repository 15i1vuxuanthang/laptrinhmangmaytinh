/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat15i1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.codehaus.jackson.map.ObjectMapper;


public class ChatFrame extends javax.swing.JFrame {
  
     public static String CURRENT_USER;
    final private DefaultListModel<String> friendListModel;
    final private HashMap<String,String> mapChatContent;
    public ChatFrame() {
        friendListModel = new DefaultListModel<>();
        mapChatContent = new HashMap<>();
        initComponents();
        listfriends.setModel(friendListModel);
        CURRENT_USER = LoginFrame.USER_NAME;
        lblchu.setText(CURRENT_USER);
        getAndDisplayUser();
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listfriends = new javax.swing.JList<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        noidung = new javax.swing.JTextArea();
        txt_Noidung = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblkhach = new javax.swing.JLabel();
        lblchu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        listfriends.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        listfriends.setForeground(new java.awt.Color(51, 51, 255));
        listfriends.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listfriends.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listfriendsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listfriends);

        noidung.setEditable(false);
        noidung.setBackground(new java.awt.Color(204, 204, 255));
        noidung.setColumns(20);
        noidung.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        noidung.setRows(5);
        jScrollPane2.setViewportView(noidung);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Gửi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        btout.setBackground(new java.awt.Color(255, 0, 0));
        btout.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btout.setForeground(new java.awt.Color(255, 255, 255));
        btout.setText("Đăng Xuất");
        btout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btoutMouseClicked(evt);
            }
        });
        btout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Chat Live");

        lblkhach.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblkhach.setForeground(new java.awt.Color(204, 0, 0));
        lblkhach.setText("UserName ");

        lblchu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblchu.setText("Admin");

        tes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tes.setText("nhận");
        tes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 24, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(txt_Noidung))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(327, 327, 327)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(tes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblchu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btout, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblchu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btout))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_Noidung, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String s = txt_Noidung.getText().trim();
        if (s.length() >0){
            try{
                MyMessage m = new MyMessage();
                m.sender = CURRENT_USER;
                m.receiver = lblkhach.getText().trim();
                m.type = "chat";
                m.content = s;
                ChatClient client = new ChatClient();
                MyMessage r = client.sendMessage(m);
                if (r.content.equalsIgnoreCase("ok")){
                   noidung.append(CURRENT_USER + ": " + s + "\n");
                    txt_Noidung.setText("");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listfriendsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listfriendsValueChanged
        
        String s = lblkhach.getText();
        String content = noidung.getText();
        mapChatContent.put(s, content);
        if (!evt.getValueIsAdjusting()){
            JList source = (JList)evt.getSource();
            String selected = source.getSelectedValue().toString();
            lblkhach.setText(selected);
            content = mapChatContent.get(selected);
            noidung.setText(content);
        }
    }//GEN-LAST:event_listfriendsValueChanged

    private void btoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btoutMouseClicked
      
        ChatFrame cf = new ChatFrame();
        JOptionPane.showMessageDialog(cf, "Bạn đã đăng xuất");
        LoginFrame LF = new LoginFrame();
        LF.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btoutMouseClicked

    private void btoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btoutActionPerformed

    private void tesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tesActionPerformed
        // TODO add your handling code here:
        try{
            MyMessage m = new MyMessage();
            m.sender = CURRENT_USER;
            m.receiver = "server";
            m.type = "getmessages";
            m.content = lblkhach.getText().trim();
            ChatClient client = new ChatClient();
            MyMessage r = client.sendMessage(m);
            ObjectMapper mapper = new ObjectMapper();
            ArrayList<String> b = mapper.readValue(r.content, ArrayList.class);
            for (String s:b){
                noidung.append(m.content + ": " + s + "\n");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_tesActionPerformed

    
    public static void main(String args[]) {
      

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ChatFrame().setVisible(true);
                
            }                                
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btout;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel lblchu;
    public javax.swing.JLabel lblkhach;
    private javax.swing.JList<String> listfriends;
    private javax.swing.JTextArea noidung;
    private javax.swing.JButton tes;
    private javax.swing.JTextField txt_Noidung;
    // End of variables declaration//GEN-END:variables
private void getAndDisplayUser(){
          try{
           
            MyMessage m = new MyMessage();
            m.sender = CURRENT_USER;
            m.receiver = "server";
            m.type = "getusers";
            ChatClient client = new ChatClient();
            MyMessage r = client.sendMessage(m);
            ObjectMapper mapper = new ObjectMapper();
            ArrayList<String> b = mapper.readValue(r.content, ArrayList.class);
            for (int i=0; i<b.size(); i++){
                String s = b.get(i);
                System.out.println(""+s);
                friendListModel.addElement(s);
                mapChatContent.put(s, "");
                if (i==0){
                    lblkhach.setText(s);
                    //i2
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

