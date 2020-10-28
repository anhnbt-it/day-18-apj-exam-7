import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 3:48 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager manager = new Manager();
        int choice = -1;
        try {
            do {
                System.out.println("------------------------");
                System.out.println("Quản lý Cán bộ giáo viên");
                System.out.println("------------------------");
                System.out.println("1. Thêm cán bộ");
                System.out.println("2. Danh sách cán bộ");
                System.out.println("3. Tính lương cán bộ");
                System.out.println("4. Cán bộ có lương thực lĩnh hơn 8 triệu");
                System.out.println("0. Thoát");
                System.out.println("Nhập lựa chọn [0-Thoát]: ");
                System.out.print("> ");
                choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("------------------------");
                        System.out.println("\t\tThêm cán bộ");
                        System.out.println("------------------------");
                        System.out.print("Nhập họ tên: ");
                        String name = input.nextLine();
                        System.out.print("Nhập ngày sinh (1-30): ");
                        String day = input.nextLine();
                        System.out.print("Nhập tháng sinh (1 - 12): ");
                        String month = input.nextLine();
                        System.out.print("Nhập năm sinh (1900 - 2020): ");
                        String year = input.nextLine();
                        Date dateOfBirth = manager.strToDate(day + "/" + month + "/" + year);
                        System.out.print("Nhập quê quán: ");
                        String address = input.nextLine();
                        System.out.print("Số tiền thưởng của cán bộ " + name + ": ");
                        double bonusSalary = input.nextDouble();
                        System.out.print("Số tiền phạt của cán bộ " + name + ": ");
                        double penaltySalary = input.nextDouble();
                        CanBo canBo = new CanBo(name, dateOfBirth, address);
                        CBGV cbgv = new CBGV(bonusSalary, penaltySalary, canBo);
                        manager.add(cbgv);
                        System.out.println("Done.");
                        break;
                    case 2:
                        manager.show();
                        break;
                    case 3:
                        System.out.println("Nhập ID cán bộ cần tính lương: ");
                        int id = input.nextInt();
                        manager.calcTotalPayment(id);
                        break;
                    case 4:
                        manager.over8Million();
                        break;
                }
            } while (choice != 0);
        } catch (InputMismatchException | ParseException e) {
            e.printStackTrace();
        }
    }


}
