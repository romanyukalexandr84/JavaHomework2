public class Task2 {
    public static String []ParseFilters (String str) {
        return str.replaceAll("\\{", "")
        .replaceAll("\\}", "")
        .replaceAll("\\[", "")
        .replaceAll("\\]", "")
        .replace("фамилия", "")
        .replace("оценка", "")
        .replace("предмет", "")
        .replace(":", "")
        .replace("'", "")
        .split(",");
    }
    public static void main(String[] args) {
        String filters = "[{'фамилия':'Иванов','оценка':'5','предмет':'Математика'},{'фамилия':'Петрова','оценка':'4','предмет':'Информатика'},{'фамилия':'Краснов','оценка':'5','предмет':'Физика'}]";
        int numberOfPupils = 3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfPupils; i++){
            sb.append("Студент " + ParseFilters(filters)[i*numberOfPupils] + " получил " + ParseFilters(filters)[i*numberOfPupils+1] + " по предмету " + ParseFilters(filters)[i*numberOfPupils+2]);
            System.out.println(sb);
            sb.delete(0,sb.length());
        }
    }
}