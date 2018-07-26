import com.qianfeng.etl.util.IpParseUtil;
import com.qianfeng.etl.util.ip.IPSeeker;

import java.util.List;

public class IpTest {
    public static void main(String[] args){
//        String country=IPSeeker.getInstance().getCountry("112.10.2.1");
//       int index=country.indexOf("省");
//       System.out.println(country.substring(0,index+1));
//       System.out.println(IPSeeker.getInstance().getCountry("192.168.220.67"));

        List<String> ips= IPSeeker.getInstance().getAllIp();
        for (String ip:ips){
            System.out.println(ip+"="+ new IpParseUtil().parserIp(ip));
            try{
                System.out.println(ip+"===="+ new IpParseUtil().parserIp("http://ip.taobao.com/service/getIpInfo.php?ip=\"+ip,\"utf-8"));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
