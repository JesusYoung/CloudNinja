package cn.com.yangshj.alert.log;

import cn.com.yangshj.alert.bean.LogEntity;
import org.springframework.stereotype.Service;

/**
 * Create by yangshijie on 4/12/22
 */
@Service
public class OpsLogServiceImpl implements IOpsLogService {

    @Override
    public void insertLog(LogEntity logEntity) {


        System.out.println("log================> \n" + "                " + logEntity.toString());
    }
}
