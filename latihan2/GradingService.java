// Koordinator alur kerja; semua dependensi disuntikkan lewat constructor
public class GradingService {
    private final GradeCalculator calculator;
    private final ReportPrinter printer;
    private final StudentRepository repository;

    public GradingService(GradeCalculator calculator, ReportPrinter printer, StudentRepository repository) {
        this.calculator = calculator;
        this.printer = printer;
        this.repository = repository;
    }

    public void proses(String nama, double tugas, double uts, double uas) {
        double nilai = calculator.hitungNilaiAkhir(tugas, uts, uas);
        printer.cetakLaporan(nama, nilai);
        repository.simpan(nama, nilai);
    }
}
