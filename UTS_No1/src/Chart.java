import java.util.ArrayList;
import java.util.List;

public class Chart {
    private List<Subject> subjek;

    public Chart() {
        this.subjek = new ArrayList<>();
    }

    public void addChart(Subject subject) {
        subjek.add(subject);
    }

    public void removeChart(Subject subject) {
        subjek.remove(subject);
    }

    public String toString() {
        StringBuilder hasil = new StringBuilder();
        double totalBeban = 0;

        for (Subject subject : subjek) {
            totalBeban += subject.getBeban();
        }

        for (Subject subject : subjek) {
            double persen = subject.getBeban() / totalBeban * 100;
            hasil.append(String.format("%.1f%%", persen))
                    .append(" ")
                    .append(subject.getNama())
                    .append("\n");
        }

        return "Pie Chart Saat ini:\n" + hasil.toString();
    }
}

