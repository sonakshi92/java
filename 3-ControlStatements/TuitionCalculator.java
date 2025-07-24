public class TuitionCalculator {
    public static void main(String[] args) {
        int gradeLevel = 10;
        int baseTuitionFee = 50000;
        boolean isAcademicTopper = true;
        int discountPercent = 0;

        // Apply discounts
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            if (isAcademicTopper) {
                discountPercent = 20;
            } else {
                discountPercent = 10;
            }
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            discountPercent = 5;
        } else {
            discountPercent = 0;
        }

        // Additional discounts for grade 10 and 12
        if (gradeLevel == 10) {
            discountPercent += 3.0;
        } else if (gradeLevel == 12) {
            discountPercent += 5.0;
        }

        // Calculate final fee
        int discountAmount = (discountPercent / 100) * baseTuitionFee;
        int finalTuitionFee = baseTuitionFee - discountAmount;

        // Output results
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Academic Topper: " + isAcademicTopper);
        System.out.println("Base Tuition Fee: Rs. " + baseTuitionFee);
        System.out.println("Total Discount: " + discountPercent + "%");
        System.out.println("Final Tuition Fee: Rs. " + finalTuitionFee);
    }
}
