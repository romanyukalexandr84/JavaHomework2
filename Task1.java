public class Task1 {
    public static void main(String[] args) {
        String sql = "SELECT * FROM students WHERE ";
        String filters = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";

        StringBuilder request = new StringBuilder(sql);
        String temp = filters.replaceAll("['{}]", "").replace(":", "=");

        for (int i = 0; i < temp.split(" ").length; i++) {
            if (!temp.split(" ")[i].contains("null")) {
                request.append(temp.split(" ")[i]);
            }
        }
        if (request.charAt(request.length() - 1) == ',') {
            request.deleteCharAt(request.length() - 1);
        }
        System.out.println(request.toString().replace("=", " = ").replace(",", " AND "));
    }
}