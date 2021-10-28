import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(StringUtils.upperCase(args[0]));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка");
        }



    }
}
