//package com.gholly.config.db.server;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.cloud.config.environment.Environment;
//import org.springframework.cloud.config.server.environment.JdbcEnvironmentRepository;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//@Component
//@ConfigurationProperties("spring.cloud.config.server.dbjdbc")
//public class DbEnvironmentRepository extends JdbcEnvironmentRepository {
//
//    private static final String DEFAULT_SQL = "SELECT KEY, VALUE from PROPERTIES where APPLICATION=? and PROFILE=? and LABEL=?";
//
//    @Value("${spring.cloud.config.server.default-label:master}")
//    private String DEFAULT_LABEL;
//
//    @Value("${spring.cloud.config.server.dbjdbc.sql}")
//    private String DEFINED_SQL;
//
//
//    public DbEnvironmentRepository(JdbcTemplate jdbc) {
//        super(jdbc);
//        setSQL(DEFINED_SQL);
//
//    }
//
//
//    private void setSQL(String sql)
//    {
//        if (StringUtils.isEmpty(DEFINED_SQL))
//        {
//            DEFINED_SQL = DEFAULT_SQL;
//        }
//        super.setSql(DEFINED_SQL);
//    }
//
//
//
//    @Override
//    public Environment findOne(String application, String profile, String label)
//    {
//        if (StringUtils.isEmpty(label))
//        {
//            label = DEFAULT_LABEL;
//        }
//        this.setSQL(DEFINED_SQL);
//        System.out.println("LABEL IS [" + label + "]" );
//        return super.findOne(application, profile, label);
//    }
//
//
//
//
//
//}
