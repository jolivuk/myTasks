import org.example.exceptions.CtgInvalideException;
import org.example.exceptions.DivideByZeroException;
import org.example.constants.ErrorMessages;
import org.example.exceptions.LogorhythmException;
import org.example.exceptions.TanZeroExceptions;

public class Calculator {

    public double sum(double a, double b){
        return a + b;
    }

    public double minus(double a, double b){
        return a - b;
    }

    public double division(double a, double b) throws DivideByZeroException {
        if (b==0) {
            throw new DivideByZeroException(ErrorMessages.DIVIDE_BY_ZERO);
        }
        return a/b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double sin(double a){
        return Math.sin(a);
    }

    public double cos(double a){
        return Math.cos(a);
    }
    public double tan(double a){
        if (a==Math.PI/2 || a==3*(Math.PI)/2) {
            throw new TanZeroExceptions(ErrorMessages.UNKNOWN_TAN);
        }
        return Math.tan(a);
    }
    public double ctg(double a){
        if (a==0 || a==Math.PI  || a== Math.PI * 2) {
            throw new CtgInvalideException(ErrorMessages.UNKNOWN_CTG);
        }
        return 1/Math.tan(a);
    }

    public double logorhythm(double a){
        if (a<=0)
        {
            throw new LogorhythmException(ErrorMessages.UNKNOWN_LOG);
        }
        return Math.log(a);
    }


}
