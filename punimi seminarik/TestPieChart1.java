import java.awt.*;
public class TestPieChart1
{ public static void main(String[] args)
{ PieChartWriter p = new PieChartWriter();
p.setTitle("INCOME:");
p.setSlice1("personal income taxes: 46%", 46, Color.black);
p.setSlice5("social security and medicare taxes: 34%", 34, Color.gray);
p.setSlice2("corporate income taxes: 11%", 11, Color.blue);
p.setSlice3("excise and customs taxes: 8%", 8, Color.red);
p.setSlice4("borrowing to cover deficit: 1%", 1, Color.green);

 PieChartWriter a= new PieChartWriter();
a.setTitle("OUTLAYS:");
a.setSlice1("social security and medicare: 38%", 38, Color.black);
a.setSlice6("general government: 2%", 2, Color.orange);
a.setSlice2("social programs: 18%", 18, Color.blue);
a.setSlice3("interest on national debt: 15%", 15, Color.red);
a.setSlice4("human and community development: 7%", 7, Color.green);
a.setSlice5("national defense: 20%", 20, Color.gray);
}

}