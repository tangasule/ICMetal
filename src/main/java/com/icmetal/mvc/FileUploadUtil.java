package com.icmetal.mvc;
import java.io.File;
import java.util.*;
import org.apache.commons.fileupload.*;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
@Controller
@RequestMapping("/")
public class FileUploadUtil {
    //当上传文件超过限制时设定的临时文件位置，注意是绝对路径
    private String tempPath = null;
    //文件上传目标目录，注意是绝对路径
    private String dstPath = null;
    //新文件名称，不设置时默认为原文件名
    private String newFileName = null;
    //获取的上传请求
    private HttpServletRequest fileuploadReq = null;
    //设置最多只允许在内存中存储的数据,单位:字节，这个参数不要设置太大
    private int sizeThreshold = 4096;
    //设置允许用户上传文件大小,单位:字节
    //共10M
    private long sizeMax = 10485760;
    //地址
    private String uploadPath = "/Users/tangshijun/Desktop/upload";
    //图片文件序号
    private int picSeqNo = 1;
    private boolean isSmallPic = false;
    public FileUploadUtil(){
    }
    public FileUploadUtil(String tempPath, String destinationPath){
        this.tempPath  = tempPath;
        this.dstPath = destinationPath;
    }
    public FileUploadUtil(String tempPath, String destinationPath, HttpServletRequest fileuploadRequest){
        this.tempPath   = tempPath;
        this.dstPath = destinationPath;
        this.fileuploadReq = fileuploadRequest;
    }
    /** 文件上载
     * @return true —— success; false —— fail.
     */
    @RequestMapping(value= "uploadfile" ,method = RequestMethod.POST)
    public void Upload(HttpServletRequest request){
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if(isMultipart==true){
            try{
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                List<FileItem> items = upload.parseRequest(request);//得到所有的文件
                Iterator<FileItem> itr = items.iterator();
                while(itr.hasNext()){//依次处理每个文件
                    FileItem item=(FileItem)itr.next();
                    String fileName=item.getName();//获得文件名，包括路径
                    if(fileName!=null){
                        File fullFile=new File(item.getName());
                        File savedFile=new File(uploadPath,fullFile.getName());
                        item.write(savedFile);
                    }
                }
                System.out.print("upload succeed");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("the enctype must be multipart/form-data");
        }
    }
    /**
     * 设置临时存贮目录
     */
    public void setTmpPath(String tmppath)
    {
        this.tempPath = tmppath;
    }
    /**
     * 设置目标目录
     */
    public void setDstPath(String dstpath) {
        this.dstPath = dstpath;
    }
    /**
     * 设置最大上传文件字节数，不设置时默认10M
     */
    public void setFileMaxSize(long maxsize) {
        this.sizeMax = maxsize;
    }
    /**
     * 设置Http 请求参数，通过这个能数来获取文件信息
     */
    public void setHttpReq(HttpServletRequest httpreq) {
        this.fileuploadReq = httpreq;
    }
    /**
     * 设置Http 请求参数，通过这个能数来获取文件信息
     */
    public void setNewFileName(String filename) {
        this.newFileName = filename;
    }
    /**
     * 设置此上传文件是否是缩略图文件，这个参数主要用于缩略图命名
     */
    public void setIsSmalPic(boolean isSmallPic) {
        this.isSmallPic = isSmallPic;
    }
    /**
     * 设置Http 请求参数，通过这个能数来获取文件信息
     */
    public void setPicSeqNo(int seqNo) {
        this.picSeqNo = seqNo;
    }
}