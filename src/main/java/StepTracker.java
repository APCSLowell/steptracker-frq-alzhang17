import java.util.ArrayList;
public class StepTracker
{
  private int stepMin = 0;
  private int totalDaysActive = 0;
  private int totalDays = 0;
  private int totalSteps = 0;
 
 public StepTracker(int stepMin1){
   stepMin = step1;
 }
 
 public int activeDays(){
   return totalDaysActive;
 }
 
 public double averageSteps(){
   if(totalDays == 0){
     return 0.0;
   }
   return (double)totalSteps/totalDays;
 }
 
 public void addDailySteps(int steps){
   if(steps > stepMin){
     totalDaysActive++;
   }else{
     totalDays++;
   }
   totalSteps += steps;
 }
 } 
