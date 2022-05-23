/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.NhanVien_BUS;
import BUS.SanPham_BUS;
import BUS.ThanhVien_BUS;
import DTO.NhanVien_DTO;
import DTO.SanPham_DTO;
import DTO.ThanhVien_DTO;
import java.util.Vector;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ThanhVien_GUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form ThanhVien_GUI
     */
    public ThanhVien_GUI() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        showAll();
        DangNhap_GUI dn = new DangNhap_GUI();
        if(dn.flag == 1){
            admin();
        } else user();
     }
    
    
    public void showAll(){
          DefaultTableModel n = new DefaultTableModel();
        ThanhVien_BUS bus = new ThanhVien_BUS();
        bus.docThanhVien();
         Vector header = new Vector();
            header.add("STT");
            header.add("ID Thành Viên");
            header.add("Tên thành viên");
            header.add("Số điện thoại");
            header.add("Ngày đăng kí");
           
            n = new DefaultTableModel(header,0);
            int k = 0;
             for (ThanhVien_DTO tv : ThanhVien_BUS.dstv) {
     
            Vector row = new Vector();
            row.add(k);
            row.add(tv.ID_ThanhVien);
            row.add(tv.HoVaTen);
            row.add(tv.SoDienThoai);
            row.add(tv.NgayDangKi);
            n.addRow(row);
            k++;
        }
        tbl_ThanhVien.setModel(n);
    }
    public void showAll_nv(){
          DefaultTableModel n = new DefaultTableModel();
        NhanVien_BUS bus = new NhanVien_BUS();
        bus.docNhanVien_edit();
         Vector header = new Vector();
            header.add("STT");
            header.add("ID Thành Viên");
            header.add("Tên thành viên");
            header.add("Email");
            header.add("Địa chỉ");
            header.add("Số điện thoại");
            header.add("Tên đăng nhập");
           
            n = new DefaultTableModel(header,0);
            int k = 0;
             for (NhanVien_DTO nv : NhanVien_BUS.dsnv) {
     
            Vector row = new Vector();
            row.add(k);
            row.add(nv.ID_NhanVien);
            row.add(nv.HoVaTen);
            row.add(nv.Email);
            row.add(nv.DiaChi);
            row.add(nv.SoDienThoai);
            row.add(nv.TenDangNhap);
            n.addRow(row);
            k++;
        }
        tbl_NhanVien.setModel(n);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_ThanhVien = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txt_sdt = new javax.swing.JTextField();
        txt_tenkhachhang = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_lammoi = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbtn_ma = new javax.swing.JRadioButton();
        rbtn_ten = new javax.swing.JRadioButton();
        txt_timkiem = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();
        rbtn_sdt = new javax.swing.JRadioButton();
        rbtn_ngaydk = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_NhanVien = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        rbtn_ten1 = new javax.swing.JRadioButton();
        txt_timkiem1 = new javax.swing.JTextField();
        btn_timkiem1 = new javax.swing.JButton();
        Email = new javax.swing.JRadioButton();
        rbtn_ten2 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        rbtn_ten3 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        txt_DiaChiNV = new javax.swing.JTextField();
        txt_TenNhanVien = new javax.swing.JTextField();
        txt_EmailNV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_SoDienThoaiNV = new javax.swing.JTextField();
        ttkm_makm3 = new javax.swing.JTextField();
        txt_tendn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btn_lammoi_nv = new javax.swing.JButton();
        nv_btn_xoa = new javax.swing.JButton();
        nv_btn_sua = new javax.swing.JButton();
        nv_btn_Them = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1075, 600));
        setMinimumSize(new java.awt.Dimension(1075, 600));
        setPreferredSize(new java.awt.Dimension(1075, 600));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thành Viên"));

        tbl_ThanhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID Thành Viên", "Tên thành viên", "Số điện thoại", "Ngày đăng kí"
            }
        ));
        tbl_ThanhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ThanhVienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_ThanhVien);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1047, 300));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin khách hàng"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_sdt.setColumns(10);
        txt_sdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sdtActionPerformed(evt);
            }
        });
        jPanel3.add(txt_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 67, 213, -1));

        txt_tenkhachhang.setColumns(3);
        jPanel3.add(txt_tenkhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 33, 213, -1));

        txt_date.setColumns(10);
        jPanel3.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 101, 213, -1));

        jLabel2.setText("Ngày đăng kí");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 104, 84, -1));

        jLabel3.setText("Tên Khách hàng");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 36, -1, -1));

        jLabel4.setText("Số điện thoại");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 73, -1, -1));

        btn_lammoi.setText("Refresh");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });
        jPanel3.add(btn_lammoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 18, -1, -1));

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 67, -1, -1));

        btn_sua.setText("Sửa");
        btn_sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_suaMouseClicked(evt);
            }
        });
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 107, -1, -1));

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 308, 630, 190));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtn_ma.setText("Theo mã");
        jPanel1.add(rbtn_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 37, -1, -1));

        rbtn_ten.setText("Theo Tên");
        jPanel1.add(rbtn_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 37, -1, -1));

        txt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timkiemActionPerformed(evt);
            }
        });
        jPanel1.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 127, 155, -1));

        btn_timkiem.setText("Tìm kiếm");
        jPanel1.add(btn_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 127, -1, -1));

        rbtn_sdt.setText("Theo SDT");
        jPanel1.add(rbtn_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 75, -1, -1));

        rbtn_ngaydk.setText("Theo ngày ĐK");
        jPanel1.add(rbtn_ngaydk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 410, 190));

        jTabbedPane1.addTab("Thành Viên", jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        tbl_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID Nhân Viên", "Tên Nhân Viên", "Email", "Đia chỉ", "Số điện thoại", "Tên đăng nhập"
            }
        ));
        tbl_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_NhanVien);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jRadioButton4.setText("Theo mã");

        rbtn_ten1.setText("Theo Tên");

        btn_timkiem1.setText("Tìm kiếm");

        Email.setText("Theo mã");

        rbtn_ten2.setText("Theo Tên");

        jRadioButton6.setText("Theo mã");

        rbtn_ten3.setText("Theo Tên");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txt_timkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btn_timkiem1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(Email)
                        .addGap(54, 54, 54)
                        .addComponent(rbtn_ten2)
                        .addGap(50, 50, 50)
                        .addComponent(jRadioButton6)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rbtn_ten1)
                                .addGap(50, 50, 50))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(rbtn_ten3)
                        .addGap(32, 32, 32))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(rbtn_ten1)
                    .addComponent(rbtn_ten3))
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(rbtn_ten2)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timkiem1))
                .addGap(33, 33, 33))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_DiaChiNV.setColumns(10);
        txt_DiaChiNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiaChiNVActionPerformed(evt);
            }
        });
        jPanel8.add(txt_DiaChiNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 95, 214, -1));

        txt_TenNhanVien.setColumns(3);
        jPanel8.add(txt_TenNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 24, 217, -1));

        txt_EmailNV.setColumns(10);
        jPanel8.add(txt_EmailNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 52, 215, -1));

        jLabel7.setText("Email");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 55, -1, -1));

        jLabel8.setText("Tên Nhân Viên");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 27, -1, -1));

        jLabel9.setText("Địa chỉ");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 98, -1, -1));

        jLabel13.setText("Số điện thoại");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 135, -1, -1));

        txt_SoDienThoaiNV.setColumns(3);
        jPanel8.add(txt_SoDienThoaiNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 129, 215, -1));

        ttkm_makm3.setColumns(3);
        jPanel8.add(ttkm_makm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 181, -1, -1));

        txt_tendn.setColumns(3);
        txt_tendn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tendnActionPerformed(evt);
            }
        });
        jPanel8.add(txt_tendn, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 172, 215, -1));

        jLabel14.setText("Tên đăng nhập");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 175, -1, -1));

        btn_lammoi_nv.setText("Refresh");
        btn_lammoi_nv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoi_nvActionPerformed(evt);
            }
        });
        jPanel8.add(btn_lammoi_nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 24, -1, -1));

        nv_btn_xoa.setText("Xóa");
        nv_btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv_btn_xoaActionPerformed(evt);
            }
        });
        jPanel8.add(nv_btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 67, -1, -1));

        nv_btn_sua.setText("Sửa");
        nv_btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv_btn_suaActionPerformed(evt);
            }
        });
        jPanel8.add(nv_btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 113, -1, -1));

        nv_btn_Them.setText("Thêm");
        nv_btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv_btn_ThemActionPerformed(evt);
            }
        });
        jPanel8.add(nv_btn_Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 153, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("Nhân Viên", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sdtActionPerformed

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        // TODO add your handling code here:
        showAll();
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
         int i = tbl_ThanhVien.getSelectedRow();
        String ID_ThanhVien = tbl_ThanhVien.getValueAt(i, 1).toString();
        new ThanhVien_BUS().xoa_ThanhVien(ID_ThanhVien);
        showAll();
       
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        
        int i = tbl_ThanhVien.getSelectedRow();
        String ID_ThanhVien=tbl_ThanhVien.getModel().getValueAt(i, 1).toString();
        String HoVaTen = txt_tenkhachhang.getText();
        String DiaChi = txt_sdt.getText();
        String Email = txt_date.getText();
        String SoDienThoai = txt_sdt.getText();
       
        new ThanhVien_BUS().sua_ThanhVien(ID_ThanhVien, HoVaTen, DiaChi, Email, SoDienThoai);
        showAll();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void txt_DiaChiNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiaChiNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiaChiNVActionPerformed

    private void btn_lammoi_nvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoi_nvActionPerformed
        // TODO add your handling code here:
        showAll_nv();
    }//GEN-LAST:event_btn_lammoi_nvActionPerformed

    private void nv_btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv_btn_xoaActionPerformed
        // TODO add your handling code here:
         int i = tbl_NhanVien.getSelectedRow();
        String ID_NhanVien = tbl_NhanVien.getValueAt(i, 1).toString();
        new NhanVien_BUS().xoa_NhanVien(ID_NhanVien);
        showAll_nv();
    }//GEN-LAST:event_nv_btn_xoaActionPerformed

    private void nv_btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv_btn_suaActionPerformed
        // TODO add your handling code here:
         int i = tbl_NhanVien.getSelectedRow();
            String ID_NhanVien=tbl_NhanVien.getModel().getValueAt(i, 1).toString();
            String HoVaTen = txt_TenNhanVien.getText();
            String DiaChi = txt_DiaChiNV.getText();
        String Email = txt_EmailNV.getText();
        String SoDienThoai = txt_SoDienThoaiNV.getText();
       
        new NhanVien_BUS().sua_NhanVien(ID_NhanVien, HoVaTen, DiaChi, Email, SoDienThoai);
        showAll_nv();
    }//GEN-LAST:event_nv_btn_suaActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        showAll_nv();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void txt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timkiemActionPerformed

    private void btn_suaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_suaMouseClicked

    private void tbl_ThanhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ThanhVienMouseClicked
        // TODO add your handling code here:
        int i = tbl_ThanhVien.getSelectedRow();
        txt_tenkhachhang.setText(tbl_ThanhVien.getModel().getValueAt(i, 2).toString());
        txt_sdt.setText(tbl_ThanhVien.getModel().getValueAt(i,3).toString());   
        txt_date.setText(tbl_ThanhVien.getModel().getValueAt(i,4).toString());
       
    }//GEN-LAST:event_tbl_ThanhVienMouseClicked

    private void nv_btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv_btn_ThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nv_btn_ThemActionPerformed

    private void tbl_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NhanVienMouseClicked
        // TODO add your handling code here:
        int i = tbl_NhanVien.getSelectedRow();
        txt_TenNhanVien.setText(tbl_NhanVien.getModel().getValueAt(i, 2).toString());
        txt_DiaChiNV.setText(tbl_NhanVien.getModel().getValueAt(i,4).toString());
        txt_EmailNV.setText(tbl_NhanVien.getModel().getValueAt(i,3).toString());
        txt_SoDienThoaiNV.setText(tbl_NhanVien.getModel().getValueAt(i,5).toString());
        txt_tendn.setText(tbl_NhanVien.getModel().getValueAt(i,6).toString());
    }//GEN-LAST:event_tbl_NhanVienMouseClicked

    private void txt_tendnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tendnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tendnActionPerformed
    public void admin(){
        nv_btn_xoa.setEnabled(true);
    }
    public void user(){
        nv_btn_xoa.setEnabled(false);
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
            java.util.logging.Logger.getLogger(ThanhVien_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhVien_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhVien_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhVien_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhVien_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Email;
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_lammoi_nv;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_timkiem1;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton nv_btn_Them;
    private javax.swing.JButton nv_btn_sua;
    private javax.swing.JButton nv_btn_xoa;
    private javax.swing.JRadioButton rbtn_ma;
    private javax.swing.JRadioButton rbtn_ngaydk;
    private javax.swing.JRadioButton rbtn_sdt;
    private javax.swing.JRadioButton rbtn_ten;
    private javax.swing.JRadioButton rbtn_ten1;
    private javax.swing.JRadioButton rbtn_ten2;
    private javax.swing.JRadioButton rbtn_ten3;
    private javax.swing.JTable tbl_NhanVien;
    private javax.swing.JTable tbl_ThanhVien;
    private javax.swing.JTextField ttkm_makm3;
    private javax.swing.JTextField txt_DiaChiNV;
    private javax.swing.JTextField txt_EmailNV;
    private javax.swing.JTextField txt_SoDienThoaiNV;
    private javax.swing.JTextField txt_TenNhanVien;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tendn;
    private javax.swing.JTextField txt_tenkhachhang;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JTextField txt_timkiem1;
    // End of variables declaration//GEN-END:variables
}
