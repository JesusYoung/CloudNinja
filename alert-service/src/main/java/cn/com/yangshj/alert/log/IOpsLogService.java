package cn.com.yangshj.alert.log;

import cn.com.yangshj.alert.bean.LogEntity;

/**
 * Create by yangshijie on 4/12/22
 */
public interface IOpsLogService {

    void insertLog(LogEntity logEntity);
}
