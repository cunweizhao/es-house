package com.zcw.eshouse.config;

/**
 * @ClassName : ElasticSearchConfig
 * @Description : 配置类
 * @Author : Zhaocunwei
 * @Date: 2020-08-17 17:57
 */

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class ElasticSearchConfig {
    @Bean
    public TransportClient esClient()throws UnknownHostException{
        Settings settings = Settings.builder()
                .put("cluster.name","elasticsearch")
                .put("client.transport.sniff",true)
                .build();

        InetSocketTransportAddress master = new InetSocketTransportAddress(
                InetAddress.getByName("127.0.0.1"),9200
        );
        TransportClient client = new PreBuiltTransportClient(settings)
                .addTransportAddress(master);
        return client;
    }
}
