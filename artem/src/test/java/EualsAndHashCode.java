import entities.company.Employee;
import org.junit.Test;

/**
 * Created by Programmer on 20.05.2015.
 */
public class EualsAndHashCode {
    @Test
    public void test(){
        // ��������� �������� ������ ������� (������) ��������� hashCode-��
        // ���� ������� ������� ������, �� hashCode-� �������������� ������
        // ���� hashCode-� �����, �� ������� �� �������������� �����
        //
        // - �������������� ()
        // - ������������� (x == y  y == x)
        // - �������������� (x.equals(y), y.equals(z), z.equals(x))
        // - ������������������ (���� ��� ���� ����������, ������� �� ����������� ��������,
        // ����� .equals ��������� true �� ��� ����� ����������� ���������� ��������� �� ���� ������ ���������� true)
        // - (�� ������� ������ ��� ��������� � ��������� null ������ ���������� false)
        Employee e = new Employee();
        e.setName("Ivan");
        System.out.println(e.hashCode());
        Employee e1 = new Employee();
        e.setName("Ivan");
        System.out.println(e1.hashCode());
        System.out.println(e.equals(e1));
        System.out.println(e == e1);
        String str = new String("test");
        String str1 = new String("test");
        System.out.println(str.equals(str1));
        System.out.println(str == str1);
    }
}
