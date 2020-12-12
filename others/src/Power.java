public class Power {
    public double Power(double base, int exponent){
        if(exponent<0){
            base=1/base;
            exponent=-exponent;
        }
        double total=1.0;
        for(int i=exponent;i>0;i--){
            total*=base;
        }
        return total;
    }
}
