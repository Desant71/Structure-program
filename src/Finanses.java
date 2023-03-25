
public class Finanses {
    public static int calcPayment(int start, int amount, int years){//метод с параметрами
        int payment = (start - amount)/(years * 12);//переменная с равная формуле
        return payment;//возвращаем значение
    }
}
