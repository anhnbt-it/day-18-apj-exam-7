/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 2:28 PM
 */
public class CBGV {
    private int id;
    private static int nextId = 1;
    private double basicSalary = 5000000;
    private double bonusSalary = 0;
    private double penaltySalary;
    private double salary;
    private CanBo canBo;

    public CBGV() {
        this.id = nextId;
        nextId++;
    }

    public CBGV(double bonusSalary, double penaltySalary) {
        this.bonusSalary = bonusSalary;
        this.penaltySalary = penaltySalary;
        this.id = nextId;
        nextId++;
    }

    public CBGV(double bonusSalary, double penaltySalary, CanBo canBo) {
        this.bonusSalary = bonusSalary;
        this.penaltySalary = penaltySalary;
        this.canBo = canBo;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getPenaltySalary() {
        return penaltySalary;
    }

    public void setPenaltySalary(double penaltySalary) {
        this.penaltySalary = penaltySalary;
    }

    public CanBo getCanBo() {
        return canBo;
    }

    public void setCanBo(CanBo canBo) {
        this.canBo = canBo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CBGV{" +
                "id=" + id +
                ", basicSalary=" + basicSalary +
                ", bonusSalary=" + bonusSalary +
                ", penaltySalary=" + penaltySalary +
                ", salary=" + salary +
                ", canBo=" + canBo +
                '}';
    }
}
