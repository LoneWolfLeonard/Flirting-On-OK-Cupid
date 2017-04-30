package lovetest;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoveTest {

public static void main(String[] args) {
String EpicGuy = "Leonard"; 
String EpicGirl = "Cmullinix"; 
Boolean hangout = false; 
int impression = 0; 
int worthit = 100; 
int likesanime = 5; 
int likesmobas = 2; 
int flirtycomment = 0; 
long yourphonenumber;

while(impression != worthit) 
{ 
impression = flirtycomment; 
flirtycomment = flirtycomment + 1; 
} 
JFrame frame = new JFrame("What is your number?");
String yournumber = JOptionPane.showInputDialog(frame, "What's your phone number?");
yourphonenumber = Long.parseLong(yournumber);      
hangout = true; 
if (hangout == true) 
{ 
System.out.println(yourphonenumber); 
} 
} 
}