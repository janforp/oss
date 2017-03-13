package com.janita.oss.service;

import com.janita.oss.configuration.AliOss;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.UUID;

/**
 * Created by Janita on 2017/3/13 0013.
 * oss
 */
@Service("uploadService")
public class UploadService {


    /**
     * 上传文件
     * @param file  文件
     * @return
     */
    public String upload(MultipartFile file) {
        String url = null;
        String fileName = file.getOriginalFilename();
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1,fileName.length()).toLowerCase();
        try {
            url =  AliOss.uploadMultipartFile("preLesson/"+ UUID.randomUUID().toString()+fileName, file, ext);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }
}
