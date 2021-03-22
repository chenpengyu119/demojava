package com.sky.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

/**
 * @author pengyu
 * @date 2021/1/21 13:43
 */
public class DemoAgno {

    public static void main(String[] args) {
        demo1();
    }

    private static void demo1(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("总金额：");
            float total = 0;
            try {
                total = scanner.nextFloat();
            } catch (InputMismatchException e) {
                 throw new RuntimeException("输入类型不匹配，请输入数字");
            }
            System.out.print("个数：");
            int splitCnt = scanner.nextInt();
            // splitRedPacket2(5f,4,0.1f,2);
            splitRedPacket2(total, splitCnt, 0.1f, 2);
            for (int i = 0; i <5; i++) {
                System.out.println("");
            }
        }
    }

    /**
     *
     * @param total
     *            总金额
     * @param splitCount
     *            个数
     * @param min
     *            最小金额
     * @param max
     *            最大金额
     */
    public static void splitRedPacket(int total, int splitCount, int min, int max) {
        System.out.println("总金额：	" + total);
        System.out.println("个数：	" + splitCount);
        System.out.println("最小金额：	" + min);
        System.out.println("最大金额：	" + max);

        ArrayList<Integer> al = new ArrayList<Integer>();
        Random random = new Random();

        if ((splitCount & 1) == 1) {// 奇数个红包，需要单独将其中一个红包先生成，以保证后续算法拆分份数为偶数。
            System.out.println("红包个数" + splitCount + "是奇数，单独生成一个红包");
            int num = 0;
            do {
                num = random.nextInt(max);
                // num = (total - num) % (splitCount / 2) + num; //
                // 将后面算法拆分时的余数加入到这个随机值中。
                System.out.println("单个的随机红包为：" + num);
            } while (num >= max || num <= min);

            total = total - num;
            al.add(num);
        }
        int couples = splitCount >> 1;
        int perCoupleSum = total / couples;

        if ((splitCount & 1) == 1) {
            System.out.println("处理后剩余的金额为：" + total);
        }
        System.out.println("将" + total + "元拆分为" + couples + "对金额，每对总额：" + perCoupleSum);

        for (int i = 0; i < couples; i++) {
            Boolean finish = true;
            int num1 = 0;
            int num2 = 0;
            do {
                num1 = random.nextInt(max);
                num2 = perCoupleSum - num1;
                if (!al.contains(num1) && !al.contains(num2)) {
                    if (i == 0) {
                        num1 = (total - couples * perCoupleSum) + num1;
                    }
                }
            } while (num1 < min || num1 > max || num2 < min || num2 > max);
            al.add(num1);
            al.add(num2);
        }

        int check_num = 0;
        //Integer.compare(1, 2);
       /* al.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });*/

        System.out.println(Arrays.toString(al.toArray()));

        for (int x : al) {
            check_num = check_num + x;
        }
        System.out.println("验证总和：" + check_num);
    }

    /**
     * 生成指定范围，指定小数位数的随机数
     * @param max 最大值
     * @param min 最小值
     * @param scale 小数位数
     * @return
     */
    private static BigDecimal makeRandom(float max, float min, int scale){
        BigDecimal cha = new BigDecimal(Math.random() * (max-min) + min);
        return cha.setScale(scale,BigDecimal.ROUND_HALF_UP);//保留 scale 位小数，并四舍五入
    }

    /**
     *
     * @param total
     *            总金额
     * @param splitCount
     *            个数
     * @param min
     *            最小金额
     * @param max
     *            最大金额
     */
    public static void splitRedPacket2(float total, int splitCount, float min, float max) {
        System.out.println("总金额：	" + total);
        System.out.println("个数：	" + splitCount);
        System.out.println("最小金额：	" + min);
        System.out.println("最大金额：	" + max);

        ArrayList<Float> al = new ArrayList<Float>();

        if ((splitCount & 1) == 1) {// 奇数个红包，需要单独将其中一个红包先生成，以保证后续算法拆分份数为偶数。
            System.out.println("红包个数" + splitCount + "是奇数，单独生成一个红包");
            float num = 0;
            do {
               // num = random.nextInt(max);
                num = makeRandom(max, min, 1).floatValue();
                // num = (total - num) % (splitCount / 2) + num; //
                // 将后面算法拆分时的余数加入到这个随机值中。
                System.out.println("单个的随机红包为：" + num);
            } while (num >= max || num <= min);

            total = total - num;
            al.add(num);
        }
        int couples = 1;
        if (splitCount>1) {
             couples = splitCount >> 1;
        }
       //float perCoupleSum = total / couples;
        float perCoupleSum = new BigDecimal(total).divide(new BigDecimal(couples), BigDecimal.ROUND_HALF_UP).floatValue();

        if ((splitCount & 1) == 1) {
            System.out.println("处理后剩余的金额为：" + total);
        }
        System.out.println("将" + total + "元拆分为" + couples + "对金额，每对总额：" + perCoupleSum);

        for (int i = 0; i < couples; i++) {
            Boolean finish = true;
            float num1 = 0;
            float num2 = 0;
            int cnt = 0;
            do {
                if (cnt++>20){
                    break;
                }
               // num1 = random.nextInt(max);
                num1 = makeRandom(perCoupleSum, min, 1).setScale(1,RoundingMode.HALF_UP).floatValue();
                //num2 = perCoupleSum - num1;
                num2 = new BigDecimal(perCoupleSum).subtract(new BigDecimal(num1)).
                        setScale(1,RoundingMode.HALF_UP).floatValue();
                if (!al.contains(num1) && !al.contains(num2)) {
                    if (i == 0) {
                     //   num1 = (total - couples * perCoupleSum) + num1;
                        BigDecimal multiply = new BigDecimal(couples)
                                .multiply(new BigDecimal(perCoupleSum));
                        BigDecimal subtract = new BigDecimal(total)
                                .subtract(multiply);
                        num1 = subtract.add(new BigDecimal(num1)).floatValue();
                    }
                }
                if (num1 < max && num1 >= min && num2<max && num2>min){
                    break;
                }
            } while (num1 < min || num1 > max || num2 < min || num2 > max);
            al.add(new BigDecimal(num1).setScale(1,RoundingMode.HALF_UP).floatValue());
            al.add(new BigDecimal(num2).setScale(1,RoundingMode.HALF_UP).floatValue());
        }

        float check_num = 0;
   //     Float.compare(1, 2);
    /*    al.sort(new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                return Float.compare(o1, o2);
            }
        });*/

        System.out.println(Arrays.toString(al.toArray()));

        for (float x : al) {
            check_num = check_num + x;
        }
        System.out.println("验证总和：" + new BigDecimal(check_num).setScale(1, RoundingMode.HALF_UP));
    }

}
