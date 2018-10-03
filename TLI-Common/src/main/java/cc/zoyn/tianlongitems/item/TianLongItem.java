package cc.zoyn.tianlongitems.item;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface TianLongItem {

    String name() default "天龙物品";

    String description() default "这是一个天龙物品";



}
