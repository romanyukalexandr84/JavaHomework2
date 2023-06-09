public class Task3 {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }

        var time = System.currentTimeMillis();
        str = str.replace("a", "A");
        System.out.println("Время выполнения замены средствами String = " + (System.currentTimeMillis() - time) + " миллисекунд");

        time = System.currentTimeMillis();
        for (int i = 0; i < sb.length(); i++) {
            sb.replace(i, i + 1, "A");
        }
        System.out.println("Время выполнения замены средствами StringBuilder = " + (System.currentTimeMillis() - time) + " миллисекунд");
    }
}