import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter the month (full name, abbreviation, 3 letters, or number): ");
            String monthInput = sc.next();
            System.out.println("Enter the year: ");
            int year = sc.nextInt();
            
            // Kiểm tra xem năm có hợp lệ hay không
            if (year < 0) {
                System.out.println("Invalid year. Please enter a valid year.");
                continue;
            }

            // Xác định số ngày trong tháng
            int days = getDaysInMonth(monthInput, year);
            
            // Kiểm tra xem tháng có hợp lệ không
            if (days == 0) {
                System.out.println("Invalid month. Please enter a valid month.");
                continue;
            }

            System.out.println("Month: " + monthInput + ", Year: " + year + " has " + days + " days.");
            break;
        }
        
        sc.close();
    }

    // Hàm để lấy số ngày của tháng
    public static int getDaysInMonth(String monthInput, int year) {
        int month = getMonthNumber(monthInput);
        boolean isLeapYear = isLeapYear(year);

        switch (month) {
            case 1: return 31; // January
            case 2: return isLeapYear ? 29 : 28; // February
            case 3: return 31; // March
            case 4: return 30; // April
            case 5: return 31; // May
            case 6: return 30; // June
            case 7: return 31; // July
            case 8: return 31; // August
            case 9: return 30; // September
            case 10: return 31; // October
            case 11: return 30; // November
            case 12: return 31; // December
            default: return 0; // Invalid month
        }
    }

    // Hàm kiểm tra xem một năm có phải năm nhuận không
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // Hàm để chuyển đổi tên hoặc số tháng thành số nguyên
    public static int getMonthNumber(String monthInput) {
        monthInput = monthInput.toLowerCase();
        switch (monthInput) {
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sept.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return 0; // Invalid month
        }
    }
}
