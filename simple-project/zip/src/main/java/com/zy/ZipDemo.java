package com.zy;

/**
 * @author: zhangyi
 * @date: 2018/11/6 23:13
 * @description:
 */
public class ZipDemo {
/*
    List<File> fileList = new ArrayList();

    @Before
    public void fileList(){
        fileList.add(new File("http://yissmt.oss-cn-hangzhou.aliyuncs.com/file/2018-11-05/44/03dc1981758c43bc9748b1858f893466-新建文本文档.txt"));
        fileList.add(new File("http://yissmt.oss-cn-hangzhou.aliyuncs.com/file/2018-11-05/44/16b22bb4d6b2484bb0dcc207cd6f8866-index.js"));
        fileList.add(new File("http://yissmt.oss-cn-hangzhou.aliyuncs.com/file/2018-11-05/44/16cc0766b6a342bc8591729ac5db95f6-index.js"));
    }
    @Test
    public void zip() throws Exception {
        String zipName = doZIP("zipname",fileList);//这里，我写了一个将多个文件打包为zip的方法doZip()，doZip()返回生成的zip路径
        //响应头部
        response.setHeader("Content-disposition", "attachment;filename=order_" + "11111" + ".zip");
        InputStream inputStreamzip = new FileInputStream(new File(zipName));//通过zip路径实例化inputStream流

        OutputStream os = response.getOutputStream();
        byte[] b = new byte[2048];
        int length;
        while ((length = inputStreamzip.read(b)) > 0) {
            os.write(b, 0, length);
        }
        os.close();
        inputStreamzip.close();
    }
    *//*文件打包zip*//*
    public String doZIP(String zipname, List<File> files) throws Exception{
        //doZIP(命名的打包文件名，传递过来的File数组)
        byte[] buffer = new byte[1024];

        String strZipName = zipname;

        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(strZipName));


        for(int i=0;i<files.size();i++) {

            FileInputStream fis = new FileInputStream(files.get(i));

            out.putNextEntry(new ZipEntry(files.get(i).getName()));

            int len;

            //读入需要下载的文件的内容，打包到zip文件

            while((len = fis.read(buffer))>0) {

                out.write(buffer,0,len);

            }

            out.closeEntry();

            fis.close();

        }

        out.close();

        return strZipName;
    }*/
}
