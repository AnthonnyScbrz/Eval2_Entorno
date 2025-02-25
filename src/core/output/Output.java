package core.output;

public class Output {

    public static void initMessage(){
        System.out.print("""
                
                ***********************************************************************
                ------------------<<-Bienvenidos a la Tienda online->>-----------------
                ***********************************************************************
                
                Menú: 
                1. Agregar Producto
                2. Listar Producto
                3. Comprar un Producto
                4. Venta de Producto
                5. Salir
                
                
                """);
    }

    public static void optionRequest(){
        System.out.print("Por favor, ingrese una opción del menú: ");
    }
    public static void numberOfProductRequest(){
        System.out.print("Seleccione el número de productos a dar de alta: ");
    }
    public static void productReference(){
        System.out.print("Ingrese la referencia del producto: ");
    }
    public static void numberOfProduct(){
        System.out.print("Ingrese el número de productos a dar de alta: ");
    }
    public static void registerDate(){
        System.out.print("Ingrese fecha de resgistro: ");
    }
    public static void tableHeader(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-2s | %-20s | %-20s | %-2s | %-20s | %-2s |\n","ID","Referencia","Unidades","Fecha de registro","Fecha de modificación");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

    }
    public static void tableBody(int id, String reference, byte productUnits, String registerDay, String modifyDate) {
        System.out.printf("| %-2s | %-20s | %-20s | %-2s | %-20s | %-2s |\n", id, reference, productUnits, registerDay, modifyDate);
    }
    public static void tableEnds() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }

}
