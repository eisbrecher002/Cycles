
//▸ Выведите на экран первые 11 членов последовательности Фибоначчи. (2 варианта: с while и for)
//▸ Напоминаем, что: первый и второй члены последовательности равны единицам,
// а каждый следующий — сумме двух предыдущих. То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
public class Cycle {
    public static void main(String[] args) {
        int one = 1;
        int two= 1;
        int sequenceMember = 0;
        System.out.println("Цикл while: ");
        System.out.print(one + " " + two + " ");
       while (sequenceMember < 89) {
         sequenceMember = one + two;
         one = two;
         two = sequenceMember;
         System.out.print( sequenceMember +" ");
    }
       System.out.println(" ");
       System.out.println("Цикл for: ");
        int ein = 1;
        int zwein  = 1;
        int  sequenceMember1= 0;
        System.out.print(ein + " " + zwein + " ");
        for(int i=3;i<=11;i++){
            sequenceMember1 =ein +zwein;
            ein =zwein;
            zwein = sequenceMember1;
            System.out.print(sequenceMember1+" ");
        }
    }
}

