package com.dcmmanagesystem.service;

import com.dcmmanagesystem.model.OtherFile;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tangweiyang
 * @since 2019-07-17
 */
public interface OtherFileService extends IService<OtherFile> {

    int insertOtherFile(OtherFile otherFile);
}
