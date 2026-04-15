public abstract class HighSchool extends Student {

    public HighSchool(String studentID, String name) {
        super(studentID, name);
    }

    private int sum() {
        int sum = 0;
        for (int i = 0; i < parts.size(); i++) {
            sum += parts.get(i).getScore();
        }
        return sum;
    }

    @Override
    public float average() {
        return  sum() / (float) parts.size();
    }

    @Override
    public String grade(float score) {
        String grade = "";
        if (score >= A)
            grade = "수";
        else if (score >= B)
            grade = "우";
        else if (score >= C)
            grade = "미";
        else if (score >= D)
            grade = "양";
        else
            grade = "가";
        return (grade);
    }
}
