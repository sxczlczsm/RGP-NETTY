/**
 * FileName: ConfigManager
 * Author:   HuangTaiHong
 * Date:     2018/12/29 18:29
 * Description: 配置管理器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.netty.practice.configuration.configs;

/**
 * 〈一句话功能简述〉<br>
 * 〈配置管理器〉
 *
 * @author HuangTaiHong
 * @create 2018/12/29
 * @since 1.0.0
 */
public class ConfigManager {
    public static final byte serializer = serializer();

    public static byte serializer() {
        return getByte(ConfigsSupport.SERIALIZER, ConfigsSupport.SERIALIZER_DEFAULT);
    }

    /************************************************************
     *                 properties for bootstrap                 *
     ***********************************************************/
    public static boolean tcp_nodelay() {
        return getBool(ConfigsSupport.TCP_NODELAY, ConfigsSupport.TCP_NODELAY_DEFAULT);
    }

    public static boolean tcp_so_reuseaddr() {
        return getBool(ConfigsSupport.TCP_SO_REUSEADDR, ConfigsSupport.TCP_SO_REUSEADDR_DEFAULT);
    }

    public static int tcp_so_backlog() {
        return getInt(ConfigsSupport.TCP_SO_BACKLOG, ConfigsSupport.TCP_SO_BACKLOG_DEFAULT);
    }

    public static boolean tcp_so_keepalive() {
        return getBool(ConfigsSupport.TCP_SO_KEEPALIVE, ConfigsSupport.TCP_SO_KEEPALIVE_DEFAULT);
    }

    public static int netty_io_ratio() {
        return getInt(ConfigsSupport.NETTY_IO_RATIO, ConfigsSupport.NETTY_IO_RATIO_DEFAULT);
    }

    public static boolean netty_buffer_pooled() {
        return getBool(ConfigsSupport.NETTY_BUFFER_POOLED, ConfigsSupport.NETTY_BUFFER_POOLED_DEFAULT);
    }



    public static boolean conn_reconnect_switch() {
        return getBool(ConfigsSupport.CONN_RECONNECT_SWITCH, ConfigsSupport.CONN_RECONNECT_SWITCH_DEFAULT);
    }

    public static boolean conn_monitor_switch() {
        return getBool(ConfigsSupport.CONN_MONITOR_SWITCH, ConfigsSupport.CONN_MONITOR_SWITCH_DEFAULT);
    }

    public static boolean netty_epoll() {
        return getBool(ConfigsSupport.NETTY_EPOLL_SWITCH, ConfigsSupport.NETTY_EPOLL_SWITCH_DEFAULT);
    }

    public static int netty_buffer_low_watermark() {
        return getInt(ConfigsSupport.NETTY_BUFFER_LOW_WATERMARK, ConfigsSupport.NETTY_BUFFER_LOW_WATERMARK_DEFAULT);
    }

    public static int netty_buffer_high_watermark() {
        return getInt(ConfigsSupport.NETTY_BUFFER_HIGH_WATERMARK, ConfigsSupport.NETTY_BUFFER_HIGH_WATERMARK_DEFAULT);
    }

    public static boolean netty_epoll_lt_enabled() {
        return getBool(ConfigsSupport.NETTY_EPOLL_LT, ConfigsSupport.NETTY_EPOLL_LT_DEFAULT);
    }

    /************************************************************
     *                 properties for bootstrap                 *
     ***********************************************************/
    public static boolean tcp_idle_switch() {
        return getBool(ConfigsSupport.TCP_IDLE_SWITCH, ConfigsSupport.TCP_IDLE_SWITCH_DEFAULT);
    }


    /** 获取系统属性相关 **/
    public static byte getByte(String key, String defaultValue) {
        return Byte.parseByte(System.getProperty(key, defaultValue));
    }

    public static boolean getBool(String key, String defaultValue) {
        return Boolean.parseBoolean(System.getProperty(key, defaultValue));
    }

    public static int getInt(String key, String defaultValue) {
        return Integer.parseInt(System.getProperty(key, defaultValue));
    }
}