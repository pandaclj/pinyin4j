package net.sourceforge.pinyin4j.test;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.multipinyin.MultiPinyinConfig;
import org.junit.Test;

/**
 * @author huixiangdou
 * @date 2019/12/25
 */
public class PinYinTest {
  static {
    MultiPinyinConfig.multiPinyinPath =
        PinYinTest.class.getResource("/multi_pinyin_ext.txt").getPath();
  }

  @Test
  public void test_pinyin() throws Exception {
    HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
    defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
    defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
    System.out.println(PinyinHelper.toHanYuPinyinString("腌笃鲜", defaultFormat, ",", true));
    System.out.println(PinyinHelper.toHanYuPinyinString("河马鲜", defaultFormat, ",", true));
    System.out.println(PinyinHelper.toHanYuPinyinString("你们好吗", defaultFormat, ",", true));
    System.out.println(PinyinHelper.toHanYuPinyinString("啦啦", defaultFormat, ",", true));
    System.out.println(PinyinHelper.toHanYuPinyinString("鲜", defaultFormat, ",", true));
  }

  @Test
  public void testHex() throws Exception {
    System.out.printf(Integer.toHexString('鲜').toUpperCase());
  }

}
