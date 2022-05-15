/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;


import BUS.SanPham_BUS;
import DTO.SanPham_DTO;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author blemb
 */
public class SanPham_GUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form SanPham_GUI
     */
    public SanPham_GUI() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        showAll();
        
        

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        timkiem_sp = new javax.swing.ButtonGroup();

        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();

        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_refresh = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt_masp = new javax.swing.JTextField();
        txt_maloai = new javax.swing.JTextField();
        txt_mancc = new javax.swing.JTextField();
        txt_tensp = new javax.swing.JTextField();
        txt_soluong = new javax.swing.JTextField();
        txt_gia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sanpham = new javax.swing.JTable();


        setMinimumSize(new java.awt.Dimension(1060, 580));
        setPreferredSize(new java.awt.Dimension(1068, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));


        timkiem_sp.add(jRadioButton1);
        jRadioButton1.setText("Số TT");

        timkiem_sp.add(jRadioButton2);
        jRadioButton2.setText("Mã sp");

        timkiem_sp.add(jRadioButton3);
        jRadioButton3.setText("Mã loại");

        timkiem_sp.add(jRadioButton4);
        jRadioButton4.setText("Số lượng");

        timkiem_sp.add(jRadioButton5);
        jRadioButton5.setText("Đơn giá");

        timkiem_sp.add(jRadioButton6);
        jRadioButton6.setText("Mã NCC");

        timkiem_sp.add(jRadioButton7);
        jRadioButton7.setText("Tên SP");

        jTextField1.setColumns(5);

        jButton4.setText("Tìm kiếm");


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton7))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton4))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(51, 51, 51))))

        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton7))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)

                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 390, 260));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tùy chọn"));

        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_refresh)
                        .addGap(44, 44, 44)
                        .addComponent(btn_them))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_xoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_sua)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refresh)
                    .addComponent(btn_them))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoa)
                    .addComponent(btn_sua))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 370, 150));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin sản phẩm"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_masp.setText("ID_SanPham");
        jPanel3.add(txt_masp, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 48, -1, -1));

        txt_maloai.setText("ID_Loai");
        jPanel3.add(txt_maloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 48, 90, -1));

        txt_mancc.setText("ID_NCC");
        jPanel3.add(txt_mancc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 140, -1));

        txt_tensp.setText("Tên SP");
        jPanel3.add(txt_tensp, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 103, 220, -1));

        txt_soluong.setText("Số lượng");
        jPanel3.add(txt_soluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        txt_gia.setText("Đơn giá");
        jPanel3.add(txt_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, -1));

        jLabel1.setText("Mã SP:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 51, -1, -1));

        jLabel2.setText("Mã loại:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 51, -1, -1));

        jLabel3.setText("Mã NCC:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 120, -1));

        jLabel4.setText("Tên SP:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 106, -1, -1));

        jLabel5.setText("Mô tả:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel6.setText("Đơn giá:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel7.setText("Số lượng:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        txt_mota.setColumns(20);
        txt_mota.setLineWrap(true);
        txt_mota.setRows(5);
        txt_mota.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txt_mota);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 360, 100));


        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 610, 250));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Sản phẩm"));


        tbl_sanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "ID_SanPham", "ID_Loai", "ID_NCC", "Tên SP", "Mô tả", "Đơn giá", "Số lượng"
            }
        ));
        tbl_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sanphamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_sanpham);


        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()

                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))

        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()

                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())

        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showAll(){
        DefaultTableModel n = new DefaultTableModel();
        SanPham_BUS bus = new SanPham_BUS();
        bus.docSanPham_edit();
        Vector header = new Vector();
            header.add("STT");
            header.add("ID_SanPham");
            header.add("ID_Loai");
            header.add("ID_NCC");
            header.add("Tên SP");
            header.add("Mô tả");
            header.add("Đơn giá");
            header.add("Số lượng");
            n = new DefaultTableModel(header,0);
            int k = 0;
        for (SanPham_DTO sp : SanPham_BUS.dssp) {
     
            Vector row = new Vector();
            row.add(k);
            row.add(sp.id_sanpham);
            row.add(sp.id_loai);
            row.add(sp.id_ncc);
            row.add(sp.tensp);
            row.add(sp.mota);
            row.add(sp.giaban);
            row.add(sp.soluong);
            n.addRow(row);
            k++;
        }
        tbl_sanpham.setModel(n);
    }
    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        showAll();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void tbl_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sanphamMouseClicked
        // TODO add your handling code here:
        int i = tbl_sanpham.getSelectedRow();
        txt_masp.setText(tbl_sanpham.getModel().getValueAt(i, 1).toString());
        txt_maloai.setText(tbl_sanpham.getModel().getValueAt(i,2).toString());
        txt_mancc.setText(tbl_sanpham.getModel().getValueAt(i,3).toString());
        txt_tensp.setText(tbl_sanpham.getModel().getValueAt(i,4).toString());
        txt_mota.setText(tbl_sanpham.getModel().getValueAt(i,5).toString());
        txt_gia.setText(tbl_sanpham.getModel().getValueAt(i,6).toString());
        txt_soluong.setText(tbl_sanpham.getModel().getValueAt(i,7).toString());
        
    }//GEN-LAST:event_tbl_sanphamMouseClicked

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int i = tbl_sanpham.getSelectedRow();
        String ma_sp = txt_masp.getText();
        String ma_loai = txt_maloai.getText();
        String ma_ncc = txt_mancc.getText();
        String ten_sp = txt_tensp.getText();
        String mo_ta = txt_mota.getText();
        String gia = txt_gia.getText();
        String sl = txt_soluong.getText();
        new SanPham_BUS().sua_sp(ma_sp, ma_loai, ma_ncc, ten_sp, mo_ta, gia, sl);
        showAll();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int i = tbl_sanpham.getSelectedRow();
        String id_sp = tbl_sanpham.getValueAt(i, 1).toString();
        new SanPham_BUS().xoa_sp(id_sp);
        showAll();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        int flag = 0;
        String id_sp = txt_masp.getText();
        int row = tbl_sanpham.getModel().getRowCount();
        for(int i = 0; i < row; i++){
        if(id_sp.equals(tbl_sanpham.getValueAt(i, 1).toString())){
            flag = 1;
        }
        } 
        if(flag == 0){
            String ma_sp = txt_masp.getText();
        String ma_loai = txt_maloai.getText();
        String ma_ncc = txt_mancc.getText();
        String ten_sp = txt_tensp.getText();
        String mo_ta = txt_mota.getText();
        String gia = txt_gia.getText();
        String sl = txt_soluong.getText();
        new SanPham_BUS().them_sp(ma_sp, ma_loai, ma_ncc, ten_sp, mo_ta, gia, sl);
        JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công !");
        showAll();
        }else JOptionPane.showMessageDialog(null, "Mã sản phẩm đã tồn tại !");
    }//GEN-LAST:event_btn_themActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;

    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_sanpham;
    private javax.swing.ButtonGroup timkiem_sp;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JTextField txt_maloai;
    private javax.swing.JTextField txt_mancc;
    private javax.swing.JTextField txt_masp;
    private javax.swing.JTextArea txt_mota;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_tensp;

    // End of variables declaration//GEN-END:variables
}
