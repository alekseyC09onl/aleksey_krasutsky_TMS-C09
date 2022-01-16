package homework;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.showBestStudent();
        service.showWorstStudent();
        service.showInfoStudentsE01Group();
        service.showInfoStudentsE02Group();
        service.showInfoStudentsE03Group();
        service.showStudentsE01GroupWithRatingAboveAverage();
        service.showStudentsE02GroupWithRatingAboveAverage();
        service.showStudentsE03GroupWithRatingAboveAverage();
        service.showMorePopularCourse();
        service.showMorePopularMark();
    }
}


