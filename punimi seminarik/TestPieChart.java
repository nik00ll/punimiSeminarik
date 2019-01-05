import java.awt.*;
public class TestPieChart
{ public static void main(String[] args)
{ PieChartWriter p = new PieChartWriter();
p.setTitle("How I spend my day");
p.setSlice1("Sleep: 7 hours", 7, Color.black);
p.setSlice4("Recreation: 9 hours", 9, Color.gray);
p.setSlice2("In class: 3 hours", 3, Color.blue);
p.setSlice3("Homework: 5 hours", 5, Color.red);
}
}