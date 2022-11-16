public class WorkString {
    public static void main(String[] args) {

        findSymbolOccurance("mister twister former minister", 'i');
        findWordPosition("mister twister former ","er");
        stringReverse("klass");
        System.out.println(isPalindrom("Ні не Ленін"));
    }
        static void findSymbolOccurance (String text, char a) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == a) {
                    count++;
                }
            }
            System.out.println("Символ " + a + " зустрічається в тексті " + count + " разів.");
        }

        public static void findWordPosition (String source, String target){
            System.out.println("Джерело: " + source);
            System.out.println("Що шукаємо: " + target);
            System.out.println("Результат: " + source.indexOf(target));
        }
        public static void stringReverse (String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
            System.out.println("Було: " + str);
            System.out.println("Стало: " + result);
        }
        public static boolean isPalindrom (String str) {
            str = str.replaceAll("\\s", "").toLowerCase();
            char[] array = str.toCharArray();
            String result = "";
            for (int i = array.length - 1; i >= 0; i--) {
                result = result + array[i];
            }
            return (str.equals(result));
        }



}
