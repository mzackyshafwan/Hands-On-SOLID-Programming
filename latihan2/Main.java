public class Main {
    public static void main(String[] args) {
        GradingService service = new GradingService(
                new GradeCalculator(),
                new ReportPrinter(),
                new DatabaseStudentRepository());

        service.proses("Andi", 80, 85, 90);
    }
}
