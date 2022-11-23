public class HesapMakinasi {

        public static double topla(int a, int b){
            double sonuc = a + b;
            return sonuc;
        }

       public static double cikarma(int a, int b){
            double sonuc = a - b;
            return sonuc;
        }

        public static double carpma(int a, int b){
            double sonuc = a * b;
            return sonuc;
        }

        public static  double bolme(int a, int b){
            if (b!=0){
                double sonuc = a / b;
                return sonuc;
            }else{
                return -1;
            }
        }

    public static double usunuAl(int a, int b){
        return Math.pow(a, b);
    }

    public static double kokunuAl(int a, int b) {
        return Math.sqrt(a);
    }
}
