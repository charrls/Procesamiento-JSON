import org.json.*;

public class PromedioSales {
    public static void main(String[] args) {
        JSONArray a = (JSONArray) parser.parse(new FileReader("sales_array.json"));
        double sum = 0;
        int n =0;
        for (Object o : a)
        {
            JSONObject prom = (JSONObject) o;

            Double sales = (Double) prom.get("sales");
            System.out.println(sales);

            String departmet = (String) prom.get("departmet");
            System.out.println(departmet);


            sum = sum + sales;
            n++;

            for (Object c : prom)
            {
                sales = sum /n;
                System.out.println(sales+"");
            }
        }
    }
}
