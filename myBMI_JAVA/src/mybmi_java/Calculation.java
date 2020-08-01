package mybmi_java;


public class Calculation {
    
    private double weight = 0, height = 0;
    
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public String getResult(){
        
        double bmi = this.weight * 703 / (height*height);
        //System.out.println(bmi);
        
        if(bmi < 18.5){
            //System.out.println("According to BMI, you are underweight.");
            return "According to BMI, you are underweight.";
        }else if(bmi <= 25){ // 25 is included
            //System.out.println("According to BMI, your weight is optimal.");
            return "According to BMI, your weight is optimal.";
        }else{
            //System.out.println("Accodring to BMI, you are overweight.");
            return "Accodring to BMI, you are overweight.";
        }
        
    }
}
