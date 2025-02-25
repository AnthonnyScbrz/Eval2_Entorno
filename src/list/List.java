package list;
import core.main.Main;
import core.model.Product;
import core.output.Output;
import java.util.Map;

public class List {

    public static void listStudent(){
        Main.iterate = Main.products.entrySet().iterator();



        Output.tableHeader();
        while(Main.iterate.hasNext()){
            Map.Entry<Integer, Product> in = Main.iterate.next();
            Integer id = in.getKey();
            Product products = in.getValue();
            Output.tableBody(id, products.getReference(), products.getUnits(), products.getCreateDate(), products.getModifyDate());
        }
        Output.tableEnds();

    }

}