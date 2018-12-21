import java.io.IOException;
import java.io.InputStream;

/**
 * @author xuechaofu
 * @date 2018/12/20 19:45
 */
public class MyRequest {

    private String url;
    private String method;

    public MyRequest(InputStream inputStream) throws IOException {
        String httpRequest = "";
        byte[] httpRequestBytes = new byte[1024];
        int length = 0;
        if((length = inputStream.read(httpRequestBytes)) > 0){
            httpRequest = new String(httpRequestBytes,0,length);
        }

//        HTTP请求西医
//        GET /562f25980001b1b106000338.jpg HTTP/1.1
//        Host    img.mukewang.com
//        User-Agent  Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.106 Safari/537.36
//        Accept  image/webp,image/*,*/*;q=0.8
//        Referer http://www.imooc.com/
//        Accept-Encoding gzip, deflate, sdch
//        Accept-Language zh-CN,zh;q=0.8



        String httpHead = httpRequest.split("\n")[0];
        url  = httpHead.split("\\s")[1];
        method = httpHead.split("\\s")[0];
        System.out.println(this);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "MyRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}
