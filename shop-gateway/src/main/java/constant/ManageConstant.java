package constant;

public class ManageConstant {
    /** 平台用户token前缀 **/
    public static final String TOKEN_PRE = "MANAGE_TOKEN_PRE:";

    /**
     * 人员库标签 1 - 黑名单
     */
    public static final String PERSONNEL_LAB_BLACK = "0";

    /**消息队列--------- start*/
    public static final String BAIDU_COMPARE_EXCHANGE = "bd.compare.exchange";
    //public static final String BAIDU_COMPARE_RECORD_QUEUE = "bd.record.queue";
    public static final String BAIDU_COMPARE_MSG_QUEUE = "bd.msg.queue";
    public static final String BAIDU_COMPARE_WEB_QUEUE = "bd.web.queue";
    public static final String BAIDU_COMPARE_WECHAT_QUEUE = "bd.weChat.queue";
    public static final String CAMERA_ERROR = "camera.error.queue";


    /**重写**/
    public static final String BAIDU_COMPARE_RECORD_QUEUE = "bd.record.queue";
    public static final String NOTICE_MSG_QUEUE = "notice.msg.queue";
    public static final String NOTICE_WEB_QUEUE = "notice.web.queue";
    public static final String NOTICE_WECHAT_QUEUE = "notice.weChat.queue";


    /**
     * 考勤队列
     */
    public static final String ATTENCE_ADD_QUEUE = "attence.add.queue";
    /**
     * 访客队列
     */
    public static final String VISITOR_ADD_QUEUE = "visitor.add.queue";
    /**
     * 门禁队列
     */
    public static final String ENTRANCE_ADD_QUEUE = "entrance.add.queue";
    /** 消息队列--------- end*/


    /**
     * 设备人员同步队列
     */
    public static final String CAMRERA_PERSON_QUEUE = "camera.person.queue.";
}
