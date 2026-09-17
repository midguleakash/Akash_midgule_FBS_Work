package excel;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

    public static List<Employee> getEmployees() throws Exception {

        List<Employee> employees = new ArrayList<Employee>();

        InputStream inputStream =
                ExcelReader.class
                .getClassLoader()
                .getResourceAsStream("employees.xlsx");

        Workbook workbook = WorkbookFactory.create(inputStream);

        Sheet sheet = workbook.getSheetAt(0);

        // Skip first row because it contains headers
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            Row row = sheet.getRow(i);

            if (row == null) {
                continue;
            }

            int id = (int) row.getCell(0).getNumericCellValue();

            String name =
                    row.getCell(1).getStringCellValue();

            double salary =
                    row.getCell(2).getNumericCellValue();

            String department =
                    row.getCell(3).getStringCellValue();

            Employee employee =
                    new Employee(
                            id,
                            name,
                            salary,
                            department
                    );

            employees.add(employee);
        }

        workbook.close();
        inputStream.close();

        return employees;
    }
}