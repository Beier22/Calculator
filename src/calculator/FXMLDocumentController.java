/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author mads_
 */
public class FXMLDocumentController implements Initializable {
    
    private double pastNumber = 0;
    private double currentNumber = 0;
    private int add = 1;
    private int subtract = 2;
    private int divide = 3;
    private int multiply = 4;
    private int equals = 5;
    private int operand = 0;
    private boolean pressedEquals = false;
    
    private Label label;
    @FXML
    private Label display;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    @FXML
    private void press1()
    {
        if (pressedEquals)
            resetDisp();
        addNumber(1);
        currentNumber = currentNumber * 10 + 1;
    }
    @FXML
    private void press2()
    {
        if (pressedEquals)
            resetDisp();
        addNumber(2);
        currentNumber = currentNumber * 10 + 2;
    }
    @FXML
    private void press3()
    {
        if (pressedEquals)
        {
            pressedEquals = false;
            display.setText("");
        }
        addNumber(3);
        currentNumber = currentNumber * 10 + 3;
    }
    @FXML
    private void press4()
    {
        if (pressedEquals)
            resetDisp();
        addNumber(4);
        currentNumber = currentNumber * 10 + 4;
    }
    @FXML
    private void press5()
    {
        if (pressedEquals)
            resetDisp();
        addNumber(5);
        currentNumber = currentNumber * 10 + 5;
    }
    @FXML
    private void press6()
    {
        if (pressedEquals)
            resetDisp();
        addNumber(6);
        currentNumber = currentNumber * 10 + 6;
    }
    @FXML
    private void press7()
    {
        if (pressedEquals)
            resetDisp();
        addNumber(7);
        currentNumber = currentNumber * 10 + 7;
    }
    @FXML
    private void press8()
    {
        if (pressedEquals)
            resetDisp();
        addNumber(8);
        currentNumber = currentNumber * 10 + 8;
    }
    @FXML
    private void press9()
    {
        if (pressedEquals)
            resetDisp();
        addNumber(9);
        currentNumber = currentNumber * 10 + 9;
    }
    @FXML
    private void press0()
    {
        if (pressedEquals)
            resetDisp();
        addNumber(0);
        currentNumber = currentNumber * 10 + 0;
    }
    
    @FXML
    private void pressAdd()
    {
        operand = add;
        display.setText(display.getText() + " +");
        pressedEquals = true;
    }
    @FXML
    private void pressSubtract()
    {
        operand = subtract;
        display.setText(display.getText() + " -");
        pressedEquals = true;
    }
    @FXML
    private void pressDivide()
    {
        operand = divide;
        display.setText(display.getText() + " /");
        pressedEquals = true;
    }
    @FXML
    private void pressMultiply()
    {
        operand = multiply;
        display.setText(display.getText() + " -");
        pressedEquals = true;
    }
    @FXML
    private void pressEquals()
    {
        if (operand == add){
            currentNumber = (pastNumber+currentNumber);
            display.setText(""+currentNumber);
            pressedEquals = true;
        } else if (operand == subtract){
            currentNumber = (pastNumber-currentNumber);
            display.setText(""+currentNumber);
            pressedEquals = true;
        } else if (operand == divide){
            currentNumber = (pastNumber/currentNumber);
            display.setText(""+currentNumber);
            pressedEquals = true;
        } else if (operand == multiply){
            currentNumber = (pastNumber*currentNumber);
            display.setText(""+currentNumber);
            pressedEquals = true;
        }
    }
    
    @FXML
    private void exitCalculator(){
       System.exit(1);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void addNumber(int num)
    {
        display.setText(display.getText() + num);
    }
    
    public void resetDisp()
    {
        pastNumber = currentNumber;
        currentNumber = 0;
        pressedEquals = false;
        display.setText("");
    }
}
