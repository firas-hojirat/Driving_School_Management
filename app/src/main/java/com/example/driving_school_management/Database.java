package com.example.driving_school_management;

public class Database {

    private static Teacher registeredTeacher;

    public static void registerTeacher(int id, String password, String confirmPassword) {
        if (!confirmPassword.equals(password) || (id > 999999999 || id < 100000000)) {
            return;
        }
        registeredTeacher = new Teacher(id, password);
    }

    public static Teacher getRegisteredTeacher() {
        return registeredTeacher;
    }

    public static boolean isTeacherRegistered() {
        if (getRegisteredTeacher() != null)
            return true;
        else
            return false;
//        return registeredTeacher != null ? true : false;
    }
}
