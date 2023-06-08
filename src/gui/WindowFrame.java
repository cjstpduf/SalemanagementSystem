package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import git_SalemanagementSystem.SaleManagement;

public class WindowFrame extends JFrame{


   ManagementGui man;
   EditGui edit;
   ViewGui view;
   ElementarySchoolGui ele;
   MiddleSchoolGui mid;
   HighschoolGui high;
   UniversityGui uni;
   SaleManagement sale;
   
   public WindowFrame(SaleManagement sale) {
	  this.sale = sale;
      this.setSize(700, 200);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      this.setVisible(true);
      this.man = new ManagementGui(this);
      this.edit = new EditGui(this);
      this.view = new ViewGui(this, this.sale);
      
      
      this.setupPanel(man);
   }
   
   public void setupPanel(JPanel panel) {
      this.getContentPane().removeAll();
      this.getContentPane().add(panel);
      this.revalidate();
      this.repaint();
   }
   public ManagementGui getMan() {
      return man;
   }

   public void setMan(ManagementGui man) {
      this.man = man;
   }

   public EditGui getEdit() {
      return edit;
   }

   public void setEdit(EditGui edit) {
      this.edit = edit;
   }

   public ViewGui getView() {
      return view;
   }

   public void setView(ViewGui view) {
      this.view = view;
   }

   public ElementarySchoolGui getEle() {
      return ele;
   }

   public void setEle(ElementarySchoolGui ele) {
      this.ele = ele;
   }

   public MiddleSchoolGui getMid() {
      return mid;
   }

   public void setMid(MiddleSchoolGui mid) {
      this.mid = mid;
   }

   public HighschoolGui getHigh() {
      return high;
   }

   public void setHigh(HighschoolGui high) {
      this.high = high;
   }

   public UniversityGui getUni() {
      return uni;
   }

   public void setUni(UniversityGui uni) {
      this.uni = uni;
   }

}