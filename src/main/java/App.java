import com.google.gson.Gson;

import java.io.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        App app = new App();
        String userInfoJsonStr = app.readFile("user_info.json");

        Gson gson = new Gson();
        UserInfoDao userInfoDao = gson.fromJson(userInfoJsonStr, UserInfoDao.class);
        System.out.println("userInfoDao = " + userInfoDao.toString());
        System.out.println("login = " + userInfoDao.getLogin());
        System.out.println("email = " + userInfoDao.getEmail());

        String testDaoJsonStr = app.readFile("test.json");

        TestDao testDao = gson.fromJson(testDaoJsonStr, TestDao.class);
        System.out.println(testDao.toString());
        System.out.println(testDao.getOopDao().getName());
        System.out.println(testDao.getOopDao().getListName().get(2));
    }

    private String readFile(String fileName) {
        StringBuilder result = new StringBuilder("");
        File file = new File(getClass().getClassLoader().getResource(fileName).getFile());
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
