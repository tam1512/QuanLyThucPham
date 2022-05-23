/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import BUS.CTPhieuNhap_BUS;
import BUS.PhieuNhap_BUS;
import BUS.SanPham_BUS;
import DTO.CTPhieuNhap_DTO;
import DTO.PhieuNhap_DTO;
import DTO.SanPham_DTO;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author blemb
 */
public class NhapHang_GUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form NhapHang_GUI
     */
    public NhapHang_GUI() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        showAll_PN();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        pn_pn = new javax.swing.JPanel();
        txt_mapn = new javax.swing.JTextField();
        txt_mancc = new javax.swing.JTextField();
        txt_ngaynhap = new javax.swing.JTextField();
        txt_manv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_xoapn = new javax.swing.JButton();
        btn_thempn = new javax.swing.JButton();
        btn_suapn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_ctphieunhap = new javax.swing.JTable();
        pn_phieunhap = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_phieunhap = new javax.swing.JTable();
        pn_ctpn = new javax.swing.JPanel();
        txt_masp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_soluong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_mactpn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_suactpn = new javax.swing.JButton();
        btn_themctpn = new javax.swing.JButton();
        btn_xoactpn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1075, 600));
        setMinimumSize(new java.awt.Dimension(1075, 600));
        setPreferredSize(new java.awt.Dimension(1075, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        jRadioButton2.setText("Mã PN");

        jRadioButton3.setText("Mã NCC");

        jRadioButton6.setText("Ngày nhập");

        jRadioButton7.setText("Mã NV");

        jTextField1.setColumns(5);

        jButton4.setText("Tìm kiếm");

        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton7))
                        .addGap(53, 53, 53)
                        .addComponent(jRadioButton3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jRadioButton6)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_refresh)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btn_refresh))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 400, 200));

        pn_pn.setBorder(javax.swing.BorderFactory.createTitledBorder("Phiếu nhập"));
        pn_pn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_mapn.setText("ID_PN");
        pn_pn.add(txt_mapn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 140, -1));

        txt_mancc.setText("MaNCC");
        pn_pn.add(txt_mancc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, -1));

        txt_ngaynhap.setText("NgayNhap");
        pn_pn.add(txt_ngaynhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 140, -1));

        txt_manv.setText("MaNV");
        pn_pn.add(txt_manv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, -1));

        jLabel1.setText("Mã PN:");
        pn_pn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 51, -1, -1));

        jLabel2.setText("Mã NCC:");
        pn_pn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setText("Ngày Nhập:");
        pn_pn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, -1));

        jLabel4.setText("Mã NV: ");
        pn_pn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        btn_xoapn.setText("Xóa");
        btn_xoapn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoapnActionPerformed(evt);
            }
        });
        pn_pn.add(btn_xoapn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        btn_thempn.setText("Thêm");
        btn_thempn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thempnActionPerformed(evt);
            }
        });
        pn_pn.add(btn_thempn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        btn_suapn.setText("Sửa");
        btn_suapn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suapnActionPerformed(evt);
            }
        });
        pn_pn.add(btn_suapn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        getContentPane().add(pn_pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 310, 250));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết phiếu nhập"));

        tbl_ctphieunhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã PN", "Mã SP", "Số lượng"
            }
        ));
        tbl_ctphieunhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ctphieunhapMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_ctphieunhap);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 270));

        pn_phieunhap.setBorder(javax.swing.BorderFactory.createTitledBorder("Phiếu nhập"));

        tbl_phieunhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã PN", "Mã NCC", "Ngày nhập", "Mã NV"
            }
        ));
        tbl_phieunhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_phieunhapMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_phieunhap);
        if (tbl_phieunhap.getColumnModel().getColumnCount() > 0) {
            tbl_phieunhap.getColumnModel().getColumn(3).setHeaderValue("Ngày nhập");
        }

        javax.swing.GroupLayout pn_phieunhapLayout = new javax.swing.GroupLayout(pn_phieunhap);
        pn_phieunhap.setLayout(pn_phieunhapLayout);
        pn_phieunhapLayout.setHorizontalGroup(
            pn_phieunhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        pn_phieunhapLayout.setVerticalGroup(
            pn_phieunhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_phieunhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pn_phieunhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 400, 320));

        pn_ctpn.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết phiếu nhập"));

        txt_masp.setText("Mã sản phẩm");

        jLabel5.setText("Mã SP:");

        txt_soluong.setText("Số lượng");

        jLabel6.setText("Số lượng:");

        txt_mactpn.setText("ID_PN");

        jLabel7.setText("Mã PN:");

        btn_suactpn.setText("Sửa");
        btn_suactpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suactpnActionPerformed(evt);
            }
        });

        btn_themctpn.setText("Thêm");
        btn_themctpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themctpnActionPerformed(evt);
            }
        });

        btn_xoactpn.setText("Xóa");
        btn_xoactpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoactpnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_ctpnLayout = new javax.swing.GroupLayout(pn_ctpn);
        pn_ctpn.setLayout(pn_ctpnLayout);
        pn_ctpnLayout.setHorizontalGroup(
            pn_ctpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ctpnLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pn_ctpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ctpnLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_masp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_ctpnLayout.createSequentialGroup()
                        .addGroup(pn_ctpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(pn_ctpnLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_ctpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_ctpnLayout.createSequentialGroup()
                                .addComponent(txt_soluong, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addGroup(pn_ctpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_suactpn)
                                    .addComponent(btn_themctpn)
                                    .addComponent(btn_xoactpn)))
                            .addGroup(pn_ctpnLayout.createSequentialGroup()
                                .addComponent(txt_mactpn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pn_ctpnLayout.setVerticalGroup(
            pn_ctpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ctpnLayout.createSequentialGroup()
                .addGroup(pn_ctpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ctpnLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pn_ctpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_mactpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(29, 29, 29)
                        .addGroup(pn_ctpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_masp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(pn_ctpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_ctpnLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_suactpn)
                        .addGap(28, 28, 28)
                        .addComponent(btn_themctpn)
                        .addGap(28, 28, 28)
                        .addComponent(btn_xoactpn)))
                .addContainerGap())
        );

        getContentPane().add(pn_ctpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 330, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void showAll_PN(){
        DefaultTableModel n = new DefaultTableModel();
        PhieuNhap_BUS bus = new PhieuNhap_BUS();
        bus.docDSPN();
        Vector header = new Vector();
            header.add("STT");
            header.add("Mã PN");
            header.add("Mã NCC");
            header.add("Ngày nhập");
            header.add("Mã NV");
            n = new DefaultTableModel(header,0);
            int k = 0;
        for (PhieuNhap_DTO pn : PhieuNhap_BUS.dspn) {
     
            Vector row = new Vector();
            row.add(k);
            row.add(pn.id_phieunhap);
            row.add(pn.id_ncc);
            row.add(pn.ngaynhap);
            row.add(pn.id_nhanvien);
            n.addRow(row);
            k++;
        }
        tbl_phieunhap.setModel(n);
    }
    public void showAll_CTPN(){
        DefaultTableModel n = new DefaultTableModel();
        CTPhieuNhap_BUS bus = new CTPhieuNhap_BUS();
        bus.docDS_CTPN();
        Vector header = new Vector();
            header.add("STT");
            header.add("Mã PN");
            header.add("Mã SP");
            header.add("Số lượng");
            
            n = new DefaultTableModel(header,0);
            int k = 0;
        for (CTPhieuNhap_DTO ctpn : CTPhieuNhap_BUS.ds_ctpn) {
     
            Vector row = new Vector();
            row.add(k);
            row.add(ctpn.id_phieunhap);
            row.add(ctpn.id_sp);
            row.add(ctpn.soluong);
            
            n.addRow(row);
            k++;
        }
        tbl_ctphieunhap.setModel(n);
    }
    private void tbl_phieunhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_phieunhapMouseClicked
        // TODO add your handling code here:
        pn_ctpn.setVisible(false);
        pn_pn.setVisible(true);
        int i = tbl_phieunhap.getSelectedRow();
        DefaultTableModel n = new DefaultTableModel();
        CTPhieuNhap_BUS bus = new CTPhieuNhap_BUS();
        bus.docDS_CTPN_ID(tbl_phieunhap.getValueAt(i, 1).toString());
        Vector header = new Vector();
            header.add("STT");
            header.add("Mã PN");
            header.add("Mã SP");
            header.add("Số lượng");
            
            n = new DefaultTableModel(header,0);
            int k = 0;
        for (CTPhieuNhap_DTO ctpn : CTPhieuNhap_BUS.ds_ctpn_id) {
     
            Vector row = new Vector();
            row.add(k);
            row.add(ctpn.id_phieunhap);
            row.add(ctpn.id_sp);
            row.add(ctpn.soluong);
            
            n.addRow(row);
            k++;
        }
        tbl_ctphieunhap.setModel(n);
        
        txt_mapn.setText(tbl_phieunhap.getValueAt(i, 1).toString());
        txt_mancc.setText(tbl_phieunhap.getValueAt(i, 2).toString());
        txt_ngaynhap.setText(tbl_phieunhap.getValueAt(i, 3).toString());
        txt_manv.setText(tbl_phieunhap.getValueAt(i, 4).toString());
        
    }//GEN-LAST:event_tbl_phieunhapMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        showAll_PN();
        showAll_CTPN();
        
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_thempnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thempnActionPerformed
        // TODO add your handling code here:  
            String ma_pn = txt_mapn.getText();
            String ma_ncc = txt_mancc.getText();
            String ma_sp = txt_masp.getText();
            String ngaynhap = txt_ngaynhap.getText();
            String ma_nv = txt_manv.getText();     
            String soluong = txt_soluong.getText();
            
            boolean flag = new PhieuNhap_BUS().them_PN(ma_pn, ma_ncc, ngaynhap, ma_nv);
            if(flag == true){ 
                JOptionPane.showMessageDialog(null, "Thêm phiếu nhập thành công !");
                showAll_PN();
            }else JOptionPane.showMessageDialog(null, "Mã phiếu nhập không hợp lệ !");
            
    }//GEN-LAST:event_btn_thempnActionPerformed

    private void btn_xoapnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoapnActionPerformed
        // TODO add your handling code here:
        String ma_pn = txt_mapn.getText();
        boolean flag = new PhieuNhap_BUS().xoa_PN(ma_pn);
        if(flag == true){ 
            JOptionPane.showMessageDialog(null, "Xóa phiếu nhập thành công !");
            showAll_PN();
        }else JOptionPane.showMessageDialog(null, "Vui lòng xóa chi tiết phiếu nhập có mã '"+ ma_pn +"' trước !");
    }//GEN-LAST:event_btn_xoapnActionPerformed

    private void btn_suapnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suapnActionPerformed
        // TODO add your handling code here:
            String ma_pn = txt_mapn.getText();
            String ma_ncc = txt_mancc.getText();
            String ngaynhap = txt_ngaynhap.getText();
            String ma_nv = txt_manv.getText();      
         boolean flag = new PhieuNhap_BUS().sua_PN(ma_pn, ma_ncc, ngaynhap, ma_nv);
        if(flag == true){ 
            JOptionPane.showMessageDialog(null, "Sửa phiếu nhập thành công !");
            showAll_PN();
        }else JOptionPane.showMessageDialog(null, "Lỗi khi sửa phiếu nhập");
    }//GEN-LAST:event_btn_suapnActionPerformed

    private void tbl_ctphieunhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ctphieunhapMouseClicked
        // TODO add your handling code here: 
        pn_ctpn.setVisible(true);
        pn_pn.setVisible(false);
        
        int i = tbl_ctphieunhap.getSelectedRow();   
        txt_mactpn.setText(tbl_ctphieunhap.getValueAt(i, 1).toString());
        txt_masp.setText(tbl_ctphieunhap.getValueAt(i, 2).toString());
        txt_soluong.setText(tbl_ctphieunhap.getValueAt(i, 3).toString());
        
    }//GEN-LAST:event_tbl_ctphieunhapMouseClicked

    private void btn_suactpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suactpnActionPerformed
        // TODO add your handling code here:
        String ma_pn = txt_mactpn.getText();
            String ma_sp = txt_masp.getText();
            String soluong = txt_soluong.getText();      
         boolean flag = new CTPhieuNhap_BUS().sua_CTPN(ma_pn, ma_sp, soluong);
        if(flag == true){ 
            JOptionPane.showMessageDialog(null, "Sửa chi tiết phiếu nhập thành công !");
            showAll_CTPN();
        }else JOptionPane.showMessageDialog(null, "Lỗi khi sửa chi tiết phiếu nhập");
    }//GEN-LAST:event_btn_suactpnActionPerformed

    private void btn_themctpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themctpnActionPerformed
        // TODO add your handling code here:
        SanPham_BUS sp = new SanPham_BUS();
        String ma_pn = txt_mactpn.getText();
            String ma_sp = txt_masp.getText();
            String soluong = txt_soluong.getText();    
        boolean flag = new CTPhieuNhap_BUS().them_CTPN(ma_pn, ma_sp, soluong);
            if(flag == true){ 
                JOptionPane.showMessageDialog(null, "Thêm phiếu nhập thành công !");
                sp.capNhatSlSp_cong(soluong, ma_sp);
                showAll_CTPN();
            }else JOptionPane.showMessageDialog(null, "Mã phiếu nhập không hợp lệ !");
    }//GEN-LAST:event_btn_themctpnActionPerformed

    private void btn_xoactpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoactpnActionPerformed
        // TODO add your handling code here:
        SanPham_BUS sp = new SanPham_BUS();
        String ma_pn = txt_mapn.getText();
        String ma_sp = txt_masp.getText();
                    String soluong = txt_soluong.getText();    

        boolean flag = new CTPhieuNhap_BUS().xoa_CTPN(ma_pn,ma_sp);
        if(flag == true){ 
            sp.capNhatSlSp(soluong, ma_sp);
            JOptionPane.showMessageDialog(null, "Xóa phiếu nhập thành công !");
            showAll_CTPN();
        }else JOptionPane.showMessageDialog(null, "Lỗi khi xóa chi tiết phiếu nhập");
    }//GEN-LAST:event_btn_xoactpnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_suactpn;
    private javax.swing.JButton btn_suapn;
    private javax.swing.JButton btn_themctpn;
    private javax.swing.JButton btn_thempn;
    private javax.swing.JButton btn_xoactpn;
    private javax.swing.JButton btn_xoapn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pn_ctpn;
    private javax.swing.JPanel pn_phieunhap;
    private javax.swing.JPanel pn_pn;
    private javax.swing.JTable tbl_ctphieunhap;
    private javax.swing.JTable tbl_phieunhap;
    private javax.swing.JTextField txt_mactpn;
    private javax.swing.JTextField txt_mancc;
    private javax.swing.JTextField txt_manv;
    private javax.swing.JTextField txt_mapn;
    private javax.swing.JTextField txt_masp;
    private javax.swing.JTextField txt_ngaynhap;
    private javax.swing.JTextField txt_soluong;
    // End of variables declaration//GEN-END:variables
}
