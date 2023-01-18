package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(12.12345);
        answer.isInteger(3);

        byte any_byte = 1;
        answer.isByte(any_byte);

        short any_short = 22;
        answer.isShort(any_short);

        answer.isDouble(3.713);
        answer.isLong(2900131);
        answer.isChar('D');
        answer.isBoolean(true);
    }
}