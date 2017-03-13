package com.janita.oss.controller;

import com.janita.oss.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Janita on 2017/3/13 0013.
 * oss
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 上传文件
     * @param file  文件
     * @return
     */
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String uploadMultipartFile( @RequestParam("file") MultipartFile file){
        String url = uploadService.upload(file);
        System.out.println("*****"+url);
        return url;
    }

}
