package com.ylc.readinglist.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/6/11 9:04
 * @description: xxx
 * own:
 */
@Component
@ConfigurationProperties(prefix = "sp")
@Data
public class SystemProperties {
    private String associateId;
}
