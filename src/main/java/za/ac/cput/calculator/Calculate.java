
package za.ac.cput.calculator;

/**
 *
 * @author raeec
 */
public class Calculate {
    private String Addition, Subtraction, Division, Multiplication;
    public int a = 1;
    public int b = 2;
    
    public int Addition(){
    return a + b;
    }
    
    public int Subtraction(){
    return a - b;
    }
    
    public int Division(){
    return a / b;
    }
    
    public int Multiplication(){
    return a * b;
    }

    

    public String getAddition() {
        return Addition;
    }

    public void setAddition(String Addition) {
        this.Addition = Addition;
    }

    public String getSubtraction() {
        return Subtraction;
    }

    public void setSubtraction(String Subtraction) {
        this.Subtraction = Subtraction;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String Division) {
        this.Division = Division;
    }

    public String getMultiplication() {
        return Multiplication;
    }

    public void setMultiplication(String Multiplication) {
        this.Multiplication = Multiplication;
    }
    
    @Override
    public String toString() {
        return "Calculate{" + "Addition=" + Addition + ", Subtraction=" + Subtraction + ", Division=" + Division + ", Multiplication=" + Multiplication + '}';
    }
    
}
