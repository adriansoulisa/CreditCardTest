package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object CardNumber
     
    /**
     * <p></p>
     */
    public static Object ExpiryDate
     
    /**
     * <p></p>
     */
    public static Object CVVNumber
     
    /**
     * <p></p>
     */
    public static Object BankOTP
     
    /**
     * <p></p>
     */
    public static Object UnsucsessCardNumber
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            CardNumber = selectedVariables['CardNumber']
            ExpiryDate = selectedVariables['ExpiryDate']
            CVVNumber = selectedVariables['CVVNumber']
            BankOTP = selectedVariables['BankOTP']
            UnsucsessCardNumber = selectedVariables['UnsucsessCardNumber']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
