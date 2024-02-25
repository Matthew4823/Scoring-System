//Matthew Orellana
//June 22 2022
//This program will allow scores from multiples judges to be calculated and give an overall score for a gymnasts competition 
import java.util.Arrays;
import java.util.Scanner;
public class ScoringSystem{
  
 //this method will ask the user to enter the difficulty score given by the judges
public static double showDifficulty(int JudgeNumber) {
//do while loop makes sure the difficulty is between 0.1 and 7.5
double Difficulty;
do{
Scanner console = new Scanner(System.in);
System.out.println("Enter the difficulty score given by Judge #" + JudgeNumber);
Difficulty = console.nextDouble(); 
}while (Difficulty < 0.1 || Difficulty > 7.5);
//returns the difficulty 
return Difficulty;
}

//this method lets the user enter the excecution 
public static double showExcecution(int JudgeNumber) {
double Excecute;
do{
Scanner console = new Scanner(System.in);
//this prints the excecution score to the user
System.out.println("Enter the excecution score given by Judge #" + JudgeNumber);
Excecute = console.nextDouble();
 }while (Excecute < 0.1 || Excecute > 2.5);
 return Excecute;
 
   }
   //this method lets the user enter the deductions
 public static double showDeduction(int JudgeNumber ) {
 double Deduction;
 do{
Scanner console = new Scanner(System.in);
System.out.println("Enter the Deduction given by Judge #" + JudgeNumber);
Deduction = console.nextDouble();
 }while (Deduction < 0.1 || Deduction > 1.0); 
 return Deduction;
 }
 //the main method of the program
 
   public static void main(String [] args) {
   String again;
   do{
     Scanner console = new Scanner(System.in);
     double D,E,DI,DD,OverAllScore;
     String Name, Gymnasts;
     double [] JudgeScore = new double [5];
      
     
     System.out.println("Enter the Gymnansts name ");
     Name = console.nextLine();
     
     System.out.println("Enter the Gymnasts city ");
     Gymnasts = console.nextLine();
     
     //this for loop allows the amount of judges to be five
     for (int J = 0; J <= 4; J++){
     
     D  = showDifficulty(J + 1);
     //these bring the methods from the top to the main method 
     E = showExcecution(J + 1);
     DI = showDeduction(J + 1);
     JudgeScore[J] = (D + E) - DI;
     //this line lets the user know of the judge score 
     System.out.println("Judge " + (J + 1)  + " Score " + JudgeScore[J]);
      }
      //this array tallys the highest and lowest scores from the judges 
      Arrays.sort(JudgeScore);
      double lowest = JudgeScore[0];
      double highest = JudgeScore[4];
      
      
      
     OverAllScore  = ( JudgeScore[1] + JudgeScore[2] + JudgeScore[3] )/3;
      
      displayData(Name, Gymnasts, OverAllScore);
     
     //this line of code lets the user  restart the program to enter another gymnast
     System.out.println("Do you want to process another gymnast?");
      again = console.nextLine();
      } while (again.equalsIgnoreCase("yes"));
      System.out.println("Have a nice day !");


     
     
     }
    
    //this method displays the data from the main method to display the gymnists final results 
     public static void displayData(String Name,String Gymnasts,double OverAllScore){
      System.out.println(" Gymnast "+ Name + " City " + Gymnasts);
      System.out.println("Overall Score was "+ OverAllScore );
      }

      } //end of file 
         
