package Demo01;

import java.util.Scanner;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-08 16:55
 */
public class daima {
    tushuguan tg = new tushuguan();
    Scanner scanner = new Scanner(System.in);
    /*
    * 初始化图书
    * */
    //图书状态

    public  void book(){
        boolean flag = true;

        tushu java基础教程 = new tushu();
        java基础教程.name="《java基础教程》";
        java基础教程.zhangtai = flag;
//        java基础教程.jiechu =
        tushu 数据库技术 = new tushu();
        数据库技术.name="《数据库技术》";
        数据库技术.zhangtai = flag;

        tushu 人月神话 = new tushu();
        人月神话.name = "《人月神话》";
        人月神话.zhangtai = flag;
//        人月神话.
        if( flag == false){

            java基础教程.zhangtai ="不可解";
            数据库技术.zhangtai = "不可借";
            人月神话.zhangtai = "不可借";
        }else{
            System.out.println("借出");
//            java基础教程.zhangtai = "可借";
//            数据库技术.zhangtai = "可借";
//            人月神话.zhangtai = "可借";
        }


        tg.book[0] = java基础教程;
        tg.book[1] = 数据库技术;
        tg.book[2] = 人月神话;


    }
    public  void jiemian() {
        boolean flag = true;
        do {
            System.out.println("欢迎使用图书管理系统");
            System.out.println("***********************************");
            System.out.println("1.新增图书");
            System.out.println("2.查看图书");
            System.out.println("3.删除图书");
            System.out.println("4.接触图书");
            System.out.println("5.归还图书");
            System.out.println("6.退出");
            System.out.println("请选择");
            int xz1 = scanner.nextInt();
            switch (xz1) {
                case 1:
                    System.out.println("--->新增图书");
                    xinzeng();
                    break;
                case 2:
                    System.out.println("--->查看图书");
                    chakan();
                    break;
                case 3:
                    System.out.println("--->删除图书");
                    delete();
                    break;
                case 4:
                    System.out.println("--->借出图书");
                    sell();
                    break;
                case 5:
                    System.out.println("--->归还图书");
                    break;
                case 6:
                    System.out.println("--->您已退出");
                    break;

            }


        } while (flag);
    }
    // 借出图书
    private void sell() {
        System.out.println("请输入你要借出的书的名字");
        String name = scanner.next();
        for (int i = 0; i < tg.book.length; i++) {
            if(tg.book[i]  != null && tg.book[i].name.equals(name)){

            }
        }
    }

    //删除图书
    private void delete() {
        boolean flag = true;
        System.out.println("输入你要删除的图书编号");
        int delNo = scanner.nextInt();

        for (int i = 0; i < tg.book.length; i++) {
            if( delNo == (i + 1) && tg.book[i] != null){
                int j = i;
                while(tg.book[j + 1] != null){
                    tg.book[ j ] = tg.book[j+1];
                }
                tg.book[j] = null;
                flag = true;
                j++;
                break;
            }else{
                flag= false;
            }
        }if(flag) {
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
    //查看图书xinxi   无bug
    private void chakan(){
            System.out.println("序号\t 状态\t 名称\t 借出日期\t");
            for (int i = 0; i < tg.book.length; i++) {
                if( tg.book[i] != null){
                    tg.book[i].print(i+1);
                }
            }
        }
    //新增图书信息
    private void xinzeng() {
        System.out.println("此处实现新增图书");
        System.out.println("请输入图书名称");
        String ts = scanner.next();

        System.out.println("请输入状态");
        String a=scanner.next();

        System.out.println("请输入结束日期");
        String s = scanner.next();

        tushu zj = new tushu();
        zj.name = ts;

        zj.jiechu = s;
        for (int i = 0; i < tg.book.length; i++) {
            if( tg.book[i] == null){
                tg.book[i] =zj;
                break;
            }
        }
    }
    }


//        java基础教程.zhangtai = "已借出";
//        数据库技术.zhangtai = "已借出";
//        人月神话.zhangtai = "已借出";
