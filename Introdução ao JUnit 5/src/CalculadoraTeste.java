import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class CalculadoraTeste {

    static Calculadora calculadora;

    @Test
    public void testaSomaMenosIngenuo(){
        Calculadora myCalc = new Calculadora();

        boolean temErro = false;
        if(myCalc.soma(2,2) != 4){
            temErro = true;
        }
        if(myCalc.soma(2,-2) != 0){
            temErro = true;
        }
        if(myCalc.soma(-2,2) != 0){
            temErro = true;
        }
        if(myCalc.soma(0,0) != 0){
            temErro = true;
        }
        if(temErro){
            fail("Houve um erro na validação da soma.!");
        }
    }


}
