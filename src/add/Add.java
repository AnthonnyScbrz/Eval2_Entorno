package add;

import core.input.Input;
import core.main.Main;
import core.output.Output;


import java.util.UUID;

public class Add {
    public static void addProduct(){
        Output.numberOfProductRequest();
        int numberofProducts = Input.getNumberOfProduct();

        for (int i=0; i<numberofProducts;i++){
            Output.productReference();
            String reference = Input.getProductReference();
            Output.numberOfProduct();
            byte productUnits = Input.getNumberProductRegister();
            Output.registerDate();
            String registerDay = Input.getRegisterDay();

            String modifyDate="Null";

            /*Main.products.put(i+1,new Main.products(UUID,reference,productUnits,registerDay,modifyDate));*/
        }
    }
}
