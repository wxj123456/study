package com.study.util.constants;

/**
 * Created by caoling on 17/11/23.
 */
public enum TaskConstant {


    /**
     * 关于大的错误类型的缓存
     */
    ERROR_TYPE_BY_ID("error_type_id_", 0),

    /**
     * 关于小的错误类型的缓存(根据ID)
     */
    ERROR_TYPE_TAG_BY_ID("error_type_tag_id_", 0),
    /**
     * 关于小的错误类型的缓存(根据NAME)
     */
    ERROR_TYPE_TAG_BY_NAME("error_type_tag_name_", 0),
    /**
     * 关于错误统计的key
     */
    ERROR_TYPE_SUM("error.type.sum.devices", 0),
    /**
     * 将错误信息存入的一个key
     */
    ERROR_LOG_LIST("error.deviceslog.list", 0),
    /**
     * iemi组别的key
     */
    IMEI_GROUP_LIST("imei.group.list", 0),
    /**
     * imei范围的key
     */
    IMEI_RANGE_LIST("imei.range.list", 0),
    /**
     * 一个队列对象的key
     */
    WRITEQUENE_OBJ_("write.quene.obj", 0);
    /**
     * 缓存key
     */
    private String key;
    /**
     * key过期时间
     */
    private int expire;

    private TaskConstant(String key, int expire) {
        this.key = key;
        this.expire = expire;
    }

    /**
     * 获取缓存key
     *
     * @return
     */
    public String getKey() {
        return this.key;
    }

    /**
     * 获取缓存key的过期时间
     *
     * @return
     */
    public int getExpire() {
        return this.expire;
    }
}

