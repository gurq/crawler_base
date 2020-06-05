package ci.xu.crawlerbase.frameword.util;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FakeUserUtil {
    static String[] firstNameArr = new String[95];
    static String[] LastNameArr = new String[79];

    static {
        firstNameArr[0] = "白|bai";
        firstNameArr[1] = "拜|bai";
        firstNameArr[2] = "蔡|cai";
        firstNameArr[3] = "曹|cao";
        firstNameArr[4] = "陈|chen";
        firstNameArr[5] = "戴|dai";
        firstNameArr[6] = "窦|dou";
        firstNameArr[7] = "邓|deng";
        firstNameArr[8] = "狄|di";
        firstNameArr[9] = "杜|du";
        firstNameArr[10] = "段|duan";
        firstNameArr[11] = "范|fan";
        firstNameArr[12] = "樊|fan";
        firstNameArr[13] = "房|fang";
        firstNameArr[14] = "风|feng";
        firstNameArr[15] = "符|fu";
        firstNameArr[16] = "福|fu";
        firstNameArr[17] = "高|gao";
        firstNameArr[18] = "古|gu";
        firstNameArr[19] = "关|guan";
        firstNameArr[20] = "郭|guo";
        firstNameArr[21] = "毛|mao";
        firstNameArr[22] = "韩|han";
        firstNameArr[23] = "胡|hu";
        firstNameArr[24] = "花|hua";
        firstNameArr[25] = "洪|hong";
        firstNameArr[26] = "侯|hou";
        firstNameArr[27] = "黄|huang";
        firstNameArr[28] = "贾|jia";
        firstNameArr[29] = "蒋|jiang";
        firstNameArr[30] = "金|jin";
        firstNameArr[31] = "廖|liao";
        firstNameArr[32] = "梁|liang";
        firstNameArr[33] = "李|li";
        firstNameArr[34] = "林|lin";
        firstNameArr[35] = "刘|liu";
        firstNameArr[36] = "龙|long";
        firstNameArr[37] = "陆|lu";
        firstNameArr[38] = "卢|lu";
        firstNameArr[39] = "罗|luo";
        firstNameArr[40] = "马|ma";
        firstNameArr[41] = "牛|niu";
        firstNameArr[42] = "庞|pang";
        firstNameArr[43] = "裴|pei";
        firstNameArr[44] = "彭|peng";
        firstNameArr[45] = "戚|qi";
        firstNameArr[46] = "齐|qi";
        firstNameArr[47] = "钱|qian";
        firstNameArr[48] = "乔|qiao";
        firstNameArr[49] = "秦|qin";
        firstNameArr[50] = "邱|qiu";
        firstNameArr[51] = "裘|qiu";
        firstNameArr[52] = "仇|qiu";
        firstNameArr[53] = "沙|sha";
        firstNameArr[54] = "商|shang";
        firstNameArr[55] = "尚|shang";
        firstNameArr[56] = "邵|shao";
        firstNameArr[57] = "沈|shen";
        firstNameArr[58] = "师|shi";
        firstNameArr[59] = "施|shi";
        firstNameArr[60] = "宋|song";
        firstNameArr[61] = "孙|sun";
        firstNameArr[62] = "童|tong";
        firstNameArr[63] = "万|wan";
        firstNameArr[64] = "王|wang";
        firstNameArr[65] = "魏|wei";
        firstNameArr[66] = "卫|wei";
        firstNameArr[67] = "吴|wu";
        firstNameArr[68] = "武|wu";
        firstNameArr[69] = "萧|xiao";
        firstNameArr[70] = "肖|xiao";
        firstNameArr[71] = "项|xiang";
        firstNameArr[72] = "许|xu";
        firstNameArr[73] = "徐|xu";
        firstNameArr[74] = "薛|xue";
        firstNameArr[75] = "杨|yang";
        firstNameArr[76] = "羊|yang";
        firstNameArr[77] = "阳|yang";
        firstNameArr[78] = "易|yi";
        firstNameArr[79] = "尹|yin";
        firstNameArr[80] = "俞|yu";
        firstNameArr[81] = "赵|zhao";
        firstNameArr[82] = "钟|zhong";
        firstNameArr[83] = "周|zhou";
        firstNameArr[84] = "郑|zheng";
        firstNameArr[85] = "朱|zhu";
        firstNameArr[86] = "东方|dongfang";
        firstNameArr[87] = "独孤|dugu";
        firstNameArr[88] = "慕容|murong";
        firstNameArr[89] = "欧阳|ouyang";
        firstNameArr[90] = "司马|sima";
        firstNameArr[91] = "西门|ximen";
        firstNameArr[92] = "尉迟|yuchi";
        firstNameArr[93] = "长孙|zhangsun";
        firstNameArr[94] = "诸葛|zhuge";

        LastNameArr[0] = "ai|皑艾哀";
        LastNameArr[1] = "an|安黯谙";
        LastNameArr[2] = "ao|奥傲敖骜翱";
        LastNameArr[3] = "ang|昂盎";
        LastNameArr[4] = "ba|罢霸";
        LastNameArr[5] = "bai|白佰";
        LastNameArr[6] = "ban|斑般";
        LastNameArr[7] = "bang|邦";
        LastNameArr[8] = "bei|北倍贝备";
        LastNameArr[9] = "biao|表标彪飚飙";
        LastNameArr[10] = "bian|边卞弁忭";
        LastNameArr[11] = "bu|步不";
        LastNameArr[12] = "cao|曹草操漕";
        LastNameArr[13] = "cang|苍仓";
        LastNameArr[14] = "chang|常长昌敞玚";
        LastNameArr[15] = "chi|迟持池赤尺驰炽";
        LastNameArr[16] = "ci|此次词茨辞慈";
        LastNameArr[17] = "du|独都";
        LastNameArr[18] = "dong|东侗";
        LastNameArr[19] = "dou|都";
        LastNameArr[20] = "fa|发乏珐";
        LastNameArr[21] = "fan|范凡反泛帆蕃";
        LastNameArr[22] = "fang|方访邡昉";
        LastNameArr[23] = "feng|风凤封丰奉枫峰锋";
        LastNameArr[24] = "fu|夫符弗芙";
        LastNameArr[25] = "gao|高皋郜镐";
        LastNameArr[26] = "hong|洪红宏鸿虹泓弘";
        LastNameArr[27] = "hu|虎忽湖护乎祜浒怙";
        LastNameArr[28] = "hua|化花华骅桦";
        LastNameArr[29] = "hao|号浩皓蒿浩昊灏淏";
        LastNameArr[30] = "ji|积极济技击疾及基集记纪季继吉计冀祭际籍绩忌寂霁稷玑芨蓟戢佶奇诘笈畿犄";
        LastNameArr[31] = "jian|渐剑见建间柬坚俭";
        LastNameArr[32] = "kan|刊戡";
        LastNameArr[33] = "ke|可克科刻珂恪溘牁";
        LastNameArr[34] = "lang|朗浪廊琅阆莨";
        LastNameArr[35] = "li|历离里理利立力丽礼黎栗荔沥栎璃";
        LastNameArr[36] = "lin|临霖林琳";
        LastNameArr[37] = "ma|马";
        LastNameArr[38] = "mao|贸冒貌冒懋矛卯瑁";
        LastNameArr[39] = "miao|淼渺邈";
        LastNameArr[40] = "nan|楠南";
        LastNameArr[41] = "pian|片翩";
        LastNameArr[42] = "qian|潜谦倩茜乾虔千";
        LastNameArr[43] = "qiang|强羌锖玱";
        LastNameArr[44] = "qin|亲琴钦沁芩矜";
        LastNameArr[45] = "qing|清庆卿晴";
        LastNameArr[46] = "ran|冉然染燃";
        LastNameArr[47] = "ren|仁刃壬仞";
        LastNameArr[48] = "sha|沙煞";
        LastNameArr[49] = "shang|上裳商";
        LastNameArr[50] = "shen|深审神申慎参莘";
        LastNameArr[51] = "shi|师史石时十世士诗始示适炻";
        LastNameArr[52] = "shui|水";
        LastNameArr[53] = "si|思斯丝司祀嗣巳";
        LastNameArr[54] = "song|松颂诵";
        LastNameArr[55] = "tang|堂唐棠瑭";
        LastNameArr[56] = "tong|统通同童彤仝";
        LastNameArr[57] = "tian|天田忝";
        LastNameArr[58] = "wan|万宛晚";
        LastNameArr[59] = "wei|卫微伟维威韦纬炜惟玮为";
        LastNameArr[60] = "wu|吴物务武午五巫邬兀毋戊";
        LastNameArr[61] = "xi|西席锡洗夕兮熹惜";
        LastNameArr[62] = "xiao|潇萧笑晓肖霄骁校";
        LastNameArr[63] = "xiong|熊雄";
        LastNameArr[64] = "yang|羊洋阳漾央秧炀飏鸯";
        LastNameArr[65] = "yi|易意依亦伊夷倚毅义宜仪艺译翼逸忆怡熠沂颐奕弈懿翊轶屹猗翌";
        LastNameArr[66] = "yin|隐因引银音寅吟胤訚烟荫";
        LastNameArr[67] = "ying|映英影颖瑛应莹郢鹰";
        LastNameArr[68] = "you|幽悠右忧猷酉";
        LastNameArr[69] = "yu|渔郁寓于余玉雨语预羽舆育宇禹域誉瑜屿御渝毓虞禺豫裕钰煜聿";
        LastNameArr[70] = "zhi|制至值知质致智志直治执止置芝旨峙芷挚郅炙雉帜";
        LastNameArr[71] = "zhong|中忠钟衷";
        LastNameArr[72] = "zhou|周州舟胄繇昼";
        LastNameArr[73] = "zhu|竹主驻足朱祝诸珠著竺";
        LastNameArr[74] = "zhuo|卓灼灼拙琢濯斫擢焯酌";
        LastNameArr[75] = "zi|子资兹紫姿孜梓秭";
        LastNameArr[76] = "zong|宗枞";
        LastNameArr[77] = "zu|足族祖卒";
        LastNameArr[78] = "zuo|作左佐笮凿";
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        FakeUserUtil chineseName = new FakeUserUtil();
        System.out.println(chineseName.listFakeUser(50));

    }

    public class FakeUser {
        public String fullCName;
        public String fullEName;
        public String firstCName;
        public String lastCName;
        public String firstEName;
        public String lastEName;

        @Override
        public String toString() {
            return "FakeUser{" +
                    "fullCName='" + fullCName + '\'' +
                    ", fullEName='" + fullEName + '\'' +
                    ", firstCName='" + firstCName + '\'' +
                    ", lastCName='" + lastCName + '\'' +
                    ", firstEName='" + firstEName + '\'' +
                    ", lastEName='" + lastEName + '\'' +
                    '}';
        }
    }

    public List<FakeUser> listFakeUser(int count) {
        return IntStream.rangeClosed(1, count)
                .mapToObj(i -> getFakeUser())
                .collect(Collectors.toList());
    }

    private FakeUser getFakeUser() {
        FakeUser user = new FakeUser();
        setFakeUserFirstName(user);
        setFakeUserLastName(user);
        user.fullCName = user.firstCName + user.lastCName;
        user.fullEName = user.firstEName + user.lastEName;
        return user;
    }

    public void setFakeUserFirstName(FakeUser user) {
        Random random = new Random();
        int i = random.nextInt(94);
        user.firstCName = firstNameArr[i].split("[|]")[0];
        user.firstEName = captureName(firstNameArr[i].split("[|]")[1]);
    }

    public void setFakeUserLastName(FakeUser user) {
        String cname = "";
        String ename = "";
        Random random = new Random();
        int i = random.nextInt(78);
        ename += captureName(LastNameArr[i].split("[|]")[0]);
        cname += getKey(LastNameArr[i].split("[|]")[1]);
        if (random.nextInt(2) == 1) {
            ename += captureName(LastNameArr[i].split("[|]")[0]);
            cname += getKey(LastNameArr[i].split("[|]")[1]);
        }
        user.lastCName = cname;
        user.lastEName = ename;
    }

    private String captureName(String name) {
        char[] cs = name.toCharArray();
        if (cs[0] >= 97 && cs[0] <= 122) {
            cs[0] -= 32;
        }
        return String.valueOf(cs);
    }

    public String getName() {
        Random random = new Random();
        int i = random.nextInt(94);
        String mName = firstNameArr[i].split("[|]")[0];
        mName += getNameKey();
        if (random.nextInt(2) == 1) {
            mName += getNameKey();
        }
        return mName;
    }

    private String getNameKey() {
        Random random = new Random();
        int i = random.nextInt(78);
        return getKey(LastNameArr[i].split("[|]")[1]);
    }

    private String getKey(String name) {
        if (name == null)
            return null;
        int counti = name.length();
        Random random = new Random();
        int i = random.nextInt(counti);
        return name.substring(i, i + 1);
    }

}
