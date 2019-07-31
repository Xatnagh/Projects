import java.util.*;
class Bank{
 
  private static double totalSaving=1000,withdraw,deposite,totalSavingCA=500000;
  private static String saving="saving",checking="checking",accountType;
  public static Scanner scan = new Scanner(System.in);
private static int withdrawAmount=5;
  public Bank(){

  }
  public Bank(boolean a){
     if(a==true){
       totalSaving=0;
       totalSavingCA=0;
     }
  }
  public Bank(String at){
   setaccountType(at);
  
  }
  public Bank(String at,double w){
    TSwhenwithdraw(at,w);
   
  }
public static void setaccountType(String s){
  accountType=s;
 
}


public static void TSwhenwithdraw(String at,double w){
boolean wSuccess;
    if(withdrawAmount<=0){
      System.out.println("sorry you can not withdraw anymore today");}else{
      
do{
  if(at.equals(saving) && w<totalSaving&&w>0){
totalSaving= totalSaving-w;
wSuccess=true;
}else if(at.equals(checking)&&w< totalSavingCA&&w>0){
  System.out.println("You have: "+ totalSavingCA+ " in your checking account");
totalSavingCA= totalSavingCA-w;
wSuccess=true;
}else if(w<0){
  System.out.println("You can not withdraw negative balance, please try again");
  wSuccess=false;
}else{
  System.out.println("Sorry you are trying to withdraw more than what you have");
  
  System.out.println("Please try again");
  wSuccess=false;
}}while(wSuccess==false&& withdrawAmount<=0);
if(wSuccess==true){
System.out.println("you had withdrawn: "+w);
withdrawAmount--;
System.out.println("you have " + withdrawAmount+ " withdraws left today.");

if(at.equals(saving)){
System.out.println("You now have " + totalSaving+ "left in your"+ at+ "account");
}else{
  System.out.println("You now have " + totalSavingCA+ " left in your "+ at+ " account");
}}}
}





public static void TSwhendeposite(String at,double w){

if(at.equals(saving)&& w>0){
totalSaving= totalSaving+w;
System.out.println("you had deposited: "+w);
}else if(at.equals(checking)&&w>0){
totalSavingCA= totalSavingCA+w;
System.out.println("you had deposited: "+w);
}else if(w<0){
  System.out.println("You can not deposite negative amount, please try again");
}
}


public static void whenTransferingSA(double t){
 if(t>totalSaving){
   System.out.println("sorry you don't have enough in your saving account");
   System.out.println("Please try again");
 }else{
  totalSaving= totalSaving-t;
  totalSavingCA= totalSavingCA+t;
}}

public static void whenTransferingCA(double t){
 if(t>totalSavingCA){
   System.out.println("sorry you don't have enough in your checking account");
   System.out.println("Please try again");
 }else{
  totalSaving= totalSaving+t;
  totalSavingCA= totalSavingCA-t;
}}


public static double getTotalSaving(){
  return totalSaving;
}
public static double getTotalSavingCA(){
  return totalSavingCA;
}




public static void showAccountInfo(){
  System.out.println("Your total saving from  saving account: "+ totalSaving);
  System.out.println("your total saving in checking account: "+totalSavingCA);
}
 
}
