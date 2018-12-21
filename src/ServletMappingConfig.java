import java.util.ArrayList;
import java.util.List;

/**
 * @author xuechaofu
 * @date 2018/12/21 15:56
 */
public class ServletMappingConfig {
    public static List<ServletMapping> servletMappingList = new ArrayList<>();

    static {
        servletMappingList.add(new ServletMapping("findGirl","/girl","mytomcat.FindGirlServlet"));
        servletMappingList.add(new ServletMapping("holleWorld","/world","mytomcat.HelloWorldServlet"));
    }
}
