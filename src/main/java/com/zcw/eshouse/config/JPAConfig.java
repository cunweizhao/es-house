package com.zcw.eshouse.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName : JPAConfig
 * @Description : 配置类
 * @Author : Zhaocunwei
 * @Date: 2020-07-31 11:16
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.zcw.eshouse.repository")
@EnableTransactionManagement //允许事务管理
public class JPAConfig {

    /**
     * 创建数据源
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
    /**
     * 创建实体类的管理工厂
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        HibernateJpaVendorAdapter japVendor = new HibernateJpaVendorAdapter();
        //是否生成sql
        japVendor.setGenerateDdl(false);
        //管理工厂类
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource());
        //jpa的适配器
        entityManagerFactory.setJpaVendorAdapter(japVendor);
        entityManagerFactory.setPackagesToScan("com.zcw.eshouse.entity");
        return entityManagerFactory;
    }
    /**
     * 创建事务管理类
     */
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
}
