package ci.xu.crawlerbase;

import ci.xu.crawlerbase.frameword.util.FakeUserUtil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class Office365excel {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            createFile(i);
        }
    }

    private static void createFile(int i){
        File file = new File("C:\\"+i+".csv");
        FakeUserUtil fakeUserUtil = new FakeUserUtil();
        List<FakeUserUtil.FakeUser> userList = fakeUserUtil.listFakeUser(250);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.newLine();
            bw.write("用户名,名字,姓氏,显示名称,职务,部门,办公室号码,办公室电话,移动电话,传真号码,地址,城市,省/自治区/直辖市,邮政编码,国家或地区");
            for (FakeUserUtil.FakeUser user : userList) {
                bw.newLine();
                bw.write(user.fullEName+"@gmail.com," +
                        user.firstCName+"," +
                        user.lastCName+"," +
                        user.fullCName+"," +
                        "IT Manager," +
                        "Information Technology," +
                        "123451," +
                        "123-555-1211," +
                        "123-555-6641,123-555-9821,1 Microsoft way,Redmond,Wa,98052,United States");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
