import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    
    @Test
    public void deveResultarQuatroAoSomarDoisEDois(){
        //Calculadora calculadora = new Calculadora();
        assertEquals(4.0, calculadora.soma(2,2));
    }

    @Test
    public void deveResultarZeroAoSomarDoisMenosDois(){
        //Calculadora calculadora = new Calculadora();
        assertEquals(0.0, calculadora.soma(2,-2));
    }


}
