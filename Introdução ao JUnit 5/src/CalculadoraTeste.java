import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
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

    //Anotação que indica que esse método setup() deve ser executado antes de todos os testes
    @BeforeAll
    public static void setup(){
        calculadora = new Calculadora();
    }

    //Outros: @BeforeEach, @AfterEach, @AfterAll




}
