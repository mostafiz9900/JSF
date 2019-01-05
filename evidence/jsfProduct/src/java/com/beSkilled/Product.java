/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Mostafizur
 */
@ManagedBean
@RequestScoped
public class Product {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    private int pid;
    private String pname;
    private double price;
    private double stock;
    private double totalPrice;
    private int selectedPrice;
    
    private List<Product> proList=new ArrayList<Product>();

    public Product() {
    }

    public Product(Connection con, PreparedStatement pstm, ResultSet rs, int pid, String pname, double price, double stock, double totalPrice, int selectedPrice) {
        this.con = con;
        this.pstm = pstm;
        this.rs = rs;
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.stock = stock;
        this.totalPrice = totalPrice;
        this.selectedPrice = selectedPrice;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public PreparedStatement getPstm() {
        return pstm;
    }

    public void setPstm(PreparedStatement pstm) {
        this.pstm = pstm;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getSelectedPrice() {
        return selectedPrice;
    }

    public void setSelectedPrice(int selectedPrice) {
        this.selectedPrice = selectedPrice;
    }

    public List<Product> getProList() {
        return proList;
    }

    public void setProList(List<Product> proList) {
        this.proList = proList;
    }
    public void doSave(){
    mysqlConnect cd=new mysqlConnect();
        try {
            con=cd.doConnection();
            pstm=con.prepareStatement("insert into produce values(?,?,?,?,?)");
            pstm.setInt(1, pid);
            pstm.setString(2, pname);
            pstm.setDouble(3, price);
            pstm.setDouble(4, stock);
            pstm.setDouble(5, totalPrice);
            int i=pstm.executeUpdate();
            //doShow();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
