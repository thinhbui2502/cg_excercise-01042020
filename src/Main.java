public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();

        //Thêm sinh viên mới
        studentManagement.addData();
        studentManagement.addData();
        studentManagement.addData();
        studentManagement.displayInfo();

        //Xóa sinh viên qua ID
        studentManagement.removeID();
        studentManagement.displayInfo();

        //Thay đổi thông tin sinh viên qua ID
        studentManagement.replaceID();
        studentManagement.displayInfo();

        //Tìm kiến theo ID
        studentManagement.findByID();

        //Tìm kiến theo ten
        studentManagement.findByName();

        //Hiển thị học sinh được học bổng
        studentManagement.showScholarship();

        //Hiển thị học sinh nữ
        studentManagement.showFemaleStudent();

    }
}
