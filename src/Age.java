
import java.util.Scanner;
public class Age {
    public int age;
    public static int main(String[] args) {
        System.out.print("What is your age? ");
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}