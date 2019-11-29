package com.yao.controller;

import com.yao.service.UpLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @author pengjie_yao
 * @date 2019/11/2911:49
 */
@Controller
public class UploadController {


    @Autowired
    private UpLoadService upLoadService;


    @RequestMapping(value = "/uploadImg",method = RequestMethod.POST)
    @ResponseBody
    public Map uploadImg(@RequestParam(value = "file",required = false) MultipartFile file){
        return upLoadService.uploadImg(file);
    }
}
