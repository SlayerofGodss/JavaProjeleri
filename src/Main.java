public class Main {

    public static void main(String[] args) {
       int [] sayilar = new int[] { 1,2,5,6,7,3,8};
       int aranacak =5;
       boolean varmi = false;
       for (int sayi:sayilar){
            if (sayi== aranacak){
                varmi=true;
                break;
            }
       }
       if (varmi){
           System.out.println("Sayı vardır");
       }else {
           System.out.println("Sayı mevcut değildir");
       }

    }

}
