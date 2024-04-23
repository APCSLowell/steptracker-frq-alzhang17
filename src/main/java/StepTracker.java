import java.util.ArrayList;
public class StepTracker
{
  private int stepMin;
  private int totalDaysActive;
  private int totalDays;
  private int totalSteps;
 
 public StepTracker(int stepMin1){
   stepMin = stepMin1;
   totalSteps = 0;
   totalDays = 0;
   totalDaysActive = 0;
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
   if(steps >= stepMin){
     totalDaysActive++;
   }
   totalDays++;
   totalSteps += steps;
 }
 } 
