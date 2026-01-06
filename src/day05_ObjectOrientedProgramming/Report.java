package day05_ObjectOrientedProgramming;

interface Report {
    void generate();
}

class PdfReport implements Report {
    public void generate() {
        System.out.println("PDF report generated");
    }
}

class ExcelReport implements Report {
    public void generate() {
        System.out.println("Excel report generated");
    }
}

class ReportService {
    void process(Report report) {
        report.generate();
    }

    public static void main(String[] args) {
        ReportService rs = new ReportService();
        rs.process(new PdfReport());
        rs.process(new ExcelReport());
    }
}

//PDF report generated
//Excel report generated