import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 3:17 PM
 */
public class Manager {

    private List<CBGV> list;

    public Manager() {
        list = new ArrayList<>();
    }

    public void add(CBGV cbgv) {
        list.add(cbgv);
    }

    public void show() {
        for (CBGV cbgv: list) {
            System.out.println(cbgv.toString());
        }
    }

    public void over8Million() {
        int counter = 0;
        for (CBGV cbgv: list) {
            if (cbgv.getSalary() >= 8000000) {
                counter++;
                System.out.println(cbgv.toString());
            }
        }
        if (counter == 0) {
            System.out.println("Không có cán bộ nào lương hơn 8 triệu!");
        }
    }

    public CBGV findByID(int id) {
        for (CBGV cbgv: list) {
            if (cbgv.getId() == id) {
                return cbgv;
            }
        }
        return null;
    }

    public void calcTotalPayment(int id) {
        CBGV cbgv = findByID(id);
        if (cbgv != null) {
            double totalPayment = cbgv.getBasicSalary() + cbgv.getBonusSalary() - cbgv.getPenaltySalary();
            cbgv.setSalary(totalPayment);
            System.out.println("Lương phải trả cho cán bộ " + cbgv.getCanBo().getName() + "=" + cbgv.getSalary());
        } else {
            System.out.println("Không tìm thấy cán bộ này!");
        }
    }

    public Date strToDate(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.parse(date);
    }
}
