public class fraction implements Cloneable{
    private double numerator;
    private double denominator;
    
public fraction(double numerator, double denominator){
    if(denominator == 0){
        throw new 
        IllegalArgumentException("DON'T GIVE THE ZERO VALUE FOR DENOMINATOR .");
    }
    this.numerator = numerator;
    this.denominator = denominator;
    simplify();
    }
public double getNumerator(){
    return numerator;
}
public double getDenominator(){
    return denominator;
}
public void simplify(){
    double gcd = gcd(Math.abs(numerator), Math.abs(denominator));
    numerator = numerator / gcd;
    denominator = denominator / gcd;

    if(denominator < 0){
        numerator -= numerator;
        denominator -= denominator;
    }
}
 
//Euclidean Algorithm (Fatested method for finding GCD)
public double gcd(double a, double b){
    if(b == 0){
        return Math.abs(a);
    }
        return gcd(b, a % b );
    }
 
  
public fraction add(fraction other){
    double num = this.numerator * other.denominator + this.denominator * other.numerator;
    double den = this.denominator * other.denominator;
    return new fraction(num,den);
}
  
public fraction substract(fraction other){
  double num = this.numerator * other.denominator - this.denominator * other.numerator;
  double den = this.denominator * other.denominator;
  return new fraction(num, den);
}

public fraction multiple(fraction other){
  double num = this.numerator * other.numerator;
  double den = this.denominator * this.denominator;
  return new fraction(num, den);
}

public fraction divide(fraction other){
    double num = this.numerator * other.denominator;
    double den = this.denominator * other.numerator;
    return new fraction(num, den);
}
public fraction clone(){
    return new fraction(numerator, denominator);
}
public double toDecimal(){
    return (double) numerator / denominator;
}

public void printFraction(){
    System.out.println(numerator + "/" + denominator);
}
public boolean equals(Object obj){
    if(!(obj instanceof fraction)){
      return false;
    }
    fraction other = (fraction) obj;
    return this.numerator == other.numerator && this.denominator == other.denominator;
}
public String toString(){
    return numerator + "/" + denominator;
}
}    
