import java.util.*;

public class InforPorcess { //This class will process the information
	//The variables assigned as float below will only be valid in this class
    private float num; //Assign numerator(num) as float and viable for only this class
    private float d_nom;  //Assign denominator(d_nom) as float and also viable for only this class
    
    public InforPorcess() { //Assign a value 0 to the numerator and denominator
        this.num = 0;
        this.d_nom = 0;
    }
    public InforPorcess(int num, int d_nom){ //Gives an actual value to both the numerator and denominator
        this.num = num;
        this.d_nom = d_nom;
    }

    
    public float sc_numerator(){ //Select numerator
        return this.num;
    } 
    public void assign_numerator(int num) { //Assign numerator value to this.num
        this.num = num;
    }
    
    
    public float sc_denominator(){ //Selects denominator
        return this.d_nom;
    }
    public void assign_denominator(int d_nom) { //Assign d_nom value to this.d_nom
        this.d_nom = d_nom;
    }
    
    
    public float Ratio_calc(){ //Calculate the Ratio
        return this.num/this.d_nom; //Returns the result from the function
    }
 
    
    public String Result(){ //This function is used to sort and extract the desired information
        return this.num + " " + this.d_nom + " " + Ratio_calc();
    }
}
