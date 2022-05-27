/**
 * Copyright (C), 2021-2022, 楚恬商行
 * FileName: Properties
 * Author:   Derek Xu
 * Date:     2022/5/27 15:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * Derek Xu           修改时间           版本号              描述
 */
package org.csource.fastdfs;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2022/5/27
 * @since 1.0.0
 */
public class Properties implements Serializable {

    private int connect_timeout_in_seconds = 5;

    private int network_timeout_in_seconds = 30;

    private String charset = " UTF-8";

    private boolean http_anti_steal_token = false;

    private String http_secret_key = "FastDFS1234567890";

    private int http_tracker_http_port = 8080;

    private String tracker_servers;

    private Pool pool;

    public int getConnect_timeout_in_seconds() {
        return connect_timeout_in_seconds;
    }

    public void setConnect_timeout_in_seconds(int connect_timeout_in_seconds) {
        this.connect_timeout_in_seconds = connect_timeout_in_seconds;
    }

    public int getNetwork_timeout_in_seconds() {
        return network_timeout_in_seconds;
    }

    public void setNetwork_timeout_in_seconds(int network_timeout_in_seconds) {
        this.network_timeout_in_seconds = network_timeout_in_seconds;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public boolean isHttp_anti_steal_token() {
        return http_anti_steal_token;
    }

    public void setHttp_anti_steal_token(boolean http_anti_steal_token) {
        this.http_anti_steal_token = http_anti_steal_token;
    }

    public String getHttp_secret_key() {
        return http_secret_key;
    }

    public void setHttp_secret_key(String http_secret_key) {
        this.http_secret_key = http_secret_key;
    }

    public int getHttp_tracker_http_port() {
        return http_tracker_http_port;
    }

    public void setHttp_tracker_http_port(int http_tracker_http_port) {
        this.http_tracker_http_port = http_tracker_http_port;
    }

    public String getTracker_servers() {
        return tracker_servers;
    }

    public void setTracker_servers(String tracker_servers) {
        this.tracker_servers = tracker_servers;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    static class Pool {

        private boolean enabled = true;

        private Integer max_count_per_entry = 500;

        private Integer max_idle_time = 3600;

        private Integer max_wait_time_in_ms = 1000;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public Integer getMax_count_per_entry() {
            return max_count_per_entry;
        }

        public void setMax_count_per_entry(Integer max_count_per_entry) {
            this.max_count_per_entry = max_count_per_entry;
        }

        public Integer getMax_idle_time() {
            return max_idle_time;
        }

        public void setMax_idle_time(Integer max_idle_time) {
            this.max_idle_time = max_idle_time;
        }

        public Integer getMax_wait_time_in_ms() {
            return max_wait_time_in_ms;
        }

        public void setMax_wait_time_in_ms(Integer max_wait_time_in_ms) {
            this.max_wait_time_in_ms = max_wait_time_in_ms;
        }
    }
}