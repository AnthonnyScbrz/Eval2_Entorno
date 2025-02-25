package core.main;

import core.input.Input;
import core.model.Product;
import core.output.Output;
import core.validator.Validator;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static int optionMenu;
        public static final int EXIT = 5;
        public static final int ADDPRODUCT = 1;
        public static final int LISTPRODUCT = 2;
        public static final int BUYPRODUCT = 3;
        public static final int SELLPRODUCT = 4;
        public static HashMap<String, Product> products;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        products = new HashMap<>();
        boolean userWantToExit = false;

            do {
                boolean correctOption;
                do {
                    initMessage();
                    optionMenu= optionRequest();
                     correctOption = validateRequest();
                }while(!correctOption);

                if (optionMenu ==EXIT){
                    userWantToExit=true;
                }else{
                    switch (optionMenu){
                        case ADDPRODUCT:

                            break;
                        case LISTPRODUCT:

                            break;
                        case BUYPRODUCT:
                            break;
                        case SELLPRODUCT:
                            break;
                    }
                }

            }while(!userWantToExit);


    }

    private static boolean validateRequest() {
        return Validator.menuValidator(optionMenu);
    }

    private static int optionRequest() {
        Output.optionRequest();
        return Input.getOptionMenu();
    }

    private static void initMessage() {
        Output.initMessage();
    }


}