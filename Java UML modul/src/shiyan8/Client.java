package shiyan8;

/**
 * @author 智障过人的laoxie
 * @create 2019-04-02 12:28 星期二
 */
class Client {
    public static void main(String args[]) {
        Image image;
        ImageImp imp;
        image = (Image)XMLUtil.getBean("image");
        imp = (ImageImp)XMLUtil.getBean("os");
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
