package projava;

import java.util.Objects;

public class ClassSample {
    static final class Student {
        private final String name;
        private final int Score;

        Student(String name, int Score) {
            this.name = name;
            this.Score = Score;
        }

        public String name() {
            return name;
        }

        public int Score() {
            return Score;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Student) obj;
            return Objects.equals(this.name, that.name) &&
                    this.Score == that.Score;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, Score);
        }

        @Override
        public String toString() {
            return "Student[" +
                    "name=" + name + ", " +
                    "Score=" + Score + ']';
        }
    }
    public static  void main(String[] args) {
        var s = new Student("kis", 89);
        System.out.println(s);
    }
}
