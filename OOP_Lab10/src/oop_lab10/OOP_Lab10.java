/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab10;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author Gm
 */
public class OOP_Lab10 extends Application{

  private TextField tfAnnualInterestRate = new TextField();
  private TextField tfNumberOfYears = new TextField();
  private TextField tfLoanAmount = new TextField();
  private TextField tfMonthlyPayment = new TextField();
  private TextField tfTotalPayment = new TextField();
  private Button btCalculate = new Button("Calculate");
  private Button btLoad = new Button("Load");
  private Button btSave = new Button("Save");
  private Button btClear = new Button("Clear");
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create UI
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
    gridPane.add(tfAnnualInterestRate, 1, 0);
    gridPane.add(new Label("Number of Years:"), 0, 1);
    gridPane.add(tfNumberOfYears, 1, 1);
    gridPane.add(new Label("Loan Amount:"), 0, 2);
    gridPane.add(tfLoanAmount, 1, 2);
    gridPane.add(new Label("Monthly Payment:"), 0, 3);
    gridPane.add(tfMonthlyPayment, 1, 3);
    gridPane.add(new Label("Total Payment:"), 0, 4);
    gridPane.add(tfTotalPayment, 1, 4);
    gridPane.add(btLoad, 0, 5);
    gridPane.add(btSave, 1, 5);
    gridPane.add(btClear, 2, 5);
    gridPane.add(btCalculate, 3, 5);

    // Set properties for UI
    gridPane.setAlignment(Pos.CENTER);
    tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
    tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
    tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
    tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
    tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
    tfMonthlyPayment.setEditable(false);
    tfTotalPayment.setEditable(false);
    GridPane.setHalignment(btCalculate, HPos.RIGHT);

    // Process events
    btCalculate.setOnAction(e -> calculateLoanPayment());
    btClear.setOnAction(e -> clearTextField());
    btSave.setOnAction(e -> saveFile());
    btLoad.setOnAction(e -> readFile());

    // Create a scene and place it in the stage
    Scene scene = new Scene(gridPane, 400, 250);
    primaryStage.setTitle("LoanCalculator"); // Set title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  private void calculateLoanPayment() {
    // Get values from text fields
    double interest =
      Double.parseDouble(tfAnnualInterestRate.getText());
    int year = Integer.parseInt(tfNumberOfYears.getText());
    double loanAmount =
      Double.parseDouble(tfLoanAmount.getText());

    // Create a loan object. Loan defined in Listing 10.2
    loan lloan = new loan(interest, year, loanAmount);

    // Display monthly payment and total payment
    tfMonthlyPayment.setText(String.format("$%.2f",
      lloan.getMonthlyPayment()));
    tfTotalPayment.setText(String.format("$%.2f",
      lloan.getTotalPayment()));
  }
  
  private void clearTextField(){
      tfAnnualInterestRate.setText("");
      tfLoanAmount.setText("");
      tfNumberOfYears.setText("");
      tfLoanAmount.setText("");
      tfTotalPayment.setText("");
      tfMonthlyPayment.setText("");
  }
  
  private void saveFile() {
      try(DataOutputStream ot = new DataOutputStream(new FileOutputStream("loan.dat"))){
          String FileContent = tfAnnualInterestRate.getText()+"\n"+tfNumberOfYears.getText()+"\n"+tfLoanAmount.getText();
          ot.flush();
          ot.writeUTF(tfAnnualInterestRate.getText());
          ot.writeUTF(tfNumberOfYears.getText());
          ot.writeUTF(tfLoanAmount.getText());
      }
      catch(Exception e){
          
      }
  }
  
  private void readFile() {
      try(DataInputStream it = new DataInputStream(new FileInputStream("loan.dat"))){
          tfAnnualInterestRate.setText(it.readUTF());
          tfNumberOfYears.setText(it.readUTF());
          tfLoanAmount.setText(it.readUTF());
          
      }catch(Exception e){
          
      }
  }
  public static void main(String[] args) {
    launch(args);
  }
    
}
