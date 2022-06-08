import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    //в строке не меньше 3 и не больше 19 символов,
    //==19
    //3
    //12
    //<3
    //>19

    // в строке есть только один пробел,
    // пробел стоит не в начале и не в конце строки.
    private final String name;
    private final boolean result;

    public AccountTest(String name, boolean result) {
        this.name = name;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getAccountData(){
        return new Object[][] {

                {"С ю", true},
                {"Гарри Стайлз", true},
                {"Гарри СтайлзСтайлзз", true},
                {"Гаррик СтайлзСтайлзз", false},
                {" Сю", false},
                {" ГарриСтайлз", false},
                {" ГарриСтайлзСтайлзз", false},
                {" ГаррикСтайлзСтайлзз", false},
                {"Сю ", false},
                {"ГарриСтайлз ", false},
                {"ГарриСтайлзСтайлзз ", false},
                {"ГаррикСтайлзСтайлзз ", false},
                {"Сю", false},
                {"Сью", false},
                {"ГарриСтайлз", false},
                {"ГаррикСтайлзСтайлзз", false},
                {"ГаррикСтайлззСтайлзз", false},
                {"Гарри  Стайлз", false},
                {"Гарри Стайлз Стайлз", false},
                {"Гаррик Стайлзз Стайлзз", false},
        };
    }

    @Test
    public void nameLength(){
        Account account = new Account(name);

        assertEquals(result, account.checkNameToEmboss());
    }

}


