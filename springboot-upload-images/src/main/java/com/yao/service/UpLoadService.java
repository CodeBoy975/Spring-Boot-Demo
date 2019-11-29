package com.yao.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @author pengjie_yao
 * @date 2019/11/2911:51
 */
public interface UpLoadService {

    public Map<String, String> uploadImg(MultipartFile file);
}
