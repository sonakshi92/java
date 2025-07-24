public class TuitionCalculatorSwitch {
    public static void main(String[] args) {
        int gradeLevel = 10;
        int baseTuitionFee = 50000;
        boolean isAcademicTopper = true;
        int discountPercent = 0;

        discountPercent = switch (gradeLevel) {
            case 9, 10, 11, 12 -> isAcademicTopper ? 20 : 10;
            case 6, 7, 8 -> 5;
            default -> 0;
        };

        // Additional discounts
        discountPercent += switch (gradeLevel) {
            case 10 -> 3;
            case 12 -> 5;
            default -> 0;
        };

        // Calculate final fee
        int discountAmount = (discountPercent / 100) * baseTuitionFee;
        int finalTuitionFee = baseTuitionFee - discountAmount;

        // Output
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Academic Topper: " + isAcademicTopper);
        System.out.println("Base Tuition Fee: Rs. " + baseTuitionFee);
        System.out.println("Total Discount: " + discountPercent + "%");
        System.out.println("Final Tuition Fee: Rs. " + finalTuitionFee);
    }
}
