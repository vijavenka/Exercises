import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class UnExpectedDemand {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of order :");
        int orders = Integer.parseInt(bufferedReader.readLine()); //2

        List<Integer> orderList = new ArrayList<>();
        if (orders > 0){
            System.out.println("Enter order :");
            for(int i=0; i<orders; i++)
                orderList.add(Integer.parseInt(bufferedReader.readLine())); //10 20
        }

        System.out.println("Enter total order available (widgets) :");
        int k = Integer.parseInt(bufferedReader.readLine());    //30 or 31 ...

        demand(orderList, k);
    }

    private static void demand(List<Integer> orders, int widgets){
        int sum = orders.stream().reduce(0, Integer::sum);
//        assertEquals("Demand in raised state", sum, widgets);
        MatcherAssert.assertThat(sum, lessThanOrEqualTo(widgets));
    }
}
